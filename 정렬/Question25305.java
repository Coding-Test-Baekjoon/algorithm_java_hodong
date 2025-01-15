package y202501.d15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Question25305 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] prizeWinner = reader.readLine().split(" ");
            String[] scores = reader.readLine().split(" ");

            int count = Integer.parseInt(prizeWinner[0]);

            Integer[] ints = new Integer[count];

            for (int i= 0; i < count; i++){
                ints[i] = Integer.parseInt(scores[i]);
            }

            Arrays.sort(ints, Collections.reverseOrder());
            System.out.println(ints[Integer.parseInt(prizeWinner[1])-1]);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
