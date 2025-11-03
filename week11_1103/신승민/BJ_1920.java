import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String n : nums) {
            set.add(n);
        }

        int n = Integer.parseInt(br.readLine());
        String[] nums2 = br.readLine().split(" ");
        for (String m : nums2) {
            if (set.contains(m)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}