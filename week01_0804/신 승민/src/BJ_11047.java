import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		int[] coins = new int[N];
		
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			coins[N - 1 - i] = Integer.parseInt(br.readLine());
		}
		
		
		for (int i = 0; i < N; i++) {
			while (coins[i] <= K) {
				K -= coins[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
