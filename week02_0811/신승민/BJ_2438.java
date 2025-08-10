import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String A = br.readLine();
		int a = Integer.parseInt(A);
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < (i+1); j ++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
