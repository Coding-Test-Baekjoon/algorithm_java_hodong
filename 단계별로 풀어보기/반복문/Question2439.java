package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2439 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int starNum = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= starNum; i++){
                for (int j = 1; j <= starNum-i; j++){
                    System.out.print(" ");
                }
                for (int j = 1; i >= j; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
