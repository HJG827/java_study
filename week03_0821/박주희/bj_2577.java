import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }
        String numS = Integer.toString(num);

        int[] arr = new int[10];
        for(int i = 0; i < numS.length(); i++) {
            // charAt(i) 은 char 타입을 반환하므로, 숫자를 원한다면 - '0'을 해주자.
            int digit = numS.charAt(i) - '0';
            arr[digit] += 1;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
