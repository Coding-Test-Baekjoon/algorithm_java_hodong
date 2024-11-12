package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question10950 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < num; i++){
                String[] strArr = reader.readLine().split(" ");
                arr.add(Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
            }

            for (int a : arr){
                System.out.println(a);
            }


        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
