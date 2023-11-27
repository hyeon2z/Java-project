package javaexp.z02_homework.a14_cms;

import java.util.Scanner;


public class weekendhomework {
	//추석과제입니다.

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 /*# 09/28(목)
		 1. 자바의 메모리 분류 및 기본 데이터 유형
		 	1) 자바의 메모리 분류
		 		* 스택(Stack) - 지역변수, 메소드의 매개변수 등 잠시만 사용되고 초기화되는 데이터가 저장되는 공간
		 		* 힙(heap영역) - new 연산자로 생성된 객체, Array와 같은 동적으로 생성되는 데이터가
		 					   저장되는 공간으로 모든 스레드에서 정보가 공유된다.
		 	2) 기본 데이터 유형
		 		정수형 : short, byte, **int, long
		 		실수형 : float, **double
		 		문자형 : char
		 		boolean(논리)형 : true, false
		 		
		 JavaScript
		 	1) 메모리 분류 : js에서는 java와 같이 명확한 메모리 분류가 없다.
		 	2) data 유형 : Number, String, Boolean, Function, Object,
		 	Undefined, Null, Symbol, BigInt 
		 * */
		// 1번
		double dbl = 10.5;
		int num1 = (int)dbl;
		// 2번
		// int 1num01 = 10; 변수명은 숫자로 시작할 수 없다.
		//double &double01 = 10.4; 기호는 _,$만 사용가능하다.
		//String name String = null; 띄어쓰기는 사용할 수 없다.
		
		/*
		 # 09/29(금)
		 ** Java
		 1. 데어터 유형의 형변환
		 	데이터 유형의 형변환은 명시적 형변환과 자동형변환이 있다.
		 	예를 들어 int형에서 double형으로 형변환을 하는 등 작은 데이터유형에서 큰 데이터유형의
		 	형변환은 자동으로 이루어진다.
		 	반대로 double에서 int로 형변환을 할 시에는 (int)를 사용해서 명시적으로 형변환을
		 	해주어야 한다.
		 	다른 예로 int형을 char로 형변환도 명시적형변환을 해야 한다.
		 2. 변수 선언 규칙
		 	1) 변수 선언시 데이터형을 미리 선언해야 한다.
		 	2) 변수 이름은 문자로 시작해야 하며 대소문자를 구분합니다.
		 	3) 예약어는 변수 이름으로 사용할 수 없습니다. ex) int break = 0 (X)
		 	4) 변수 이름을 작성할 때는 보통 카멜케이스 규칙을 사용합니다.
		 		첫번째 단어는 소문자로 시작하고, 그 뒤의 각 단어의 첫글자는 대문자로 시작합니다.
		 		ex) String setName = null;
		 	5) 상수는 대문자로 선언합니다. ex) final int MAX_VALUE = 100;
		 	
		 ** JS
		 기본적으로 자동적으로 형변환이 된다. 명시적으로 형변환을 원할 시에는
		 Number(), parseInt(), parseFloat() 사용
		 * */
		int num01 = 10;
		int num02 = 3;
		System.out.println((double)10/3); //정수끼리의 나눗셈을 정수값으로 나오기 때문에 double로 명시적 형변환
		char lowerChar = 'a';
		//대문자로 바꾸기
		int upper = (int)(lowerChar) - 32;
		System.out.println((char)upper);
		System.out.println("두 정수를 입력하십시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a>b?(a!=b?a:0):b;
		System.out.println("더 큰 수는 (서로 같으면 0 출력) " + max);
		System.out.println("두 수의 합: " + (a+b));
		System.out.println("두 수의 차: " + (a-b));
		System.out.println("두 수의 곱: " + a*b);
		System.out.println("두 수의 나눗셈 몫: " + a/b);
		System.out.println("두 수의 나눗셈 나머지: " + a%b);
		
		/*
		 09/30(토)
		 1. 자바에서의 연산자
		 	1) 산술 연산자 : +, -, *, /, %
		 	2) 관계 연산자 : ==, !=, <, >, <=, >=
		 	3) 논리 연산자 : &&(AND), ||(OR), !(NOT)
		 	4) 대입 연산자 : =, +=, -=, *=, /=, %=
		 		ex) int num = 0;
		 			num += 3; num = num + 3과 같은 뜻
		 	5) 증감 연산자 : ++, -- 증감연산자가 앞에 붙으면 연산 먼저, 뒤에 붙으면 연산을 나중에 합니다.
		 	6) 삼항 연산자 (조건)?(true이면 처리할 내용):(false이면 처리할 내용)
		 	
		 	js도 동일
		 
		 * */
		System.out.println("정수를 입력하십시오.");
		int c = sc.nextInt();
		String numberSign = c>0?"양수":(c==0?"0":"음수");
		System.out.println(c+"는 " +numberSign + "입니다");
		/*
		 10/01(일)
		 1. 조건문의 개념
		 	프로그램의 흐름을 제어하고 특정 조건에 따라 코드 블록을 실행하거나 건너뛰는데 사용합니다.
		 	if문, if-else문, switch문이 있습니다. 
		 	js도 java와 비슷하다
		 	
		 * */
		System.out.println("정수 하나를 입력하십시오.");
		int d = sc.nextInt();
		if(d>0) System.out.println(d+"는 양수입니다.");
		if(d<0) System.out.println(d+"는 음수입니다.");
		if(d==0) System.out.println(d+"는 0입니다.");
		
		
	
	
	/*
	 1. 반복문의 개념
	 	코드 블록을 여러번 실행하도록 하는 제어 구조입니다. for문, while문, do-while문이 있습니다.
	 	1) for 문
	 	for(초기값; 조건; 증감연산자){반복할 구문} 구조로 일정 횟수만큼 반복하거나 배열, 리스트를 순회할 때 주요 사용됩니다.
	 	2) while문
	 	while(반복할 조건){반복할 구문} 구조로 반복문은 조건이 true일 동안 코드 블록을 실행합니다.
	 	3) do-while문
	 	do-while문은 무조건 한번은 실행하고, 그 다음에는 조건이 true일 때만 실행합니다. 
	 	do{
	 		반복할 구문
	 	} while(반복조건);
	 	
	 * */
		//for문 이용
		System.out.println("정수를 입력하십시오.");
		int max1 = sc.nextInt();
		int sumFor = 0;
		for(int i=1; i<=max1; i++) {
			sumFor+=i;
		}
	System.out.println("for문을 이용한 합: "+sumFor);
	//while문 이용
	int j = 1;
	int sumWhile = 0;
	while(j<=max1) {
		sumWhile+=j;
		j++;
	}
	System.out.println("while문을 이용한 합: " + sumWhile);
	//do while문 이용
	int k = 0;
	int sumDowhile = 0;
	do {
		sumDowhile += k;
		k++;
	}while(k<=max1);
	System.out.println("do-while문을 이용한 합 : " + sumDowhile);
	
	/*
	 1. 자바의 데이터 처리 방식
	 	1) 변수 사용 : 변수를 선언하고 값을 할당하여 데이터를 처리하고 관리합니다. 
	 		연산 및 조건문과 함께 사용하여 데이터를 조작할 수 있습니다.
	 	2) 배열 : 같은 데이터형식의 집합으로 배열을 이용하여 여러 데이터를 저장하고 처리할 수 있습니다.
	 			단 배열의 크기는 한번 지정하면 변경할 수 없습니다.
	 	3) 리스트 : 리스트는 동적배열을 의미하며, 한번 크기를 지정하면 변경할 수 없는 배열의 단점을 상쇄시킵니다.
	 	4) 반복문 : 반복할 조건을 지정하여 코드를 반복실행합니다.
	 2. 자바에서의 객체의 개념
	 	자바에서의 객체는 객체지향언이의 핵심 개념 중 하나입니다. 클래스는 객체를 만들기 위한 도면으로 
	 	필드와 메서드라는 속성을 가지고 있습니다. 예를 들면 설계도는 클래스이고, 객체는 그 설계도를 토대로 만들어진
	 	건물입니다. 객체는 클래스를 기반으로 생성된 실제 데이터 구조로 속성과 동작을 포함합니다.
	 	객체의 속성으로는 필드와 메서드가 있습니다. 필드는 객체의 상태를 나타내는 데이터를 저장하는 변수로 클래스 내부에
	 	정의되며 객체마다 다른 값을 가질 수 있습니다. 메서드는 객체의 동작을 정의하는 함수입니다. 
	 	
	 	//js 
	 	var rec = {width:0, height:0, getArea:function(){return (this.width * this.height)},
	 	getPerimeter:function(){return 2*(this.width + this.height)}
	 	}
	 	rec.width = 300; rec.height = 200
	 	console.log(rec.getArea())
	 	console.log(rec.getPerimeter())
	 
	 * */
	Rectangle r01 = new Rectangle(10,20);
	r01.getArea();
	r01.getPerimeter();
	
	}

}
class Rectangle{
	private int width;
	private int height;
	public Rectangle() {}; //매개변수 없는 생성자 
	public Rectangle(int width, int height) { //가로와 세로를 입력받는 생성자
		this.width = width;
		this.height = height;
		
	}
	public void getArea() {
		System.out.println("직사각형의 넓이를 구하는 메서드입니다. 넓이는: " + width * height);
	
	}
	public void getPerimeter() {
		System.out.println("직사각형의 둘레를 구하는 메서드입니다. 둘레는 : " +2*(height+width));
		
	}
}

