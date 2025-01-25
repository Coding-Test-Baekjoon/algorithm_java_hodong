package y202412.d02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2292 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            if(num == 1){
                System.out.println(1);
                return;
            }

            int roomSize = 2;
            int count = 1;

            while (roomSize <= num) {
                roomSize = roomSize + (6 * count);
                count++;
            }

            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
