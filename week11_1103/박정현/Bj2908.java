import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int reverse3(String s) {
        // s는 항상 길이 3
        return (s.charAt(2) - '0') * 100
             + (s.charAt(1) - '0') * 10
             + (s.charAt(0) - '0');
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int ra = reverse3(A);
        int rb = reverse3(B);

        System.out.println(Math.max(ra, rb));
    }
}
