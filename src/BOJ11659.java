import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11659 {
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] firstLine = br.readLine().split(" ");
        final int N = Integer.parseInt(firstLine[0]);
        final int M = Integer.parseInt(firstLine[1]);

        final String[] numbers = br.readLine().split(" ");
        final int[] sums = new int[N + 1];
        sums[0] = 0;

        final int[][] ranges = new int[M][2];
        for (int i = 0; i < M; i++) {
            final String[] sub = br.readLine().split(" ");
            final int a = Integer.parseInt(sub[0]);
            final int b = Integer.parseInt(sub[1]);
            ranges[i] = new int[]{a, b};
        }

        for (int i = 1; i < N + 1; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(numbers[i - 1]);
        }

        for (int i = 0; i < ranges.length; i++) {
            final int a = ranges[i][0];
            final int b = ranges[i][1];
            System.out.println(sums[b] - sums[a - 1]);
        }
    }
}
