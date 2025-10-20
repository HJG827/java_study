import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10250 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine().trim());

    for (int tc = 0; tc < T; tc++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int H = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());

      int floor = N % H;
      if (floor == 0) {
        floor = H;
      }

      int room = N / H + 1;
      if (floor == H) {
        room = N / H;
      }

      System.out.println(floor * 100 + room);
    }

  }
}
