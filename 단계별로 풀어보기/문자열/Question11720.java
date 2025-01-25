package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11720 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());
            String[] str = reader.readLine().split("");
            int total = 0;

            for (int i =0; i < num; i++){
                total += Integer.parseInt(str[i]);
            }

            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
