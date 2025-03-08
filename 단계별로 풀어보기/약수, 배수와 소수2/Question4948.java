package y202503.d08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question4948 {

    private static final int LIMIT = 246_912;
    private static boolean[] isPrime = new boolean[LIMIT + 1];

    public static void main(String[] args) {

        preprocessPrimes();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();
            String input;

            while ((input = reader.readLine()) != null) {
                int num = Integer.parseInt(input);

                if (num == 0) {
                    break;
                }

                if (num == 1) {
                    builder.append(1).append("\n");
                    continue;
                }

                int count = findNextPrimeInRange(num);
                builder.append(count).append("\n");
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void preprocessPrimes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= LIMIT; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    private static int findNextPrimeInRange(int n) {
        int cnt = 0;

        for (int i =  n + 1; i <= 2 * n; i++) {
            if (isPrime[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
