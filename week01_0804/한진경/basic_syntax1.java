public class basic_syntax1 {
  public static void main(String[] args) {
    System.out.println("Hello Java");
    System.out.println("Hi"); // sysout -> 자동완성

    // 변수 설정

    int age;
    int Age;
    int age123;
    //숫자 시작 불가, 한글 변수명 권장하지 않음


    // 형변환 : 자료형 바꾸는 행위

    //1. 묵시적 형변환(자동) : 작은 자료형 -> 큰 자료형
    int age1 = 10;
    double age2 = age1;
    long age5 = age1;

    //2. 명시적 형변환 : 큰 자료형 -> 작은 자료형
    double age3 = 1000;
    int age4 = (int) age3; // 데이터가 소실될 수 있음


    //산술 연산자 : 수학적인 연산
    int a = 35;
    int b = 10;

    // +, -, /, %
    System.out.println(a/b); //b int : 3 / b double : 3.5

    // 비교연산자
    int c = 100;
    int d = 1000;

    System.out.println(c==d);
    System.out.println(c!=d);
    System.out.println(c>d);

    String e = "Java";
    String f = "Python";

    System.out.println(e.equals(f));
  }
// 한 줄 주석
/* 여러 줄 주석
 
 */



}
