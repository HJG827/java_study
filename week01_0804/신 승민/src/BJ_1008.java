import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1008 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] parts = br.readLine().split(" ");
		
		double A = Double.parseDouble(parts[0]);
		
		double B = Double.parseDouble(parts[1]);
		
		System.out.println(A/B);
	}
}
