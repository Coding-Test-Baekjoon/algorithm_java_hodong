package y202504.d29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10872 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int result = 1;

            for (int i = 2; i <= n; i++) {
                result *= i;
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
