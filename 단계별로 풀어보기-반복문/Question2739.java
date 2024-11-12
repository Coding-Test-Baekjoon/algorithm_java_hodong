package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2739 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int year = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= 9; i++){
                System.out.println(year + " * " + i + " = " + year*i);
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
