package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question11382 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] arr = reader.readLine().split(" ");

            System.out.print(Long.parseLong(arr[0]) + Long.parseLong(arr[1]) + Long.parseLong(arr[2]));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
