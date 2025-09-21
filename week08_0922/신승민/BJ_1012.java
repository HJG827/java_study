import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ_1012 {
    static int res, R, C, K;
    static boolean[][] visited, baechu;
    static int[] dc = {1, 0, -1, 0};
    static int[] dr = {0, 1, 0, -1};
    static int[][] q;
    static void dfs(int r, int c){
        res++;
        int top = 0;
        q[0][top] = r;
        q[1][top] = c;

        while (top >= 0) {
            int sr = q[0][top];
            int sc = q[1][top];
            top--;

            visited[sr][sc] = true;

            for (int i = 0; i < 4; i++) {
                int nr = sr + dr[i];
                int nc = sc + dc[i];

                if (nr >= R || nc >= C || nr < 0 || nc < 0) continue;
                if (visited[nr][nc]) continue;

                if (baechu[nr][nc]) {
                    top++;
                    q[0][top] = nr;
                    q[1][top] = nc;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            res = 0;
            visited = new boolean[R][C];
            baechu = new boolean[R][C];
            q = new int[2][K];

            for (int j = 0; j < K; j++) {
                StringTokenizer bae = new StringTokenizer(br.readLine());

                int r = Integer.parseInt(bae.nextToken());
                int c = Integer.parseInt(bae.nextToken());

                baechu[r][c] = true;
            }

            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++){

                    if(baechu[r][c] && !visited[r][c]) {
                        dfs(r, c);
                    }
                }
            }
            System.out.println(res);
        }
    }
}