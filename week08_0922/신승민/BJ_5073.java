import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_5073{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] nums = new int[3];
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(nums);

            if(nums[0] == 0) {
                return;
            }

            String res = "Scalene";

            if (nums[2] >= nums[1] + nums[0]) {
                res = "Invalid";
            } else if(nums[2]==nums[1] && nums[1]== nums[0] && nums[0]==nums[2]) {
                res = "Equilateral";
            } else if (nums[2]==nums[1] || nums[1]==nums[0] || nums[0]==nums[2]) {
                res = "Isosceles";
            }

            System.out.println(res);
        }
    }
}