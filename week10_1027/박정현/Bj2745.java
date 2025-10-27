package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
//		System.out.println(N);
//		System.out.println(B);
		int len = N.length();
		double result = 0;
//		HashMap<String, Integer> str2int = new HashMap<String, Integer>;
//		str2int.put("A", 10);str2int.put("B", 11);
		for (int i=len-1;i>=0;i--) {
			char n = N.charAt(i);
			if (n>='0'&&n<='9') {
//				System.out.println((n-'0'));
				result += (n-'0')*Math.pow(B, len-i-1);
				
			}
			else {
//				System.out.println((n-'A'+10));
				result += (n-'A'+10)*Math.pow(B, len-i-1);
			}
		}
		System.out.println((int)(result));
	}

}
