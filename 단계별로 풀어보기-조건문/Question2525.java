package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2525 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] timeArr = reader.readLine().split(" ");
            int addmm = Integer.parseInt(reader.readLine());

            int hh = Integer.parseInt(timeArr[0]);
            int mm = Integer.parseInt(timeArr[1]);

            mm += addmm;

            if(mm >= 60){
                hh += mm / 60;
                if(hh >= 24){
                    hh %= 24;
                }
                mm %= 60;
            }

            System.out.println(hh + " " + mm);

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
