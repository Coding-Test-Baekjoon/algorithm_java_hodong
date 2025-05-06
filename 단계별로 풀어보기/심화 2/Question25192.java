package y202505.d06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Question25192 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());

            Set<String> hashSet = new HashSet<>();
            int count = 0;

            for (int i = 0; i < n; i++) {
                String input = reader.readLine();

                if (input.equals("ENTER")) {
                    hashSet.clear();
                } else {
                    if (!hashSet.contains(input)) {
                        count++;
                        hashSet.add(input);
                    }
                }
            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
