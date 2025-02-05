package y202502.d05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Question10816 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());
            int[] coords = new int[n];
            String[] coordinateList = reader.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                coords[i] = Integer.parseInt(coordinateList[i]);
            }

            Map<Integer, Integer> map = new HashMap<>();

            for (int num : coords) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int m = Integer.parseInt(reader.readLine());
            String[] mList = reader.readLine().split(" ");

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                if(map.get(Integer.parseInt(mList[i])) == null) {
                    builder.append(0).append(" ");
                } else {
                    builder.append(map.get(Integer.parseInt(mList[i]))).append(" ");
                }
            }

            System.out.println(builder.toString().trim());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
