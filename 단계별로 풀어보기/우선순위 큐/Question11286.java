package y202506.d17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Question11286 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            StringBuilder sb = new StringBuilder();

            PriorityQueue<Integer> absHeap = new PriorityQueue<>((a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return Integer.compare(a, b);
                }
                return Integer.compare(absA, absB);
            });

            for (int i = 0; i < n; i++) {
                int command = Integer.parseInt(reader.readLine());

                if (command == 0) {
                    sb.append(absHeap.isEmpty() ? 0 : absHeap.poll()).append("\n");
                } else {
                    absHeap.add(command);
                }
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
