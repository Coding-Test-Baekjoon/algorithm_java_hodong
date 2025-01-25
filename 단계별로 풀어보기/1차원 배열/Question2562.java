package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2562 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int maxIndex = 0;
            int max = 0;

            for (int i = 0; i < 9; i++) {
                int number = Integer.parseInt(reader.readLine());

                if (number > max) {
                    max = number;
                    maxIndex = i + 1;
                }
            }

            System.out.println(max);
            System.out.println(maxIndex);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
