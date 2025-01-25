package y202501.d07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question19532 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int a1 = Integer.parseInt(strings[0]);
            int b1 = Integer.parseInt(strings[1]);
            int c1 = Integer.parseInt(strings[2]);
            int a2 = Integer.parseInt(strings[3]);
            int b2 = Integer.parseInt(strings[4]);
            int c2 = Integer.parseInt(strings[5]);

            int det = a1 * b2 - a2 * b1;

            int x = (c1 * b2 - c2 * b1) / det;
            int y = (a1 * c2 - a2 * c1) / det;

            System.out.println(x + " " + y);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
