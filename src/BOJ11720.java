import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());
        final String number = br.readLine();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            final int tempNumber = Character.getNumericValue(number.charAt(i));
            sum += tempNumber;
        }
        System.out.println(sum);
    }
}
