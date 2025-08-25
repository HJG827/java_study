import java.io.*;

public class Bj11720 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine().trim());
    String s = br.readLine().trim();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += s.charAt(i) - '0';
    }
    System.out.println(sum);
  }
}