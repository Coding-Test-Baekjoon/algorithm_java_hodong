package y202503.d26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question12789 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int N = Integer.parseInt(reader.readLine());

            Queue<Integer> queue = new LinkedList<>();
            String[] strings = reader.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                queue.offer(Integer.parseInt(strings[i]));
            }

            Stack<Integer> stack = new Stack<>();
            int expected = 1;

            while (true) {
                if (!queue.isEmpty() && queue.peek() == expected) {
                    queue.poll();
                    expected++;
                } else if (!stack.isEmpty() && stack.peek() == expected) {
                    stack.pop();
                    expected++;
                } else if (!queue.isEmpty()) {
                    stack.push(queue.poll());
                } else {
                    break;
                }
            }

            System.out.println(stack.isEmpty() ? "Nice" : "Sad");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
