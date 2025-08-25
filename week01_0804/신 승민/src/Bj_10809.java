import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Bj_10809 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] nums = new int[26];
		
		for (int i = 0; i < 26; i++) {
			nums[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - '0' - 49;
			
			if (nums[n] != -1) continue;
			
			nums[n] = i;
		}
		
		StringBuilder sb = new StringBuilder(78);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i <26; i++ ) {
			sb.append(nums[i]);
			sb.append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
