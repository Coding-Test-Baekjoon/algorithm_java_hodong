package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2480 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] diceArr = reader.readLine().split(" ");

            int num1 = Integer.parseInt(diceArr[0]);
            int num2 = Integer.parseInt(diceArr[1]);
            int num3 = Integer.parseInt(diceArr[2]);

            if (num1 == num2 && num2 == num3) {
                System.out.println(10000 + num1 * 1000);
                return;
            }

            if (num1 == num2) {
                System.out.println(1000 + num1 * 100);
                return;
            }

            if (num2 == num3) {
                System.out.println(1000 + num2 * 100);
                return;
            }

            if (num1 == num3) {
                System.out.println(1000 + num1 * 100);
                return;
            }

            if (num1 != num2 && num2 != num3 && num1 != num3){
                System.out.println(Math.max(num1, Math.max(num2, num3)) * 100);
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
