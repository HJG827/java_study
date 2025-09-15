package asdf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15829 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long ans = 0, mod = 1234567891L;
		
		long pow = 1L;
		
		for(int i = 0; i < L; i++) {
			int a = str.charAt(i) - 'a' + 1;
			ans += a * pow % mod;
			pow = pow * 31 % mod;
		}
		ans %= mod;
		System.out.println(ans);
	}

}
