package y202501.d02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2444 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int parseInt = Integer.parseInt(reader.readLine());

            // 위쪽
            for (int i = 1; i <= parseInt; i++) {

                for (int j = 1; j <= parseInt - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            // 아래쪽
            for (int i = parseInt - 1; i >= 1; i--) {

                for (int j = 1; j <= parseInt - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
