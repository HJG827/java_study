import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class BJ_14425{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int res = 0;
        Map<String, Integer> hm = new HashMap<> ();
        
        for (int i = 0; i < N; i++) {
            hm.put(br.readLine(), 0);
        }
        for (int i = 0; i < M; i++) {
            if (hm.containsKey(br.readLine())) {
                res++;
            }
        }
        System.out.println(res);
    }
}