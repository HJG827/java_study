package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = br.readLine();
			if (input.equals("0")) break;
			for (int i=0;i<input.length()/2;i++) {
				if (input.charAt(i) != input.charAt(input.length()-i-1)) {
					System.out.println("no");
					break;
				}
				if (i==input.length()/2-1) {
					System.out.println("yes");
				}
			}
	}

}
	}
