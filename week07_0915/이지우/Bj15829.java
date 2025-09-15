import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 문제에서 주는 상수들: r=31, M=1234567891(소수)
    private static final long R = 31L;
    private static final long MOD = 1234567891L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1) 문자열 길이 입력 (사실 L을 안 써도 되지만, 입력 형식에 맞춰 읽어줌)
        int L = Integer.parseInt(br.readLine().trim());

        // 2) 실제 문자열
        String s = br.readLine().trim();

        // 합과 r의 거듭제곱을 누적할 변수는 오버플로 방지를 위해 long 사용
        long hash = 0L;   // 해시 누적합 H
        long pow = 1L;    // r^i 값을 저장 (처음은 r^0 = 1)

        // 3) 왼쪽부터 순회하며 a_i * r^i 를 더해줌 (매 단계에서 모듈러)
        //    - 'a' -> 1, 'b' -> 2, ..., 'z' -> 26
        //    - 매번 pow = pow * R % MOD 로 다음 거듭제곱 준비
        for (int i = 0; i < L; i++) {
            char ch = s.charAt(i);
            int ai = (ch - 'a') + 1;    // 알파벳을 1~26으로 매핑

            // (현재 문자 값 * 현재 r^i) 를 더하고 모듈러
            hash = (hash + (ai * pow) % MOD) % MOD;

            // 다음 문자 준비: r^(i+1)
            pow = (pow * R) % MOD;
        }

        // 4) 결과 출력
        System.out.println(hash);
    }
}
