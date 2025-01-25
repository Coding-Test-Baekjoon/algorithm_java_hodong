package y202412.d10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question2501 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int num1 = Integer.parseInt(strings[0]);
            int num2 = Integer.parseInt(strings[1]);

            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for (int i = 1; i <= num1; i++){

                if(num1 % i == 0){
                    arrayList.add(i);
                }
            }

            if(arrayList.size() < num2){
                System.out.println(0);
            } else {
                System.out.println(arrayList.get(num2-1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
