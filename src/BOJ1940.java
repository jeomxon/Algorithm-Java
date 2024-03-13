import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1940 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final int M = Integer.parseInt(br.readLine());
        final int[] materials = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(materials);

        int start = 0;
        int end = N - 1;
        int count = 0;
        while (start < end) {
            if (materials[start] + materials[end] < M) {
                start++;
            } else if (materials[start] + materials[end] > M) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }

        System.out.println(count);
    }
}
