import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1259{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String str = br.readLine();
            
            if (str.equals("0")) {
                break;
            }
            
            int N = str.length();
            boolean res = false;
            
            for(int i = 0; i < (N/2); i++){
                if (str.charAt(i) != str.charAt(N-1-i)){
                    res = true;
                    break;
                }
            }
            sb.append(res ? "no" : "yes").append("\n");
        }
        System.out.print(sb);
    }
}