package y202505.d04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1010 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int t = Integer.parseInt(reader.readLine());

            for (int i = 0; i < t; i++) {
                String[] input = reader.readLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int m = Integer.parseInt(input[1]);

                System.out.println(combination(m, n));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static long combination(int n, int k) {
        long result = 1;

        if (k > n - k) k = n - k;

        for (int i = 1; i <= k; i++) {
            result *= (n - i + 1);
            result /= i;
        }

        return result;
    }
}
