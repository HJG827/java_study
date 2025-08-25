import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine(); 
        int[] alphabet = new int[26]; 

        // 초기값 -1로 설정
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a'; 
            if (alphabet[idx] == -1) { // 처음 등장할 때
                alphabet[idx] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(alphabet[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    
}
