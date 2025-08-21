import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_10818 {
    public static void main(String[] args) throws IOException{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        int M = -1000001;
        int m = 1000001;
        
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(A[i]);
            if (M < a) {
                M = a;
            }
            if (m > a){
                m = a;
            }
        }
        System.out.printf("%d %d", m, M);
        System.out.println("");
        
    }
}