package week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5585 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int change = 1000-a;
//		System.out.printf("First Change: %d \n", change);
		int result = 0;
		while(change/500>0) {
			change-=500;
			result+=1;
//			System.out.printf("coin: %d \n", 500);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
		while(change/100>0) {
			change-=100;
			result+=1;
//			System.out.printf("coin: %d \n", 100);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
		while(change/50>0) {
			change-=50;
			result+=1;
//			System.out.printf("coin: %d \n", 50);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
		while(change/10>0) {
			change-=10;
			result+=1;
//			System.out.printf("coin: %d \n", 10);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
		while(change/5>0) {
			change-=5;
			result+=1;
//			System.out.printf("coin: %d \n", 5);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
		while(change>0) {
			change-=1;
			result+=1;
//			System.out.printf("coin: %d \n", 1);
//			System.out.printf("change: %d \n", change);
//			System.out.printf("result: %d \n", result);
		}
	System.out.println(result);
	}

}
