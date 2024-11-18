package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2743 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println(reader.readLine().length());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
