import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());

        System.out.println(N * 4);
    }
}