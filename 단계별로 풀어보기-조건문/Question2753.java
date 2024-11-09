package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Year;

public class Question2753 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int year = Integer.parseInt(reader.readLine());

            System.out.println(Year.isLeap(year) ? 1 : 0);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
