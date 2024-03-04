import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10986 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] split = br.readLine().split(" ");
        final int N = Integer.parseInt(split[0]);
        final int M = Integer.parseInt(split[1]);

        final String second = br.readLine();
        final int[] numbers = Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).toArray();

        long answer = 0;
        final long[] sum = new long[N];
        sum[0] = numbers[0];
        final long[] count = new long[M];

        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + numbers[i];
        }

        for (int i = 0; i < N; i++) {
            final int remainder = (int) (sum[i] % M);
            sum[i] = remainder;
            count[remainder]++;
            if (remainder == 0) {
                answer++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            answer += (count[i] * (count[i] - 1)) / 2;
        }

        System.out.println(answer);
    }
}
