import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class BJ_1620{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] poket = new String[N + 1];             // 1-based
        HashMap<String, Integer> nameToIdx = new HashMap<>(N * 2);

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            poket[i] = name;
            nameToIdx.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String q = br.readLine();
            // 숫자 쿼리면 인덱스로 접근
            if (q.length() > 0 && q.charAt(0) >= '0' && q.charAt(0) <= '9') {
                int idx = Integer.parseInt(q);
                sb.append(poket[idx]).append('\n');
            } else { // 문자열 쿼리면 해시맵에서 O(1) 조회
                sb.append(nameToIdx.get(q)).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}