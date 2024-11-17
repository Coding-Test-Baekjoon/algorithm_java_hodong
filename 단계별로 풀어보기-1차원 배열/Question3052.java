package y202411.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question3052 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            List<String> strList = new ArrayList<>();

            for (int i = 0; i < 10; i++){
                strList.add(String.valueOf(Integer.parseInt(reader.readLine()) % 42));
            }

            Set<String> set = new HashSet<>(strList);

            System.out.println(set.size());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
