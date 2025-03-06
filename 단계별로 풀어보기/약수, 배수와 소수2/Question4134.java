package y202503.d06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question4134 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            long num = Long.parseLong(reader.readLine());

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < num; i++) {
                long n = Long.parseLong(reader.readLine());

                long prime = findValue(n);
                builder.append(prime).append("\n");
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long findValue(long n) {
        if (n <= 2) return 2;

        long candidate = n;

        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static boolean isPrime(long n) {
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
