package y202411.d19;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2675 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i<num; i++){
                String[] strArr = reader.readLine().split(" ");
                for (int j = 0; j < strArr[1].length(); j++){
                    String[] strArr2 = strArr[1].split("");
                    for (int t = 0; t < Integer.parseInt(strArr[0]); t++){
                        builder.append(strArr2[j]);
                    }
                }
                builder.append("\n");
            }

            System.out.println(builder.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
