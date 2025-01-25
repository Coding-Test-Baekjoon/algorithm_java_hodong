package y202412.d09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5086 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();

            while (true){
                String[] strings = reader.readLine().split(" ");

                int num1 = Integer.parseInt(strings[0]);
                int num2 = Integer.parseInt(strings[1]);

                if(num1 == 0 && num2 == 0){
                    break;
                }

                if(num2 % num1 == 0){
                    builder.append("factor").append("\n");
                } else if(num1 % num2 == 0){
                    builder.append("multiple").append("\n");
                } else {
                    builder.append("neither").append("\n");
                }


            }

            System.out.println(builder.toString());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
