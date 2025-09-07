import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1978{
    static int res = 0;
    public static void isprime(int n) {
        int sqrtn = (int) Math.sqrt(n);
        if(n == 1){
            return;
        }
        if (n == 2 || n == 3){
            res++;
            return;
        }
        for (int i = 2; i <= sqrtn; i++) {
            if (n % i == 0){
                return;
            }
        }
        res++;
             
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] ip = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            isprime(Integer.parseInt(ip[i]));
        }
        System.out.printf("%d\n", res);
    }
}