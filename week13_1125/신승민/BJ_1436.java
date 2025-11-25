import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 찾고 싶은 번째 수
        int count = 0; // 몇 개 찾았는지
        int num = 666; // 666부터 시작

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
    }
}
