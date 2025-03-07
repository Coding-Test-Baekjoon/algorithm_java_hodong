package y202503.d07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1929 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");
            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);

            StringBuilder builder = new StringBuilder();
            for (int i = n; i <= m; i++) {
                if(findPrimeNumber(i)){
                    builder.append(i).append("\n");
                }
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean findPrimeNumber(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
