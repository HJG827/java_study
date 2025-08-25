package week4;

import java.util.Set;
import java.io.*;

public class bj2941 {
	public static void main(String[] args) throws IOException{
		Set<String> alpha = Set.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int i = 0, n = word.length(), cnt = 0;
		while (i < n) {
			if (i + 3 <= n && word.startsWith("dz=", i)) {
				cnt += 1;
				i += 3;
			} else if (i + 2 <= n && alpha.contains(word.substring(i, i+2))) {
				cnt += 1;
				i += 2;
			} else {
				cnt += 1;
				i++;
			}
		}
		
		System.out.println(cnt);
	}
}
