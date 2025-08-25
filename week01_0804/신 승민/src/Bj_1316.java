import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int res = 0;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			int[] count = new int[26];
			char pre = str.charAt(0);
			count[pre - '0' - 49] = 1;
			Boolean found = true;
			for (int j = 1; j < str.length(); j++) {
				if(pre != str.charAt(j)) {
					count[pre-'0'-49] = 1;
					pre = str.charAt(j);
					if (count[pre - '0' - 49] == 1) {
						found = false;
						break;
					}
				}
			}
			if (found) {
				res += 1;
			}
		}
		System.out.println(res);
	}
}
