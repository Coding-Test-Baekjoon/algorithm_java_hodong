package y202505.d25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question11399 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");
            int[] times = new int[n];

            for (int i = 0; i < n; i++) {
                times[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(times);

            int total = 0;
            int sum = 0;
            for (int time : times) {
                sum += time;
                total += sum;
            }

            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
