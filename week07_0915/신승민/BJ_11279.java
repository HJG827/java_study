import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
// import java.util.Comparator;

public class BJ_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				if (pQ.isEmpty()) {
					sb.append("0\n");
					continue;
				} else {
					sb.append(-pQ.poll() + "\n");
					continue;
				}
			}
			pQ.offer(-n);
		}
		//  PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 최대 힙
		System.out.print(sb.toString());
	}
}
