package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question9498 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int score = Integer.parseInt(reader.readLine());

            String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

            System.out.println(grade);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
