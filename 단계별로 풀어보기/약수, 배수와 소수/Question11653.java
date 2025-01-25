package y202412.d16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11653 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            primeFactorization(num);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void primeFactorization(int num) {
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }

        if (num != 1){
            System.out.println(num);
        }

    }

}
