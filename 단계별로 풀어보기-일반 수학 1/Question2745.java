package y202412.d07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2745 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            System.out.println(Integer.parseInt(strings[0], Integer.parseInt(strings[1])));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
