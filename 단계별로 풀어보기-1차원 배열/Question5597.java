package y202411.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5597 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            boolean[] booleans = new boolean[31];

            for (int i = 0; i < 28; i++){
                int num = Integer.parseInt(reader.readLine());
                booleans[num] = true;
            }

            for (int i = 1; i <= 30; i++){
                if (!booleans[i]){
                    System.out.println(i);
                }
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
