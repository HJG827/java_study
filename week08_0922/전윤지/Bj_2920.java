import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bj_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 7; i++) {
            if (nums[i] < nums[i + 1]) {
                descending = false;
            } else if (nums[i] > nums[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) System.out.println("ascending");
        else if (descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
