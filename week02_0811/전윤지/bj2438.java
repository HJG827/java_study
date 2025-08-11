import java.util.Scanner;

public class bj2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 줄 수 입력

        for (int i = 1; i <= N; i++) { // 줄(row)
            for (int j = 1; j <= i; j++) { // 별(column)
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
    
}
