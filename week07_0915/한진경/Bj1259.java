import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1259 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();
    while (true) {
      String s = br.readLine();
      if (s == null)
        break;
      s = s.trim();
      if (s.equals("0"))
        break;

      boolean ok = true;
      int i = 0, j = s.length() - 1;
      while (i < j) {
        if (s.charAt(i) != s.charAt(j)) {
          ok = false;
          break;
        }
        i++;
        j--;
      }
      out.append(ok ? "yes\n" : "no\n");
    }
    System.out.print(out.toString());
  }
}
