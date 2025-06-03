package y202506.d03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1654 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = reader.readLine().split(" ");
            int K = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);

            int[] lengths = new int[K];
            long maxLen = 0;

            for (int i = 0; i < K; i++) {
                lengths[i] = Integer.parseInt(reader.readLine());
                if (lengths[i] > maxLen) maxLen = lengths[i];
            }

            long left = 1;
            long right = maxLen;
            long result = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                long count = 0;

                for (int len : lengths) {
                    count += len / mid;
                }

                if (count >= N) {
                    result = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
