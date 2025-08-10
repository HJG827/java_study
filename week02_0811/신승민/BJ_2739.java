import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2739 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		int a = Integer.parseInt(A);
		
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " +a*i);
		}
	}
}
