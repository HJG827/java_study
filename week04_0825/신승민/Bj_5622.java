import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_5622 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++ ) {
			if (str.charAt(i) == 'Z') {
				res += 10;
				continue;
			}
			if (str.charAt(i) == 'S') {
				res += 8;
				continue;
			}
			if (str.charAt(i) > 'S') {
				res += (str.charAt(i) - 'T') / 3 + 9;
				continue;
			}
			res += (str.charAt(i) - 'A') / 3 + 3;
		}
		
		System.out.println(res);
	}
}
