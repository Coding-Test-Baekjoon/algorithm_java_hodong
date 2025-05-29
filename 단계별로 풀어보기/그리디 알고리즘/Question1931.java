package y202505.d29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question1931 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int[][] meetings = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] parts = reader.readLine().split(" ");
                meetings[i][0] = Integer.parseInt(parts[0]);
                meetings[i][1] = Integer.parseInt(parts[1]);
            }

            Arrays.sort(meetings, (a, b) -> {
                if (a[1] == b[1]) return a[0] - b[0];
                return a[1] - b[1];
            });

            int count = 0;
            int lastEnd = 0;

            for (int[] meeting : meetings) {
                if (meeting[0] >= lastEnd) {
                    count++;
                    lastEnd = meeting[1];
                }
            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
