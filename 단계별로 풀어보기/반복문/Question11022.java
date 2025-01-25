package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11022 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= num; i++){
                String[] numArr = reader.readLine().split(" ");
                builder.append("Case #"+i+": " + Integer.parseInt(numArr[0]) + " + " + Integer.parseInt(numArr[1]) + " = " + (Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1])) + "\n");
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
