import java.io.*;
import java.util.*;

public class Bj4153 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String line = br.readLine();
      if (line == null)
        break; // 입력 끝 안전장치

      StringTokenizer st = new StringTokenizer(line);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if (a == 0 && b == 0 && c == 0)
        break; // 종료 조건(0 0 0)!

      int[] arr = { a, b, c };
      Arrays.sort(arr); // 정렬

      int x = arr[0], y = arr[1], z = arr[2];
      if (x * x + y * y == z * z)
        sb.append("right\n");
      else
        sb.append("wrong\n");
    }

    System.out.print(sb.toString());
  }
}
