import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class BJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String n : nums) {
            set.add(Integer.parseInt(n));
        }

        List<Integer> sorted = set.stream()
                .sorted() // 오름차순
                .collect(Collectors.toList());


        Map<Integer, Integer> indexMap = new HashMap<>();
        int index = 0;
        for (int num : sorted) {
            if (!indexMap.containsKey(num)) {
                indexMap.put(num, index++);
            }
        }

        // 원래 배열 순서대로 인덱스 출력
        StringBuilder sb = new StringBuilder();
        for (String m : nums) {
            int num = Integer.parseInt(m);
            sb.append(indexMap.get(num)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}