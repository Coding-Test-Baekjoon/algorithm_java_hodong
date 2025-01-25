package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10807 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(reader.readLine());

            String[] strArr = reader.readLine().split(" ");

            int forNum = Integer.parseInt(reader.readLine());

            int total = 0;

            for (int i = 0; i < num; i++){
                if(Integer.parseInt(strArr[i]) == forNum){
                    total++;
                }
            }

            System.out.println(total);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
