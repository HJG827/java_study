package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();

		int ans = 0, temp = 0;
		for (int i = 0; i < 3; i++) {
			temp = a * (b.charAt(2 - i) - '0');
			System.out.println(temp);
			ans += temp * Math.pow(10, i);
		}
		System.out.println(ans);
	}

}
