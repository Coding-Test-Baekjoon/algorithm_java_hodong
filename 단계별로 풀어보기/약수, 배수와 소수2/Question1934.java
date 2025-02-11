package y202502.d11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1934 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int t = Integer.parseInt(reader.readLine());

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < t; i++){
                String[] strings = reader.readLine().split(" ");
                int num1 = Integer.parseInt(strings[0]);
                int num2 = Integer.parseInt(strings[1]);

                builder.append((num1 * num2) / getLcm(num1, num2)).append("\n");
            }

            System.out.println(builder.deleteCharAt(builder.length() - 1).toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int getLcm(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getLcm(num2, num1%num2);
    }

}
