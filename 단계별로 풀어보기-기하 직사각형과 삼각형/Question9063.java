package y202412.d25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question9063 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            if (num == 1){
                System.out.println(0);
                return;
            }

            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;

            for (int i = 0; i < num; i++){
                String[] strings = reader.readLine().split(" ");

                int x = Integer.parseInt(strings[0]);
                int y = Integer.parseInt(strings[1]);

                minX = (x < minX) ? x : minX;
                maxX = (x > maxX) ? x : maxX;
                minY = (y < minY) ? y : minY;
                maxY = (y > maxY) ? y : maxY;

            }

            int width = maxX - minX;
            int height = maxY - minY;

            System.out.println(width * height);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
