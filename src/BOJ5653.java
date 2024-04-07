import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BOJ5653 {
    public static void main(final String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        final Map<Integer, String> birth = new HashMap<>();
        for (int i = 0; i < N; i++) {
            final String[] line = br.readLine().split(" ");
            if (line[1].length() == 1) {
                line[1] = "0" + line[1];
            }
            if (line[2].length() == 1) {
                line[2] = "0" + line[2];
            }

            final String birthday = line[3] + line[2] + line[1];
            birth.put(Integer.parseInt(birthday), line[0]);
        }
        final List<Integer> births = birth.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println(birth.get(Collections.max(births)));
        System.out.println(birth.get(Collections.min(births)));
    }
}
