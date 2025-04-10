package y202504.d10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question24266 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            long n = Long.parseLong(reader.readLine());

            System.out.println(n*n*n + "\n" + 3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
