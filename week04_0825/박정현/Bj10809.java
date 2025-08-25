package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
//		int arr[] = new int[26];
//		Arrays.fill(arr,  -1); // 0으로 채워져있던 배열 -1 채우기, 
//		// dijkstra에서 초기화할때도 사용합니다
//		// for 쓰는 게 가장 빠르지만 차이 아주 미세함
//		
//		int N = S.length();
//		for (int i=0;i<N;i++) {
//			int index = Integer.valueOf(S.charAt(i)-'a');
//			if (arr[index]==-1) {
//				arr[index] = i;
//			}
//		}
//		
//		for (int i=0;i<26;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		// Arrays.fill 쓰기 싫어요!
		// -> visited로 방문체크
		int arr[] = new int[26];
		int visited[] = new int[26];
		
		int N = S.length();
		for (int i=0;i<N;i++) {
			int index = Integer.valueOf(S.charAt(i)-'a');
			if (visited[index]==1) continue;
			visited[index]=1;
			arr[index]=i;
		}
		
		for (int i=0;i<26;i++) {
			if (visited[i]==1) System.out.print(arr[i]+" ");
			else System.out.print("-1 ");
		}

	}

}
