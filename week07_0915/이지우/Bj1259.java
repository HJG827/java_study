import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // 팰린드롬인지 확인하는 메소드
    // 앞뒤에서 하나씩 비교하다가 다르면 false, 끝까지 같으면 true
    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false; // 한 글자라도 다르면 팰린드롬 아님
            i++;
            j--;
        }
        return true; // 끝까지 다 같으면 팰린드롬 맞음
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder out = new StringBuilder(); // 출력 모아서 한 번에 내보내려고 사용

        while ((line = br.readLine()) != null) {
            line = line.trim(); // 혹시 모를 공백 제거
            if (line.equals("0")) break; // 입력이 0이면 문제 조건에 따라 종료

            // 팰린드롬이면 yes, 아니면 no 붙여주기
            if (isPalindrome(line)) {
                out.append("yes\n"); // 팰린드롬이면 yes
            } else {
                out.append("no\n");  // 아니면 no
            }
        }
        System.out.print(out.toString()); // 모아둔 결과 한 번에 출력
    }
}
