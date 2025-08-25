import java.util.Scanner;

public class Bj11720 {
    public static void main(String[] args) {
        // 스캐너
        Scanner sc = new Scanner(System.in);
        // 첫줄 숫자 n
        int n = sc.nextInt();
        String numbers = sc.next();
        // 결과값
        int sum = 0;
        
        // numbers를 분리해서 합계 계산
        for (int i = 0; i<n;i++) {
            // charAt으로 i번째 문자 가져오고 -'0'으로 숫자 변환해서 추가됨
            sum += numbers.charAt(i) - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}

// 숫자의 합
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램
// 첫째 줄에 숫자의 개수 N이 주어짐
// 둘째 줄에 숫자 N개가 공백없이 주어짐
