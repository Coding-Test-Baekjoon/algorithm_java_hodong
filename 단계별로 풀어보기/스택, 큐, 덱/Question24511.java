package y202505.d08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question24511 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            String[] types = reader.readLine().split(" ");
            String[] values = reader.readLine().split(" ");

            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                if (types[i].equals("0")) {
                    deque.addLast(Integer.parseInt(values[i]));
                }
            }

            int m = Integer.parseInt(reader.readLine());
            String[] strings = reader.readLine().split(" ");

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < m; i++) {
                int inputVal = Integer.parseInt(strings[i]);
                deque.addFirst(inputVal);
                builder.append(deque.removeLast()).append(" ");
            }

            System.out.println(builder);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
