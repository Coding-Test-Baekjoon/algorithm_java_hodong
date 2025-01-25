package y202412.d28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5073 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder builder = new StringBuilder();

            while (true){
                String[] strings = reader.readLine().split(" ");
                int angle1 = Integer.parseInt(strings[0]);
                int angle2 = Integer.parseInt(strings[1]);
                int angle3 = Integer.parseInt(strings[2]);

                if (angle1 == 0 && angle2 == 0 && angle3 == 0) {
                    break;
                }

                // 세 변 중 가장 긴 변을 찾아 삼각형 조건 확인
                int max = Math.max(angle1, Math.max(angle2, angle3));
                int sum = angle1 + angle2 + angle3;

                // 나머지 두 변의 합이 가장 긴 변보다 작거나 같을 경우
                if (sum - max <= max) {
                    builder.append("Invalid").append("\n");
                    continue;
                }

                if (angle1 == angle2 && angle2 == angle3) {
                    builder.append("Equilateral");
                } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                    builder.append("Isosceles");
                } else {
                    builder.append("Scalene");
                }

                builder.append("\n");

            }

            System.out.println(builder.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
