import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ_11650 {
    static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.first != other.first) {
                return Integer.compare(this.first, other.first); // 첫 번째 기준
            } else {
                return Integer.compare(this.second, other.second); // 두 번째 기준
            }
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pq.add(new Pair(x, y));
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
