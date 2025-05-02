package y202505.d02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11050 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] strings = reader.readLine().split(" ");
            int n = Integer.parseInt(strings[0]);
            int k = Integer.parseInt(strings[1]);

            int result = factorial(n) / (factorial(k) * factorial(n - k));
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int factorial(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
