package week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2577 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int cal = A*B*C;
		int[] result = new int[10];
		
		// 1. String으로 변환 후 한 글자씩 조회
		String str1 = String.valueOf(cal); // string으로 변환
		int len = str1.length();
		for (int i=0;i<len;i++) {
//			int num = Integer.valueOf(str1.charAt(i)); // 작동 X, 문자 '1'의 아스키코드인 49가 출력된다...!
//			int num = Integer.valueOf(str1.charAt(i)-'0'); // 작동 O, 문자에서 '0'을 뺀 아스키코드로 형변환
			int num = Character.getNumericValue(str1.charAt(i)); // getNumericValue 함수 사용
			result[num] += 1;
		}
		
		// 2. int인 상태로 한자리씩 조회
//		while (cal/10>0) {
//			int num = cal%10; // 한자리씩 조회
//			result[num]+=1; // result index를 숫자로, 개수 한개씩 늘리기
//			cal /= 10;
//		}
//		result[cal]+=1; // while 문을 빠져나오면 남는 1의자리 수 포함
		
		// 출력
		for (int i=0;i<10;i++) {
			System.out.println(result[i]);
		}
		
	}

}


// 참고 자료 - 배열 선언 방법 (array)
// https://hongong.hanbit.co.kr/java-%EC%9E%90%EB%B0%94-%EB%B0%B0%EC%97%B4array-%EC%84%A0%EC%96%B8%ED%95%98%EA%B3%A0-%EC%83%9D%EC%84%B1%ED%95%98%EA%B8%B0/
// 참고 자료 - 형변환 (int <-> String)
// https://hianna.tistory.com/524
// 참고 자료 - string에서 chr 뽑아오는
// https://hongong.hanbit.co.kr/java-%EC%9E%90%EB%B0%94-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EB%8B%A4%EB%A3%A8%EB%8A%94-string-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%A9%94%EC%86%8C%EB%93%9C-%EC%B4%9D%EC%A0%95%EB%A6%AC/