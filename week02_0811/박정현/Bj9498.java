package 박정현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9498 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N > 89) {
			System.out.print('A');
		}
		else if (N > 79) {
			System.out.print('B');
		}
		else if (N > 69) {
			System.out.print('C');
		}
		else if (N > 59) {
			System.out.print('D');
		}
		else {
			System.out.print('F');
		}
	}

}
