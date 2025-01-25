package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question10818 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());
            String[] strArr = reader.readLine().split(" ");
            List<Integer> strings = new ArrayList<>();

            for (int i = 0; i < num; i++){
                strings.add(Integer.parseInt(strArr[i]));
            }

            System.out.print(Collections.min(strings)+ " " +Collections.max(strings));

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
