package y202506.d10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1300 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int k = Integer.parseInt(reader.readLine());

            long left = 1;
            long right = (long) n * n;
            long answer = 0;

            while (left <= right) {
                long mid = (left + right) / 2;
                long count = 0;

                for (int i = 1; i <= n; i++) {
                    count += Math.min(n, mid / i);
                }

                if (count >= k) {
                    answer = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(answer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
