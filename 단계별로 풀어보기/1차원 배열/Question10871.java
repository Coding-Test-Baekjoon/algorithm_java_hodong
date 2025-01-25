package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10871 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strArr1 = reader.readLine().split(" ");
            String[] strArr2 = reader.readLine().split(" ");

            StringBuilder builder = new StringBuilder();
            for(String s : strArr2){
                if(Integer.parseInt(strArr1[1]) > Integer.parseInt(s)){
                    builder.append(s + " ");
                }
            }

            builder.deleteCharAt(builder.length() - 1);
            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
