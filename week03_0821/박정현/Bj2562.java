package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2562 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max_N = 0; // 자연수니까 최댓값의 초기값을 0으로 놓음
		int num_N = 0; // 최댓값이 몇번째 수인지
		
		for (int i=1;i<10;i++) { // 9개의 자연수, 몇번째 수인지와 맞춤
			int N = Integer.parseInt(br.readLine());
			if (N>max_N) {
				max_N = N;
				num_N = i;
			}
		}
		System.out.printf("%d\n%d", max_N, num_N);

	}

}
