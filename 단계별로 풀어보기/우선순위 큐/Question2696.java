package y202506.d22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Question2696 {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int T = Integer.parseInt(reader.readLine());

            while (T-- > 0) {
                int m = Integer.parseInt(reader.readLine());
                int count = 0;

                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
                PriorityQueue<Integer> minHeap = new PriorityQueue<>();

                List<Integer> result = new ArrayList<>();
                int total = 0;

                while (total < m) {
                    String[] input = reader.readLine().split(" ");
                    for (String s : input) {
                        if (s.isEmpty()) continue;
                        int num = Integer.parseInt(s);

                        if (maxHeap.size() == minHeap.size()) {
                            maxHeap.offer(num);
                        } else {
                            minHeap.offer(num);
                        }

                        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                            int maxTop = maxHeap.poll();
                            int minTop = minHeap.poll();
                            maxHeap.offer(minTop);
                            minHeap.offer(maxTop);
                        }

                        count++;
                        if (count % 2 == 1) {
                            result.add(maxHeap.peek());
                        }
                    }
                    total += input.length;
                }

                output.append(result.size()).append("\n");
                for (int i = 0; i < result.size(); i++) {
                    output.append(result.get(i)).append(" ");
                    if ((i + 1) % 10 == 0) output.append("\n");
                }
                output.append("\n");
            }

            System.out.print(output);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
