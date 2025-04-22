package y202504.d22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question24267 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            long n = Long.parseLong(reader.readLine());

            long result = (n * (n - 1) * (n - 2)) / 6;

            System.out.println(result);
            System.out.println(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
