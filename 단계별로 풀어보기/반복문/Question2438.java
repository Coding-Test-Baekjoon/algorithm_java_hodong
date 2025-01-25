package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2438 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int starNum = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= starNum; i ++){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
