package y202412.d23;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question15894 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println(Long.parseLong(reader.readLine()) * 4);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
