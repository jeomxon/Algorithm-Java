import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Map;

public class BOJ25206 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final Map<String, Double> scores = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        );
        double sum = 0.0;
        double total = 0.0;
        for (int i = 0; i < 20; i++) {
            final String[] line = br.readLine().split(" ");
            final double score = Double.parseDouble(line[1]);
            if (line[2].equals("P")) {
                continue;
            }
            total += score;
            final Double mean = scores.get(line[2]);
            sum += (score * mean);
        }
        final DecimalFormat df = new DecimalFormat("#.######");
        final String formatted = df.format(sum / total);
        System.out.println(formatted);
    }
}
