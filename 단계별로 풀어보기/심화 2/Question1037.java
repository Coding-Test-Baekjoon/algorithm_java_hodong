package y202505.d05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question1037 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");

            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(ints);

            int result = ints[0] * ints[n - 1];
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
