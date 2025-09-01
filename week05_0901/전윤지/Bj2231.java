import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2231 {
    private static int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int digits = Integer.toString(N).length();
        int start = Math.max(1, N - 9 * digits);
        int answer = 0;

        for (int i = start; i < N; i++) {
            if (i + digitSum(i) == N) {
                answer = i; // 최소 생성자 발견
                break;
            }
        }
        System.out.println(answer);
    }
}
