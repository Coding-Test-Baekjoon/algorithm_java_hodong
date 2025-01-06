package y202501.d05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2231 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());
            int result = 0;

            int start = Math.max(1, n - String.valueOf(n).length() * 9);

            for (int i = start; i < n; i++) {
                if (getDecomposedSum(i) == n) {
                    result = i;
                    break;
                }
            }

            if (result == 0){
                System.out.println(0);
            } else {
                System.out.println(result);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getDecomposedSum(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
