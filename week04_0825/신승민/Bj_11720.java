import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += nums.charAt(i)- '0';
		}
		System.out.println(sum);
	}
}
