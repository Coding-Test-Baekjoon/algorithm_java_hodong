package y202505.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question2108 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int[] numbers = new int[n];
            int[] count = new int[8001];
            int sum = 0;
            int maxCount = 0;

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(reader.readLine());
                numbers[i] = num;
                sum += num;
                count[num + 4000]++;
                maxCount = Math.max(maxCount, count[num + 4000]);
            }

            Arrays.sort(numbers);

            List<Integer> modes = new ArrayList<>();
            for (int i = 0; i < count.length; i++) {
                if (count[i] == maxCount) {
                    modes.add(i - 4000);
                }
            }

            int mode = modes.size() == 1 ? modes.get(0) : modes.get(1);

            System.out.println(Math.round((double) sum / n));     // 산술 평균
            System.out.println(numbers[n / 2]);                    // 중앙값
            System.out.println(mode);                              // 최빈값
            System.out.println(numbers[n - 1] - numbers[0]);       // 범위

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
