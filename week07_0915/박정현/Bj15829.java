package week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15829 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		long M = 1234567891L;
		
		long result = 0;
		for (int i=0;i<L;i++) {
			result += (s.charAt(i)-'a'+1)%M*Math.pow(31, i);
		}
		System.out.println(result);
	}

}
