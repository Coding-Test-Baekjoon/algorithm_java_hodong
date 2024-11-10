package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question14681 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            short num1 = Short.parseShort(reader.readLine());
            short num2 = Short.parseShort(reader.readLine());

            if(num1 > 0 && num2 > 0){
                System.out.println("1");
            }

            if(num1 < 0 && num2 > 0){
                System.out.println("2");
            }

            if(num1 < 0 && num2 < 0){
                System.out.println("3");
            }

            if(num1 > 0 && num2 < 0){
                System.out.println("4");
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
