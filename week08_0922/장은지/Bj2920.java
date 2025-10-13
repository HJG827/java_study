package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(func(arr));
	}

	public static String func(int[] arr) {
		String result = "mixed";
		if (arr[0] == 1) {
			for (int i = 1; i < 8; i++) {
				if (arr[i - 1] + 1 != arr[i])
					return result;
			}
			return "ascending";
		} else if (arr[0] == 8) {
			for (int i = 1; i < 8; i++) {
				if (arr[i - 1] - 1 != arr[i])
					return result;
			}
			return "descending";
		}

		return result;
	}

}
