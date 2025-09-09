package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for (int i=1;i<N+1;i++) {
			q.offer(i);
		}
		
		String result = "<";
		
		int i = 0;
		while(!q.isEmpty()) {
			i += 1;
			int num = q.poll();
			if (i == K) {
				result += num+", ";
				i=0;
			} else {
				q.offer(num);
			}
		}
		if (result.length()<=1) {
			System.out.print("<>");
		} else {
			result = result.substring(0, result.length()-2) + ">";
			System.out.println(result);
		}
	}
}
