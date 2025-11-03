import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int top = -1;
        int next = 0;
        for (int i = 0; i < N; i++) {
            next = Integer.parseInt(br.readLine());
            if (next == 0) {
                top --;
            } else {
                top++;
                nums[top] = next;
            }
        }

        int result = 0;
        for (int i = 0; i <= top; i++) {
            result += nums[i];
        }
        System.out.println(result);
    }
}