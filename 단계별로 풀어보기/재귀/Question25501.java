package y202505.d13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question25501 {
    static int count;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int t = Integer.parseInt(reader.readLine());
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < t; i++) {
                String s = reader.readLine();
                count = 0;
                int isPal = isPalindrome(s);
                result.append(isPal).append(" ").append(count).append("\n");
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        count++;
        if (l >= r) return 1;
        if (s.charAt(l) != s.charAt(r)) return 0;
        return recursion(s, l + 1, r - 1);
    }
}
