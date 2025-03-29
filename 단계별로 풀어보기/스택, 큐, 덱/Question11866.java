package y202503.d29;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question11866 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] s = reader.readLine().split(" ");

            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);

            Deque<Integer> queue = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            sb.append("<");

            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }

            while (!queue.isEmpty()) {
                for (int i = 0; i < K - 1; i++) {
                    queue.add(queue.poll());
                }
                sb.append(queue.poll());

                if (!queue.isEmpty()) {
                    sb.append(", ");
                }
            }

            sb.append(">");
            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
