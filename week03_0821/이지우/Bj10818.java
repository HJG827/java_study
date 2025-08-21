import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = 1000001;  // 문제 조건상 최댓값보다 큰 수
        int max = -1000001; // 문제 조건상 최솟값보다 작은 수

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println(min + " " + max);
        sc.close();
    }
}

// 최소, 최대
// https://www.acmicpc.net/problem/10818