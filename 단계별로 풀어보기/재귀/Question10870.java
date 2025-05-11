package y202505.d11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10870 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            System.out.println(fibonacci(n));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
