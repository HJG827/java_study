package week4;

import java.io.*;

public class bj5622 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		String word = br.readLine();
		int time = 0;
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			for (int n = 0; n < nums.length; n++) {
				if (nums[n].indexOf(ch) >= 0) {
					time += n + 3;
					break;
				}
			}
		}
		System.out.println(time);
	}
}
