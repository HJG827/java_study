import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2798{
    
    static int res = 0;
    static int N;
    static int M;
    static int[] cards;
    
    public static void blackJack(int sum, int idx, int count) {
        if (res == M) return;
        if (sum > M) return;
        if (count == 3) {
            if (M - res > M - sum){
                res = sum;
            }   
            return;
        }
        if (idx >= N) return;
        
        for (int i = idx; i < N; i++) {
            blackJack(sum + cards[i], i + 1, count + 1);
            if (res == M) return;
        }
    }
    
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String[] NM = br.readLine().split(" ");
       N = Integer.parseInt(NM[0]);
       M = Integer.parseInt(NM[1]);
       
       String [] temp = br.readLine().split(" ");
       cards = new int[N];
       for (int i = 0; i < N; i++){
           cards[i] = Integer.parseInt(temp[i]);
       }
       blackJack(0, 0, 0);
       
       System.out.println(res);
   } 
}