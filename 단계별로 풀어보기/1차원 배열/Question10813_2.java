package y202411.d16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10813_2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr = reader.readLine().split(" ");

            List<Integer> arr = new ArrayList<>();
            for (int i = 1; i <= Integer.parseInt(strArr[0]); i++){
                arr.add(i);
            }

            for (int i = 0; i < Integer.parseInt(strArr[1]); i++) {
                String[] basketNumArr = reader.readLine().split(" ");
                Collections.swap(arr, Integer.parseInt(basketNumArr[0])-1, Integer.parseInt(basketNumArr[1])-1);
            }

            StringBuilder builder = new StringBuilder();
            for (int num : arr){
                builder.append(num + " ");
            }

            builder.deleteCharAt(builder.length() - 1);
            System.out.println(String.valueOf(builder));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
