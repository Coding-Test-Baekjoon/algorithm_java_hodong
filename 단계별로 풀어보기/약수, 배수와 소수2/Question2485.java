package y202503.d05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2485 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int N = Integer.parseInt(reader.readLine());
            int prevPosition = Integer.parseInt(reader.readLine());

            int[] gaps = new int[N - 1];
            int gcd = 0;

            for (int i = 0; i < N - 1; i++) {
                int currentPosition = Integer.parseInt(reader.readLine());
                int gap = currentPosition - prevPosition;

                gaps[i] = gap;
                gcd = (i == 0) ? gap : gcd(gcd, gap);

                prevPosition = currentPosition;
            }

            int num = 0;

            for (int i = 0; i < gaps.length; i++) {
                num += (gaps[i] / gcd) - 1;
            }

            System.out.println(num);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}
