package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10952 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();

            while (true){
                String[] numArr = reader.readLine().split(" ");
                if((Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1])) != 0){
                    builder.append((Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1])) + "\n");
                } else {
                    break;
                }
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
