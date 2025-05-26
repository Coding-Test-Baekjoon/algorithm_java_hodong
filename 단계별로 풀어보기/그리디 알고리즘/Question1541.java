package y202505.d26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1541 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String expression = reader.readLine();
            String[] subtractions = expression.split("-");

            int total = 0;

            for (int i = 0; i < subtractions.length; i++) {
                int sum = 0;
                String[] additions = subtractions[i].split("\\+");

                for (String num : additions) {
                    sum += Integer.parseInt(num);
                }

                if (i == 0) {
                    total += sum;
                } else {
                    total -= sum;
                }
            }

            System.out.println(total);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
