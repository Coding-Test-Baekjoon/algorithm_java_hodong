package y202411.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1546 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int subNum = Integer.parseInt(reader.readLine());
            Double[] ints = new Double[subNum];

            Double maximum = 0.0;

            String[] scoreArr = reader.readLine().split(" ");

            for (int i = 0; i < subNum; i++){
                ints[i] = Double.valueOf(scoreArr[i]);
                if(maximum < ints[i]){
                    maximum = ints[i];
                }
            }
            Double total = 0.0;

            for (Double num : ints){
                total += ((num/maximum)*100)/subNum;
            }

            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
