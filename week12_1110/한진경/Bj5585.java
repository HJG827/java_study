import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5585 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long N = Long.parseLong(br.readLine().trim());

    long money = 1000 - N;
    int ans = 0;

    while (money > 0) {
      if (money >= 500) {
        long pay = money / 500;
        ans += pay;
        money -= 500 * pay;
      }
      if (money >= 100) {
        long pay = money / 100;
        ans += pay;
        money -= 100 * pay;
      }
      if (money >= 50) {
        long pay = money / 50;
        ans += pay;
        money -= 50 * pay;
      }
      if (money >= 10) {
        long pay = money / 10;
        ans += pay;
        money -= 10 * pay;
      }
      if (money >= 5) {
        long pay = money / 5;
        ans += pay;
        money -= 5 * pay;
      }

      ans += money;
      money = 0;
    }
    System.out.println(ans);
  }
}
