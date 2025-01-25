package y202412.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1085 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int x = Integer.parseInt(strings[0]);
            int y = Integer.parseInt(strings[1]);
            int w = Integer.parseInt(strings[2]);
            int h = Integer.parseInt(strings[3]);

            int minDistance = Math.min(Math.min(x, y), Math.min(w - x, h - y));

            System.out.println(minDistance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
