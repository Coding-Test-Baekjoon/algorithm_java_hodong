package y202506.d24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question24416 {
    static int recursiveCount = 0;

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            recursiveCount++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int dp(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;
        int count = 0;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());

            fib(n); // 재귀 호출 횟수 세기
            int dpCount = dp(n); // DP 계산 횟수 세기

            System.out.println(recursiveCount + " " + dpCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
