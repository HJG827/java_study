import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = -1000000;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }

// .split() 은 좀 무거운 연산이라 함
//        String [] input = br.readLine().split(" ");
//
//        for(String s : input) {
//            int num = Integer.parseInt(s);
//            if (num > max) max = num;
//            if (num < min) min = num;
//        }

        System.out.printf("%d %d", min, max);
    }
}
