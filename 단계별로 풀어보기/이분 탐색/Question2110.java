package y202506.d07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2110 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] input = reader.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int C = Integer.parseInt(input[1]);

            int[] houses = new int[N];
            for (int i = 0; i < N; i++) {
                houses[i] = Integer.parseInt(reader.readLine());
            }

            Arrays.sort(houses);

            int left = 1;
            int right = houses[N - 1] - houses[0]; // 가능한 최대 거리
            int result = 0;

            while (left <= right) {
                int mid = (left + right) / 2;
                int count = 1;
                int lastInstalled = houses[0];

                for (int i = 1; i < N; i++) {
                    if (houses[i] - lastInstalled >= mid) {
                        count++;
                        lastInstalled = houses[i];
                    }
                }

                if (count >= C) {
                    result = mid;       // 공유기 더 설치 가능, 거리 늘려봄
                    left = mid + 1;
                } else {
                    right = mid - 1;    // 공유기 부족, 거리 줄임
                }
            }

            System.out.println(result);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
