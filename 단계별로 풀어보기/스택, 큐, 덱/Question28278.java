package y202503.d10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Question28278 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            int num = Integer.parseInt(reader.readLine());

            Stack<Integer> stack = new Stack<>();
            StringBuilder builder = new StringBuilder();
            while (num-- > 0) {
                String input = reader.readLine();
                String[] parts = input.split(" ");
                int command = Integer.parseInt(parts[0]);

                int value = 0;
                if (parts.length > 1) {
                    value = Integer.parseInt(parts[1]);
                    processCommand( stack, command, value);
                    continue;
                }

                builder.append(processCommand( stack, command, value)).append("\n");
            }
            System.out.println(builder.toString());


        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int processCommand(Stack<Integer> stack, int command, int value) {
        switch (command) {
            case 1:
                stack.push(value);
                return 0;
            case 2:
                return stack.isEmpty() ? -1 : stack.pop();
            case 3:
                return stack.size();
            case 4:
                return stack.empty() ? 1 : 0;
            case 5:
                return stack.isEmpty() ? -1 : stack.peek();
            default:
                System.out.println("잘못된 명령어입니다.");
                return -1;
        }
    }
}
