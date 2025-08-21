import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        int j = 0;
        
        for (int i = 1; i < 10; i++){
            int a = Integer.parseInt(br.readLine());
            
            if (res < a){
                res = a;
                j = i;
            }
        }
        System.out.println(res);
        System.out.println(j);
    }
}