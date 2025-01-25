package y202412.d11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question9506 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            while (true){

                int num = Integer.parseInt(reader.readLine());

                if (num == -1){
                    break;
                }

                arrayList.add(num);

            }

            for (int i = 0; i < arrayList.size(); i++){
                int count = 0;
                StringBuilder builder = new StringBuilder();

                for (int j = 1; j <= arrayList.get(i); j++){

                    if(arrayList.get(i) % j == 0){
                        if(arrayList.get(i) != j){
                            count += j;
                            builder.append(j + " + ");
                        }
                    }
                }

                if(count == arrayList.get(i)){
                    System.out.println(arrayList.get(i) + " = " + builder.deleteCharAt(builder.length() - 2).toString().trim());
                } else {
                    System.out.println(arrayList.get(i) + " is NOT perfect.");
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
