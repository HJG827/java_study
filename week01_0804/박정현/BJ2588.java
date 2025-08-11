package 박정현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class BJ2588 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
		
//		주의: 두 줄로 input이 들어오고 있다
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		int B_1 = B%10;
		int B_10 = (B/10)%10;
		int B_100 = B/100;
		
		System.out.println(A*B_1);
		System.out.println(A*B_10);
		System.out.println(A*B_100);
		System.out.println(A*B);
	}

}
