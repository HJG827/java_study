import java.util.Scanner;

public class bj1330 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int A = sc.nextInt(); // 첫 번째 정수
            int B = sc.nextInt(); // 두 번째 정수
    
            if (A > B) {
                System.out.println(">");
            } else if (A < B) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        }
    
}
