# 자바
## 1단계: 변수와 자료형
강타입 언어, 모든 변수는 사용하기 전에 타입을 명시해야 함
```text
// 정수형
int age = 25;
long bigNumber = 1000000000L; // 8바이트, 큰 수

// 실수형
double score = 95.5;    // 8바이트
float height = 175.5f;  // 4바이트

// 문자형
char grade = 'A';   // 1개 문자

// 논리형
boolean isStudent = true; // true, false

// 문자형(참조형)
String name = "홍길동";
```

### 변수 선언 규칙
- 첫 글자는 문자나 `_`, `$`로 시작
- 숫자로 시작 불가
- 공백 사용 불가
- 대소문자 구분

## 2단계: 입출력 방법
### 출력하기(`System.out`)
```text
System.out.printIn("안녕하세요"); // 줄바꿈 있음
System.out.print("안녕");       // 줄바꿈 없음
System.out.printf("%d살입니다", 25);    // 형식 지정
```

### 입력받기(`Scanner`)
```text
import java.util.Scanner;
// 먼저 Scanner를 불러와야 함, 맨 위에

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 정수 입력받기
    int age = sc.nextInt();
    
    // 실수 입력받기
    double score = sc.nextDouble();

    // 문자열 입력받기(공백 전까지)
    String name = sc.next();

    // 한 줄 전체 입력받기(공백 포함)
    String line = sc.nextLine();

    System.out.printIn("나이: " + age);
    System.out.printIn("점수: " + score);
    System.out.printIn("이름: " + name);
    
    sc.close();     // Scanner 닫기
  }
}
```
- nextInt() 후에 nextLine() 쓸 때는 빈 nextLine() 한 번 더 써야 함
- Scanner는 사용 후 close() 해주기

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // 배열에 입력받기
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        // 최솟값, 최댓값 찾기
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(min + " "+max);
        sc.close();
    }
}
## 위의 코드는 통과하지 못하는 이유
```text
핵심 차이점 분석
1. 메모리 사용량
   위 코드 (실패):

int[] arr = new int[n] → N개만큼 배열 생성
N이 1,000,000이면 약 4MB 메모리 사용
아래 코드 (성공):

배열 없이 변수만 사용 → 매우 적은 메모리
2. 실행 시간
   위 코드:

배열에 저장하는 시간 + 다시 읽어서 비교하는 시간
총 2번의 반복문 (입력 받기 + 비교하기)
아래 코드:

입력과 동시에 비교 처리
1번의 반복문으로 해결
3. 백준에서 실패하는 이유
   메모리 제한 초과 가능성:

백준 문제는 보통 메모리 제한이 있음 (128MB 등)
N=1,000,000일 때 배열이 메모리를 많이 차지
다른 변수들과 합쳐서 메모리 초과 발생 가능
시간 제한 초과 가능성:

대량 데이터에서 배열 접근이 약간의 오버헤드 발생
Scanner의 성능 문제와 합쳐져서 시간 초과
교훈
알고리즘 최적화 원칙:

필요 없는 저장소는 사용하지 않기
한 번에 처리할 수 있으면 한 번에
메모리와 시간 복잡도 고려
아래 코드가 더 효율적인 이유는:

공간복잡도: O(n) → O(1)
시간복잡도: 동일하지만 실제 실행시간은 더 빠름
메모리 사용량: 훨씬 적음
이런 최적화는 알고리즘 문제에서 매우 중요해요! 특히 대용량 데이터를 다룰 때 이런 차이가 합격/불합격을 좌우할 수 있습니다.

노서치엘리먼트는 왜 발생했을까? 위의 코드에서

NoSuchElementException이 발생한 정확한 원인을 분석해보겠습니다!

NoSuchElementException 발생 원인
1. Scanner의 입력 스트림 처리 방식
   java
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();  // 첫 번째 nextInt() 호출
   Scanner가 System.in에서 입력을 읽을 때:

버퍼링 문제: 입력 스트림이 완전히 준비되지 않았을 때
EOF 도달: 예상보다 일찍 입력이 끝날 때
2. 온라인 저지 환경의 특수성
   로컬 환경 vs 백준 환경:

로컬: 사용자가 직접 입력 → 문제 없음
백준: 미리 준비된 테스트 케이스를 파이프로 전달
백준에서 발생하는 상황:

// 백준이 프로그램에 전달하는 방식
echo "5\n20 10 35 30 7" | java Main
3. 메모리 부족으로 인한 부작용
   메모리 부족 시나리오:

int[] arr = new int[1000000] 배열 생성 시도
메모리 부족으로 GC(Garbage Collection) 빈발 발생
GC 중에 Scanner의 내부 버퍼가 불안정해짐
sc.nextInt() 호출 시 예상치 못한 EOF 상황 발생
4. 구체적인 발생 시점
   java
   for (int i = 0; i < n; i++) {
   arr[i] = sc.nextInt();  // 여기서 NoSuchElementException!
   }
- 가능한 시나리오:
메모리 압박으로 Scanner의 입력 버퍼가 손상
시스템이 강제로 입력 스트림을 종료
Scanner가 더 이상 읽을 데이터가 없다고 판단
왜 아래 코드는 성공했을까?
java
for (int i = 0; i < n; i++) {
int num = sc.nextInt();  // 배열 없으니 메모리 안정적
}
- 이유:
메모리 사용량이 적어 GC 압박이 없음
Scanner 버퍼가 안정적으로 유지됨
시스템 리소스 여유로 입력 스트림이 정상 작동
결론
NoSuchElementException은 메모리 부족으로 인한 Scanner 불안정이 주된 원인이었을 가능성이 높습니다. 단순히 입력 데이터 문제가 아니라, 시스템 리소스 문제였던 거죠!

이래서 알고리즘 문제에서는 메모리 효율성이 중요한 거예요.
```

