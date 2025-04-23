package y202504.d23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question24313 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] strings = reader.readLine().split(" ");
            int a1 = Integer.parseInt(strings[0]);
            int a0 = Integer.parseInt(strings[1]);

            int c = Integer.parseInt(reader.readLine());
            int n0 = Integer.parseInt(reader.readLine());

            boolean condition1 = a1 <= c;
            boolean condition2 = a1 * n0 + a0 <= c * n0;

            System.out.println((condition1 && condition2) ? 1 : 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
