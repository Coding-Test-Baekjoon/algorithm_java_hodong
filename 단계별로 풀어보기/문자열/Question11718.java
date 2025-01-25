package y202411.d20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11718 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();
            String str;

            while((str = reader.readLine()) != null) {
                builder.append(str + "\n");
            }

            System.out.println(builder.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
