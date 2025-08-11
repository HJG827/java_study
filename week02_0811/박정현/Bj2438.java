package 박정현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2438 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i=1;i<N+1;i++) {
			for (int j=0;j<i;j++) {				
				System.out.print('*');
			}
			System.out.printf("%n");
		}
	}

}
