import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bj_4344{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 1; i < (T+1); i++) {
            StringTokenizer A = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(A.nextToken());
            int[] B = new int[n];
            double avg = 0.0;
            int count = 0;
            
            for (int j = 0; j < n; j++) {
                B[j] = Integer.parseInt(A.nextToken());
                avg += B[j];
            }
            
            avg /= n;
            for (int j = 0; j < n; j++) {
                if (B[j] > avg) {
                    count++;
                }
            }
            
            double per = (double) count / n * 100;
            System.out.printf("%.3f%%\n", per);
            
        }
    }
}