package y202411.d16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10810 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split(" ");

            int[] ints = new int[Integer.parseInt(strArr[0])];

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < Integer.parseInt(strArr[1]); i++) {
                String[] arrNum = reader.readLine().split(" ");
                for (int j = Integer.parseInt(arrNum[0]); j <= Integer.parseInt(arrNum[1]); j++){
                    ints[j-1] = Integer.parseInt(arrNum[2]);
                }
            }

            for (int num : ints){
                builder.append(num + " ");
            }

            builder.deleteCharAt(builder.length() - 1);
            System.out.println(String.valueOf(builder));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
