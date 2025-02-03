package y202502.d03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Question1620 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);

            HashMap<String, Integer> nameToNumber = new HashMap<>();
            HashMap<Integer, String> numberToName = new HashMap<>();

            for (int i = 0; i < n; i++){
                String pokemon = reader.readLine();
                nameToNumber.put(pokemon, i + 1);
                numberToName.put(i + 1, pokemon);
            }

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++){
                String value = reader.readLine();
                if(isInteger(value)){
                    builder.append(numberToName.get(Integer.parseInt(value)));
                } else {
                    builder.append(nameToNumber.get(value));
                }
                builder.append("\n");
            }

            System.out.println(builder.toString().trim());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
