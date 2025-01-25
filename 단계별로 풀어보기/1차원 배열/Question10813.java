package y202411.d16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10813 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split(" ");

            int[] ints = new int[Integer.parseInt(strArr[0])];

            for (int i = 1; i <= ints.length; i++){
                ints[i-1] = i;
            }

            for (int i = 0; i < Integer.parseInt(strArr[1]); i++) {
                String[] basketNumArr = reader.readLine().split(" ");
                int storageNum = ints[Integer.parseInt(basketNumArr[0])-1];
                ints[Integer.parseInt(basketNumArr[0])-1] = ints[Integer.parseInt(basketNumArr[1])-1];
                ints[Integer.parseInt(basketNumArr[1])-1] = storageNum;
            }

            StringBuilder builder = new StringBuilder();

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
