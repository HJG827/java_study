package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int ans = 0;
		for (int i = 0; i < 8; i++) {
			line = br.readLine();
			for (int j = 0; j < 4; j++) {
				if (line.charAt(j * 2 + (i % 2)) == 'F') {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
