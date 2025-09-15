package asdf;

import java.io.*;

public class Bj1259 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			if (s.equals("0")) break;
			
			sb.append(isPalindrome(s) ? "yes" : "no").append("\n");
		}
		System.out.println(sb);
	}
	
	private static boolean isPalindrome(String s) {
		int l = 0, r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) return false;
			l++; r--;
		}
		return true;
	}

}
