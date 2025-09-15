import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15829 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int L = Integer.parseInt(br.readLine().trim());
    String s = br.readLine().trim();

    final long MOD = 1234567891L;
    final long R = 31L;

    long h = 0L;
    long pow = 1L;
    for (int i = 0; i < L; i++) {
      int val = s.charAt(i) - 'a' + 1; // a=1 ... z=26
      h = (h + val * pow) % MOD;
      pow = (pow * R) % MOD;
    }
    System.out.println(h);
  }
}
