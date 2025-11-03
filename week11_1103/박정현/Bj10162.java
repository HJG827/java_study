import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        int A = 300; // 5분
        int B = 60;  // 1분
        int C = 10;  // 10초

        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        }

        int a = T / A; T %= A;
        int b = T / B; T %= B;
        int c = T / C; // 이제 T는 반드시 0

        System.out.println(a + " " + b + " " + c);
    }
}
