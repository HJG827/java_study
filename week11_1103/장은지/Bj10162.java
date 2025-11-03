package sadf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int A = 60 * 5;
		int B = 60;
		int C = 10;

		int t = T;
		if (t >= A) {
			sb.append(t / A + " ");
			t %= A;
		} else {
			sb.append(0 + " ");
		}
		if (t >= B) {
			sb.append(t / B + " ");
			t %= B;
		} else {
			sb.append(0 + " ");
		}

		if (t % C == 0) {
			sb.append(t / C);
			System.out.println(sb);
		} else {
			System.out.println(-1);
		}

	}

}
