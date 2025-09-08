package week06_0908.전윤지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1978 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num))
                count++;
        }

        System.out.println(count);
    }

}
