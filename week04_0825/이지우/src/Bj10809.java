import java.util.Arrays;
import java.util.Scanner;

public class Bj10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i=0; i<26; i++) {
            char alphabet = (char)('a' + i);
            int position = s.indexOf(alphabet);

            if (i>0) {
                System.out.print(" ");
                }
            System.out.print(position);
        }
        sc.close();
    }
}

// 알파벳 찾기
// 소문자로만 이루어진 단어 S
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우 처음 등장하는 위치
// 포함되어어있지 않은 경우 -1 출력
// 첫 줄: S = 소문자로만 된 단어, 100 이하,
// 예제 입력1
// baekjoon
// 예제 출력1
// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1