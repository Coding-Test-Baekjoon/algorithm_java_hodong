package y202502.d08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Question1269 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);

            Set<Integer> diffA = new HashSet<>(forSet(a, reader));
            Set<Integer> diffB = new HashSet<>(forSet(b, reader));

            Set<Integer> tempA = new HashSet<>(diffA);
            diffA.removeAll(diffB);
            diffB.removeAll(tempA);

            System.out.println(diffA.size() + diffB.size());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Set<Integer> forSet(int num, BufferedReader reader) throws IOException {
        Set<Integer> set = new HashSet<>();
        String[] values = reader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            set.add(Integer.parseInt(values[i]));
        }
        return set;
    }
}
