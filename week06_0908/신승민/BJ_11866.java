import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NK = br.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		
		boolean[] res = new boolean[N];
		String nums = "<";
		
		int a = -1;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			
			while (cnt != K) {
				a = (a + 1) % N;
				if (res[a]) continue;
				cnt++;
			}

			a = a % N;
			res[a] = true;

			if (i < N -1) {
				nums += (a+1) + ", ";
			}
			else {
				nums += (a+1) + ">";
			}
		}
		
		System.out.printf("%s\n", nums);
	}
}
