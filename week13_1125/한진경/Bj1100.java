import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1100 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int ans = 0;

    for (int r = 0; r < 8; r++) {
      String line = br.readLine();
      for (int c = 0; c < 8; c++) {
        if (line.charAt(c) == 'F' && (r + c) % 2 == 0) {
          ans += 1;
        }
      }
    }
    System.out.println(ans);
  }
}
