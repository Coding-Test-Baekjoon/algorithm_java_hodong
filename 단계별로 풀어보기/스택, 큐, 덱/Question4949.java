package y202503.d23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question4949 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder sb = new StringBuilder();
            String input;

            while (!(input = reader.readLine()).equals(".")) {
                sb.append(checkBalance(input) ? "yes\n" : "no\n");
            }

            System.out.print(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkBalance(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
