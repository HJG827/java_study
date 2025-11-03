import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        String a = nums[0];
        String b = nums[1];
        char a1, b1;

        for (int i = 2; i > -1; i--) {
            a1 = a.charAt(i);
            b1 = b.charAt(i);

            if (a1 > b1) {
                System.out.println(new StringBuilder(a).reverse().toString());
                break;
            } else if (b1 > a1) {
                System.out.println(new StringBuilder(b).reverse().toString());
                break;
            }
        }
    }
}