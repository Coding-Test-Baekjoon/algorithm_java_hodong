package y202505.d20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11047 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] firstLine = reader.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);

            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = Integer.parseInt(reader.readLine());
            }

            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (coins[i] <= k) {
                    count += k / coins[i];
                    k %= coins[i];
                }
            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
