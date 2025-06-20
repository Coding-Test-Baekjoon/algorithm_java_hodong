package y202506.d20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Question2075 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙

            for (int i = 0; i < n; i++) {
                String[] input = reader.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    int num = Integer.parseInt(input[j]);
                    pq.offer(num);

                    if (pq.size() > n) {
                        pq.poll();
                    }
                }
            }

            System.out.println(pq.peek()); // N번째로 큰 수

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
