package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		for (int n=0;n<C;n++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			// score에 점수 입력, 평균 구하기
			double avg = 0; // 평균 변수
			for (int i=0;i<N;i++) {
				score[i] = Integer.parseInt(st.nextToken());
				avg += score[i];
			}
			avg /= N;
			
			// 평균보다 점수가 높은 사람 세기
			double count = 0;
			for (int i=0;i<N;i++) {
				if (score[i]>avg) {
					count+=1;
				}
			}
			
			double result = count/N*100;
			System.out.printf("%.3f%%\n", result);
		}
	}

}

// 참고 자료 : 자바의 출력
// https://keep-cool.tistory.com/15
