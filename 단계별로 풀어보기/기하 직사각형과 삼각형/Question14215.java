package y202412.d29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question14215 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int angle1 = Integer.parseInt(strings[0]);
            int angle2 = Integer.parseInt(strings[1]);
            int angle3 = Integer.parseInt(strings[2]);

            int max = Math.max(angle1, Math.max(angle2, angle3));
            int sum = (angle1 + angle2 + angle3) - max;



            if (max < sum) {
                System.out.println(angle1 + angle2 + angle3);
                return;
            }

            max = sum - 1;
            System.out.println(max + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
