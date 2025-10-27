package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj7567 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int ans = 10;
		char prev = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char now = s.charAt(i);
			if (now != prev)
				ans += 10;
			else
				ans += 5;
			prev = now;
		}
		System.out.println(ans);
	}

}
