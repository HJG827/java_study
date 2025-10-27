package week10_1027.전윤지;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bj7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String plates = br.readLine().trim();

        int h = 10;

        for (int i = 1; i < plates.length(); i++) {
            if (plates.charAt(i) == plates.charAt(i - 1)) {
                h += 5;
            } else {
                h += 10;
            }
        }

        System.out.println(h);
    }
}
