package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question15552 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < num; i++){
                String[] strArr = reader.readLine().split(" ");
                builder.append(Short.parseShort(strArr[0]) + Short.parseShort(strArr[1]) + "\n");
            }

            System.out.println(builder.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
