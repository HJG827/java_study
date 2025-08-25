package week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Trie {
	static class Node{
		Map<Character, Node> next = new HashMap<>();
		boolean end;
	}
	Node root = new Node();
	
	void insert(String w) {
		Node cur = root;
		for (char ch : w.toCharArray()) {
			cur = cur.next.computeIfAbsent(ch,  k -> new Node());
			// computeIfAbsent(key, value) : 키가 없으면-> func.apply(key)를 호출, 만든 값 삽입
			// 키가 있으면 -> 기존 값 반환
			// if (cur.next[idx]==null) cur.next[idx] = new Node(); 랑 비슷
		}
		cur.end = true;
	}
	
	int longestMatch(char[] s, int i) {
		Node cur = root;
		int n = s.length;
		int best = 0;
		int idx = i;
		while (idx<n) {
			Node nxt = cur.next.get(s[idx]);
			if (nxt==null) break;
			cur = nxt;
			idx++;
			if (cur.end) best = idx - i;
		}
		return best;
	}
}

public class Bj2941 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 1. Trie 학습
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		
		Trie trie = new Trie();
		
		for(String p : new String[] {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="}) {
			trie.insert(p);
		}
		
		int n = s.length, i=0, count=0;
		while(i<n) {
			int len = trie.longestMatch(s,  i);
			if(len>0) {
				count++;
				i += len;
			}
			else {
				count ++;
				i++;
			}
		}
		System.out.println(count);
		
		
		// 2. chatGPT - 깔끔
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine().trim();
//
//        int count = 0;
//        for (int i = 0; i < s.length(); ) {
//            // 1) "dz="는 3글자이므로 가장 먼저 확인 (겹침 방지)
//            if (i + 2 < s.length() && s.charAt(i) == 'd' && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
//                // 단축평가?에 의해서 i+2가 범위 안이 아니면 바로 나옴
//            	count++;
//                i += 3;
//                continue;
//            }
//
//            // 2) 2글자 묶음들 확인
//            if (i + 1 < s.length()) {
//                String two = s.substring(i, i + 2);
//                if (two.equals("c=") || two.equals("c-") || 
//                		// String은 reference 타입이므로 .equals 활용
//                    two.equals("d-") || two.equals("lj") ||
//                    two.equals("nj") || two.equals("s=") ||
//                    two.equals("z=")) {
//                    count++;
//                    i += 2;
//                    continue;
//                }
//            }
//
//            // 3) 그 외는 1글자
//            // continue에 의해서 '그 외' 특정 쉬움
//            count++;
//            i++;
//        }
//
//        System.out.println(count);

		
		// 3. 노가다
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String word = br.readLine();
//		
//		int N = word.length();
//		int result = 0;
//		int i=0;
//		while(i<N) {
////			System.out.println("index: " + i + "character: " + word.charAt(i));
//			if (i==N-1) {
//				result += 1;
//				i+=3;
//				continue;
//			}
//
//			if(word.charAt(i)=='d') {
//				if(i<N-2&&word.charAt(i+1)=='z' && word.charAt(i+2)=='=') {
//					result += 1;
//					i+=3;
//				}
//				else if(word.charAt(i+1)=='-') {
//					result += 1;
//					i+=2;
//				}
//				else {
//					result += 1;
//					i+=1;
//				}
//			}
//			else if(word.charAt(i)=='c') {
//				if(word.charAt(i+1)=='=' || word.charAt(i+1)=='-') {
//					result += 1;
//					i+=2;
//				}
//				else {
//					result += 1;
//					i+=1;
//				}
//			}
//			else if(word.charAt(i)=='l'&&word.charAt(i+1)=='j') {
//				result += 1;
//				i+=2;
//			}
//			else if (word.charAt(i)=='n'&&word.charAt(i+1)=='j') {
//				result += 1;
//				i+=2;
//			}
//			else if (word.charAt(i)=='s'&&word.charAt(i+1)=='=') {
//				result += 1;
//				i+=2;
//			}
//			else if (word.charAt(i)=='z'&&word.charAt(i+1)=='=') {
//				result += 1;
//				i+=2;
//			}
//			else {
//				result += 1;
//				i+=1;
//			}
//			
//		}
//		System.out.println(result);
	}

}
