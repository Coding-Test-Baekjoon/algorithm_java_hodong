package y202412.d01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2563 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int[][] paper = new int[100][100];

            int count = Integer.parseInt(reader.readLine());

            for (int i = 0; i < count; i++){
                String[] strings = reader.readLine().split(" ");

                for (int j = Integer.parseInt(strings[0]); j < Integer.parseInt(strings[0]) + 10; j++){
                    for (int z = Integer.parseInt(strings[1]); z < Integer.parseInt(strings[1]) + 10; z++){
                        paper[j][z] = 1;
                    }

                }

            }

            int total = 0;

            for (int i = 0; i < 100; i++){
                for (int j = 0; j < 100; j++){
                    if(paper[i][j] != 0){
                        total += paper[i][j];
                    }
                }
            }

            System.out.print(total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
