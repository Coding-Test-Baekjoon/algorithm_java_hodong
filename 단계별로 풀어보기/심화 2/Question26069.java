package y202505.d15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Question26069 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            Set<String> dancers = new HashSet<>();
            dancers.add("ChongChong");

            for (int i = 0; i < n; i++) {
                String[] names = reader.readLine().split(" ");
                String a = names[0];
                String b = names[1];

                if (dancers.contains(a) || dancers.contains(b)) {
                    dancers.add(a);
                    dancers.add(b);
                }
            }

            System.out.println(dancers.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
