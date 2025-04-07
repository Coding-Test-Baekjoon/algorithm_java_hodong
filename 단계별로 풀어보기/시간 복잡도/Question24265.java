package y202504.d07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question24265 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            long n = Long.parseLong(reader.readLine());
            System.out.println((n*(n-1))/2);
            System.out.println(2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
