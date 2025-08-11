package 박정현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if (A>B) {
			System.out.println('>');
		}
		else if (A<B) {
			System.out.println('<');
		}
		else {
			System.out.println("==");
			// Java는 char와 String을 구분한다.
			// 한글자를 의미하는 Char는 ''
			// 두글자 이상의 문자열을 의미하는 String은 ""
		}
	}

}
