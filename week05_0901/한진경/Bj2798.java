import java.io.*;
import java.util.StringTokenizer;

public class Bj2798 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] a = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++)
      a[i] = Integer.parseInt(st.nextToken());

    int best = 0;
    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = a[i] + a[j] + a[k];
          if (sum == M) {
            System.out.println(M);
            return;
          }
          if (sum < M && sum > best) {
            best = sum;
          }
        }
      }
    }
    System.out.println(best);
  }
}
