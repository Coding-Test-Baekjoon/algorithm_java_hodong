package y202503.d01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question13909 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            System.out.println(count(num));

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int count(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        return count;
    }
}
