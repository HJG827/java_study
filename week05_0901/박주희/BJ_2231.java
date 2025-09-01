import java.io.*;
import java.util.*;

public class BJ_2798 {
    static int N, M;
    static int[] cards;
    static int best = 0; // M 이하 최댓값

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) cards[i] = Integer.parseInt(st.nextToken());

        // 오름차순 정렬해두면 약간의 가지치기(합 초과 시 break) 가능
        Arrays.sort(cards);

        dfs(0, 0, 0); // start=0, depth=0, sum=0
        System.out.println(best);
    }

    // 조합 DFS: start부터 시작해서 3장(depth==3) 뽑기
    static void dfs(int start, int depth, int sum) {
        // 합이 이미 M을 넘으면 의미 없으니 컷
        if (sum > M) return;

        // 3장 골랐으면 최댓값 갱신
        if (depth == 3) {
            if (sum <= M && sum > best) best = sum;
            return;
        }

        // 조합 선택: i를 고르고 다음은 i+1부터
        for (int i = start; i < N; i++) {
            // 정렬되어 있으므로 현재 카드 더해도 M을 넘으면 이후 카드들도 다 더 큼 → 더 볼 필요 없음
            if (sum + cards[i] > M) break;

            dfs(i + 1, depth + 1, sum + cards[i]);

            // 최적값 도달 시(=M) 조기 종료
            if (best == M) return;
        }
    }
}
