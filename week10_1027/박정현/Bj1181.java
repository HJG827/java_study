package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

class Word implements Comparable<Word>{
	int length;
	String detail;
	
	Word (int length, String detail) {
		this.length = length;
		this.detail = detail;
	}
	@Override
	public int compareTo(Word word) {
		if (this.length == word.length) {
			for (int i=0;i<this.length;i++) {
				if (this.detail.charAt(i)==word.detail.charAt(i))continue;
				return this.detail.charAt(i)-word.detail.charAt(i);
			}
		}
		return this.length - word.length;
	}
}

public class Bj1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		TreeSet<Word> dictionary = new TreeSet<>();
//		String[] dictionary = new String[N];
		for (int i=0;i<N;i++) {
			String inputString = br.readLine();
			dictionary.add(new Word(inputString.length(), inputString));
		}
		for (Word word : dictionary) {
			System.out.println(word.detail);
		}
	}

}


// 참고자료
// https://kbj96.tistory.com/49
// https://hoonsb.tistory.com/48
//
//import java.util.Comparator;
//import java.util.PriorityQueue;
// 
//class Student {
//    int mathScore; // 수학점수
//    int engScore;  // 영어점수
// 
//    public Student(int mathScore, int engScore){
//        this.mathScore = mathScore;
//        this.engScore = engScore;
//    }
//}
//// 클래스 객체의 우선순위를 위한 클래스
//class StudentComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//        if (o1.mathScore == o2.mathScore) {
//            return o2.engScore - o1.engScore;
//        } else {
//            return o1.mathScore - o2.mathScore;
//        }
//    }
//}
// 
//public class Example {
// 
//    public static void main(String[] args) {
// 
//        // 클래스 객체에 대한 우선순위 기준 제공
//        PriorityQueue<Student> pQ = new PriorityQueue<>(1, new StudentComparator());
// 
//        pQ.offer(new Student(70, 50));  // 우선순위 큐에 클래스 객체를 추가
//        pQ.offer(new Student(60, 50));  // 우선순위 큐에 클래스 객체를 추가
//        pQ.offer(new Student(70, 40));  // 우선순위 큐에 클래스 객체를 추가
// 
//        while (!pQ.isEmpty()) {
//            Student s = pQ.poll();
//            System.out.printf("Student\'s MathScore and engScore: %d, %d \n", s.mathScore, s.engScore);
//        }
//    }
//}
//
//야 여기서 
//class StudentComparator implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//        if (o1.mathScore == o2.mathScore) {
//            return o2.engScore - o1.engScore;
//        } else {
//            return o1.mathScore - o2.mathScore;
//        }
//    }
//}
//이부분에서 내가 만약에 o1도 o2도 같으면 입력하지 말라고 하고 싶으면 어떻게 해야해?
//		
//		요약(확실함): **Comparator에서 `0`을 반환해도 `PriorityQueue`는 중복 삽입을 막아주지 않습니다.**
//		“두 점수가 모두 같은 객체는 넣지 않기”를 원하면 **삽입 전에 별도로 걸러야** 합니다.
//
//		### 방법 1) `PriorityQueue + HashSet`으로 중복 필터링 (권장)
//
//		`Student`에 `equals/hashCode`를 정의하고, 넣기 전에 `HashSet`으로 한 번 걸러주세요.
//
//		```java
//		import java.util.*;
//
//		class Student {
//		    int mathScore;
//		    int engScore;
//
//		    public Student(int mathScore, int engScore){
//		        this.mathScore = mathScore;
//		        this.engScore = engScore;
//		    }
//
//		    @Override
//		    public boolean equals(Object o) {
//		        if (this == o) return true;
//		        if (!(o instanceof Student)) return false;
//		        Student s = (Student) o;
//		        return mathScore == s.mathScore && engScore == s.engScore;
//		    }
//
//		    @Override
//		    public int hashCode() {
//		        return Objects.hash(mathScore, engScore);
//		    }
//		}
//
//		class StudentComparator implements Comparator<Student> {
//		    @Override
//		    public int compare(Student o1, Student o2) {
//		        if (o1.mathScore == o2.mathScore) {
//		            return o2.engScore - o1.engScore; // 수학 같으면 영어 내림차순
//		        } else {
//		            return o1.mathScore - o2.mathScore; // 수학 오름차순
//		        }
//		    }
//		}
//
//		public class Example {
//		    public static void main(String[] args) {
//		        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
//		        Set<Student> seen = new HashSet<>();
//
//		        // addIfAbsent 유틸처럼 사용
//		        addIfAbsent(pq, seen, new Student(70, 50));
//		        addIfAbsent(pq, seen, new Student(60, 50));
//		        addIfAbsent(pq, seen, new Student(70, 40));
//		        addIfAbsent(pq, seen, new Student(70, 50)); // 동일 → 삽입 안 됨
//
//		        while (!pq.isEmpty()) {
//		            Student s = pq.poll();
//		            System.out.printf("Student's MathScore and engScore: %d, %d%n", s.mathScore, s.engScore);
//		        }
//		    }
//
//		    static void addIfAbsent(PriorityQueue<Student> pq, Set<Student> seen, Student s) {
//		        if (seen.add(s)) { // 처음 본 조합일 때만 true
//		            pq.offer(s);
//		        }
//		        // else: 동일 점수 조합이 이미 있어 삽입 생략
//		    }
//		}
//		```
//
//		### 방법 2) 아예 `TreeSet` 사용 (Comparator 기준으로 중복 차단)
//
//		`TreeSet`은 `compare` 결과가 `0`인 원소를 **같은 원소로 보고** 추가를 무시합니다. 우선순위 구조가 필요하면 `pollFirst()`로 하나씩 꺼내면 됩니다.
//
//		```java
//		import java.util.*;
//
//		class StudentComparator implements Comparator<Student> {
//		    @Override
//		    public int compare(Student o1, Student o2) {
//		        if (o1.mathScore == o2.mathScore) {
//		            int cmp = o2.engScore - o1.engScore;
//		            if (cmp == 0) return 0; // 두 점수 모두 같으면 동일 원소로 취급 → 중복 방지
//		            return cmp;
//		        } else {
//		            return o1.mathScore - o2.mathScore;
//		        }
//		    }
//		}
//
//		public class Example {
//		    public static void main(String[] args) {
//		        NavigableSet<Student> set = new TreeSet<>(new StudentComparator());
//		        set.add(new Student(70, 50));
//		        set.add(new Student(60, 50));
//		        set.add(new Student(70, 40));
//		        set.add(new Student(70, 50)); // 무시됨
//
//		        while (!set.isEmpty()) {
//		            Student s = set.pollFirst();
//		            System.out.printf("Student's MathScore and engScore: %d, %d%n", s.mathScore, s.engScore);
//		        }
//		    }
//		}
//		```
//
//		정리:
//
//		* **`PriorityQueue`는 중복을 자동으로 막지 않습니다.** → `Set`으로 사전 필터.
//		* **`TreeSet`은 `compare()==0`을 동일 원소로 간주** → 같은 점수 조합은 추가 자체가 안 됨.
//		  용도에 따라 둘 중 하나를 선택하세요.
//
//근데 priority queue를 썼던 이유는 정렬을 편하게 하려고 했던 거란 말이야? 앞에 있는 o1을 토대로 정렬을 하다가 넘어가면 o2 토대로 정렬하잖아... 그런 기능이 treeset에 있나?
//
//		짧은 답: **네. 있습니다.**
//		`TreeSet`도 `Comparator`로 “1차 키(o1.mathScore 오름차순) → 2차 키(o2.engScore 내림차순” 같은 **다중 기준 정렬**을 그대로 지원합니다. 지금 만든 `StudentComparator`를 `TreeSet`에 그대로 넘기면, 항상 그 기준으로 정렬·저장되고, `pollFirst()`/`first()`로 우선순위가 가장 높은 요소를 뽑을 수 있어요.
//
//		### 확실한 점
//
//		* `PriorityQueue`와 `TreeSet`은 **둘 다 `Comparator`**를 사용해 정렬합니다(확실함).
//		* `TreeSet`은 `compare(a,b)==0`이면 **동일 원소로 간주**해서 **중복 추가를 막습니다**(확실함).
//		* 정렬 기준(수학 오름차순 → 영어 내림차순)은 **지금의 Comparator로 충분**합니다(확실함).
//
//		### 예시 코드 (동일 Comparator 그대로 사용)
//
//		```java
//		import java.util.*;
//
//		class Student {
//		    int mathScore;
//		    int engScore;
//		    public Student(int mathScore, int engScore) {
//		        this.mathScore = mathScore;
//		        this.engScore = engScore;
//		    }
//		}
//
//		class StudentComparator implements Comparator<Student> {
//		    @Override
//		    public int compare(Student o1, Student o2) {
//		        if (o1.mathScore == o2.mathScore) {
//		            // 수학 같으면 영어 내림차순
//		            int cmp = Integer.compare(o2.engScore, o1.engScore);
//		            if (cmp == 0) return 0; // 두 점수 모두 같으면 동일 원소 취급(중복 방지)
//		            return cmp;
//		        }
//		        // 수학 오름차순
//		        return Integer.compare(o1.mathScore, o2.mathScore);
//		    }
//		}
//
//		public class Example {
//		    public static void main(String[] args) {
//		        NavigableSet<Student> set = new TreeSet<>(new StudentComparator());
//
//		        set.add(new Student(70, 50));
//		        set.add(new Student(60, 50));
//		        set.add(new Student(70, 40));
//		        set.add(new Student(70, 50)); // 동일 → 무시됨
//
//		        while (!set.isEmpty()) {
//		            Student s = set.pollFirst(); // 가장 우선 순위(정렬상 앞)부터 꺼냄
//		            System.out.printf("Student's MathScore and engScore: %d, %d%n", s.mathScore, s.engScore);
//		        }
//		    }
//		}
//		```
//
//		### 언제 PQ, 언제 TreeSet?
//
//		* **중복 허용 O + 항상 맨 앞만 빠르게 뽑기**가 목적이면 `PriorityQueue`. (단, 중복 차단은 직접 해야 함)
//		* **중복 차단 O + 전체가 항상 정렬 상태**가 필요하면 `TreeSet`이 더 자연스러워요. `first()/pollFirst()`로 우선순위 추출 가능.
//
//		정리: “o1 기준 → 같으면 o2 기준” 같은 정렬 로직은 **`Comparator`가 하는 일**이고, `TreeSet`도 동일하게 작동합니다. 여기에 **중복 차단까지 자동**으로 해주니, 질문하신 의도(두 점수 모두 같으면 안 넣기)에는 `TreeSet`이 딱 맞습니다.
//
//		
//		그럼 treeset이랑 priority queue의 공통점 차이점 좀 정리해줘
//		
//		아래는 **핵심만 간결 정리**입니다.
//
//		# 공통점 (확실함)
//
//		* 정렬 기준: 둘 다 `Comparator`(또는 자연 순서)에 따라 **정렬 기반 자료구조**.
//		* 시간 복잡도: `add`/`offer`, `remove`(삭제) 모두 **O(log n)**.
//		* 메모리: **O(n)**.
//		* 스레드 안전성: **비동기(스레드 안전 아님)** — 동시성 필요 시 별도 구조 필요.
//
//		# 차이점 (확실함)
//
//		* **중복 처리**:
//
//		  * `PriorityQueue` — **중복 허용**.
//		  * `TreeSet` — `compare()==0`이면 **동일 원소로 보고 삽입 거부(중복 차단)**.
//		* **가장 앞 원소 접근**:
//
//		  * `PriorityQueue` — `peek()` **O(1)**, `poll()` **O(log n)**.
//		  * `TreeSet` — `first()`/`pollFirst()` **O(log n)**.
//		* **순회(Iteration) 결과**:
//
//		  * `PriorityQueue` — **정렬된 순서 보장 없음**(힙 구조라 임의 순서).
//		  * `TreeSet` — **항상 정렬 순서로 순회**.
//		* **탐색/범위 연산**:
//
//		  * `PriorityQueue` — **없음**.
//		  * `TreeSet`(= `NavigableSet`) — `lower/higher/ceiling/floor`, `subSet/headSet/tailSet` 등 **범위/근접 탐색 지원**.
//		* **주용도**:
//
//		  * `PriorityQueue` — “**가장 우선인 것 빠르게 꺼내기**”(우선순위 작업 큐).
//		  * `TreeSet` — “**정렬 + 유일성 보장 + 범위 질의**”(정렬된 집합).
//
//		# 선택 가이드 (확실함)
//
//		* **중복을 허용하면서** 최솟값/최댓값만 계속 뽑아 쓰면 → **`PriorityQueue`**.
//		* **중복을 막고**, 항상 **정렬 상태 유지 + 범위/근접 질의**가 필요하면 → **`TreeSet`**.
//
//		# 주의사항 (확실함)
//
//		* `TreeSet`은 **Set 의미**를 지키려면 `Comparator`가 `equals`와 **일관성** 있게 동작하는 게 바람직합니다(그렇지 않으면 “같은 값 같은가?”에 대한 직관이 깨질 수 있음).
//		* 두 점수가 완전히 같은 학생을 **넣지 않으려면** `TreeSet`에서 `compare()==0`을 반환하게 만들면 자동 차단됩니다. 반면 `PriorityQueue`는 **직접 필터링**(예: `HashSet` 병행)이 필요합니다.
//
//		원하면, 네 코드 기준으로 `TreeSet` 전환 예시도 바로 만들어 드릴게요.
//
//		그럼 정렬된 결과로 처음부터 꺼내려면 시간 복잡도 측면에서 tree set과 priority queue을 비교해줘
//		
//		요점 먼저:
//
//			* **“정렬된 순서로 하나씩 꺼내기(삭제 포함)”**라면
//			  **TreeSet.pollFirst()** vs **PriorityQueue.poll()** → 둘 다 **연산당 O(log n), 전체 O(n log n)** (확실함).
//			  (상수 계수는 보통 **PriorityQueue(힙)** 쪽이 더 작아 실무에서 약간 빠른 편—추측 아님, 일반적 경험칙. “확실하지 않음”: JDK/데이터 분포에 따라 다를 수 있음.)
//
//			* **“삭제 없이 정렬 순서로 처음부터 끝까지 보기”**라면
//			  **TreeSet.iterator()**는 **총 O(n)**(원소당 상수·암ortized)로 **정렬 순서 보장** (확실함).
//			  **PriorityQueue**는 반복자가 **정렬 순서가 아님** → 정렬 순서가 필요하면 결국 복사+`poll()` 해야 해서 **O(n log n)** (확실함).
//
//			세부 비교 (정렬된 결과를 “처음부터 꺼낼 때”의 해석별):
//
//			1. 꺼내면서 제거(poll)
//
//			* TreeSet: `pollFirst()` 한 번 **O(log n)** → n개 전부 **O(n log n)** (확실함)
//			* PriorityQueue: `poll()` 한 번 **O(log n)** → n개 전부 **O(n log n)** (확실함)
//			* 차이: **상수 계수**는 대체로 **PriorityQueue가 더 유리**(힙 vs 레드블랙트리) — *확실하지 않음(상황/구현 차)*.
//
//			2. 삭제 없이 “정렬된 순서로 전부 열람”
//
//			* TreeSet: `iterator()`가 **정렬 순서 보장**, **총 O(n)** (확실함)
//			* PriorityQueue: `iterator()`는 **정렬 보장 없음** → 정렬 순서가 필요하면 `poll()` 기반으로 별도 구조에 담아야 하므로 **O(n log n)** (확실함)
//
//			3. 기타 실무 팁
//
//			* **중복 허용** 필요: `PriorityQueue`가 자연스럽고 빠름 (확실함).
//			* **중복 제거 + 정렬 유지 + 범위/근접 질의** 필요: `TreeSet` 유리 (`lower/higher/ceiling/floor`, `subSet` 등) (확실함).
//			* **최솟값만 반복적으로 뽑는 작업 큐**: `PriorityQueue` 선호(상수 계수 유리) (확실함).
//			* **그냥 한 번 정렬해서 전부 순회**: 컬렉션이면 `Arrays.sort`/`Collections.sort`가 보통 가장 단순·빠름(메모리/요건 따라 다름) (확실함).
//
//			정리:
//
//			* **poll로 “꺼내면서 정렬 유지” → 둘 다 O(n log n)**.
//			* **삭제 없이 정렬 순서로 보기**가 목적이면 **TreeSet이 총 O(n)**로 유리.
//			* **실행 시간**은 상수 계수 차이로 보통 **PriorityQueue가 poll 연산에서 미세 우세**.
//
//			음? 꺼내면서 정렬 유지는 아까 맨 처음꺼 뽑아내는게 pq가 O(1)이라고 했잖아. 그런데도 그래?
//					
//					좋은 포인트! 여기서 **peek(보기)**와 **poll/remove(꺼내며 삭제)**를 구분해야 합니다.
//
//					### 핵심 정리
//
//					* **PriorityQueue**
//
//					  * `peek()` = **O(1)** → 힙의 루트(가장 우선) “보기만” (확실함)
//					  * `poll()` = **O(log n)** → 루트 “꺼내며 삭제” (확실함)
//					* **TreeSet**
//
//					  * `first()` = **O(log n)** → 가장 작은 원소 “보기만” (루트에서 왼쪽으로 내려감) (확실함)
//					  * `pollFirst()`/`remove(first())` = **O(log n)** → “꺼내며 삭제” (확실함)
//
//					### 질문에 대한 답
//
//					> “꺼내면서 정렬 유지”인데도 왜 전체가 O(n log n)이냐?
//
//					* 맨 앞 원소를 **한 번만 ‘보기’**라면:
//
//					  * PQ `peek()`는 **O(1)** (확실함)
//					  * TS `first()`는 **O(log n)** (확실함)
//					* 하지만 **정렬된 순서로 ‘계속 꺼내며 삭제’**하려면 각 단계가
//
//					  * PQ `poll()` = **O(log n)**
//					  * TS `pollFirst()` = **O(log n)**
//					    이걸 **n번 반복**하니 **전체 O(n log n)**이 됩니다. (확실함)
//
//					### 간단 표
//
//					| 작업                 | PriorityQueue                             | TreeSet                      | 메모  |
//					| ------------------ | ----------------------------------------- | ---------------------------- | --- |
//					| 맨 앞 “보기만”          | `peek()` **O(1)**                         | `first()` **O(log n)**       | 확실함 |
//					| 맨 앞 “꺼내기”          | `poll()` **O(log n)**                     | `pollFirst()` **O(log n)**   | 확실함 |
//					| 전부 정렬 순서로 “꺼내며 삭제” | **O(n log n)**                            | **O(n log n)**               | 확실함 |
//					| 삭제 없이 정렬 순서로 순회    | 정렬 보장 안 됨 → 결국 `poll` 필요 → **O(n log n)** | `iterator()`가 정렬 순서 **O(n)** | 확실함 |
//
//					요약: **맨 앞을 ‘보기만’ 할 땐 PQ가 O(1)로 유리**하지만, **정렬된 결과를 끝까지 ‘꺼내며 삭제’**하는 순간 **둘 다 O(n log n)**입니다.
//
//					
//					음. 꺼내면서 정렬을 해버리니까 결국엔 n log n이라는 거지? 그럼 tree set은 순서가 아예 정렬된 채로 가지고 있는거야? 그거 정렬하는 시간은 어떻게 달라?
//							
//							맞아요. **“꺼내면서 정렬”**하면 결국 각 단계가 `log n`이라 **총 O(n log n)**입니다(확실함).
//
//							### TreeSet은 항상 정렬 상태인가?
//
//							* **네.** `TreeSet`(레드블랙 트리)은 **삽입 시마다** 트리 균형을 잡으면서 **정렬 순서**를 유지합니다(확실함).
//							* 그래서 `iterator()`로 순회하면 **항상 정렬 순서로 O(n)**에 볼 수 있어요(확실함).
//
//							### “정렬하는 시간” 관점 비교
//
//							* **TreeSet**
//
//							  * **빌드 시간:** 원소를 하나씩 넣으면 **각 add가 O(log n)** → **총 O(n log n)** (확실함).
//							  * **정렬 별도 단계 없음:** 넣으면서 정렬 상태가 유지됩니다(확실함).
//							  * **이미 정렬된 자료로 생성:** `new TreeSet<>(다른 SortedSet)`이면 **O(n)**에 가능(내부 참조/복사 수준) — 일반 `Collection`에서 넣으면 여전히 **O(n log n)**(확실함).
//							* **PriorityQueue**
//
//							  * **빌드 시간:** 배열/컬렉션로 한 번에 만들면 **heapify가 O(n)**로 더 빠르게 구축 가능(확실함).
//							  * **하지만 전체 정렬 순서로 보려면:** 정렬 순서 보장 순회가 안 되므로 `poll()`을 **n번** 해야 해서 **O(n log n)**(확실함).
//							  * **맨 앞만 자주 뽑기:** 각 `poll()` **O(log n)**, `peek()`는 **O(1)**이라 작업 큐에 유리(확실함).
//
//							### 선택 요령 (확실함)
//
//							* **정렬된 상태로 계속 보관/순회 + 중복 제거** → `TreeSet` (빌드 O(n log n), 순회 O(n)).
//							* **대량 삽입 빠르게 + 최소값만 반복 추출** → `PriorityQueue` (빌드 O(n), 각 추출 O(log n)).
//							* **그냥 한 번 정렬해서 끝내기** → 배열/리스트에 모아 `Arrays.sort`/`Collections.sort`로 **O(n log n)**이 보통 가장 단순·빠름.
//
//							요약:
//
//							* `TreeSet`은 **삽입 때마다 정렬 유지(O(log n)) → 전체 O(n log n)**, 그 후 **정렬 순회 O(n)**.
//							* `PriorityQueue`는 **빠른 빌드(O(n))** 가능하지만, **정렬 순회는 poll 반복으로 O(n log n)**.
