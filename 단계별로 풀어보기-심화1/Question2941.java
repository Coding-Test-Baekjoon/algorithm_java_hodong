package y202411.d24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2941 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder(reader.readLine());

            String[] strings = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
            int count = 0;

            for (String str : strings){
                int index = builder.indexOf(str);
                while (index != -1) {
                    count++;
                    builder.replace(index, index + str.length(), " ");
                    index = builder.indexOf(str);
                }
            }

            count += builder.toString().replace(" ", "").length();

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
