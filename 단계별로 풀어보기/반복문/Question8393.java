package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question8393 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            int total = 0;

            for (int i = 1; i <= num; i++){
                total += i;
            }

            System.out.println(total);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
