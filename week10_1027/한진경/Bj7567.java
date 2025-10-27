import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj7567 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();

    if (s != null)
      s = s.trim();

    int ans = 0;
    char prev = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (i == 0) {
        ans += 10;
      } else {
        if (c == prev) {
          ans += 5;
        } else {
          ans += 10;
        }
      }
      prev = c;
    }
    System.out.println(ans);
  }
}
