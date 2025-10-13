import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		if (a=="1 2 3 4 5 6 7 8") {
			System.out.println("ascending");
		}
		else if (a=="8 7 6 5 4 3 2 1") {
			System.out.println("ascending");
		}
		else {
			System.out.println("mixed");
		}
	}

}
