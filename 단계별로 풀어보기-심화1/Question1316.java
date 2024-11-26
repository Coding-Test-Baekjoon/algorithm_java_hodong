package y202411.d26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Question1316 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            int count = 0;

            for (int i = 0; i < num; i++) {
                if (groupCheck(reader.readLine())) {
                    count++;
                }
            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean groupCheck(String str) {
        Set<Character> seen = new HashSet<>();
        char prevChar = str.charAt(0);
        seen.add(prevChar);

        for (int j = 1; j < str.length(); j++) {
            char currentChar = str.charAt(j);

            if (currentChar != prevChar) {
                if (seen.contains(currentChar)) {
                    return false;
                }
                seen.add(currentChar);
                prevChar = currentChar;
            }
        }

        return true;
    }

}
