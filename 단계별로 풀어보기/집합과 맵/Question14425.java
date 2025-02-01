package y202502.d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question14425 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String[] strings = reader.readLine().split(" ");

            int n = Integer.parseInt(strings[0]);
            int m = Integer.parseInt(strings[1]);

            Set<String> stringSet = storageStringSet(reader, n);
            List<String> checkList = storageStringList(reader, m);

            System.out.println(countMatchingWords(stringSet, checkList));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int countMatchingWords(Set<String> stringSet, List<String> checkList) {
        int count = 0;
        for (String s : checkList) {
            if (stringSet.contains(s)) {
                count++;
            }
        }
        return count;
    }

    private static Set<String> storageStringSet(BufferedReader reader, int count) throws IOException {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(reader.readLine());
        }
        return set;
    }

    private static List<String> storageStringList(BufferedReader reader, int m) throws IOException {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(reader.readLine());
        }
        return list;
    }
}
