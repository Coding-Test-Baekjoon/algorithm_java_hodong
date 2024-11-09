package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question10809 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();

            // baekjoon
            String str = reader.readLine();

            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                arr.add(str.indexOf('a' + i));
            }

            for (int pos : arr) {
                builder.append(pos + " ");
            }

            builder.deleteCharAt(builder.length() - 1);
            System.out.println(builder.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
