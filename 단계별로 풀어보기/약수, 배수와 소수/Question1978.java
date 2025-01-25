package y202412.d14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1978 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int num = Integer.parseInt(reader.readLine());

            String[] strings = reader.readLine().split(" ");

            int count = 0;
            for (String s : strings) {

                int decimalValue = Integer.parseInt(s);

                if(decimalValue < 2) {
                    continue;
                }

                boolean ck = true;
                for (int j = 2; j * j <= decimalValue; j++) {
                    if (decimalValue % j == 0) {
                        ck = false;
                        break;
                    }
                }


                if(ck){
                    count++;
                }

            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
