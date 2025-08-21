import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        String D = String.valueOf(A * B * C);
        // String D = Integer.toString(A * B * C); 오직 int형만 문자열로 + null 값인 경우 에러남
        
        int[] res = new int[10];
        
        for(int i = 0; i < D.length(); i++){
            // int a = Integer.parseInt(String.valueOf(D.charAt(i)));
            int a = D.charAt(i) - '0';
            res[a]++;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(res[i]);
        }
    }
}