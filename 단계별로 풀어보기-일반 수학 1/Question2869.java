package y202412.d05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2869 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int climb = Integer.parseInt(strings[0]);
            int down = Integer.parseInt(strings[1]);
            int top = Integer.parseInt(strings[2]);

            int day = (top - down) / (climb - down);

            // 다른 문제 풀이 봤는데 이렇게 푸네요
            // (int)Math.ceil((double)(V - B) / (A - B));

            if ((top - down) % (climb - down) != 0){
                day++;
            }

            System.out.println(day);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
