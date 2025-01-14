package y202501.d14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2587 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int total = 0;
            int[] ints = new int[5];


            for (int i = 0; i < 5; i++){
                int num = Integer.parseInt(reader.readLine());
                total += num;
                ints[i] = num;
            }

            System.out.println(total/5);

            Arrays.sort(ints);
            System.out.println(ints[2]);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
