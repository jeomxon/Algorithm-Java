import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11660 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] firstLine = br.readLine().split(" ");
        final int N = Integer.parseInt(firstLine[0]);
        final int M = Integer.parseInt(firstLine[1]);

        final String[][] matrix = new String[N][N];
        for (int i = 0; i < N; i++) {
            final String[] line = br.readLine().split(" ");
            matrix[i] = line;
        }

        final String[][] range = new String[M][4];
        for (int i = 0; i < M; i++) {
            range[i] = br.readLine().split(" ");
        }

        final int[][] sum = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            sum[0][i + 1] = Integer.parseInt(matrix[0][i]);
            sum[i + 1][0] = Integer.parseInt(matrix[i][0]);
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + Integer.parseInt(matrix[i - 1][j - 1]);
            }
        }

        for (int i = 0; i < range.length; i++) {
            int x1 = Integer.parseInt(range[i][0]);
            int y1 = Integer.parseInt(range[i][1]);
            int x2 = Integer.parseInt(range[i][2]);
            int y2 = Integer.parseInt(range[i][3]);

            final int result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
