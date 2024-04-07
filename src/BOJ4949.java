import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BOJ4949 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final List<String> inputs = new ArrayList<>();
        while (true) {
            final String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            inputs.add(input);
        }

        for (final String input : inputs) {
            final Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                final char c = input.charAt(i);
                if (c == '(' || c == '[') {
                    stack.add(c);
                }
                if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        stack.add('^');
                        break;
                    }
                    if (c == ')' && stack.peek() != '(') {
                        break;
                    }
                    if (c == ']' && stack.peek() != '[') {
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
