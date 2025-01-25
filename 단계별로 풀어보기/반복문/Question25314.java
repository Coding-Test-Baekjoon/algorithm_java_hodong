package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question25314 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int integer = Integer.parseInt(reader.readLine());

            StringBuilder builder = new StringBuilder();
            for (int i = 1; i*4 <= integer; i++){
                builder.append("long ");
            }

            System.out.println(builder.append("int").toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
