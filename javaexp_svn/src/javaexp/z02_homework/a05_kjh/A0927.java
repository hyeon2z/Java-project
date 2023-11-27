package javaexp.z02_homework.a05_kjh;

import java.util.Scanner;

public class A0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 연휴과제
# 미니프로젝트 1개와 아래 일자별 과제 진행
# 일자별 진행할 내용
# javascript와 java로 처리하고 차이점에 대하여 기술하세요.
### 09/28 (목요일)
- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.
//자바의 메모리 분류는 지역변수와 메소드 호출에 관여하는 stack 영역과 객체들이 저장되는 heap영역으로 나뉜다.
 * 자바의 기본 데이터 유형은 다음과 같다
 * 정수형 : byte, short, int, long
 * 실수혈 : float, double
 * 문자형 : char
 * 논리형 : boolean
- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
//        double doubleValue = 10.5;
        int intValue = (int) doubleValue; // 실수를 정수로 형변환
        System.out.println("형변환된 정수 값: " + intValue);
    }
2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
int %a1 = 1 -> 자바에서 변수명에 특수문자는 $_만 허용됨
String break ==>예약어는 변수명으로 사용 불가
int 12a1 ==> 변수명은 숫자로 시작할 수 없음
---
### 09/29 (금요일)
- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
변수를 선언할 때 지켜야 할 규칙
1. 변수는 대소문자를 구분한다.
2. 특수문자는 $_만 사용할 수 있다.
3. 예약어는 변수명으로 사용할 수 없다.
4. 변수명은 숫자로 시작할 수 없다
5. 카멜 표기법을 사용한다.
데이터 유형의 형변환
자바에서는 데이터 유형을 변환할 수 있는데 두 가지 방법이 있다.
1) 자동 형변환
작은 데이터 유형을 큰 데이터 유형으로 바꾸는 것을 자동 형변환이라고 한다
int v1 =10; double dv1 = v1; // 자동 형변환이 된다
2) 강제 형변환(casting)
큰 유형의 데이터 값을 작은 유형으로 바꾸는 것으로 데이터의 손실이 일어날 수 있다.
double dv2 = 3.14;
int in1 = (int) dv2;// 3.14가 아닌 3으로 출력
- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
Scanner scanner = new Scanner(System.in);
System.out.print("첫 번째 정수를 입력하세요: ");
        int v1 =scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int v2 = =scanner.nextInt();
        if (v1>v2) {
            System.out.println(v1+"는"+v2+"보다 크다.");
        } else if (v1<v2) {
            System.out.println(v2+"는"+v1+"보다 크다.");
        } else {
            System.out.println("두 수는 같다);
        }
        int sum = v1+v2;
        int dif = v1-v2;
        int prt = v1*v2;
        int qut = v1/v2;
        int rer = v1%v2;

        // 결과 출력
        System.out.println("합: " + sum);
        System.out.println("차: " + dif);
        System.out.println("곱: " + prt);
        System.out.println("나눗셈의 몫: " + qnt);
        System.out.println("나머지: " + rer);
---
### 09/30 (토요일)
- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
자바에서 연산자는 다음과 같다.
1. 산술 연산자 
+ : 덧셈
- : 뺄셈
* : 곱셈
/ : 나눗셈
% : 나머지

2.대입연산자
= : 오른쪽 값을 왼쪽에 대입함

3. 비교연산자
== : 같음
!= : false 일때 ture
>, < :왼쪽이 크다, 오른쪽이 크다
>= : 크거나 같다
<= : 작거나 같다

4. 논리 연산자
|| : 'or' 두 값 중 하나라도 true이면true
&& : 'and' 두 값 모두 true일 때 true
! : 결과를 반전시킴 true는 false, false는 true

5. 증감 연산자
++ : 값을 1씩 증가시킴
-- : 값을 1씩 감소시킴


- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		System.out.print("정수를 입력하세요: ");
        int num01 = scanner.nextInt();
        String result = (num01 > 0) ? "양수입니다." : (num01 < 0) ? "음수입니다." : "0입니다.";
        System.out.println("입력한 수는 " + result);
---
### 10/01 (일요일)
- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
자바에서 조건문은 다음과 같다
1. if문 : 조건이 참일때 처리 거짓이면 넘어감
if (조건) {
    // 조건이 true일때 처리
}
2.if-else 문 : 조건이 참일때 처리할 내용과 거짓일때 처리할 내용을 나눔
if (조건) {
    // 조건이 true일때 처리
} else {
    // 조건이 false일때 처리
}
3.if-else-if 문 : 여러 조건을 동시에 처리해야 할 때 사용
if (조건1) {
    // 조건1이 true일때 처리
} else if (조건2) {
    // 조건2가 true일때 처리
} else {
    // 모든 조건이 false일 때 처리
}
4.switch문 : 여러가지 조건을 비교할 때 사용
switch (변수) {
    case 값1:
        // 값1일때 처리할 내용
        break;
    case 값2:
        // 값2일때 처리할 내용
        break;
    // 다른 case 
    default:
        // 위의 어떤 case에도 해당하지 않을 때 처리할 내용
}


- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		System.out.print("정수를 입력하세요: ");
        int num02 = scanner.nextInt();
 		if (num02 > 0) {
            System.out.println("입력한 수는 양수입니다.");
        } else if (num02 < 0) {
            System.out.println("입력한 수는 음수입니다.");
        } else {
            System.out.println("입력한 수는 0입니다.");
        }
---
---

### 10/02 (월요일)
- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
자바의 반복문은 다음과 같다
1) for문 : 정회진 회수만큼 반복
		for (초기화; 조건; 증감연산자){
    // 반복해서 실행될 내용
}
ex) for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
2) while 문 : 값이 true인 경우 반복
while (조건) {
    // 조건이 true면 반복해서 처리할 내용
}
3) do-while 문 : 조건이 true면 반복하지만 false여도 한번은 수행함
do {
    // 조건이 true면 반복해서 처리할 내용
} while (조건);
- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
		Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num03 = scanner.nextInt();
        int sum02 = 0;
        int num04 = 1;

        while (num04 <= num03) {
            sum02 += num04i;
            num04i++;
        }

        System.out.println("1부터 " + num03 + "까지의 합: " + sum02);

---
### 10/03 (화요일)
- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
자바의 데이터 처리 방식은 다음과 같다
1) 객체 지향 프로그래밍(OOP) : 자바의 데이터와 그 처리를 객체화 하여 프로그래밍하는 것
2) 프레임워크 : 아직안배움
3) 데이터베이스? : 아직안배움
객체의 개념
객체 : 데이터와 그 데이터의 처리를 위한 메서드를 포함하는 단위, 메모리에 할당되어 사용함
클래스 : 객체를 만들기 위해 사용되는 틀(설계도)
- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.
 // 사각형 객체 생성 (가로: 5, 세로: 10)
        Quad Quad02 = new Quad(5, 10);// 사각형 객체 생성 (가로: 5, 세로: 10)
        double area = Quad02.calculArea();// 넓이와 둘레 계산
        double perimeter = Quad02.calculPerimeter();
        System.out.println("넓이: " + area);// 결과 출력
        System.out.println("둘레: " + perimeter);
        
        
        
        
        
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 개인별/조별 미니프로젝트 주제 및 내용 전달
3. 오늘 지각(9:00기준)인원과 사유

 * */

	}

}

class Quad {
    private double width;
    private double height;

    // 생성자: 가로와 세로 길이를 초기화
    public Quad(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 넓이를 계산
    public double calculArea() {
        return width * height;
    }

    // 둘레를 계산
    public double calculPerimeter() {
        return 2 * (width + height);
    }
}