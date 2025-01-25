package y202412.d08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11005 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            System.out.println(Integer.toString(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])).toUpperCase());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
