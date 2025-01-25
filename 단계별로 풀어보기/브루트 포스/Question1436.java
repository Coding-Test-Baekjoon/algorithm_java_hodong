package y202501.d08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1436 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());

            int count = 0;
            int num = 666;

            // N번째 "666"이 포함된 수를 찾을 때까지 반복
            while (true) {
                if (String.valueOf(num).contains("666")) {
                    count++;
                }
                if (count == n) {
                    System.out.println(num);
                    break;
                }
                num++;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
