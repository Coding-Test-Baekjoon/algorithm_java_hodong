package y202501.d22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question11651 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int anInt = Integer.parseInt(reader.readLine());
            int[][] arr = new int[anInt][2];

            for (int i =0; i < anInt; i++){
                String[] strings = reader.readLine().split(" ");

                int num1 =  Integer.parseInt(strings[0]);
                int num2 =  Integer.parseInt(strings[1]);

                arr[i][0]  = num1;
                arr[i][1]  = num2;

            }

            Arrays.sort(arr, (o1, o2) -> {
                if(o1[1] != o2[1]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            });

            for(int i = 0; i < anInt; i++){
                System.out.println(arr[i][0] + " "+arr[i][1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
