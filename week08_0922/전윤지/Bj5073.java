import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Bj5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (true) {
            input = br.readLine();
            if (input.equals("0 0 0")) break;

            StringTokenizer st = new StringTokenizer(input);
            int[] sides = new int[3];
            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(sides); // 작은 변부터 정렬

            if (sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
