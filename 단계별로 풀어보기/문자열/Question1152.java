package y202411.d19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1152 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String str = reader.readLine().strip();

            String[] strArr = str.split(" ");

            if(str.equals("")){
                System.out.println(0);
            } else {
                System.out.println(strArr.length);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
