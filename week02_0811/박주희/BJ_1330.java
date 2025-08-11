import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); // 입력 한 줄 읽기
        String[] input = line.split(" "); // 공백 기준 split

        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        if (nums[0] > nums[1]) {
            System.out.println(">");
        } else if (nums[0] == nums[1]) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
