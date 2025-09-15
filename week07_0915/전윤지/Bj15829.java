package week07_0915.전윤지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15829 {
    public static void main(String[] args) throws IOException {
        final int R = 31;
        final long MOD = 1234567891L;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long hash = 0;
        long rPow = 1; // R^0 = 1

        for (int i = 0; i < L; i++) {
            int val = s.charAt(i) - 'a' + 1; // a=1, b=2, ..., z=26
            hash = (hash + val * rPow) % MOD;
            rPow = (rPow * R) % MOD;
        }

        System.out.println(hash);
    }

}
