package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2231 {
	static int findNum(int N) {
		for (int ans = N / 2; ans < N; ans++) {
			int result = ans;
			int temp = ans;
			while (temp > 0) {
				result += temp % 10;
				temp /= 10;
			}

			if (result == N)
				return ans;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(findNum(N));
	}
}
