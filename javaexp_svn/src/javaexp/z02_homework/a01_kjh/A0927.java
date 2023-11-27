package javaexp.z02_homework.a01_kjh;

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

자바는 stack영역과 heap 영역이 있는데 heap영역에 객체의 실제 데이터가 저장되고,
stack영역에서는 heap영역에 저장한 데이터의 주소값을 저장한다.

기본 데이터 유형
정수
 1) byte
 2) short
 3) int <- default
 4) long
실수
 1) float
 2) double <- default
논리
 1) boolean
문자
 1) char

- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
js) let num = 10.5;
	console.log(parseInt(num)) <- 첫번째방법
	console.log(Math.floor(num)) <- 두번째방법

java) double num = 10.5;
		System.out.println((int)num);

2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.
String break;	// java나 js에서 예약어는 변수명으로 선언이 불가능하다.
var break;

int 1num;	// 변수명의 첫글자는 숫자나 $,_을 제외한 특수문자가 올 수 없다.
var 1num;

int !num;	// 변수명에서 특수문자는 $,_만 사용가능하다.
var !num;

int num01 = 10;	// 이미 선언된 변수명을 또 선언하면 오류발생

int num01 = 20;

int num 1 = 10;	// 공백을 포함할수 없다.

---
### 09/29 (금요일)
- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
1) 클래스 명을 지을때는 대문자로 시작
2) 일반 변수/메소드명은 소문자로 시작
3) 변하지 않는 수 -> 상수 는 대문자로 선언
4) 합성어는 구분 시 _ 또는 대문자로 처리

기본 형변환처리
	1) 자동 타입변환(promotion)
		byte num = 1;
		short num1 = num; <- 자동으로 작은유형 -> 큰유형으로 형변환 예시
		
	2) 강제 타입변환(casting)
		double num02 = 1.23;
		int num03 = (int)num02; 실수 -> 정수로 형변환이다. 소숫점부분은 사라지고 1만 남는다.
		
	3) 문자열 <-> 숫자형 변환
		"25" , "3.14" 와 같이 숫자로 이루어진 문자열이어야 한다.
		
		- 정수형 문자열 -> 정수형
			int num01 = Integer.parseInt("25");
			
		- 실수형 문자열 -> 실수형
			double num02 = Double.parseDouble("3.14");

js 에서는 문자 -> 숫자로 바꿀 때 Number()을 사용하면 된다.
	정수 -> 실수 와 같은 자세한 형변환은
	parseInt / parseFloat / Math.floor(실수내림처리) 등으로 사용가능하다.

- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고,
두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
--java--
int a = 10;
int b = 5;

System.out.println(a > b); <- true of false 출력

System.out.println(a + b); 덧셈
System.out.println(a - b); 뺄셈
System.out.println(a * b); 곱셈
System.out.println(a / b); 나눗셈 몫
System.out.println(a % b); 나머지 출력

--js--

var a = 10;
var b = 5;

console.log(a < b)

console.log(a + b)
console.log(a - b)
console.log(a * b)
console.log(a / b)
console.log(a % b)

---
### 09/30 (토요일)
- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
기본 산술연산자
	+, -, *, /, %
	
증감연산자 기본적으로 1씩 증/감 처리
		++변수 -> 증가먼저 한 뒤 표시
		변수++ -> 변수를 표시 하고 증가처리

누적연산자 2개이상 증가/감소
	int num01 = 1;
	num01 += 2;
	num01 = num01 + 2; // 2 증가하는 연산식
	
비교연산자
	>, <, >=, <=, ==, !=
		기본적으로 같은지 안같은지 판별하는 비교연산자이다. !=는 양쪽두개가 서로 같지않은지 판별.
		참 거짓인지를 true, false로 나타낸다.
		
논리연산자
	비교연산식을 2개 이상 처리할때 주로 사용한다.
	1) 논리합 or
		num<3 || num>65 -> 3보다 작거나 65보다 큰 숫자일때 true 출력
		둘 중 하나만 참이어도 true가 출력된다
		
	2) 논리곱 and
		num>3 && num<10 -> 3보다 크고 10보다 작을때 true
		두 조건 모두 만족해야 true가 출력된다
	3) 부정연산자 not
		결과값이 true면 false가 출력되고, false면 true가 출력되게 하는 연산자.
		!(num>3 && num<10) -> num<=3 || num>=10
		
- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
int num;
Scanner sc = new Scanner(System.in);

System.out.print("숫자를 입력하세요")
num = sc.nextInt();

if(num > 0) {
	System.out.println("양수입니다.")
}else if(num == 0) {
	System.out.println("0 입니다")
}else {
	System.out.println("음수입니다")
}

js)
		num = prompt("숫자를 입력",0);

        if(num > 0) {
            alert("양수입니다")
        }else if(num == 0) {
            alert("0 입니다")
        }else {
            alert("음수입니다")
        }
---
### 10/01 (일요일)
- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
조건문은 코드를 실행할때 조건을 추가해서 각 조건에 해당하는 코드를 실행하는 기능을 가진 제어문이다.
if, if-else, if-else if-else 와 같이 활용가능하다.

if(조건문) {
	조건이 true일때 수행할 내용
}else if(조건문) {
	조건이 true일떄 수행할 내용
}else {
	나열된 조건들을 모두 제외했을때의 경우에 처리할 내용
}

또한 switch-case 문을 활용해 간단한 조건에 답이 여러개인경우 활용가능하다.

switch(변수) {
	case 케이스1:
		위 변수의 값이 케이스1일때 처리할 내용(계절을 계산할 경우, 변수의 값이 2라면 겨울을 출력)
		break; <- break이 나오기 전까지 문구 처리
	case 케이스2:
		변수값이 케이스2일때 처리할 내용
		break;
	...
	default:
		위 변수가 case에 해당하는 데이터 이외 일 때 처리할 내용

- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
if-else 문을 활용한 문제는 위에작성하였음.

Scanner sc = new Scanner(System.in);

System.out.print("숫자를 입력 : ");
num = sc.nextInt();

switch(num) {
	case num < 0:
		System.out.println("음수입니다.");
		break;
	case num == 0:
		System.out.println("0 입니다.");
	default:
		System.out.println("양수입니다.");

---
### 10/02 (월요일)
- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
반복문은 특정 조건에 대해서 해당 조건이 true일때 계속 반복을 하게한다.
false가 되면 반복 종료.

for(int cnt = 1; cnt <= 10; cnt++) {
	cnt가 10까지 더해질때 반복할 구문
}

while(반복조건) {
	반복할 구문
}

do-while은 반드시 한번은 실행 후, while문에 따라 반복할지 안할지 결정하는 구문이다.
do{
	수행할 구문
}while(반복할 조건);

- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
Scanner sc = new Scanner(System.in);
System.out.print("수를 입력 : ");
int usr = sc.nextInt();
int sum = 0;

첫번째)

for(int i = 1; i <= usr, i ++){
	sum += i;
}

System.out.println("모든 정수의 합은 : " + sum);

두번째)
int i = 1;
while(i <= usr) {
	i++;
	sum += i;
}

System.out.println("모든 정수의 합은 : " + sum);

세번째)
int i = 0;
do{
	i++;
	sum += i;
}while(i <= usr);

System.out.println("모든 정수의 합은 : " + sum);
---
### 10/03 (화요일)
- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
클래스는 도면 역할이고 객체는 이제 그 도면을 통해서 생성한것을 의미한다.
ex) bus라는 클래스가 선언되어있는 상태에서, 해당 클래스를 통해 객체를 생성하고 싶다면
	Bus b1 = new Bus(); 로 선언을 하면 클래스를 이용해 b1이라는 객체를 만든것이다.

클래스 내부에는 필드/생성자/기능메서드가 존재한다.
필드는 객체의 고유데이터/ 부품객체/ 상태정보 등을 저장할때 쓰인다.
선언형태는 변수선언할때와 비슷하지만 변수라고 부르지는 않으며
필드는 생성자와 메서드 전체에서 사용되고 객체가 소멸하지 않는 한 객체와 함께 존재한다.
ex) public class Bus { // 클래스 선언
		String name = 버스; // 필드 선언과 함께 초기화
		int speed; // 선언만 한 경우
		
생성자는 new 연산자로 호출되는 중괄호블럭이다.
생성자는 객체 생성시 초기화를 담당한다**
생성자는 메서드와 비슷하게 생겼지만 클래스이름으로 되어있으며 반환타입이 없다.
모든 클래스는 생성자가 반드시 존재하고, 선언되지 않았을 경우 default값으로
중괄호 블록 내용이 비어있는 기본 생성자를 추가한다.
ex) public class Bus {
		// 필드
		String name = 버스;
		int speed;
		String year;
		
		// 생성자
		public Bus(int speed, String year) {
			this.speed = speed;
			this.year = year;
		}
	
생성자는 매개변수 타입의 위치를 다르게하거나, 갯수를 다르게 하면
생성자 오버로딩으로 생성자를 여러개 선언할 수 있다.
단, 매개변수들의 타입이 동일하고 개수가 똑같은경우 오버로딩이라고 볼 수 없음.

메서드는 선언부와 실행블록으로 구성된다.
반환타입이 있는것과 반환타입이 없는것으로 나뉘는데

반환타입이 있는것은 메서드가 실행된 뒤 반환하는 값의 타입을 정해야 한다.
int sum(int i) {
	실행할 코드
	
	return sum1;
	}
	
반환타입이 없는 메서드는 void를 사용하면 된다.

- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.

Square sq01 = new Square(10, 15);
	sq01.Area();
	sq01.Round();


# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 개인별/조별 미니프로젝트 주제 및 내용 전달
3. 오늘 지각(9:00기준)인원과 사유

 * */
	}

}

class Square {
	double width;
	double length;
	
	Square(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getArea() {
		return width * length;
	}
	public void Area() {
		System.out.println("사각형의 넓이 : " + getArea());
	}
	
	public double getRound() {
		return (width*2) + (length*2);
	}
	public void Round() {
		System.out.println("사각형의 둘레 : " + getRound());
	}
}

