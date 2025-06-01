package y202506.d01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question1920 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int[] a = new int[n];
            String[] aInput = reader.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(aInput[i]);
            }

            Arrays.sort(a); // 이분 탐색 위해 정렬

            int m = Integer.parseInt(reader.readLine());
            String[] mInput = reader.readLine().split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < m; i++) {
                int target = Integer.parseInt(mInput[i]);
                result.append(binarySearch(a, target)).append("\n");
            }

            System.out.print(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return 1;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return 0;
    }
}
