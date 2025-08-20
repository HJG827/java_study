package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10818 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int n_M = -1000000;
		int n_m = 1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0;i<N;i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num>n_M) {
				n_M = num;
			}
			if (num<n_m) {
				n_m = num;
			}
		}
//		System.out.println(n_m+" "+n_M); // ' '와 같이 chr로 쓸경우 string으로 못 합침. "" 쓸 것
		System.out.printf("%d %d", n_m, n_M);
	}

}
