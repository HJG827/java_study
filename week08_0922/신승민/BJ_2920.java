import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2920{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nums = br.readLine();
        String res = "mixed";

        if(nums.equals("1 2 3 4 5 6 7 8")){
            res = "ascending";
        } else if (nums.equals("8 7 6 5 4 3 2 1")) {
            res = "descending";
        }

        System.out.println(res);
    }
}