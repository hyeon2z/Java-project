package javaexp.z02_homework.a19_cjw;

import java.util.Scanner;

public class A0927_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 연휴과제
		# 미니프로젝트 1개와 아래 일자별 과제 진행
		# 일자별 진행할 내용
		# javascript와 java로 처리하고 차이점에 대하여 기술하세요.
		 * */
		/*
		### 09/28 (목요일)
		- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.
		- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
		1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
		2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
		 * */
		System.out.println("~~9/28~~");
		/*
		개념문제
		**메모리**
		static 영역 : 상수를 저장하는 영역
		stack 영역 : 기본 데이터 유형의 데이터와 배열, 객체의 주소값이 저장되는 영역
		heap 영역 : 배열과 객체의 데이터가 저장되는 영역
		
		**기본 데이터 유형**
		정수형 : byte, short, int, long으로 변수 선언.
				byte와 short는 잘 사용하지 않으며, int가 default. (연산시 byte와 short는 크기가 너무 작아서 사용하지 않는다)
				int는 대략 21억까지만 사용할 수 있기 때문에 그 이상의 수는 long을 사용한다.
				long을 사용하려면 할당시 데이터 끝에 L을 붙여야한다.
		실수형 : double, float로 변수 선언
				double이 default. float를 사용하려면 할당시 데이터 끝에 f/F를 붙여야한다.
		문자형 : char로 변수 선언. 문자 한글자만 할당할 수 있으며 ''사이에 사용한다.
				맵핑되어있는 유니코드값이 존재하기 때문에 저장될 때는 정수형으로 저장된다.
		문자열 : String으로 변수 선언. 문자의 배열이며 ""사이에 사용한다.
		논리형 : boolean으로 변수 선언. true/false만 할당할 수 있다.
		 * */
		/*
		!!js!!
		**기본 데이터 유형**
		var 또는 let
		숫자형 : 정수와 실수 구분 없음
		문자열 : character의 개념이 따로 없다.
		boolean형
		함수형 : var 변수명 = function () {}
		객체형 : var 변수명 = {속성1:속성값1,속성2:속성값2,...}
		 * */
		
		
		System.out.println("#1");
		double num01 = 10.5;
		int num02 = (int) num01;	// 강제형변환(casting)을 할 때는 (데이터타입)을 입력해야한다.
		System.out.println(num01+"->"+num02);
		System.out.println("#2");
//		int 1num; 숫자로 시작하면 안된다.
//		int num 1; 공백을 포함해서는 안된다.
		int num_$; // 특수 문자 중 _와 $는 사용 가능하다.
		int num; int Num; // 대소문자는 구분한다.
//		int for; 미리 지정된 예약어는 사용할 수 없다.
//		int num; 이전에 선언한 변수는 다시 선언할 수 없다.
		System.out.println();
		
		/*
		### 09/29 (금요일)
		- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
		- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
						 사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고,
						 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
		 * */
		System.out.println("~~09/29~~");
		/*
		개념문제
		**형변환**
		1) 자동형변환
			크기가 작은 데이터 유형에서 크기가 큰 데이터 유형으로 변환할 때는 잘려나가는 데이터가 없기 때문에 그냥 할당하면 된다.
			ex) int num02 = 4;
				double num2 = num02;  ==> 4.0
		2) 강제형변환(casting)
			크기가 큰 데이터 유형에서 크기가 작은 데이터 유형으로 변환할 때는 일부가 잘려나가기 때문에 다르게 할당한다.
			ex) double num03 = 3.14;
				int num3 = (int)num03;  ==> 3
		**변수 선언 규칙**
		1. 필수
			1) 문자로 시작해야 한다.
			2) 공백을 포함해서는 안된다.
			3) 특수문자는 $, _만 가능
			4) 대소문자는 구분한다.
			5) 미리 지정된 예약어는 변수로 선언할 수 없다.
			6) 이전에 선언된 변수를 재선언할 수 없다. (재할당은 가능)
		2. 가독성을 위해 지키면 좋은 것
			1) 클래스명은 대문자로 시작
			2) 변수명/메서드명은 소문자로 시작
			3) 상수(한 번 할당하면 변하지 않는 수)는 대문자로 선언
			4) 합성어는 구분자 _로 구분하거나, 구분 시작시 대문자를 사용한다.
		 * */
		/*
		!!js!!
		**형변환**
		1) 자동형변환
			자바스크립트에서는 숫자형 문자열의 경우 연산식에서 자동으로 형변환 된다.
		2) 강제형변환(casting)
			다만 +의 경우 문자열끼리 나열을 의미하는 것일 수도 있기 때문에 자동형변환이 이루어지지 않는다.
			Number() 또는 parseInt(), parseDouble을 통해 형변환을 해줘야 한다.
		 * */
		System.out.println("# 1~10 임의의 정수 #");
		int rdNum = (int)(Math.random()*10+1);	// double -> int
		System.out.println(rdNum);
		System.out.println("# b의 유니코드값 #");
		char c = 'c';
		int code_c = (int) c;		// char -> int
		System.out.println(c+" : "+code_c);
		System.out.println("# 정수 'a','b'를 입력받아서 어느 수가 큰지, 합 차 곱 몫 나머지 #");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("정수 b: ");
		int b = Integer.parseInt(sc.nextLine());
		int big = a>=b?a:b;
		System.out.println("큰 수: "+big);
		System.out.println("합: "+(a+b));
		System.out.println("차: "+(a-b));
		System.out.println("곱: "+(a*b));
		System.out.println("나눗셈(몫): "+(a/b));
		System.out.println("나머지: "+(a%b));
		System.out.println();
		
		/*
		### 09/30 (토요일)
		- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
						 사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		 * */
		System.out.println("~~09/30~~");
		/*
		개념문제
		**연산자**
		1. 산술연산자: +,-,*,/,% (사칙연산을 하기 위한 연산자)
		2. 증감연산자
			1) 기본
				변수++	=> 변수사용 후 변수+1
				++변수	=> 변수+1 후 변수사용
				변수--	=> 변수사용 후 변수-1
				--변수	=> 변수-1 후 변수사용
			2) 누적연산자
				변수 += 증감시킬수	ex) a += 3  => a=a+3 의미
				+외에 다른 산술연산자도 사용할 수 있다.
		3. 비교연산자: >,<,>=,<=,==,!=	(비교를 통해 논리값을 저장하거나 출력하는 연산자)
		4. 논리연산자: ||(or),&&(and),!(not) (비교연산자에 의한 결과를 2개 이상으로 연결하여 처리하는 연산자)
		 * */
		/*
		!!js!!
		**연산자**
		자동형변환이 일어나기 때문에 데이터타입까지 비교하는 ===와 !==이 존재한다.
		 * */
		System.out.println("정수 입력");
		int num3 = Integer.parseInt(sc.nextLine());
		String result = num3>0?"양수":(num3<0?"음수":"0");
		System.out.println(num3+": "+result);
		
		/*
		### 10/01 (일요일)
		- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
						 사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		 * */
		System.out.println("~~10/01~~");
		/*
		개념문제
		**조건문**
		1. if문 (조건으로 범위 지정)
			1) 기본
				if(조건) {
					조건이 true일 때 수행할 내용
				}
			2) if-else문
				if(조건) {
					조건이 true일 때 수행할 내용
				}else {
					조건이 false일 때 수행할 내용
				}
			3) if-else-if문
				if(조건1) {
					조건1이 true일 때 수행할 내용
				}else if(조건2) {
					조건1에 부합한거 제외 조건 2가 true일 때
					...
				}else {
					위 조건들에 전부 맞지 않을 때
				}
		2. switch문 (정확히 값이 매칭될 때)
			switch(데이터) {
				case 케이스1 :
					데이터와 케이스1이 일치할때 실행할 내용
					break;
				case 케이스2 : 
					데이터와 케이스2가 일치할때 실행할 내용
					break;
				.
				.
				.
				default :
					위에 선언된 케이스들과 일치하지 않을때 실행할 내용
			}
		 * */
		System.out.println("정수 입력");
		int num10 = Integer.parseInt(sc.nextLine());
		if(num10>0) {
			System.out.println(num10+" : 양수");
		}else if(num10<0) {
			System.out.println(num10+" : 음수");
		}else {
			System.out.println("0");
		}
		
		/*
		### 10/02 (월요일)
		- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
						 1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
		 * */
		System.out.println("~~10/02~~");
		/*
		개념문제
		**반복문**
		1. for문 (특정 step 단위로 반복문을 수행)
			1) 기본
				for(초기값;반복조건;증감연산자) {
					반복해서 수행할 구문
				}
			2) for-each
				for(단위데이터:배열) {
					수행할내용
				}
		2. while문 (특정조건을 만족할때 반복문을 수행)
			1) 기본
				while(반복할조건) {
					반복할조건이 true일 때 처리할 내용
				}
			2) 응용
				while(true) {
					처리할 내용
					if(반복문을 중단할 조건) {
						break;
					}
				}
			3) do-while문 (조건이 false여도 무조건 1번은 수행)
				do{
					반복수행할 내용
				} while(반복조건);
		 * */
		System.out.println("정수 입력");
		int num12 = Integer.parseInt(sc.nextLine());
		int sum12 = 0;
		for(int cnt=1;cnt<=num12;cnt++) {
			sum12+=cnt;
		}
		System.out.println("1~"+num12+" 총합: "+sum12);
		System.out.println();
		
		/*
		### 10/03 (화요일)
		- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
		- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
						 사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요.
						 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.
		 * */
		System.out.println("~~10/03~~");
		/*
		개념문제
		**데이터 처리 방식**
		1. 기본
			왼쪽에서 오른쪽으로, 위에서 아래로 순차적으로 처리된다.
		2. 대입
			a = b 라는 대입식에서는 오른쪽에서 왼쪽으로 진행된다. 즉, 예시의 식에서는 b가 a에 대입된다.
		3. 연산
			연산식에서는 우선순위가 존재한다. 우선순위가 동일하다면 기본 처리 순서 대로 진행된다.
			1) () 
			2) *,/ 
			3) +,-
			
		**객체**
		객체 : 클래스를 통해 생성되는 인스턴스. 필드와 메서드로 구성되어 있다.
				인간의 감각체계와 비슷하다. 하나의 값이 입력되면 그에 대한 기본값과 처리방법이 정해져있으며
				그렇게 처리된 결과값은 뇌가 감각을 처리하듯 사용자가 함수나 연산자 등을 이용하여 처리할 수 있다.
		필드 : 클래스 내부에 정의된 변수. 객체의 상태 또는 속성을 나타낸다.
		메서드 : 객체의 행동을 나타낸다. 함수.
		생성자 : 객체 초기화를 위한 특별한 메서드.
		 * */
		
		Rectangle rectangle = new Rectangle(5,4);
		System.out.println("가로: "+rectangle.getHeight());
		System.out.println("세로: "+rectangle.getWidth());
		System.out.println("넓이: "+rectangle.area());
		System.out.println("둘레: "+rectangle.length());
		
	}

}

class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return width*height;
	}
	
	public int length() {
		return 2*(width+height);
	}
	
}
