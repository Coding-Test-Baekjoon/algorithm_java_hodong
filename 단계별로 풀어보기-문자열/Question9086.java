package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question9086 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            for (int i = 0; i < num; i++){
                String scoreArr = reader.readLine();

                if(scoreArr.length() != 1){
                    System.out.println(scoreArr.split("")[0] + scoreArr.split("")[scoreArr.length()-1]);
                } else {
                    System.out.println(scoreArr + scoreArr);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
