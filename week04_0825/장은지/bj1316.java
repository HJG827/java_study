package week4;

import java.io.*;

public class bj1316 {
	static boolean isGroupWord(String word) {
		// 본 적 있는지 체크할 배열. 기본값은 false
		boolean[] seen = new boolean[26];
		char prev = 0;  // 이전 문자 기억
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (prev != ch) {  // 이전 값이랑 다르면
				int idx = ch - 'a';
				// 본 적 있으면 false 반환
				if (seen[idx]) return false;
				
				seen[idx] = true;  // 본 거 체크
				prev = ch;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int n = 0; n < N; n++) {
			String word = br.readLine();
			if (isGroupWord(word)) cnt += 1;
		}
		System.out.println(cnt);
	}
}
