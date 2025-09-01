import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0 ; i < N; i ++) {
			String str = br.readLine();
			char[] stack = new char[N];
			int top = -1;
			String res = "YES";
			
			for (int j = 0; j < str.length(); j ++ ) {
				char a = str.charAt(j);
				
				if (a == '(') {
					top++;
					stack[top] = a;
				}
				else if (a == ')') {
					if (top >= 0) {
						top--;
					}
					else {
						res = "NO";
						break;
					}
				}
				
			}
			if (res == "NO") {
				System.out.println(res);				
			}
			else if (top == -1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
