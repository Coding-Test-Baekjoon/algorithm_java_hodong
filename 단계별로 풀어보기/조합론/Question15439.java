package y202504.d27;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question15439 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int result = n * (n - 1);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
