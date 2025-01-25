package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1330 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split(" ");

            int num1 = Integer.parseInt(strArr[0]);
            int num2 = Integer.parseInt(strArr[1]);

            if(num1 < num2){
                System.out.println("<");
            }

            if(num1 > num2){
                System.out.println(">");
            }

            if(num1 == num2){
                System.out.println("==");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
