import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final StringBuilder sb = new StringBuilder();

        int temp = 1;
        final Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            final int number = Integer.parseInt(br.readLine());

            while (temp <= number) {
                stack.push(temp);
                sb.append("+\n");
                temp++;
            }

            if (stack.peek() == number) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.print(sb);
    }
}
