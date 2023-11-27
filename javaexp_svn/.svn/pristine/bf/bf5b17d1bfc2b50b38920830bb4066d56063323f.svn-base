package javaexp.z02_homework.a11_mhi;

import java.util.Scanner;

public class A01_0922 {

	public static void main(String[] args) {
//      [1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//      - 이름, 나이, 키 
//      - 좋아하는 음악명, 발매연도
//      - 오늘 지출금액 목록과 비용, 합산
    String name = "문해인";
    int age = 28;
    int height = 160;
    System.out.println("# 이름, 나이, 키 #");
    System.out.println(name + ", " + age + ", " + height);

    System.out.println();

    String favoritSong = "유성우";
    int releaseYear = 1996;
    System.out.println("# 좋아하는 음악명, 발매연도 #");
    System.out.println(favoritSong + ", " + releaseYear);

    System.out.println();
    String item1Name = ("만두");
    String item2Name = ("포도");
    String item3Name = ("당근");
    int item1Price = 3000;
    int item2Price = 4000;
    int item3Price = 5000;

    System.out.println("# 지출금액 목록과 비용 #");
    System.out.println(item1Name + ", " + item1Price + " / " + item2Name + ", " + item2Price + " / " + item3Name
          + ", " + item3Price);
    System.out.println("# 비용합산 #");
    System.out.println(item1Price + item2Price + item3Price);

//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
    String name1 = "문해인";
    int age1 = 28;
    double salary = 5000.50;
    System.out.println("줄바꿈이 있는");
    System.out.println("기본 출력 형식");

    System.out.print("줄바꿈이 없는");
    System.out.println("기본 출력 형식");

    System.out.print("줄바꿈이 없는\n");
    System.out.println("기본 출력 형식에 줄바꿈 처리하기");

    System.out.println("탭 간격으로\t출력\t하기");
    System.out.printf("이름:%5s", name1); // 자리수와 문자열데이터 유형처리
    System.out.println();
    System.out.printf("나이:%5d", age1); // 자리수와 문자열데이터 유형처리
    System.out.println();
    System.out.printf("연봉:%1.3f", salary); // %소수점이상.소수점이하f / 자리수와 실수형 데이터 유형 처리
    System.out.println();
    System.out.printf("%s,%d,%f", name1, age1, salary); // 형식 선언 후, 해당 형식 안에 들어갈 데이터를 처리하는 방식

//[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
//       필수 ) 에러발생
//       1. 변수명이 숫자가 아닌 문자로 시작해야 한다.
//       int 1Num01; (x) // 
//       2. 공백을 포함해서는 안된다.
//       int 1Num 01; (x) // 
//       3. 특수문자는 $와 _만 선언이 가능하다. 
    int $num01 = 24; // (o)
    int _num01 = 24; // (o)
//       4. 대소문자 구분한다
    int num01 = 30; //
    int Num01 = 30; //
//       5. 예약어를 변수로 사용할 수 없다. 
//       int break=30; (x) 
//       int for =20; (x)
//       6. 이전에 선언된 변수는 다시 선언시, 에러가 발생한다.
    String name3 = "문해인";
//       String name3="문광현"; //오류발생
    name3 = "문광현"; // (o)

//       가독성을 위해 준수할 내용 (에러발생x)
//       1) 클래스명은 대문자로 시작한다.
//       2) 일반변수명/메서드명은 소문자로 시작한다.
//       3) 상수는 대문자로 선언 ex) final int PI = 3.14;
//       4) 합성어는 구분자로_, 구분시작시 대문자로 처리한다.
//          ex) String first_name="문";
//              String firstName+"문";

//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
//       기본 데이터 유형
//       1. 숫자형
//          1) 정수형 :byte, short, int, long
//          2) 실수형 : float, double
//          3) 문자형 : char
//          4) 논리형 : boolean
    System.out.println();
    byte byt1 = 120; // -128~127 까지 범위 임
    System.out.println(byt1);
    short shor1 = 130;
    System.out.println(shor1);
    int int1 = 1300;
    System.out.println(int1); // 약 -21억~ +21억까지 범위
    long long1 = 215351245651L; // long은 리터럴에 L을 붙어야한다.
    System.out.println(long1);
    float num02 = 34.2f;
    System.out.println(num02); // float는 리터럴에 f를 붙여야한다.
    double num03 = 34.5;
    System.out.println(num03); // 실수형의 기본 값..
    char c01 = 'A';
    System.out.println(c01);
    boolean ispass = int1 >= 90; // true, false 값을 저장
    System.out.println(ispass); // true 저장

//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
    byte byt2 = 13;
    int num04 = byt2; // 자동 형변환 (작은 데이터 유형 ==> 큰데이터 유형)
    double num05 = num04; // 자동 형변환
    System.out.println(byt2); // 13 (byte)
    System.out.println(num04); // 13 (byte -> int)
    System.out.println(num05); // 13.0 (int -> double)

    double num06 = 253.542;
    int num07 = (int) num06; // 강제 형변환 (큰 데이터 유형 -> 작은데이터 유형)
    byte num08 = (byte) num07; // 강제 형변환
    System.out.println(num06); // 253.542 (double)
    System.out.println(num07); // 253 (int)
    System.out.println(num08); // -3 (byte)

//       연산에 의해 꼭 형변환이 필요한 경우, 강제 형변환 처리
//       int ==> char으로 표현 
//       int code ==66
//       char char01 ==(char)coad;

    // 연산에 의해 실수로 표현하여야 할때
    // 실수형 데이터가 필요하면 나눗셈 피연사 중에 하나를 강제 형변환해처 처리해야함.
    double dbl01 = (double) 13 / 5;
//       13/5 ==> 정수/정수 = 정수형 2
//       (double)13/5 ==> 실수형 2.6
    System.out.println(dbl01);

    // 숫자열 문자열 숫자로 변환
    String num09Str = "13";
    int num09 = Integer.parseInt(num09Str);
    String num10Str = "3.15";
    double num10 = Double.parseDouble(num10Str);
    System.out.println(num09 + 13); // 정수형 변환 숫자 +10
    System.out.println(num10 + 13.1); // 실수형 변환 숫자 +10.1

//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
    int num11 = 2100000000;
    int num12 = 1500000000;
    long num13 = num11 + (long) num12; // 강제 형변환
    System.out.println(num13); // 3600000000

//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
//       char 정수형으로 저장되는 문자형 데이터 유형이이다.
//       문자는 내부적으로 코드값인 정수로 표현된다.
    char c02 = 'A'; // A의 코드 값인 65가 저장된다.
    int num16 = c02;
    System.out.println(num16);

//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
    for (char i = 'A'; i <= 'Z'; i++) { // 알파벳 대문자 코드 값 범위 (65~90)
       System.out.println(i + "의 코드 값: " + (int) i);
    }

    for (char i = 'a'; i <= 'z'; i++) { // 알파벳 대문자 코드 값 범위 (97~122)
       System.out.println(i + "의 코드 값: " + (int) i);
    }
    for (char i = '1'; i <= '9'; i++) { // 알파벳 대문자 코드 값 범위 (49~57)
       System.out.println(i + "의 코드 값: " + (int) i);
    }
//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
//       System.out.println(num01+num02)
//       (+,-,*,/를 연산자라고 하고, 연산의 대상이 되는 것을 피연산자라고 한다.)
//       (num01,num02 는 피연산자이고, +은 연산자 이다)

//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
    int num14 = 25;
    int num15 = 7;
    double num17 = 7.0;

    System.out.println(num14 + "+" + num15 + "=" + (num14 + num15));
    // 덧셈 연산자 (+) : 두 피연산자를 더한다.
    System.out.println(num14 + "-" + num15 + "=" + (num14 - num15));
    // 뺄셈 연산자 (-) : 첫번째 피연산자에서 두번째 피연산자를 뺀다.
    System.out.println(num14 + "*" + num15 + "=" + (num14 * num15));
    // 곱셈 연산자 (*) : 두 피연산자를 곱한다.
    System.out.println(num14 + "/" + num15 + "=" + (num14 / num15));
    // 나눗셈 연산자 (/) : 첫번째 피연산자를 두번째 피연산자로 나눈다.
    System.out.println(num14 + "/" + num17 + "=" + (num14 / num17));
    // 나눗셈 연산자 (/) : 첫번째 피연산자를 두번째 피연산자로 나눈다.
    System.out.println(num14 + "%" + num15 + "=" + (num14 % num15));
    // 나머지 연산자 (%) : 첫번째 피연산자를 두번째 피연산자로 나눈 나머지를 계산한다.
    System.out.println(++num15);
    // 증가 연산사 (++) : 피연산자 값을 1증가 시킨다.
    System.out.println(--num15);
    // 감소 연산자 (--) : 피연산자 값을 1감소 시킨다.

//       우선순위 (괄호() -> 증감 연산자 -> 곱셈, 나눗셈, 나머지 연산자 -> 덧셈, 뺄셈 연산자)
//       괄호를 사용하여 원하는 연산 순서를 명확히 할 수 있음.

//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//    소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
    int num18 = 500 / 3;
    System.out.println(num18); // 소숫점 이하가 처리 된 경우
    double num19 = 500 / (double) 3;
    System.out.println(num19); // 소수점 이하가 처리되지 않는 경우

//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
//       중감연산식의 앞에 ++은 : 증감하고 해당라인에 표시하는 것
//       증감연산식의 뒤에 ++은 : 해당라인에 표시하고 증감하는 것

    int num20 = 0;
    System.out.println(++num20); // 증가[1]하고 출력 [1]
    System.out.println(num20++); // 표시[1]하고 증가 [2]
    System.out.println(--num20); // 감소[1]하고 출력 [1]
    System.out.println(num20--); // 표시[1]하고 감소 [0]
    System.out.println(num20); // [0]

//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
//       중가 대입 연산자 (+=)
//       감소 대입 연산자 (-=)
//       곱셈 대입 연산자 (*=)
//       나눗셈 대입 연산자 (/=)
//       나머지 대입 연산자 (%=)

    int num21 = 0;
    num21 = num21 + 3;
    num21 += 3; // 위 연산식과 동일 결과 처리
//       증가 대입 연산자 (+=): 변수의 값을 증가시킨 후, 그 결과를 변수에 대입.
    System.out.println(num21); // 6

    num21 -= 2;
    System.out.println(num21); // 4
//       감소 대입 연산자 (-+): 변수의 값을 갑소시킨 후 , 그 값을 변수에 대입.

    num21 *= 2;
    System.out.println(num21); // 8
//       곱셈 대입 연산자 (*=) : 변수의 값을 곱한 후, 그 값을 변수에 대입.

    num21 /= 2;
    System.out.println(num21);// 4
//       나눗셈 대입 연산자 (/=) : 변수의 값을 나눈후, 그 결과를 변수에 대입

    num21 %= 2;
    System.out.println(num21); // 0
//       나머지 대입 연산자 (%=) : 변수의 값을 나눈 나머지를 구한 후, 그 값을 변수에 대입

//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//       김밥 1개 구매  2500 
//       김밥 2개 구매  5000
//       김밥 3개 구매  7500
    int kimbabcnt = 1;
    System.out.printf("김밥 1개 구매 %5d\n", kimbabcnt * 2500);
    System.out.printf("김밥 1개 구매 %5d\n", ++kimbabcnt * 2500);
    System.out.printf("김밥 1개 구매 %5d\n", ++kimbabcnt * 2500);

//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
    String str01 = "안녕";
    String str02 = "안녕";
//       
    String str03 = new String("안녕");
//       
    if (str01 == str02) {
       System.out.println("두개의 값이 같습니다.");
    } else {
       System.out.println("두개의 값이 같지 않습니다.");
    }
    // 비교하는 두 대상의 주소값 비교
    // 같은 문자열 리터럴을 사용하는 경우 true 반환

    if (str01 == str03) {
       System.out.println("두개의 값이 같습니다.");
    } else {
       System.out.println("두개의 값이 같지 않습니다.");
    }
    // new 키워드를 사용하여 새로운 객체를 생성한 경우, false반환
    // == 연산자가 문자열의 내용을 비교하는 것이 아닌 참조값을 비교하기 때문.

    if (str01.equals(str03)) {
       System.out.println("두개의 값이 같습니다.");
    } else {
       System.out.println("두개의 값이 같지 않습니다.");
    }
    // 두개의 문자열이 내용적으로 동일한지 비교
    // 문자열의 실제 내용을 비교, true 반환

    // 문자열을 동적으로 생성하거나 사용자로부터 입력받는 경우 equals() 메서드를 사용하는것이 적절함

//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. (헷갈)
    /*
     * 1) java를 컴파일 과정을 거치면
     * 
     * @@@.class 파일이 생성된다. ex) javac @@@.java ==> @@@.class ex) java @@@ main()가 있으면
     * 실행이된다. 2) 이 컴파일과정을 거친 @@@.class는 java @@@로 실행된다 3) 이 때, java @@@ 사과 바나나 딸기
     * 형식으로 실행하면 String[]args안에 {"사과","바나나","딸기"}로 할당되어 args[0] : 배열명[index번호] 형태로
     * 사용할 수 있게 된다.
     */

//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
    System.out.print(args[0]);
    System.out.print("," + args[1]);
    System.out.println("," + args[2]);
    System.out.print(args[3]);
    System.out.print("," + args[4]);
    System.out.println("," + args[5]);
    int args1Int = Integer.parseInt(args[1]);
    int args2Int = Integer.parseInt(args[2]);
    int args4Int = Integer.parseInt(args[4]);
    int args5Int = Integer.parseInt(args[5]);

    System.out.println("총수량: " + (args2Int + args5Int) + ", 총금액: " + (args1Int + args4Int));

//[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
    /*
     * Scanner sc = new Scanner(System.in); 1. 스캐너 객체 생성 (1) System.in : 자바의
     * 기본적인입력처리하는 내장 객체 (2) Scanner : 외부에 입력된 내용을 처리하는 java.util.* 패키지에 내장된 객체 (3)
     * import (단축키 ctrl+shift+o)
     */
    Scanner sc = new Scanner(System.in);
//       String txt = sc.nextLine();
//       // 입력한 데이터를 String으로 하는 txt에 할당해서 하단에 출력한다.
//       System.out.println(txt);

//[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
    /*
     * System.out.println("검색어를 입력하세요"); String q = sc.nextLine(); if
     * (q.equals("타율계산방법")) { System.out.println("타율계산방법: 안타수 / 타석수"); }
     * System.out.println("선수명"); String name2 = sc.nextLine();
     * System.out.println("타석수"); int atBat = Integer.parseInt(sc.nextLine());
     * System.out.println("안타수"); int hit = Integer.parseInt(sc.nextLine());
     * System.out.println(name2+"의 타율은 :"+hit/atBat);
     */

//[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
//       비교를 통해서 논리값 bolean(true/false)을 저장하거나 출력하는 연산자
//       >, <, >=, ==, !=
//       30>5 : true
//       30<5 : false
//       30>=5 : true
//       30<=5 : false
//       30==5 : false 같을때
//       30!=5 : true 같지 않을때      

//[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
    /*
     * System.out.println("나이를 입력하세요"); int age2 = Integer.parseInt(sc.nextLine());
     * boolean isTrue = age2 >=18; System.out.println("성인여부:"+ isTrue);
     */

//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
//       논리곱 (&&) : 두 조건비교연산식에서 모두 다 true이여야지 true고 
    // 그외는 false
//       ex) 청소년 요금제 8세~ 19세 이다. 해당 아이는 청소년 요금제에 해당하는가? 
    int age3 = 15;
    boolean isTrue2 = age3 >= 8 && age3 <= 19;
    System.out.println(isTrue2);

//       논리합 (||) : 비교연산식을 2개 이상 처리할 때, 두 조건이 하나 이상 true면 ture 
//       ex) 놀이공원에서 나이가 5세미만, 66세이상은 무료 일때, 무료여부를 체크해라
    boolean isTrue3 = age3 < 5 || age3 >= 65;
    System.out.println(isTrue3);

//       부정연산자 (!) : 위 논리 연산식 포함해서 비교연산자가 true면, false, 
    // false면 true로 저리되는 연산자 조건식 !(조건식)

//       ex) 불합격하는 조건
    int point = 80;
    boolean inTrue4 = !(point >= 70);
    System.out.println(inTrue4);

    // and, or가 포함된 논리연산자는 !을 통해서 드모르강법칙이 적용된 내용을 처리해준다.
//       조건1 && 조건2 ==> 조건1이 true이고 조건2가 true일 때. !(조건1 && 조건2) ==> 드모르강법칙에 의해
//              !조건1 || !조건2 로 처리를 하는 경우이다.
//       ex) himan//7777이 인증 조건이라면 (조건1&&조건2)
//        로그인이 되지 않을 조건은 himan이지 않거나 7777이 아닌경우를 말한다. (!조건1 || !조건2)
//        age>=65 || age<3 : 무료 (3세 미만, 65세이상)
//        !(age>=65 || age<3) : 유료 
//         age<65 && age>3 (4세이상, 65세미만)

//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
    for (int i = 1; i <= 5; i++) {
       System.out.println(i);
    }
//       for (초기값;반복조건;증감연산자) {
//          반복해서 수행할 구문
//       }

//       . 기본 구성 요소 내용
//       1) 초기값 : 반복구문에 사용할 변수의 최초값을
//          설정할 때, 선언한다.
//          한번만 수행한다. 
//          일반적으로 최소값인데, 역순위로 처리할 때는 
//          최댓값을 넣는다.
//       2) 반복조건 : for문을 반복한 조건 또는 한계치를 지정할 때, 사용한다.
//          cnt<=10 : 증가시 10까지 반복
//          cnt>0 : 감소시 0까지 반복
//       3) 반복해서 수행할 구문: 실제 {}(중괄호)로 반복할 내용
//       4) 증/감연산자 : 증가/감소 처리
//            cnt++ : 1씩 증가
//            cnt-- : 1씩 감소
//            cnt+=3 : 3씩 증가
//            cnt-=2 : 2씩 감소

//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//               1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
    for (int i = 200; i <= 300; i += 10) {
       System.out.println("200~300 10단위 출력" + i);
    }

    for (int i = 1000; i > 950; i -= 3) {
       System.out.println("1000~950 3단위 감소" + i);
    }
    for (int i = 100; i > 0; i--) {
       System.out.println(i + "을 2로 나눈값" + i % 2);
    }

//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요

//       전역변수 : {}(중괄호) 위에 선언하여 누적된 데이터를 처리할 때 사용한다.
//        cf) 전역변수 : '상대적인 개념...' : 현재 블럭단위와 하위에 블럭에 따라서 지역변수가 될 수 있고 전역변수가 될 수 있다.(주의)
//        코드1
//        코드2
//        블럭을 들어가기전에 선언한 변수는 이 코드 하위에 있는 모든 블럭에 변수를 사용할 수 있다. : 전역변수
//        for(){
//           블럭단위 안에서 선언되어 사용하는 변수
//           ==> 이 블럭 범위 안에서만 사용
//           int num = 25; 지역변수
//           for(){
//              num : 하위에 있는 중괄호 블럭에서 사용이 가능.
//           }
//           
//           if() {
//           
//           }
//        }
//        System.out.println(num); (x);

//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요    
    int tot02 = 0; // 전역변수
    for (int cnt = 200; cnt >= 150; cnt--) {
       System.out.print(cnt);
       if (cnt != 150)
          System.out.print("+");
       tot02 += cnt; // 지역변수 ../ 전역변수 tot01에 접근가능
    }
    System.out.println(" = " + tot02); // 전역변수 tot01에 접근가능

//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요 (다시)
//                 no 과일명  가격
//                  1 사과    3000            
//                  2 바나나   4000           
//                  3 딸기    12000
//                    총계    19000          
//       Scanner sc = new Scanner(System.in);
//       int total = 0; // 가격합산 전역변수
//       String prn = "no\t과일명\t가격\n"; // 출력할 내용 전역변수
//       for (int i = 1; i <= 3; i++) {
//          System.out.println(i + "번째 과일명 입력:");
//          String fruitName = sc.nextLine();
//          System.out.println("과일의 가격입력:");
//          int fruitPrice = Integer.parseInt(sc.nextLine());
//          // 출력할 내용을 문자열로 누적처리.
//          prn += i + "\t" + fruitName + "\t" + fruitPrice + "\n";
//          total += fruitPrice; // 가격누적
//       }
//       System.out.println(prn);
//       System.out.println("총계    " + total);

//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요(다시)
//                # 출력 형식
//                날짜  갯수 누적
//                1일차 2개  2개
//                2일차 4개  6개
//                3일차 6개 12개
    int sum02 = 0;
    System.out.println("날짜\t갯수\t누적\n");
    for (int i = 1; i <= 10; i++) {
       int today = i * 2;
       sum02 += today;
       System.out.println(i + "일자\t" + today + "개\t" + sum02 + "개\t");
    }

//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.(다시)
    int foursum = 0;
    for (int i = 1; i <= 100; i++) {
       if (i % 4 == 0) {
          System.out.println("#");
          foursum += i;
       } else
          System.out.println(i);
    }
    System.out.println(foursum);
//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리(다시)
    // n 11 12 '13' 14 15 '16' 17 18 '19' 20
    // n%10 1 2 3 4 5 6 7 8 9 0
    // n%10%3 1 2 0 1 2 0 1 2 0 0
    // 10, 20, 30 ==> 0이기에 10단위로 나누어 지는 것은 제외
    // i%10!=0

//          for (int i = 1; i <= 20; i++) {
//            if (i%10!=0 && i%10%3==0) {
//               System.out.print("짝");
//            } else
//               System.out.print(i);
//         }

//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
    for (int grade = 2; grade <= 9; grade++) {
       for (int cnt = 1; cnt <= 9; cnt++) {
          System.out.printf("%d x %d = %d\n", grade, cnt, grade * cnt);
       }
    }
//          for문안에 for문을 처리하는 내용

//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
// 1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
    // 2x2 ♥
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print("♥ ");
//             }
//             System.out.println();
//         }
//         System.out.println();

    // 3x2 ★ (크거가 같다 처리도 가능)
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print("★ ");
//             }
//             System.out.println();
//         }
//         System.out.println();

    // 사용자 입력 행/열/기호

//           System.out.println("행, 열, 기호를 입력하세요:");
//         System.out.print("행을 입력:");
//         int row = Integer.parseInt(sc.nextLine());
//         System.out.print("열을 입력:");
//         int col = Integer.parseInt(sc.nextLine());
//         System.out.print("기호를 입력:");
//         String symbol = sc.nextLine();
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.print(symbol + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
//          ex) 1부터 5까지의 정수를 출력하는 while문
//             int i = 1;
//             while (i <= 5) {
//                 System.out.println(i);
//                 i++;
//             }

//           # while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
//        1. 기본형식
//           while(반복할 조건){
//              반복할 조건이 true일때, 처리할 내용
//           }
//           무한 반복 안에서 break
//           while(true){
//              처리할 내용
//              if(반복문을 벗어날 조건){
//                 break;
//              }
//           }

//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
    int number = 100;
    int sum = 0;
    while (number >= 90) {
       System.out.println(number);
       sum += number;
       number--;
    }
    System.out.println("합계: " + sum);
    System.out.println();

//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//         int total = 0;
//         int count = 0;
//         while (true) {
//             System.out.println("점수를 입력하세요 (-1을 입력하면 종료):");
//             int score = sc.nextInt();
//             if (score == -1) {
//                 break;
//             }
//             total += score;
//             count++;
//         }
//         double average = (double) total / count;
//         System.out.println("총점: " + total + ", 평균: " + average);
//         System.out.println();
//         

//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
    // # 반복문제어 continue, break
    // 1. if문과 함께 주로 사용된다.
    // 2. continue: 해당 반복step에서 나머지 코드부분은 건너뛰고
    // 다음 step으로 진행
    // 3. break : 반복은 중단 처리..

    int grade = (int) (Math.random() * 8 + 2);
    for (int cnt = 1; cnt <= 9; cnt++) {
       if (cnt == 4)
          continue; // *4는 다음 단계로 넘어간다.
       if (cnt == 8)
          break; // * 8일때 반복 중지 처리
       // 1 2 3 5 6 7 출력
       System.out.println(grade + "x" + cnt + "=" + (grade * cnt));
//          
    }

//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
//       Stack은 지역 변수와 매개 변수를 저장하는데 사용됨.
//       메소드가 호출될 때마다 새로운 스택 프레임이 생성되며,
//       메소드가 끝나면 해당 스택 프레임이 삭제된다.
//       Stack은 메모리를 효율적으로 사용하기 때문에 빠르게 접근할 수 있지만,
//       크기가 제한적이기 때문에 작은 데이터만 저장할 수 있다.
//
//       Heap은 동적으로 할당된 객체를 저장하는데 사용된다.
//       Heap은 스택과 달리 크기가 제한되어 있지 않으며,
//       Garbage Collector에 의해 관리된다.
//       Heap은 객체를 생성하고 제거하는 데 사용되며,
//       객체의 수명은 프로그램에서 동적으로 결정된다.
//       Heap은 메모리를 많이 사용하기 때문에 접근 속도가 느리지만,
//       큰 데이터를 저장할 수 있습니다.

//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
//       배열은 동일한 데이터 유형의 요소들을 순차적으로 저장하는 자료구조이다.
//
//       // 정수형 배열 선언과 초기화
    int[] numbers = new int[5]; // 5는 배열의 갯수

    // 배열에 값 할당
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;

    // 배열의 선언 + 초기값 할당 처리
    double[] arry = { 10.7, 20.5, 30.17 };
//        이와 같이 선언과 동시에 0.0이외에 초기값을 할당하는 처리를 한번에 할 수 있다.

//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
    int intArry[]; // 배열 선언.
    intArry = new int[5]; // 배열의 초기값 할당된 heap영역선언
    System.out.println("int형 배열의 참조변수:" + intArry);
    // [I@58ceff1 [I : 정수형 배열
    // 58ceff1 : 16진수로 heap영역의 주소.
    System.out.println(intArry[0]);
    System.out.println(intArry[1]);
    System.out.println(intArry[2]);
    System.out.println(intArry[3]);
    System.out.println(intArry[4]);
    // ex) long형 3개짜리 배열을 선언/생성 참조변수호출,
    // 첫번째 데이터 출력
    long[] larry = new long[3];
    System.out.println("long형 배열의 참조변수:" + larry);
    System.out.println(larry[0]);
    // ex) double형 5개짜리 배열 선언/생성 참조변수호출 두번째 데이터 출력
    double[] darry = new double[5];
    System.out.println("double형 배열의 참조변수:" + darry);
    System.out.println(darry[1]);
    // ex) String형 3개짜리 배열 선언/생성 1번째 데이터 출력
    String[] sarry = new String[3];
    System.out.println("String의 첫번째 데이터:" + sarry[0]);

//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
//
//       1. 배열 요소의 합 구하기:
//       int[] numbers = { 1, 2, 3, 4, 5 };
//       int sum = 0;
//
//       for (int i = 0; i < numbers.length; i++) {
//           sum += numbers[i];
//       }
//
//       System.out.println("합계: " + sum);
//       
//       배열의 모든 요소를 더하여 합을 구한다. 
//       배열의 길이(`numbers.length`)를 이용해 반복문을 실행하고, 각 요소를 `sum` 변수에 더해준다.
//
//       2. 배열 요소의 최댓값 찾기:
//       int[] numbers = { 5, 8, 2, 10, 3 };
//       int max = numbers[0];
//
//       for (int i = 1; i < numbers.length; i++) {
//           if (numbers[i] > max) {
//               max = numbers[i];
//           }
//       }
//
//       System.out.println("최댓값: " + max);
//       
//       배열에서 최댓값을 찾는다.
//       `max` 변수를 초기값으로 첫 번째 요소로 설정하고,
//       반복문을 통해 배열의 나머지 요소와 비교하여 더 큰 값을 `max`에 저장합니다.
//
//       3. 배열 요소의 평균 구하기:
//       
//       int[] numbers = { 10, 20, 30, 40, 50 };
//       int sum = 0;
//
//       for (int number : numbers) {
//           sum += number;
//       }
//
//       double average = (double) sum / numbers.length;
//       System.out.println("평균: " + average);
//       
//       배열의 모든 요소를 더한 후, 평균을 구한다. 
//       향상된 for문을 사용하여 각 요소를 `number` 변수에 순차적으로 대입하고,
//       `sum` 변수에 더해줍니다. 마지막으로, `sum`을 배열의 길이로 나누어 평균을 계산한다.
//

//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//    int[] scores = new int[3]; // 크기가 3인 정수형 배열 생성
//    int sum3 = 0;
//    double average;
//
////    Scanner scanner = new Scanner(System.in);
//
//    // 사용자로부터 점수 입력 받기
//    for (int i = 0; i < scores.length; i++) {
//       System.out.print("점수 입력: ");
//       scores[i] = scanner.nextInt();
//       sum3 += scores[i];
//    }
//
//    average = (double) sum3 / scores.length;
//
//    System.out.println("총계: " + sum3);
//    System.out.println("평균: " + average);

//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
//               public class Car {
//                   String brand;
//                   String color;
//                   int year;
//
//                   public void start() {
//                       System.out.println("The car has started.");
//                   }
//
//                   public void accelerate() {
//                       System.out.println("The car is accelerating.");
//                   }
//               }
//car 클래스 , 자동차 브랜드, 색상, 및 연식을 나타내는 속성을 가지고 있고, Start와 accelerate라는 메서드를 가지고 있다.

//               Car myCar = new Car(); // Car 클래스의 객체 생성
//
//               myCar.brand = "Tesla";
//               myCar.color = "Red";
//               myCar.year = 2021; //객체의 속성 값 할당
//
//               myCar.start(); // 객체의 메서드 호출
//               myCar.accelerate();

    // 객체를 생성하여 클래스의 인스턴트 만든것.
    // 객체는 클래스로부터 생성된 구체적인 데이터를 담고 있으며,
    // 해당 클래스의 속성과 메서드에 접근 할 수 있다.

    // 클래스는 객체를 만들기 위한 템플릿
    // 클래스는 객체의 속성의 정의하고
    // 객체의 독작을 나타내는 메서드를 포함할 수 있다.
    // 객체는 클래스로부터 생성된 실제 인스턴스로,
    // 클래스에 정의된 속성과 메서드에 접근하여 사용할 수 있다.

//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
//               필드 : 객체의 데이터가 저장되는 곳
//               1. 필드의 종류
//              1) 객체의 고유 데이터 선언
//              2) 객체가 가져야할 부품 객체
//                    1:1, 1:다객체
//                    
//              3) 객체의 현재 상태 데이터
//           2. 필드의 접근제어자
//              1) 필드는 일반적으로 private로 접근제어자를 선언하여 외부에서 직접적으로 접근할 수 없게 한다.
//                 간접적인 접근을 할 수 있다. (특정한 기능 메서드를 통해서)
//                 ex) 리모컨과 TV에서 채널을 변경할 때, 리모컨의 버튼을 통해서만 가능..
//              2) 필드의 사용.
//                 1) 객체의 생성후.
//                    ex) Person p01 = new Person()
//                 2) 참조변수.필드명 형태(접근제어자가 호출가능한 범위로 선언시)
//                    ex) p01.name = "홍길동";
//                        System.out.println(p01.name)
//                  3) 하나의 객체안에는 여러가지 형태의 필드를 선언할 수 있다.
//                       이름, 나이, 사는곳 등으로 여러가지 다른 유형으로 선언..
//                  4) 이 필드는 클래스의 관점에서 보면, 전역변수로 해당 클래스 내에서 다른 구성요소(생성자, 메서드)에서는 접근해서 할당할 수 있다.
//                  5) 생성자나 메서드의 매개변수나 지역변수가 동일한 명으로 선언되어 있을 때는 this.필드명으로 구분하여 사용한다.
//                     String name;
//                     public Person(String name){
//                         this.name = name;
//                     }
//                     public void setName(String name){
//                         this.name = name;
//                     }
//                     public void call(){
//                            String name = "안녕"; // 메서드 지역변수
//                            // 지역변수를 전역변수에 할당.
//                            // this : 지역변수와 전역변수 구분을 위해 사용한다.
//                            this.name = name;

//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
//               1. 이름: 생성자는 클래스의 이름과 동일한 이름을 가지며, 일반 메서드는 클래스의 이름과 다른 이름을 가질 수 있다.
//               2. 반환 값: 생성자는 반환 값이 없으며, 일반 메서드는 반환 값이 있거나 없을 수 있다.
//               3. 호출 시점: 생성자는 객체를 생성할 때 호출되며, 일반 메서드는 객체가 생성된 이후 언제든지 호출될 수 있다.
//               4. 목적: 생성자는 객체를 초기화하는 목적으로 사용되며, 일반 메서드는 객체의 동작을 구현하는 목적으로 사용된다.
//               따라서, 생성자와 일반 메서드는 서로 다른 목적을 가지고 있으며,
//              객체 생성 시 초기화 작업을 수행하는 생성자와 객체의 동작을 구현하는 일반 메서드를 구분하여 사용한다.
//               
//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
//    1. 입력을 받고 로직을 수행한 뒤 결과를 반환하는 형태:
//
//       public int calculateSum(int a, int b) {
//           int sum = a + b;
//           return sum;
//       }
//
//       2. 입력을 받아 로직을 수행하는 형태:
//
//       public void printName(String name) {
//           System.out.println("Hello, " + name + "!");
//       }
//
//       3. 로직을 수행하고 결과를 반환하는 형태:
//
//       public int generateRandomNumber() {
//           int randomNumber = (int) (Math.random() * 100);
//           return randomNumber;
//       }
//
//       4. 입력을 받아 로직을 수행하고 결과를 반환하는 복합형태:
//
//       public String greetPerson(String name) {
//           if (name.equals("Alice")) {
//               return "Hello, Alice!";
//           } else if (name.equals("Bob")) {
//               return "Hello, Bob!";
//           } else {
//               return "Hello, stranger!";
//           }
//       }

//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
//    1. 생성자로 데이터 사용하기:
//
//       public class Person {
//           private String name;
//           
//           public Person(String name) {
//               this.name = name;
//           }
//           
//           public void introduce() {
//               System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
//           }
//       }
//
//       // 생성자를 통해 데이터 사용
//       Person person = new Person("Alice");
//       person.introduce();
//
//       위의 예제에서 생성자를 사용하여 `Person` 클래스의 인스턴스를 생성하고,
//        생성자의 매개변수로 전달된 데이터를 클래스 내부에 있는 변수에 할당합니다.
//        이후 `introduce()` 메서드를 호출하여 인스턴스에 저장된 데이터를 사용하여 동작을 수행합니다.
//
//       2. 메서드를 통해 데이터 사용하기:
//
//       public class Person {
//           private String name;
//           
//           public void setName(String name) {
//               this.name = name;
//           }
//           
//           public void introduce() {
//               System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
//           }
//       }
//
//       // 메서드를 통해 데이터 사용
//       Person person = new Person();
//       person.setName("Bob");
//       person.introduce();

//    `setName()` 메서드를 통해 데이터를 설정하고, `introduce()` 메서드를 호출하여 데이터를 사용하여 동작을 수행한다.
//     즉, 메서드를 통해 외부에서 데이터를 설정하고 사용할 수 있습니다.

//    따라서, 생성자는 객체의 초기화에 사용되고, 인스턴스 생성 시에 데이터를 전달하여 초기화하는 역할을 한다.
//    메서드는 객체의 동작을 구현하고, 외부에서 데이터를 설정하고 사용하는 역할을 한다.

//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
//1) 3개에 입력값 중에 가장 큰수 출력

    MethdsExp05 me02 = new MethdsExp05();
    int a = 3;
    int b = 7;
    int c = 5;

    me02.getMaxNum(a, b, c);

//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력

    me02.getcnt(70);

//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
    String[] items = { "사과", "당근", "포도" };
    me02.checkItem(items, "당근");

//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
    AmusementPark park01 = new AmusementPark();
    park01.isTureAge(4);
//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)

//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
//탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
// 버스번호 @@번 @@명이 탑승했습니다. 

 }

}

class MethdsExp05 {
 void getcnt(int cnt) {
    System.out.println("합격,불합격 출력");
    if (cnt <= 70) {
       System.out.println("합격");
    } else {
       System.out.println("불합격");
    }
 }

 void getMaxNum(int num1, int num2, int num3) {
    int max = num1;

    if (num2 > max) {
       max = num2;
    }

    if (num3 > max) {
       max = num3;
    }

    System.out.println("가장 큰 수: " + max);
 }

 void checkItem(String[] itemList, String itemName) {
    boolean isSold = false;

    for (String item : itemList) {
       if (item.equals(itemName)) {
          isSold = true;
          break;
       }
    }

    if (isSold) {
       System.out.println(itemName + "은(는) 판매 중입니다.");
    } else {
       System.out.println(itemName + "은(는) 판매하지 않습니다.");
    }
 }

}

class AmusementPark {
 int age;

 boolean isTureAge(int age) {
    if (age < 5 || age >= 65) {
       System.out.println("무료");
       return true;
    } else {
       System.out.println("유료");
       return false;
    }
 }

 boolean priceAge(int age) {
    if (age < 25) {
       System.out.println("무료");
       return true;
    } else {
       System.out.println("유료");
       return false;
    }

 }
}