package y202505.d28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question13305 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            String[] strings1 = reader.readLine().split(" ");
            String[] strings2 = reader.readLine().split(" ");

            long[] distances = new long[n - 1];
            long[] prices = new long[n];

            for (int i = 0; i < n - 1; i++) {
                distances[i] = Long.parseLong(strings1[i]);
            }

            for (int i = 0; i < n; i++) {
                prices[i] = Long.parseLong(strings2[i]);
            }

            long totalCost = 0;
            long minPrice = prices[0];

            for (int i = 0; i < n - 1; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                totalCost += minPrice * distances[i];
            }

            System.out.println(totalCost);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
