import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        // + 또는 - 기준으로 나누되, 구분자도 포함되도록 정규식 사용
        String[] result = expression.split("(?=[+-])|(?<=[+-])");

        int res = Integer.parseInt(result[0]);
        boolean minus = false;
        int sum = 0;

        for (int i = 1; i < result.length; i++) {
            String token = result[i];
            
            if (token.equals("-")) {
                // 마이너스 시작 시점이면 지금까지의 sum을 빼고 새 그룹 시작
                if (minus) {
                    res -= sum;
                    sum = 0;
                } else {
                    minus = true;
                }
            } else if (token.equals("+")) {
                continue;
            } else {
                int num = Integer.parseInt(token);
                if (minus) {
                    sum += num;
                } else {
                    res += num;
                }
            }
        }

        // 마지막 처리
        if (minus) res -= sum;

        System.out.println(res);
    }
}
