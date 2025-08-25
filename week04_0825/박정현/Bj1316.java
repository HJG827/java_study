package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1316 {

	public static void main(String[] args) throws Exception, IOException {
		// 문제 설명: 바로 앞이랑 다른 문자가 나왔을 때 
		// -> 이미 나온 문자면: 실패, 나온적 없는 문자면: 성공
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 0; // 결과값
		for (int tc=1;tc<N+1;tc++) {
			String word = br.readLine();
			int len = word.length();
			if (len==1) { // 종료조건1. 한글자 word일 경우
				result+=1;
				continue;
			}
			
			int visited[] = new int[26]; // 메모리 아끼고 싶으면: for(tc) 밖에 두고 fill 해서 쓸 것
			
			visited[Integer.valueOf(word.charAt(0)-'a')]=1; // 첫번째 글자 미리 넣어놓고 시작
			for (int i=1;i<len;i++) {
				int charBefore = Integer.valueOf(word.charAt(i-1)-'a');
				int charNow = Integer.valueOf(word.charAt(i)-'a');
				
				if(charBefore == charNow) { 
					// 이전 문자와 같은 경우 -> 종료조건 체크 후 continue
					if (i==len-1) result+=1; // 종료조건2. 이전 문자와 같은데 배열끝에 달했을 경우
					continue;
				}
				
				// 이전 문자와 현재 문자가 다르다
				if(visited[charNow]==1) break; // 종료조건3. 이전문자와 다른데 visited => 실패 케이스
				visited[charNow]=1; // 방문 체크
				if(i==len-1) result+=1; // 종료조건4. 이전 문자와 다른데 배열 끝에 달했을 경우
			}
		}
//			
//			visited[Integer.valueOf(word.charAt(0)-'a')]=1; // 첫번째 글자 미리 넣어놓고 시작
//			for (int i=1;i<len;i++) {
//				int charBefore = Integer.valueOf(word.charAt(i-1)-'a');
//				int charNow = Integer.valueOf(word.charAt(i)-'a');
//				
////				char charBefore = word.charAt(i-1);
////				char charNow = word.charAt(i);
//				
//				if(charBefore == charNow) { 
//					// 이전 문자와 같은 경우 -> 종료조건 체크 후 continue
//					if (i==len-1) result+=1; // 종료조건2. 이전 문자와 같은데 배열끝에 달했을 경우
////					System.out.printf("word: %s, charBefore: %c, charNow: %c, result: %d\n", word, charBefore, charNow, result);
//					continue;
//				}
//				
//				// 이전 문자와 현재 문자가 다르다
////				if(visited[Integer.valueOf(charNow-'a')]==1) break; // 종료조건3. 이전문자와 다른데 visited => 실패 케이스
//				if(visited[charNow]==1) break; // 종료조건3. 이전문자와 다른데 visited => 실패 케이스
////				visited[Integer.valueOf(charNow-'a')]=1; // 방문 체크
//				visited[charNow]=1; // 방문 체크
//				if(i==len-1) result+=1; // 종료조건4. 이전 문자와 다른데 배열 끝에 달했을 경우
////				System.out.printf("word: %s, charBefore: %c, charNow: %c, result: %d\n", word, charBefore, charNow, result);
//			}
//		}
		System.out.print(result);
	}

}
