import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int ans = 0;

        for(int i=0; i<N; i++) {
            int digit = num.charAt(i) - '0';
            ans += digit;
        }

        System.out.println(ans);
    }
}
