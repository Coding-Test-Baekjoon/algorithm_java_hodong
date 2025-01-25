package y202411.d20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2908 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split(" ");

            int strNum1 = Integer.parseInt(new StringBuilder(strArr[0]).reverse().toString());
            int strNum2 = Integer.parseInt(new StringBuilder(strArr[1]).reverse().toString());

            System.out.println((strNum1 > strNum2) ? strNum1 : strNum2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
