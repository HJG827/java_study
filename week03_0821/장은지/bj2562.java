package week3;

import java.io.*;

public class bj2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.parseInt(br.readLine());
		int index = 1;
		
		for (int i = 2; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if (max < n) {
				max = n;
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
