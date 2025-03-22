package y202503.d22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question9012 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int T = Integer.parseInt(reader.readLine());

            StringBuilder sb = new StringBuilder();

            while (T-- > 0) {
                String ps = reader.readLine();
                sb.append(isVPS(ps) ? "YES\n" : "NO\n");
            }

            System.out.print(sb.toString());

        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for (char c : ps.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
