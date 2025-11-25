import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj2588 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int A = Integer.parseInt(br.readLine().trim());
    String B = br.readLine().trim();

    int b1 = B.charAt(2) - '0';
    int b2 = B.charAt(1) - '0';
    int b3 = B.charAt(0) - '0';

    System.out.println(A * b1);
    System.out.println(A * b2);
    System.out.println(A * b3);

    int numB = Integer.parseInt(B);
    System.out.println(A * numB);
  }
}