package 신승민;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int power = 1;
        while (power <= num) {
            power *= 2;
        }
        power /= 2;

        if (num == 1) {
            System.out.println(1);
        } else if (num == 2) {
            System.out.println(2);
        } else {
            if (num - power > 0) {
                System.out.println((num - power) * 2);
            } else {
                System.out.println(num);
            }
        }
    }
}
