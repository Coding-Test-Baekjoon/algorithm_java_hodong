package y202501.d25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Question1181 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int count = Integer.parseInt(reader.readLine());

            // 중복 제거
            Set<String> set = new HashSet<>();
            for (int i = 0; i < count; i++) {
                set.add(reader.readLine());
            }

            // HashSet을 ArrayList로 변환
            List<String> strings = new ArrayList<>(set);

            // 정렬
            Collections.sort(strings, (s1, s2) -> {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            });

            // 출력
            for (String word : strings) {
                System.out.println(word);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
