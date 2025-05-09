package y202505.d09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question27433 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            System.out.println(factorial(n));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
