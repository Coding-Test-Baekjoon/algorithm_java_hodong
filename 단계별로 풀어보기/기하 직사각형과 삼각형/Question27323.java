package y202412.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question27323 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println(Integer.parseInt(reader.readLine()) * Integer.parseInt(reader.readLine()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
