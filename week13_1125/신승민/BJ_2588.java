import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2588 {
    public static void main(String[] arges) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split("");

        int C = A*Integer.parseInt(B[2]);
        int D = A*Integer.parseInt(B[1]);
        int E = A*Integer.parseInt(B[0]);

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(C + D*10 + E*100);
    }
}
