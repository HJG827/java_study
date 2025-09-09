package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] triangle = new int[3];
		triangle[0] = Integer.parseInt(st.nextToken());
		triangle[1] = Integer.parseInt(st.nextToken());
		triangle[2] = Integer.parseInt(st.nextToken());
		String result = "";
		while (triangle[0]!=0 && triangle[1]!=0 && triangle[2]!=0) {
			Arrays.sort(triangle);
//			System.out.println(triangle[0]);
			if (triangle[2]*triangle[2] == triangle[1]*triangle[1]+triangle[0]*triangle[0]) {
				result += "right\n";
			} else {
				result += "wrong\n";
			}
			
			st = new StringTokenizer(bf.readLine());
			triangle[0] = Integer.parseInt(st.nextToken());
			triangle[1] = Integer.parseInt(st.nextToken());
			triangle[2] = Integer.parseInt(st.nextToken());
		}
		System.out.println(result);
	}

}
