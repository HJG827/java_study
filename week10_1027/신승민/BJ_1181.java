import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// O(1)으로 찾기 위해서 HashSet, Set import
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Collections;


public class BJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 갯수를 나타내는 N 값 선언
        int N = Integer.parseInt(br.readLine());
        // HashSet 선언
        Set<String> set = new HashSet<>();
        // set에 추가
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        // List로 변환
        List<String> list = new ArrayList<>(set);
        // 정렬 기준 지정
        Collections.sort(list, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });
        // 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// GPT가 풀어준 TreeSet
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.TreeSet;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//
//        // TreeSet 생성 시 Comparator 전달
//        Set<String> set = new TreeSet<>((a, b) -> {
//            if (a.length() == b.length()) {
//                return a.compareTo(b); // 길이가 같으면 사전순
//            }
//            return Integer.compare(a.length(), b.length()); // 짧은 길이 우선
//        });
//
//        // 단어 입력 + TreeSet에 추가 (중복 자동 제거)
//        for (int i = 0; i < N; i++) {
//            set.add(br.readLine());
//        }
//
//        // TreeSet은 이미 정렬되어 있으므로 그대로 출력
//        for (String s : set) {
//            System.out.println(s);
//        }
//    }
//}
