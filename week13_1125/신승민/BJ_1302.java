import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BJ_1302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> hashMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        String book;
        for (int i = 0; i < N; i++) {
            book = br.readLine();
            hashMap.put(book, hashMap.getOrDefault(book, 0) + 1);
        }

        int maxValue = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();


            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            } else if (value == maxValue) {
                // 동점일 때 사전순으로 더 앞서는 문자열로 갱신
                if (key.compareTo(maxKey) < 0) {
                    maxKey = key;
                }
            }
        }

        System.out.println(maxKey);
    }
}