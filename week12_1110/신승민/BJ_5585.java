import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int n = 1000 - N;
        int[] nums = {500, 100, 50, 10, 5, 1};

        for (int k : nums){
            result += n / k;
            n = n % k;
            if (n == 0) {
                break;
            }
        }
        System.out.println(result);

    }
}