package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1978 {
	
	static boolean isPrimaryNumber(int N) {
		if(N==1) {
			return false;
		}
		for (int i=2;i<N+1;i++) {
			if (i==N) {
				return true;
			}
			if (N%i==0) {
				break;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int result = 0;
		for (int i=0;i<N;i++) {
			int n = Integer.parseInt(st.nextToken());
			if(isPrimaryNumber(n)) {
				result += 1;
			}
		}
		System.out.println(result);
	}

}
