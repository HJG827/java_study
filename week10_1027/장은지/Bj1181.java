package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		TreeSet<String> set = new TreeSet<>((a, b) -> {
			if (a.length() != b.length())
				return Integer.compare(a.length(), b.length());
			return a.compareTo(b);
		});

		for (int i = 0; i < N; i++)
			set.add(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (String w : set)
			sb.append(w).append('\n');
		System.out.println(sb);

	}

}
