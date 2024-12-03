package y202412.d03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2903 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            System.out.println((int)Math.pow(Math.pow(2, num) + 1, 2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
