import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;        // 최댓값 저장
        int maxIndex = 0;   // 최댓값의 위치 저장

        // 9개의 수를 하나씩 입력받으면서 바로 처리
        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();

            // 현재 입력받은 수가 지금까지의 최댓값보다 크면
            if (num > max) {
                max = num;          // 최댓값 업데이트
                maxIndex = i;       // 위치 업데이트 (1부터 시작)
            }
        }

        System.out.println(max);        // 최댓값 출력
        System.out.println(maxIndex);   // 몇 번째인지 출력

        sc.close();
    }
}

// 최댓값
// https://www.acmicpc.net/problem/2562
