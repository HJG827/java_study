package week1;

import java.util.*;
import java.lang.Math;

public class bj2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0, temp = 0;

		for (int i = 0; i < 3; i++) {
			temp = a * (b % 10);
			b /= 10;
			System.out.println(temp);			
			sum += temp * Math.pow(10, i);
		}
		System.out.println(sum);
	}
}
