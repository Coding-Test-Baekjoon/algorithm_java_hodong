package y202503.d27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question18258 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(reader.readLine());
            Deque<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                String command = st.nextToken();

                switch (command) {
                    case "push":
                        int x = Integer.parseInt(st.nextToken());
                        queue.addLast(x);
                        break;
                    case "pop":
                        sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append("\n");
                        break;
                    case "size":
                        sb.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                        break;
                    case "front":
                        sb.append(queue.isEmpty() ? "-1" : queue.getFirst()).append("\n");
                        break;
                    case "back":
                        sb.append(queue.isEmpty() ? "-1" : queue.getLast()).append("\n");
                        break;
                }
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
