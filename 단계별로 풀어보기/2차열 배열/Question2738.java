package y202411.d28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2738 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] start = reader.readLine().split(" ");

            int num1 = Integer.parseInt(start[0]);
            int num2 = Integer.parseInt(start[1]);

            int[][] result1 = new int[num1][num2];
            int[][] result2 = new int[num1][num2];

            for (int i = 0; i < num1; i++){
                String[] strings = reader.readLine().split(" ");
                for (int j = 0; j < num2; j++){
                    result1[i][j] = Integer.parseInt(strings[j]);
                }
            }

            for (int i = 0; i < num1; i++){
                String[] strings = reader.readLine().split(" ");
                for (int j = 0; j < num2; j++){
                    result2[i][j] = Integer.parseInt(strings[j]);
                }
            }

            for (int i = 0; i < num1; i++){
                for (int j = 0; j < num2; j++){
                    System.out.print(result1[i][j] + result2[i][j] + " ");
                }
                System.out.println("");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
