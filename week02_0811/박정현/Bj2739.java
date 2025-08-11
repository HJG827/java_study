package 박정현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2739 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i=0;i<9;i++) {
			System.out.printf("%d * %d = %d%n", N, i+1, N*(i+1));
			// 지시자와 플래그를 사용하기 위해서는 printf
			// 개행이 \n이 아니라 %n이다.
		}
	}

}

// 추가 조사 - 출력 지시자와 플래그
// https://ittrue.tistory.com/108
// 추가 조사 - for(타입 변수명:배열 또는 컬렉션)
// https://developer-yeony.tistory.com/84

