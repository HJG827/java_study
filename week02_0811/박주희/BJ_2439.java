import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int num = Integer.parseInt(line);

        for (int i = 1; i <= 9; i++) {
            int ans = num * i;
            System.out.printf("%d * %d = %d %n", num, i, ans);
        }
    }
}
