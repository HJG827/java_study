package week11;

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

		char[][] board = new char[N][M];

		for (int r = 0; r < N; r++) {
			String line = br.readLine();
			for (int c = 0; c < M; c++) {
				board[r][c] = line.charAt(c);
			}
		}

		int ans = 64;
		for (int r = 0; r < N - 7; r++) {
			for (int c = 0; c < M - 7; c++) {
				ans = Math.min(ans, fillCount(board, r, c));
			}
		}

		System.out.println(ans);
	}

	static int fillCount(char[][] b, int sr, int sc) {
		int result = 0;

		char fill;
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				if ((r + c) % 2 == 0)
					fill = 'B';
				else
					fill = 'W';
				if (b[sr + r][sc + c] != fill)
					result++;
			}
		}

		result = Math.min(result, 64 - result);
		return result;
	}
}
