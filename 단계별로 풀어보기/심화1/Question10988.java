package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10988 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String str = reader.readLine();
            int len = str.length();

            int half = len / 2;
            boolean check = true;

            for(int i = 0; i < half; i++) {
                if(str.charAt(i) != str.charAt(len - 1 - i)) {
                    check = false;
                    System.out.println(0);
                    break;
                }
            }

            if(check) {
                System.out.println(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
