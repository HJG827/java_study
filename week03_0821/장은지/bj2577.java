package week3;

import java.io.*;

public class bj2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int result = 1;

		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(br.readLine());
			result *= n;
		}

		int[] count = new int[10];

		while (result != 0) {
			count[result % 10] += 1;
			result /= 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}
}
