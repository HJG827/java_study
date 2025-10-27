package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] charInput = new char[N][M];
		int[][] intWithB = new int[N][M];
		int[][] intWithW = new int[N][M];

		long result = 999999999;
		
		for (int i=0;i<N;i++) {
			String line = br.readLine();
			for (int j=0;j<M;j++) {
				char space = line.charAt(j);
				charInput[i][j] = space;
				for (int r=0;r<8;r++) {
					if (i-r<0) break;
					for (int c=0;c<8;c++) {
						if(j-c<0) break;
						if (space=='B'&&((r%2==0&&c%2==0)||(r%2!=0&&c%2!=0))) {
							intWithW[i-r][j-c] += 1;
						} else if (space=='B' &&((r%2==0&&c%2!=0)||(r%2!=0&&c%2==0))) {
							intWithB[i-r][j-c] += 1;
						} else if (space=='W'&&((r%2==0&&c%2==0)||(r%2!=0&&c%2!=0))) {
							intWithB[i-r][j-c] += 1;
						} else intWithW[i-r][j-c] += 1;
					}
				}
			}
		}
		
		for (int i=0;i<N-8+1;i++) {
			for (int j=0;j<M-8+1;j++) {
				result = Math.min(result, intWithB[i][j]);
				result = Math.min(result, intWithW[i][j]);
			}
		}
		System.out.println(result);
	}

}