import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_2606 {
	
	static boolean[] visited;
	static List<Integer>[] graph;
	static int res = 0;
	
	static void dfs(int start) {
		
		for (int e : graph[start]) {
			if (visited[e]) {
				continue;
			}
			visited[e] = true;
			res++;
			
			dfs(e);
		}	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());
		
		visited = new boolean[V+1];
		graph = (List<Integer>[]) new ArrayList[V+1];
		
		for (int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < E; i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			graph[s].add(e);
			graph[e].add(s);
		}
		
		visited[1] = true;
		dfs(1);
		System.out.println(res);
	}
}
