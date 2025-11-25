import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        String[] chess = new String[8];

        for (int i = 0; i < 8; i++) {
            chess[i] = br.readLine();
        }

        for (int R = 0; R < 8; R++) {
            for (int C = 0; C < 8; C++ ) {
                if ((R + C) % 2 == 1) {
                    continue;
                }
                if (chess[R].charAt(C) == 'F') {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
