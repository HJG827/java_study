package week10_1027.전윤지;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;

        int len = N.length();
        for (int i = 0; i < len; i++) {
            char ch = N.charAt(len - 1 - i);
            int val;
            if (ch >= '0' && ch <= '9') {
                val = ch - '0';
            } else { // 'A'~'Z'
                val = ch - 'A' + 10;
            }
            result += val * Math.pow(B, i);
        }

        System.out.println(result);
    }
}
