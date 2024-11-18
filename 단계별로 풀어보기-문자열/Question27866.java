package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question27866 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println(reader.readLine().charAt(Integer.parseInt(reader.readLine())-1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
