import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 그릇 저장
        String bowl = br.readLine();
        // 이전 그릇 상태를 저장할 pre 값 선언
        char pre = bowl.charAt(0);
        // 다음 그릇 상태를 저장할 next 값 선언
        char next;
        // 결과 값을 담을 result 값 선언 (초기 10)
        int result = 10;
        // 반복문을 통해서 계산한다.
        for(int i = 1; i < bowl.length(); i++) {
            // 다음 그릇 상태를 저장한다.
            next = bowl.charAt(i);
            // 이전과 비교하여서 같으면 +5하고 다르면 +10 한다.
            if (pre == next) {
                result += 5;
            } else {
                result += 10;
                pre = next;
            }
        }
        System.out.println(result);
    }
}