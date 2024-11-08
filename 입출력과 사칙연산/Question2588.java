package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2588 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){


            int num = Integer.parseInt(reader.readLine());
            String[] arr2 = reader.readLine().split("");

            System.out.println(num * Integer.parseInt(arr2[2]));
            System.out.println(num * Integer.parseInt(arr2[1]));
            System.out.println(num * Integer.parseInt(arr2[0]));
            System.out.println(num * Integer.parseInt(arr2[0] + arr2[1] + arr2[2]));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
