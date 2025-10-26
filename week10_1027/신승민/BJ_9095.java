import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        // 수학 노가다 규칙
//        int[] res = new int[12];
//
//        res[1] = 1;
//        res[2] = 2;
//        res[3] = 4;
//        res[4] = 7;
//
//        for (int i = 5; i < 12; i++) {
//            res[i] = res[i-1] * 2 - res[i-4];
//        }
//        for (int i = 0; i < N; i++) {
//            int n = Integer.parseInt(br.readLine());
//            System.out.println(res[n]);
//        }
//    }
//}


// 아이디어 보고 푼 풀이
public class BJ_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 결과를 담을 res 변수 선언
        int[] res = new int[12];
        res[1] = 1;
        res[2] = 2;
        res[3] = 4;

        // 아이디어
        // 더하기의 끝이 1이라면 i-1의 경우의 수와 같고,
        // 더하기의 끝이 2라면 i-2의 경우의 수와 같고,
        // 더하기의 끝이 3이라면 i-3의 경우의 수와 같다.
        // 1, 2, 3으로만 식을 세워야 하므로 i-1, i-2, i-3의 경우만 생각하면 된다.
        for (int i = 4; i < 12; i++) {
            res[i] = res[i-1] + res[i-2] + res[i-3];
        }

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(res[n]);
        }
    }
}
