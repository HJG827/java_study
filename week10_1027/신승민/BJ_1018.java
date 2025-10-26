import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1018 {
    static String[] chess;
    static int R, C;

    // 특정 구간 (x, y) 부터 8x8 체스판을 검사
    static int fill_chess(int x, int y, char start) {
        int repaint = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = chess[x + i].charAt(y + j);
                // (i+j)가 짝수면 시작 색과 같아야 함
                if ((i + j) % 2 == 0) {
                    if (current != start) repaint++;
                }
                // (i+j)가 홀수면 시작 색과 달라야 함
                else {
                    if (current == start) repaint++;
                }
            }
        }

        return repaint;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] RC = br.readLine().split(" ");
        R = Integer.parseInt(RC[0]);
        C = Integer.parseInt(RC[1]);
        chess = new String[R];

        for (int i = 0; i < R; i++) {
            chess[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;

        // 모든 (x, y) 시작점에 대해 8x8 검사
        for (int i = 0; i <= R - 8; i++) {
            for (int j = 0; j <= C - 8; j++) {
                // W 시작, B 시작 각각 검사
                int w = fill_chess(i, j, 'W');
                int b = fill_chess(i, j, 'B');
                min = Math.min(min, Math.min(w, b));
            }
        }

        System.out.println(min);
    }
}
