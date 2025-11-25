import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BJ_11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] N = br.readLine().split(" ");
        int n = Integer.parseInt(N[0]);
        int check = Integer.parseInt(N[1]);
        int[] nums = new int[n + 1];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++ ){
            nums[i + 1] = nums[i] + Integer.parseInt(input[i]);
        }

        String[] se;
        int s;
        int e;
        for (int j = 0; j < check; j++) {
            se = br.readLine().split(" ");
            s = Integer.parseInt(se[0]) - 1;
            e = Integer.parseInt(se[1]);

            System.out.println(nums[e] - nums[s]);
        }
    }
}