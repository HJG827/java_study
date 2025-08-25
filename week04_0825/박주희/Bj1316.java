import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = N;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            int[] alphaLst = new int[26];

            char preAlpha = 'a';
            for (int j = 0; j < word.length(); j++) {
                char nowAlpha = word.charAt(j);
                if (j == 0) {
                    preAlpha = nowAlpha;
                    alphaLst[nowAlpha - 'a'] = 1;
                }
                else {
                    if (nowAlpha != preAlpha && alphaLst[nowAlpha - 'a'] != 0) {
                        alphaLst[nowAlpha - 'a'] = -1;
                        ans -= 1;
                        break;
                    }
                    else {
                        alphaLst[nowAlpha - 'a'] = 1;
                        preAlpha = nowAlpha;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
