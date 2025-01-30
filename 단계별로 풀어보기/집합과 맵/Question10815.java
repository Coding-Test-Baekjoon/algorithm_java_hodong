package y202501.d29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Question10815 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());
            int[] coords = new int[n];
            String[] coordinateList = reader.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                coords[i] = Integer.parseInt(coordinateList[i]);
            }

            int[] ints = Arrays.stream(coords).distinct().sorted().toArray();

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < ints.length; i++) {
                hashMap.put(ints[i], i);
            }

            StringBuilder builder = new StringBuilder();

            for (int num : coords) {
                builder.append(hashMap.get(num)).append(" ");
            }

            System.out.println(builder.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
