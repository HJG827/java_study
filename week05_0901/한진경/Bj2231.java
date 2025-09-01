import java.io.*;

public class Bj2231 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int ans = 0;
    // 가장 작은 생성자는 자릿수의 최대값(9)*자릿수를 뺀 값부터 완전탐색
    int start = Math.max(1, N - 9 * String.valueOf(N).length());

    for (int i = start; i <= N; i++) {
      int sum = i;
      int temp = i;
      while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
      }

      if (sum == N) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }

}