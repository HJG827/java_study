package week3;

import java.io.*;
import java.util.*;

public class bj10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 번째 줄
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 두 번째 줄
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < N; i++) {
			if (arr[i] < min) min = arr[i];
			if (arr[i] > max) max = arr[i];
		}
		
		System.out.println(min + " " + max);
	}

}
