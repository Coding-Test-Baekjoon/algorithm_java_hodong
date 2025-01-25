package y202501;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2839 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int kg = Integer.parseInt(reader.readLine());

            int count = 0;

            while (kg >= 0) {
                if (kg % 5 == 0) {
                    count += kg / 5;
                    System.out.println(count);
                    return;
                }
                kg -= 3;
                count++;
            }

            System.out.println(-1);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
