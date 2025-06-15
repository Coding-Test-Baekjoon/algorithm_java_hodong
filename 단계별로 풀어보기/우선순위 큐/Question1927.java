package y202506.d15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Question1927 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            StringBuilder sb = new StringBuilder();

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                int command = Integer.parseInt(reader.readLine());

                if (command == 0) {
                    sb.append(minHeap.isEmpty() ? 0 : minHeap.poll()).append("\n");
                } else {
                    minHeap.add(command);
                }
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
