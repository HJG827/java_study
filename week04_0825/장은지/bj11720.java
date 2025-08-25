package week4;

import java.io.*;

public class bj11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		long sum = 0;
		for (int i = 0; i < N; i++) {
			
			sum += nums.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
