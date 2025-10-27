package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj7567 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dishes = br.readLine();
		int len = dishes.length();
		char dishBefore = dishes.charAt(0);
		int result = 10;
		for (int i=1;i<len;i++) {
			char dishNow = dishes.charAt(i);
			if (dishNow == dishBefore) result += 5;
			else result += 10;
			dishBefore = dishNow;
		}
		System.out.println(result);
	}

}
