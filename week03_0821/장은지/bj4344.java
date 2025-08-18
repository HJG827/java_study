package week3;

import java.io.*;
import java.util.StringTokenizer;

public class bj4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());  // 테스트케이스 수
		
		for (int t = 0; t < C; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());  // 사람 수
			
			int[] scores = new int[N];  // 점수 배열
			int sum = 0;
			for (int i = 0; i < N; i++) {
				scores[i] = Integer.parseInt(st.nextToken());
				sum += scores[i];  // 점수 합
			}
			
			double avg = sum / N;  // 평균내기
			
			int count = 0;  // 평균 넘는 사람 수
			for (int i = 0; i < N; i++) {
				if (scores[i] > avg) {
					count += 1;
				}
			}
			
			double ans = count * 100.0 / N;  // 백분율 구하기
			System.out.printf("%.3f%%\n", ans);  // 소수점 3자리 출력
		}
	}
}
