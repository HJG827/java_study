import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_10430 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] A = br.readLine().split(" ");
		int[] B = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			B[i] = Integer.parseInt(A[i]);
		}
		
		System.out.println((B[0]+B[1])% B[2]);
		System.out.println(((B[0]%B[2])+(B[1]%B[2]))%B[2]);
		System.out.println((B[0]*B[1])% B[2]);
		System.out.println(((B[0]%B[2])*(B[1]%B[2]))%B[2]);
	}
}
