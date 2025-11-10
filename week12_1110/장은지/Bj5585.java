package sadf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj5585 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(br.readLine());
		int change = 1000 - price;

		int[] coins = { 500, 100, 50, 10, 5, 1 };
		int count = 0;

		for (int coin : coins) {
			if (change == 0)
				break;
			count += change / coin;
			change %= coin;
		}

		System.out.println(count);
	}

}
