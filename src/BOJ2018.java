import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2018 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        int answer = 0;

        int start = 1;
        int end = 1;
        int sum = 1;
        while (start <= end) {
            if (sum == N) {
                answer++;
            }
            if (sum < N) {
                end++;
                sum += end;
            } else {
                sum -= start;
                start++;
            }
        }

        System.out.println(answer);
    }
}
