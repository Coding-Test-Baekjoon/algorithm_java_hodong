package y202411.d30;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10798 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[][] ints = new String[15][15];

            for (int i = 0; i < 5; i++){
                String[] strings = reader.readLine().split("");

                for (int j = 0; j < strings.length; j++){
                    ints[j][i] = strings[j];
                }
            }

            for (int i = 0; i < 15; i++){
                    for (int j = 0; j < 15; j++){
                    if(ints[i][j] != null){
                        System.out.print(ints[i][j]);
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
