package y202503.d28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Question2164 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(reader.readLine());

            Deque<Integer> queue = new ArrayDeque<>();

            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }

            while (queue.size() > 1) {
                queue.poll();
                queue.add(queue.poll());
            }

            System.out.println(queue.peek());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
