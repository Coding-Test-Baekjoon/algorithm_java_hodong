package y202502.d02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Question7785 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(reader.readLine());

            Set<String> set = new TreeSet<>(Comparator.reverseOrder());
            for (int i = 0; i < n; i++){
                String[] strings = reader.readLine().split(" ");

                String name = strings[0];
                String workStatus = strings[1];

                if(workStatus.equals("enter")){
                    set.add(name);
                } else {
                    set.remove(name);
                }
            }

            for (String s : set) {
                System.out.println(s);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
