package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			StringBuilder sb = new StringBuilder();

			String h, w;

			if (N % H == 0) {
				h = String.valueOf(H);
				w = String.valueOf(N / H);
			} else {
				h = String.valueOf(N % H);
				w = String.valueOf(N / H + 1);
			}

			if (Integer.parseInt(w) < 10) {
				w = '0' + w;
			}

			System.out.printf("%s%s\n", h, w);
		}
	}
}
