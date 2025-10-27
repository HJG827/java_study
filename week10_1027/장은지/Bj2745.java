package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());

		long ans = 0;
		for (int i = 0; i < N.length(); i++) {
			char ch = N.charAt(i);
			int v;
			if ('0' <= ch && ch <= '9')
				v = ch - '0';
			else if ('A' <= ch && ch <= 'Z')
				v = ch - 'A' + 10;
			else
				v = ch - 'a' + 10;

			ans = ans * B + v;
		}
		System.out.println(ans);
	}

}
