package y202412.d30;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1193 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int parseInt = Integer.parseInt(reader.readLine());

            int diagonal = diagonalValue(parseInt);
            int startPosition = (diagonal * (diagonal - 1)) / 2;
            int position = parseInt - startPosition;

            System.out.println(fractionalCalculation(diagonal, position));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int diagonalValue(int parseInt) {
        int diagonal = 1;

        while ((diagonal * (diagonal + 1)) / 2 < parseInt) {
            diagonal++;
        }
        return diagonal;
    }

    private static String fractionalCalculation(int diagonal, int position){
        int numerator;
        int denominator;

        if(diagonal % 2 == 0){
            numerator = position;
            denominator = diagonal - position + 1;
        } else {
            numerator = diagonal - position + 1;
            denominator = position;
        }

        return numerator + "/" + denominator;
    }

}
