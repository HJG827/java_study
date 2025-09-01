import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
// python과 가장 비슷한 set 만들기
import java.util.Set;
import java.util.HashSet;

public class BJ_11724 {
	static int[] ver;
	
	public static int find(int x) {
		if (ver[x] == x) {
			return x;
		}
		ver[x] = find(ver[x]);
		return ver[x];
	}
	
	public static void union(int x, int y) {
		int rx = find(x);
		int ry = find(y);
		
		if (rx == ry) {
			return;
		}
		
		if (rx < ry) {
			ver[ry] = rx;
		}
		else {
			ver[rx] = ry;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		ver = new int[V + 1];
		for (int i = 1; i < V+1; i++) {
			ver[i] = i;
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			if (find(s) == find(e)) {
				continue;
			}
			union(s, e);
		}
		
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i < V+1; i++) {
			set.add(find(i));
		}
		System.out.println(set.size());
	}
}
