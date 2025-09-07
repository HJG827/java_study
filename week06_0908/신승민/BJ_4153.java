import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BJ_4153{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String[] st = br.readLine().split(" ");
            int[] nums = new int[3];
            nums[0] = Integer.parseInt(st[0]);
            nums[1] = Integer.parseInt(st[1]);
            nums[2] = Integer.parseInt(st[2]);
            
            Arrays.sort(nums);
            if (nums[2] == 0){
                break;
            }
            
            String res = "right";
            if(nums[0]*nums[0] + nums[1]*nums[1] != nums[2]*nums[2]) {
                res = "wrong";
            }
            
            System.out.printf("%s\n",res);
        }
    }
}