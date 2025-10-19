import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

public class BJ_1764 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Count = br.readLine().split(" ");
        int hearCnt = Integer.parseInt(Count[0]);
        int seeCnt = Integer.parseInt(Count[1]);
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < hearCnt; i++) {
            set.add(br.readLine());
        }
        
        int cnt = 0;
        ArrayList<String> res = new ArrayList<>();
        
        for (int i = 0; i < seeCnt; i++){
            String noSee = br.readLine();
            if (set.contains(noSee)) {
                cnt++;
                res.add(noSee);        
            }
        }
        
        Collections.sort(res);
        System.out.println(cnt);
        for(String result : res) {
            System.out.println(result);
        }
        
    }
}
