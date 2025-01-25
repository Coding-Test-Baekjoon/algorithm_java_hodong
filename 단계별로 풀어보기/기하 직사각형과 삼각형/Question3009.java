package y202412.d21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question3009 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int[][] ints = new int[3][2];

            for (int i = 0; i < 3; i++) {
                String[] strings = reader.readLine().split(" ");
                ints[i][0] = Integer.parseInt(strings[0]); // x축
                ints[i][1] = Integer.parseInt(strings[1]); // y축
            }

            int x = ints[0][0] ^ ints[1][0] ^ ints[2][0];
            int y = ints[0][1] ^ ints[1][1] ^ ints[2][1];

            System.out.println(x + " " + y);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
