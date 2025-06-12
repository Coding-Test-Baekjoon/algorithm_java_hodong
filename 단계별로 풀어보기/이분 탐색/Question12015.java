package y202506.d12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question12015 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int[] arr = new int[n];

            String[] input = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            List<Integer> lis = new ArrayList<>();

            for (int num : arr) {
                int left = 0;
                int right = lis.size();

                while (left < right) {
                    int mid = (left + right) / 2;
                    if (lis.get(mid) < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }

                if (left == lis.size()) {
                    lis.add(num);
                } else {
                    lis.set(left, num);
                }
            }

            System.out.println(lis.size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
