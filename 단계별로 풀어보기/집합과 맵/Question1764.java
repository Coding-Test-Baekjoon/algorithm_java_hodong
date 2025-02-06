package y202502.d06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question1764 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);

            Set<String> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(reader.readLine());
            }

            List<String> result = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                String name = reader.readLine();
                if (set.contains(name)) {
                    result.add(name);
                }
            }

            Collections.sort(result);

            System.out.println(result.size());
            for (String name : result) {
                System.out.println(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
