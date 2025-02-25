package y202502.d25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1735 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings1 = reader.readLine().split(" ");
            String[] strings2 = reader.readLine().split(" ");

            int A = Integer.parseInt(strings1[0]);
            int B = Integer.parseInt(strings1[1]);
            int C = Integer.parseInt(strings2[0]);
            int D = Integer.parseInt(strings2[1]);

            int numerator = getNumerator(A, B, C, D);
            int denominator = getDenominator(B, D);

            int gcd = gcd(numerator, denominator);

            System.out.println((numerator / gcd) + " " + (denominator / gcd));

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getNumerator(int A, int B, int C, int D) {
        return (A * D) + (C * B);
    }

    public static int getDenominator(int B, int D) {
        return B * D;
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
