import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<String> Aset = new HashSet<>();
        Set<String> Bset = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            Aset.add(st.nextToken());
        }
        int cnt = 0;
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            if (Aset.contains(st.nextToken())) {
                cnt++;
            } else {
                result++;
            }
        }
        System.out.println(result + A - cnt);
    }
}