import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int num = Integer.parseInt(line);
        StringBuilder sb = new StringBuilder(); // 문자열 붙여넣기

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) sb.append('*');
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
