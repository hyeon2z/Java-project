package javaexp.z02_homework.a06_psj;

import java.util.Scanner;

public class A0927 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//# 연휴과제
//# 미니프로젝트 1개와 아래 일자별 과제 진행
//# 일자별 진행할 내용
//# javascript와 java로 처리하고 차이점에 대하여 기술하세요.
//### 09/28 (목요일)
//- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.
// stack 영역과 heap영역
// JAVA (byte(정수형/얼마 못씀자릿수), int(정수형), float 1.23f, double, char(한글자 아스키코드) > 'A',
//      String(배열임) > "ABC", boolean > true or false ) 문자열 형식에따라 변수 데이터유형을 꼭 구분해서 써야한다.
// JS (숫자형, 문자형, 객체형) 문자열이면 무조건 '', ""라고 데이터를 써야하고 숫자형을 쓰고싶다면 자바랑달리 그냥 소숫점 자릿수 상관없이 숫자만! 써주면된다.

//- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
//1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
      // JAVA
            double num1 = 10.5;
            System.out.println((int)num1); // casting 강제 형변환
      // JS
//            var num1 = 10.5;
//            alert(parseInt(num1));
//2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
      // JAVA, JS 공통
            // int 1a = 0;  >> 숫자로 시작하면 안된다
            // int import = 1; >> 몇가지 지정된 예약어랑 같으면 안된다.
            // int a@ = 1; //>> 변수명에 특수문자는 오직 $, _ 만 사용가능하다.

//---
//### 09/29 (금요일)
//- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
// JAVA의 경우
	int num2=5;    // 정수형 변수선언
//	int num1=5; // 재선언 불가능
	String s1= "기본값"; // 변수 선언과 동시에 초기화 가능
	double num3 = (double)num2;  // 정수형num1을 실수형으로 형변환하여 num2에 대입
	s1 = Integer.toString(num2); // 정수형num1을 문자열로 형변환하여 s1에 대입
	String s2 = Integer.toString(num2); // 문자열s1을 정수형으로 변환하여 대입

// JS의 경우
//	변수의 형태 선언이 필요없고 초기화값에 따라 자동으로 형이 정해진다
//	변수의 재선언이 가능하다 자동으로 덮어씌워진다
//	var num1;
//	var num2 = 1; // 숫자형
//	var s1 = '가'; // 문자열형
//	var s2 = "가"; // JS에서는 "과'의 구분없이 둘다 문자열형에 쓰인다
//	s1 = String(num1) // 문자열로 변환
//	num2 = parseInt(s2)  // 숫자형으로 변환

//- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
// Java
	Scanner sc = new Scanner(System.in);
	System.out.println("학번, 이름은?");
	int sNum = sc.nextInt();
	String name = sc.next();
	String inFo ="";
	inFo += Integer.toString(sNum);
	inFo += name;
	System.out.println("학생정보 (학번/이름): "+inFo);

// JS
//	var sNum = prompt("학번은?",0);
//	var money = propmt("남은돈?(단위입력)",0원);
//	alert("학번: "+sNum+"/ 남은돈: "+money);

//사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
// java
	System.out.println("두개의 수를 입력");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int tmp = 0;
	if (b>a){
	tmp=a;
	a=b;
	b=tmp;
	}
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b)+", 나머지: "+a%b);
// JS
//	var a = prompt("a입력",0);
//	var b = prompt("b입력",0);
//	var tmp;
//	if (b>a){
//	tmp=a;
//	a=b;
//	b=tmp;
//	}
//	alert("a+b="+(a+b));
//	alert("a-b="+(a-b));
//	alert("a*b="+(a*b));
//	alert("a/b="+(a/b)+", 나머지: "+a%b);

//---
//### 09/30 (토요일)
//- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
//	증감 연산자(++,--) : 값을 1씩 증가,감소 시킴
//	산술 연산자(+,-,*,/,%) : 4칙연산, 나머지구하기등에 사용
//	비교 연산자(>, <, <=, >=, ==, !=) : 두 값을 비교하여 조건이 맞으면 true 아니면 false값을 나타냄.
//	논리 연산자(&&, ||, !) : 두 조건식을 비교하여 and or not 을 수행하여 true false을 나타냄.
//	대입 연산자(=, +=, -=, *=, /=, %=) : 오른쪽값은 왼쪽으로 대입, 대입하면서 연산처리
//	삼항 연산자(a>b ? 1:2) : 조건식이 true면 :의 왼쪽값을 리턴한다. false면 오른쪽값을 리턴  
//- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
//사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
// Java
	System.out.println("정수를 입력하세요");
	int num = sc.nextInt();
	if (num==0)
	 	System.out.println("0입니다");
	else if (num>0)
	 	System.out.println("양수");
	else
	 	System.out.println("음수");

// JS
//	var num = prompt("정수를 입력하세요")
//	if (num=0)
//	 	alert("0입니다")
//	else if (num>0)
//	 	alert("양수")
//	else
//	 	alert("음수")
//	
//---
//### 10/01 (일요일)
//- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
// 조건문에 대하여 true면 {}안으로 들어가서 프로세스를 진행한다.
// if(조건문){
//	프로세스진행
//	}
// else if(조건문2){
//	위 if 조건문에 대해 true가 아니면서 조건문2에 true이면 프로세스진행
//	}
// else{
//	위 if, else if 조건문에 대해 모두 false 일 경우 프로세스진행
//	}
// switch (변수){
//	case 입력값1:
//		프로세스진행
//		break;
//	case 입력값2:
//		프로세스진행
//		break;
//	deafult:
//		프로세스진행
//		break;
//}


//- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
//사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
//Java
int num11 = sc.nextInt();
	if (num==0)
	 	System.out.println("0입니다");
	else if (num>0)
	 	System.out.println("양수");
	else
	 	System.out.println("음수");

// JS
//	var num = prompt("정수를 입력하세요")
//	if (num=0)
//	 	alert("0입니다")
//	else if (num>0)
//	 	alert("양수")
//	else
//	 	alert("음수")

//---
//
//### 10/02 (월요일)
//- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
// 일정한 조건문을 두고 조건에대하여 true이거나 false일경우까지 구문을 계속 반복하는것이 반복문이다.
// for(초기값; 반복문을 종료할 조건; 증감){
//	실행할 프로세스
//}
// while(조건식){ 조건식에 대해 true일경우 계속 반복
//	실행할 프로세스
//}
//do{
//	프로세스
//} while(조건식 true 일경우 계속실행);

//- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
//1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
//---
int a1 = sc.nextInt();
int sum=0;
for(int i=1;i<=a1;i++){
	sum+=i;
}
int i =1;
while(i<=a){
	sum+=i;
	i++;
}
i = 0;
do{
	sum+=i;
	i++;
}while(i<=a);

//### 10/03 (화요일)
//- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
// 자바에서 stack영역의 메모리는 일정한 메서드나 함수 내에서 필요한 데이터들이 stack영역에 저장되었다가 종료가되면 데이터들은 모두 삭제가 되어서 없어진다.
// heap영역의 메모리는 비교적 오랫동안사용해야하는 데이터들이 저장된다. 주로 String 문자열이 heap 영역에 정되며 stack영역에 heap영역 주소값을 저장하고 heap영역에는 변수의 내용을 저장한다. 이는 자바에서 문자열은 배열로 취급되기 때문이다 따라서 일반적인 배열이나 리스트도 heap영역에 값이 저장된다.
// 객체란 클래스의 인스턴스나 배열을 말한다. 변수, 함수 등의 조합으로 이루어지는 프로그램 단위

//- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
//사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.
//main(){
//	Rectangle rt = new Retangle(1,5);
//	System.out.println("넓이: "+rt.area());
//	System.out.println("둘레: "+rt.dul());
//}

   }
}

class Rectangle{
	int w;
	int h;
	public int area(){
		return w*h;
	}
	public int dul(){
		return 2*(w+h);
	}	
}

/*
 *  var rec = {width:0, height:0, 
                 getArea:function(){ 
                    return this.width+this.height;}
                 getPerimeter:function(){
                    return return 2 * (this.width + this.height); 
                 }
              }
    rec.width = 300; rec.height=200
    console.log(rec.getArea())
    console.log(rec.getPerimeter())
 */