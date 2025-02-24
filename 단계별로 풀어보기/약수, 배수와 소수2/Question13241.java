package y202502.d24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question13241 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            long num1 = Integer.parseInt(strings[0]);
            long num2 = Integer.parseInt(strings[1]);

            long value = (num1 * num2) / getLcm(num1, num2);

            System.out.println(value);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static long getLcm(long num1, long num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getLcm(num2, num1%num2);
    }
}
