package week06_0908.전윤지;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; // split()
import java.util.Arrays; // sort()

public class Bj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            int[] arr = { a, b, c };
            Arrays.sort(arr); // 오름차순 정렬 → arr[2]가 가장 긴 변

            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }

        System.out.print(sb);
    }

}
