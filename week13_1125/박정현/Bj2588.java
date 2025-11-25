package week13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2588 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}

}
