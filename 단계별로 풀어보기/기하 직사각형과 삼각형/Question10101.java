package y202412.d26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question10101 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int angle1 = Integer.parseInt(reader.readLine());
            int angle2 = Integer.parseInt(reader.readLine());
            int angle3 = Integer.parseInt(reader.readLine());

            int total = angle1 + angle2 + angle3;

            // 세 각의 합이 180이 아닌 경우
            if (total != 180) {
                System.out.println("Error");
                return;
            }

            // 세 각의 크기가 모두 60이면
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral");
                return;
            }

            // 세 각의 합이 180이고, 두 각이 같은 경우
            if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Isosceles");
                return;
            }

            // 세 각의 합이 180이고, 같은 각이 없는 경우
            System.out.println("Scalene");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
