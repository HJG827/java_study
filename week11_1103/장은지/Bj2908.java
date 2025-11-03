package sadf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		String a = "", b = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			a += A.charAt(i);
		}
		for (int i = B.length() - 1; i >= 0; i--) {
			b += B.charAt(i);
		}
		if(Integer.parseInt(a) >= Integer.parseInt(b)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
