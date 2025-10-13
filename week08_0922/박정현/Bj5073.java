import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Bj5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) break;

            // 세 변 정렬
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            // 삼각형 조건 불만족
            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            }
            // 세 변 같음
            else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral");
            }
            // 두 변 같음
            else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                System.out.println("Isosceles");
            }
            // 모두 다름
            else {
                System.out.println("Scalene");
            }
        }
    }
}
s