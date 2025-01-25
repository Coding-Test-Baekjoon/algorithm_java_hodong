package y202412.d15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2581 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int min = Integer.parseInt(reader.readLine());
            int max = Integer.parseInt(reader.readLine());

            int sum = 0;
            int minVal = 0;

            for (int i = min; i <= max; i++) {
                if (decimalCheck(i, minVal)) {
                    sum += i;

                    if(minVal == 0){
                        minVal = i;
                    }

                }
            }

            if (sum == 0){
                System.out.println(-1);
                return;
            }

            System.out.println(sum);
            System.out.println(minVal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean decimalCheck(int num, int minVal) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
