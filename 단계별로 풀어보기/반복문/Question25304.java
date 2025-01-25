package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question25304 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int totalSum = Integer.parseInt(reader.readLine());
            int totalNum = Integer.parseInt(reader.readLine());

            int total = 0;

            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < totalNum; i++){
                String[] strArr = reader.readLine().split(" ");
                arr.add(Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1]));
            }

            for (int a : arr){
                total += a;
            }

            if (totalSum == total){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
