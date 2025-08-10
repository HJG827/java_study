import java.util.Scanner;

public class bj2438 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    for (int i = 1; i <= a; i++) {
      System.out.println("*".repeat(i));
    }

  }
}
