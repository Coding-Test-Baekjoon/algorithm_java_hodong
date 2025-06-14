package y202506.d14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Question11279 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            StringBuilder sb = new StringBuilder();

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                int command = Integer.parseInt(reader.readLine());
                if (command == 0) {
                    sb.append(maxHeap.isEmpty() ? 0 : maxHeap.poll()).append("\n");
                } else {
                    maxHeap.add(command);
                }
            }

            System.out.print(sb);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
