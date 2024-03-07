import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2018 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = i; j <= N; j++) {
                sum += j;
                if (sum == N) {
                    answer++;
                    break;
                } else if (sum > N) {
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
