package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj5073 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			if (sum == 0)
				break;
			Arrays.sort(arr);

			if (arr[2] >= arr[0] + arr[1]) {
				System.out.println("Invalid");
			} else if (arr[0] == arr[2]) {
				System.out.println("Equilateral");
			} else if (arr[0] == arr[1] || arr[1] == arr[2]) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}

		}

	}
}
