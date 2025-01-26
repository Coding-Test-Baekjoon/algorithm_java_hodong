package y202501.d26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Question10814 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());
            String[][] members = new String[n][2];

            for (int i = 0; i < n; i++) {
                String[] strings = reader.readLine().split(" ");
                members[i][0] = strings[0];
                members[i][1] = strings[1];
            }

            Arrays.sort(members, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

            StringBuilder result = new StringBuilder();
            for (String[] member : members) {
                result.append(member[0]).append(" ").append(member[1]).append("\n");
            }
            System.out.print(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
