package y202505.d18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question20920 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strings = reader.readLine().split(" ");
            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);

            Map<String, Integer> wordCount = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String word = reader.readLine();

                if (word.length() > m) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            List<String> words = new ArrayList<>(wordCount.keySet());

            words.sort((a, b) -> {
                int countCompare = wordCount.get(b) - wordCount.get(a);
                if (countCompare != 0) {
                    return countCompare;
                }

                int lengthCompare = b.length() - a.length();
                if (lengthCompare != 0) {
                    return lengthCompare;
                }

                return a.compareTo(b);
            });

            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word).append("\n");
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

