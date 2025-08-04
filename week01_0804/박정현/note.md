# Java 시작 & 변수 입문
들어가기 전 꿀팁: 일단 작성하고 `Ctrl`+`Shift`+`O`를 누르면 자동으로 `import`문을 써준다! (eclipse)

## 입력 받기
### 1. Buffered Reader
- 기본 형식
    ```java
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 형변환
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
        }

    }

    ```
- `BufferedReader`를 `br`로 선언
    - `line` 단위로 읽어온다.
    - 이후 `readLine`으로 데이터를 가져와야 함.
    - 입력받은 데이터의 타입이 `String`으로 고정됨 -> 형변환을 해줘야한다.

- `StringTokenizer`를 `st`로 선언
    - `readLine`을 통해 입력받은 내용을 공백단위로 구분하여 저장.
    - 다른 방법: `String.split()` 함수를 통해 배열에 공백 단위로 끊어서 저장 가능하다.
        - `String arr[] = s.split(" ");`

- `parseInt`: `String` 타입의 숫자를 `Integer`로 변환
- `nextToken`: `StringTokenizer`로 자른 내용 중 다음 내용을 반환

### 2. Scanner

- 기본 형식
    ```java
    
    ```


- Buffered Reader를 사용하는 이유: 빠르다
- Scanner를 사용하는 이유: 편하다

### 참고 자료
- [[Java] 키보드로 사용자 입력받는 2가지 방법 (BufferedReader, Scanner) [어제 오늘 내일:티스토리]](https://hianna.tistory.com/586)
- [[Java] 빠른 입출력을 위한 BufferedReader, BufferedWriter, StringTokenizer, StringBuilder [크크의 개발 블로그]](https://rlakuku-program.tistory.com/33)
- [[자바 프로그래밍 기초] 5. Integer.parseInt(String타입의 값) [주인장의 프로그래밍 개발 공부방]](https://colossus-java-practice.tistory.com/32)
- [JAVA 타입 형변환 원리 & 방법 - 완벽 정리 [Inpa Dev]](https://inpa.tistory.com/entry/JAVA-%E2%98%95-%ED%83%80%EC%9E%85-%ED%98%95%EB%B3%80%ED%99%98-%EC%A2%85%EB%A5%98-%EB%B0%A9%EB%B2%95-%F0%9F%92%AF-%EC%B4%9D%EC%A0%95%EB%A6%AC)
- [[Java] 다양한 형 변환(Type Conversion) 방법 이해하기 : 캐스팅(Casting) [adjh54]](https://adjh54.tistory.com/239)