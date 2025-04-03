package y202504.d03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Question2346 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");

            Deque<Node> deque = new ArrayDeque<>();

            for (int i = 0; i < N; i++) {
                deque.add(new Node(i + 1, Integer.parseInt(input[i])));
            }

            StringBuilder sb = new StringBuilder();

            while (!deque.isEmpty()) {
                Node balloon = deque.pollFirst();
                sb.append(balloon.index).append(" ");

                if (deque.isEmpty()) {
                    break;
                }

                int move = balloon.value;

                if (move > 0) { // 오른쪽
                    for (int i = 1; i < move; i++) {
                        deque.addLast(deque.pollFirst());
                    }
                } else {    // 왼쪽
                    for (int i = 0; i < Math.abs(move); i++) {
                        deque.addFirst(deque.pollLast());
                    }
                }
            }

            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Node {
        int index, value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

}
