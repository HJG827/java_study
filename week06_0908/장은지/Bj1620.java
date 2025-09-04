package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Bj1620 {
	static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		List<String> poket = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();  // 이름 -> 번호 매핑
		
		poket.add("");
		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			poket.add(name);
			map.put(name, i);
		}

		for (int i = 0; i < M; i++) {
			String p = br.readLine();
			if (isInteger(p)) {
				System.out.println(poket.get(Integer.parseInt(p)));
			} else {
				System.out.println(map.get(p));
			}
		}
	}

}
