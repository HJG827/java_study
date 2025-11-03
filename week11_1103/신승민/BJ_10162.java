import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ-10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());
        int a = time / 300;
        time = time % 300;
        int b = time / 60;
        time = time % 60;
        int c = time / 10;
        time = time % 10;

        if (time > 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d %d %d\n", a, b, c);
        }
    }
}
