package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9095 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11];
		dp[0]=1;dp[1]=1;dp[2]=2;dp[3]=4;
		for(int i=4;i<11;i++)dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
		for (int testcase=0;testcase<T;testcase++) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(dp[num]);
		}
	}

}
