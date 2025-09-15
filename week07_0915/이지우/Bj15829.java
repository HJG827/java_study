import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        final long M = 1234567891L;
        final long R = 31L;

        long pow = 1L;      // r^0
        long hash = 0L;

        for (int i = 0; i < L; i++) {
            long ai = (s.charAt(i) - 'a' + 1);
            hash = (hash + (ai * pow) % M) % M;
            pow = (pow * R) % M;
        }
        System.out.println(hash);
    }
}
