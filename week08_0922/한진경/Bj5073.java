import java.io.*;
import java.util.*;

public class Bj5073 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder out = new StringBuilder();
    while (true) {
      String s = br.readLine();
      if (s == null)
        break;
      StringTokenizer st = new StringTokenizer(s);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      if (a == 0 && b == 0 && c == 0)
        break;

      int[] arr = { a, b, c };
      Arrays.sort(arr);
      int x = arr[0], y = arr[1], z = arr[2];

      if (z >= x + y)
        out.append("Invalid\n");
      else if (x == z)
        out.append("Equilateral\n"); // 세 변 같음
      else if (x == y || y == z)
        out.append("Isosceles\n");
      else
        out.append("Scalene\n");
    }
    System.out.print(out.toString());
  }
}
