package y202501.d19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Question10989 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){

            int count = Integer.parseInt(reader.readLine());

            int[] arrNum = new int[count];

            for (int i = 0; i < count; i++) {
                arrNum[i] = Integer.parseInt(reader.readLine());
            }

            Arrays.sort(arrNum);

            for (int num : arrNum) {
                writer.write(num + "\n");
            }
            writer.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
