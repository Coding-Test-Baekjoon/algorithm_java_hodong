package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11654 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println((int)reader.readLine().charAt(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
