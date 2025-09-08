import java.io.*;
import java.util.*;

public class Bj1978 {
  static boolean isPrime(int x) {
    if (x < 2)
      return false;
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int v = Integer.parseInt(st.nextToken());
      if (isPrime(v))
        cnt++;
    }
    System.out.println(cnt);
  }
}
