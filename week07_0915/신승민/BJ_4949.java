import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_4949{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String str = br.readLine();
            
            if (str.equals(".")) {
                break;
            }
            
            int N = str.length(), top = -1;
            char[] stack = new char[N];
            boolean res = false;
            
            for(int i = 0; i < N; i++) {
                if (str.charAt(i) == '(') {
                    top++;
                    stack[top] = '(';
                } else if (str.charAt(i) == ')') {
                    if (top < 0 || stack[top] != '(') {
                        res = true;
                        break;
                    } else {
                        top--;
                    }
                } else if (str.charAt(i) == '[') {
                    top++;
                    stack[top] = '[';
                } else if (str.charAt(i) == ']') {
                    if (top < 0 || stack[top] != '[') {
                        res = true;
                        break;
                    } else {
                        top--;
                    }
                } else {
                    continue;
                }
            }
            if (top != -1 || res) {
                sb.append("no\n");
            } else {
                sb.append("yes\n");
            }
        }
        System.out.print(sb);
    }
}