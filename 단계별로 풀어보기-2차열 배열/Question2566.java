package y202411.d28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2566 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int[][] ints = new int[9][9];

            int max = Integer.MIN_VALUE;
            int row = 0;
            int column = 0;

            for (int i = 0; i < 9; i++){
                String[] strings = reader.readLine().split(" ");
                for (int j = 0; j < 9; j++){
                    ints[i][j] = Integer.parseInt(strings[j]);
                }
            }

            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 9; j++){
                    if (max < ints[i][j]){
                        max = ints[i][j];
                        row = i + 1;
                        column = j + 1;
                    }
                }
            }

            System.out.println(max);
            System.out.println(row + " " + column);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
