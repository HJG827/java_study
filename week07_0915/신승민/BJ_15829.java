import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_15829{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        final long MOD = 1234567891L;
        long res = 0, pow = 1;
        
        for(int i = 0; i < N; i++){
            int n = str.charAt(i) - 'a' + 1;
            res += (n * pow) % MOD;
            pow = pow * 31 % MOD;
        }
        res %= MOD;
        System.out.println(res);
    }
}