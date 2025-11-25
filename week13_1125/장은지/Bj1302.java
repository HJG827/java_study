package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bj1302 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String title = br.readLine();
			map.put(title, map.getOrDefault(title, 0) + 1);
		}

		int max = 0;
		String ans = "";

		for (String title : map.keySet()) {
			int cnt = map.get(title);

			if (cnt > max) {
				max = cnt;
				ans = title;
			} else if (cnt == max && title.compareTo(ans) < 0) {
				ans = title;
			}
		}
		System.out.println(ans);
	}

}
