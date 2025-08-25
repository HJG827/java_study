import java.io.*;

public class Bj10809 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine().trim();

    int[] pos = new int[26];

    for (int i = 0; i < 26; i++) {
      pos[i] = -1;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int idx = c - 'a';
      if (pos[idx] == -1) {
        pos[idx] = i;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      sb.append(pos[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}
