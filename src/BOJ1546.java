import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1546 {
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int[] scores = new int[N];
        final String[] temp = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(scores);

        float M = scores[N - 1];
        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (scores[i] / M) * 100;
        }
        System.out.println(sum/N);
    }
}
