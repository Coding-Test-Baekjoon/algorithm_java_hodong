package y202411.d21;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1157 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String str = reader.readLine().toLowerCase();

            int[] ints = new int[26];

            for (int i = 0; i < str.length(); i++){
                for (int j = 97; j < 123; j++){
                    if(str.charAt(i) == (char) j){
                        ints[j-97] += 1;
                    }
                }
            }

            int max = 0;
            String charStr = "";
            boolean DuplicateValState = false;

            int num = 0;

            for (int i : ints){
                if(i > max){
                    max = i;
                    DuplicateValState = false;
                    charStr = String.valueOf((char) (num + 97));
                } else if(max == i){
                    DuplicateValState = true;
                }
                num++;
            }

            if (DuplicateValState) {
                System.out.println("?");
            } else {
                System.out.println(String.valueOf(charStr).toUpperCase());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
