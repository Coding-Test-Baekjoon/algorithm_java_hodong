package y202506.d06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2805 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] strings = reader.readLine().split(" ");
            int N = Integer.parseInt(strings[0]);
            int M = Integer.parseInt(strings[1]);

            String[] line = reader.readLine().split(" ");
            int[] trees = new int[N];
            int max = 0;

            for (int i = 0; i < N; i++) {
                trees[i] = Integer.parseInt(line[i]);
                if (trees[i] > max) max = trees[i];
            }

            int left = 0;
            int right = max;
            int result = 0;

            while (left <= right) {
                int mid = (left + right) / 2;
                long sum = 0;

                for (int tree : trees) {
                    if (tree > mid) {
                        sum += (tree - mid);
                    }
                }

                if (sum >= M) {
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
