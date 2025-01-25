package y202501.d11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2750 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int count = Integer.parseInt(reader.readLine());

            int[] arrNum = new int[count];

            for (int i = 0; i < count; i++){
                int num = Integer.parseInt(reader.readLine());
                arrNum[i] = num;
            }

            Arrays.sort(arrNum);

                for (int i : arrNum) {
                System.out.println(i);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
