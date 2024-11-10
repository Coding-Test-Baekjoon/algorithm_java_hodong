package y202411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2884 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] timeArr = reader.readLine().split(" ");

            int hh = Integer.parseInt(timeArr[0]);
            int mm = Integer.parseInt(timeArr[1]);

            mm -= 45;

            if(mm < 0){
                hh -= 1;
                mm += 60;
                if(hh == -1){
                    hh = 23;
                }
            }

            System.out.println(hh + " " + mm);

        }  catch (Exception e) {
            e.printStackTrace();
        }

    }

}
