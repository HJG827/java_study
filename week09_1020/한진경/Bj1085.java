import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1085 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

    int min_x = Math.abs(w - x);
    int min_y = Math.abs(h - y);

    System.out.println(Math.min(Math.min(x, min_x), Math.min(y, min_y)));
  }
}