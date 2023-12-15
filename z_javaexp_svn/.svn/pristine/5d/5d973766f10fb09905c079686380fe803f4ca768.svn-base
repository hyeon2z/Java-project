package javaexp.z02_homework.a12_ljh.a0927;

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
- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
---
*/
	System.out.println("09/28 (목요일)");
	System.out.println("No 1.");
	int num1 = (int)10.5;
	System.out.println("10.5를 '정수'유형으로 형변환: " + num1);
	System.out.println();
	
	System.out.println("No 2.");
	System.out.println("int 1num;	==> 변수는 문자로 시작해야 한다.");
	System.out.println("String for;	==> 변수는 예약어로 선언할 수 없다.");
	System.out.println("float num!;	==> 변수는 _, $의 기호로만 선언할 수 있다.");
	System.out.println();
/*
### 09/29 (금요일)
- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
---
*/
	
	System.out.println("09/29 (금요일)");
	System.out.println("No 1.");
	Scanner sc = new Scanner(System.in);
	System.out.print("1번째 숫자를 입력하세요: ");
	int a = Integer.parseInt(sc.nextLine());
	System.out.print("2번째 숫자를 입력하세요: ");
	int b = Integer.parseInt(sc.nextLine());
	int max;
	int min;
	if(a > b) {
		max = a;
		min = b;
	} else {
		max = b;
		min = a;
	}
	System.out.println("큰 수: " + max);
	System.out.println("두 수의 합: " + (max + min));
	System.out.println("두 수의 차: " + (max - min));
	System.out.println("두 수의 곱: " + (max * min));
	if(min != 0) {
		System.out.println("두 수의 나눗셈 몫: " + (double)max / min);
		System.out.println("두 수의 나눗셈 나머지: " + (double)max % min);
	} else {
		System.out.println("0으로 수를 나눌 수 없습니다.");
	}
		
/*
### 09/30 (토요일)
- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
---
*/
	
	System.out.println("09/30 (토요일)");
	System.out.println("No 1.");
	System.out.print("숫자를 입력하세요: ");
	int num2 = Integer.parseInt(sc.nextLine());
	String result = (num2 > 0) ? "양수" : (num2 < 0) ? "음수" : "0";
    System.out.println("입력한 수는 " + result + "입니다.");
	
		
/*
### 10/01 (일요일)
- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
---

*/
    
	System.out.println("10/01 (일요일)");
	System.out.println("No 1.");
	System.out.print("숫자를 입력하세요: ");
	int num3 = Integer.parseInt(sc.nextLine());
	if(num3 > 0) {
		System.out.println("양수입니다.");
	} else if(num3 < 0) {
		System.out.println("음수입니다.");
	} else {
		System.out.println("0 입니다.");
	}
		
/*
### 10/02 (월요일)
- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
---

*/
	
	System.out.println("10/02 (월요일)");
	System.out.println("No 1. for문");
	System.out.print("숫자를 입력하세요: ");
	int num4 = Integer.parseInt(sc.nextLine());
	int sum = 0;
	for(int cnt=1; cnt<=num4; cnt++) {
		sum += cnt;
	}
	System.out.println("1부터 입력한 수까지의 합: " + sum);
	System.out.println();
	
	System.out.println("No 2. while문");
	System.out.print("숫자를 입력하세요: ");
	num4 = Integer.parseInt(sc.nextLine());
	sum = 0;
	int cnt = 1;
	while(cnt <= num4) {
		sum += cnt;
		cnt++;
	}
	System.out.println("1부터 입력한 수까지의 합: " + sum);
	System.out.println();
	
	System.out.println("No 3. do-while문");
	System.out.print("숫자를 입력하세요: ");
	num4 = Integer.parseInt(sc.nextLine());
	sum = 0;
	cnt = 1;
	do {
		sum += cnt;
		cnt++;
	}while(cnt <= num4);
	System.out.println("1부터 입력한 수까지의 합: " + sum);
	System.out.println();
	
		
/*
### 10/03 (화요일)
- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.


*/
	
	System.out.println("10/03 (화요일)");
	System.out.println("No 1.");
	Rectangle rect1 = new Rectangle(4, 5);
	rect1.area();
	rect1.circum();
	
		
/*
# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 개인별/조별 미니프로젝트 주제 및 내용 전달
3. 오늘 지각(9:00기준)인원과 사유

 * */
		
	}

}

class Rectangle{
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		System.out.println("가로 길이: " + width);
		System.out.println("세로 길이: " + height);
	}
	
	public void area() {
		System.out.println("사각형의 넓이: " + (width * height));
	}
	
	public void circum() {
		System.out.println("사각형의 넓이: " + ((width + height) * 2));
	}
	
}
