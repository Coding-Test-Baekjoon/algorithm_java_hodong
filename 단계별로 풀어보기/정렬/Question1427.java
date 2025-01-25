package y202501.d20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question1427 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            char[] cArr = reader.readLine().toCharArray();

            Arrays.sort(cArr);

            StringBuilder builder = new StringBuilder(Arrays.toString(cArr));
            System.out.println(builder.reverse().toString().replaceAll("[^0-9]", "").trim());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
