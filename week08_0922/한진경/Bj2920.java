import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2920 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] a = new int[8];
    for (int i = 0; i < 8; i++)
      a[i] = Integer.parseInt(st.nextToken());

    boolean asc = true, desc = true;
    for (int i = 0; i < 8; i++) {
      if (a[i] != i + 1)
        asc = false; // 1..8 체크!!!!
      if (a[i] != 8 - i)
        desc = false; // 8..1 체크!!!!
    }

    if (asc)
      System.out.println("ascending");
    else if (desc)
      System.out.println("descending");
    else
      System.out.println("mixed");

  }
}