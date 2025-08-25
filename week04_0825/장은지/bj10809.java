package week4;

import java.io.*;

public class bj10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		for (int i = 0; i < 26; i++) {
			char alpha = (char) ('a' + i);
			int pos = S.indexOf(alpha);
			System.out.print(pos + " ");
		}
	}
}
