import java.util.*;

public class BJ_10809 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String let = sc.nextLine();
        int[] alphs = new int[26];
        Arrays.fill(alphs, -1);

        for(int i = 0; i < let.length(); i++) {
            char alph = let.charAt(i);
            int idx = alph - 'a';
            if(alphs[idx] == -1) {
                alphs[idx] = i;
            }
        }
        for(int i = 0; i < 26; i++) {
            sb.append(alphs[i]);
            if(i < 25) sb.append(' ');
        }
        System.out.println(sb);
    }
}
