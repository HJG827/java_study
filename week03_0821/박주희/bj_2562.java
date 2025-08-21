import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        int idx = 0;
        int max = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                idx = i;
            }
        }
        System.out.printf("%d\n%d", max, idx);
    }
}
