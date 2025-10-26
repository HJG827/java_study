import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[1]);
        String num = str[0];

        // N진법을 위한 power 값 선언
        int power = 1;
        // 결과를 저장할 result 값 선은
        int result = 0;
        // 최종 결과를 계산하는 for 문
        for(int i = num.length() - 1; i >= 0; i--) {
            // i자리 문자 받아오기
            char c = num.charAt(i);
            // 가져온 문자가 숫자라면 '0'을 빼준 후 곱하면 됨
            if (c <= '9') {
                int value = c - '0';
            } else {
                // 문자일 경우 숫자로 치환해서 곱함
                int value = c - 'A' + 10;
            }
            result += value * power;

            // power 값 누적 계산
            power *= N;
        }
        System.out.println(result);
    }
}