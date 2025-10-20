package 신승민;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            String h, w;

            if (N % H != 0) {
                h = String.valueOf(N % H);
                w = String.valueOf(N / H + 1);
            } else {
                h = String.valueOf(H);
                w = String.valueOf(N / H);
            }

            if (Integer.parseInt(w) < 10) {
                w = "0" + w;
            }

            System.out.printf("%s%s\n", h, w);
        }
    }
}
