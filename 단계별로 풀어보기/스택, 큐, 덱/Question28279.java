package y202504.d01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Question28279 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                String[] command = reader.readLine().split(" ");
                switch (command[0]) {
                    case "1":
                        deque.addFirst(Integer.parseInt(command[1]));
                        break;
                    case "2":
                        deque.addLast(Integer.parseInt(command[1]));
                        break;
                    case "3":
                        sb.append(deque.isEmpty() ? "-1" : deque.pollFirst()).append("\n");
                        break;
                    case "4":
                        sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                        break;
                    case "5":
                        sb.append(deque.size()).append("\n");
                        break;
                    case "6":
                        sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                        break;
                    case "7":
                        sb.append(deque.isEmpty() ? "-1" : deque.getFirst()).append("\n");
                        break;
                    case "8":
                        sb.append(deque.isEmpty() ? "-1" : deque.getLast()).append("\n");
                        break;
                }
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
