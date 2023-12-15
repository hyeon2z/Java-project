package javaexp.z02_homework.a11_mhi;

import java.util.Scanner;

public class A01_0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//# 연휴과제 
		//# 미니프로젝트 1개와 아래 일자별 과제 진행
		//# 일자별 진행할 내용
		//# javascript와 java로 처리하고 차이점에 대하여 기술하세요.
		//### 09/28 (목요일)
		//- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.
		//// 1. Heap
		// * 참조형(Reference Type) 데이터 타입을 갖는 객체(인스턴스), 배열 등이 저장 되는 공간
		// * 단, Heap 영역에 있는 오브젝트들을 가리키는 레퍼런스 변수는 stack에 적재
		// * Heap 영역은 Stack 영역과 다르게 보관되는 메모리가 호출이 끝나더라도 삭제되지 않고 유지된다.
		//   그러다 어떤 참조 변수도 Heap 영역에 있는 인스턴스를 참조하지 않게 된다면, GC(가비지 컬렉터)에 의해 메모리에서 청소된다.
		// * stack은 스레드 갯수마다 각각 생성되지만, heap은 몇개의 스레드가 존재하든 상관없이 단 하나의 heap 영역만 존재
		//// 2. Stack
		// *메소드 내에서 정의하는 기본 자료형에 해당되는 지역변수의 데이터 값이 저장되는 공간
		// *메소드가 호출될때 스택 영역에 스택 프레임이 생기고 그안에 메소드를 호출
		// *primitive 타입의 데이터(int, double, byte, long, boolean 등) 에 해당되는 지역변수, 매개 변수 데이터 값이 저장 
		// *메소드가 호출 될 때 메모리에 할당되고 종료되면 메모리에서 사라짐
		// *Stack 은 후입선출 LIFO(Last-In-First-Out) 의 특성을 가지며, 스코프(Scope) 의 범위를 벗어나면 스택 메모리에서 사라진다.
		//
		////  3. 자바의 기본 데이터 유형
		//- 정수형(byte, short, int, long) 
		//-실수형(float, double) 
		//-문자형(char)
		//-논리형(boolean)
		//
		//// 4. 자바스크립트의 기본 데이터 유형
		// -숫자(number): 정수(-1,0.1), 실수(소수점이 있는 숫자) NAN(Not a Number, 숫자가 아님이라는 값)
		// -문자열(string) : "",'',``으로 둘러싸인 문자의 집합
		// -불리언(boolean) : 참/거짓(true/false)을 표현
		// -객체(object) :  자바스크립트의 기본타입은 객체임. 1개 이상의 데이터가 특정 구조를 가지는 일종의 집합체
		// -배열(array) : 대괄호로 이루어진 집합 데이터. 순서와 길이를 갖는다.
		// -undefined : 값이 할당되지 않아 '타입'이 정해지지 않은 것, 초기회되지 않은 변수나 존재하지 않는 값에 접근 할 때 반한됨.
		// -null : object 타입이며, '값'이 정해지지 않은 것을 의미
		//
		//- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.
		//1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.

		      int num1 = (int) 10.5;
		      System.out.println(num1); // (java)

		//var num2 = 10.5;
		//num2=parseInt(num2);
		//console.log(num2); (js)

		//차이점)
		//java에서는 실수 리터럴 값에 정수 유형인'(int)'를 붙여 정수로 형변환 할 수 있다.  
		//js에서는 parseint()함수를 사용해서 정수로 형변환 할 수 있다.

		//2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.

		//----(java)--
		//int 3num = 3; // 변수명은 문자(a-z,A-Z)혹은 _,$로 시작해야 한다.
		//int 3 num=3; // 공백을 포함해서는 안된다. (js 동일)
		//int *num3 =3; // _,$ 이외의 특수문자는 사용하지 못한다.
		//int for = 3; // 예약어 변수명으로 사용 불가능
		//int num4= 4;
		//int num4 = 5; //이전에 선언된 변수 다시 선언 시, 에러 발생.

		// ---(js)
		//var 02num1; //변수명은 문자(a-z,A-Z)혹은 _,$로 시작해야 한다.
		//var class;  //예약어 변수명으로 사용 불가능
		//var *num1; // _,$ 이외의 특수문자는 사용하지 못한다. 

		//차이점) java에서는 이전에 선언된 변수 다시 선언 시, 에러가 발생하지만,
		//js에서는 var 타입으로 이전에 선언된 변수를 다시 선언 시, 에러가 발생하지 않는다. 

		//---
		//### 09/29 (금요일)
		//- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
		//- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
		//사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.

		//---java--
		      Scanner sc = new Scanner(System.in);
		//System.out.println("첫번째 정수 값을 입력하세요");
		//int inputNumA= Integer.parseInt(sc.nextLine());
		//System.out.println("두번째 정수 값을 입력하세요");
		//int inputNumB= Integer.parseInt(sc.nextLine());
		//
		//if(inputNumA>inputNumB) {
		//   System.out.println("첫번째 정수값이 더 큽니다.");
		//}else {
		//   System.out.println("두번째 정수값이 더 큽니다.");
		//}
		//
		//int plus= inputNumA+inputNumB;
		//System.out.println("두수의 합"+plus);
		//
		//int mins=inputNumA-inputNumB;
		//System.out.println("두수의 차"+mins);
		//
		//int mult=inputNumA*inputNumB;
		//System.out.println("두수의 곱"+mult);
		//
		//int quotient=inputNumA/inputNumB;
		//System.out.println("두수의 나눗셈 몫"+quotient);
		//
		//int remainder=inputNumA%inputNumB;
		//System.out.println("두수의 나눗셈 나머지"+remainder);

		// ---js---
		//var num1 = prompt("첫번째 정수 입력")
		//var num2 = prompt("두번째 정수 입력")
		//if(num1>num2){
		//alert("첫번째 값이 더 큽니다.")
		//}else{
		//alert("두번쨰 값이 더 큽니다.")
		//}
		//var plus = Number(num1)+Number(num2)
		//console.log(plus)
		//
		//var mins = num1-num2
		//console.log(mins)
		//
		//var mult = num1*num2
		//console.log(mult)
		//
		//var quotient = num1/num2
		//console.log(quotient)
		//
		//var remainder = num1%num2
		//console.log(remainder)

		//차이점) 사용자로부터 입력된 값을 사칙연산할때,
		//java에서는 따로 형변환이 필요없지만,
		//js에서는, prompt로 입력된 값은 기본적으로 '문자열'이기 때문에, 숫자로 형변환이 필요하다.
		//+(덧셈)시에는 Number() or parseInt() 로 형변환을 해주어야하고,
		//+(덧셈)제외 다른 사칙연산자는 자동 형변환되어 계산된다.

		//

		//---
		//### 09/30 (토요일)
		//- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
		//- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
		//사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.

		//--java--
		//System.out.println("정수 값을 입력하세요, 양수인지, 음수인지, 또는 0인지 알려줄게요");
		//int inputNumC= Integer.parseInt(sc.nextLine());
		//if(inputNumC>0) {
		//   System.out.println("양수입니다.");
		//} else if(inputNumC<0) {
		//   System.out.println("음수입니다.");
		//} else if(inputNumC==0){
		//   System.out.println("0입니다");
		//}

		//--js--
		//var num3 = prompt("첫번째 정수 입력")
		//if(num3>0){
		//   console.log("양수입니다")}
		//else if(num3<0){
		//   console.log("음수입니다")
		//}else if(num3==0){
		//   console.log("0입니다")
		//}

		//차이점) js에서 prompt로 입력 받은 값은 문자열이다.
		//else if(num3==0){
		//   console.log("0입니다") //prompt 0 입력시
		//==> 두 값을 자동 형변환 후 비교 하여 true이다. 따라서 "0입니다"를 반환한다.
		//
		//else if(num3===0){
		//   console.log("0입니다") //prompt 0 입력시
		//==> 타입이 같은지 확인 후 데이터를 비교하여 false이다. 아무 값도 반환하지 않는다.
		//==> 입력값은 string "0", 비교하는 값는 숫자 0

		//---
		//### 10/01 (일요일)
		//- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
		//- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
		//사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		//---
		//

		//System.out.println("정수 값을 입력하세요, 양수인지, 음수인지, 또는 0인지 알려줄게요 (단, -1, 1,0만 입력 가능)");
		//int inputNumC= Integer.parseInt(sc.nextLine());
		//switch(inputNumC) {
		//   case 1:
//		      System.out.println("입력한 수는 양수");
//		      break;
		//   case -1:
//		      System.out.println("음력한 수는 음수");
//		      break;
		//   case 0:
//		      System.out.println("음력한 수는 0");
//		      break;
		//   default:
//		      System.out.println("-1,1,0 중에만 입력해주세요");
		//}
		//

		//-js--
		//var num3 = prompt("정수 값을 입력하세요, 양수인지, 음수인지, 또는 0인지 알려줄게요 (단, -1, 1,0만 입력 가능)")
		//switch(num3) {
		//   case "1":
//		      console.log("입력한 수는 양수");
//		      break;
		//   case "-1":
//		      console.log("입력한 수는 음수");
//		      break;
		//   case "0":
//		      console.log("입력한 수는 0");
//		      break;
		//   default:
//		      console.log("-1,1,0 중에만 입력해주세요")
		//}

		//### 10/02 (월요일)
		//- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
		//- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
		//1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
		//---

//		      System.out.println("정수를 하나 입력해보세요, 1부터 입력한 수까지의 모든 합을 알려줄게요");
//		      int sum = 0;
//		      int inputNumD = Integer.parseInt(sc.nextLine());
//		      for (int i = 1; i <= inputNumD; i++) {
//		         sum += i;
//		      }
//		      System.out.println("1부터 입력한 수까지의 모든 합:" + sum);

		//--js
		//var i=0;
		//var sum=0;
		//var num3 = prompt("정수를 하나 입력해보세요, 1부터 입력한 수까지의 모든 합을 알려줄게요")
		//while(i<=num3){
		//   sum+=i;
		//  i++;
		//}
		//   console.log(sum)

		//### 10/03 (화요일)
		//- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
		//- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
		//사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.
		//

		      Rectangle r01 = new Rectangle(3,4);
		      double area=r01.getArea();
		      double perimeter=r01.getPerimeter();
		      System.out.println("사각형의 넓이:"+area);
		      System.out.println("사각형의 둘레:"+perimeter);
		   }
		}

		class Rectangle {
		   private double base;
		   private double height;

		   public Rectangle(double base, double height) {
		      this.base = base;
		      this.height = height;
		   }

		   // 필드에 입력된 width와 height를 기준으로 면적을 가져오는 메서드
		   // rt.getArea()
		   public double getArea() {
		      return base * height;

		   }

		   public double getPerimeter() {
		      return 2 * (base + height);

		   }
		   

		}

		
//		//쌤 정답
//		package javaexp.z02_homework.a00_yhs;
//
//		public class A0927 {
//
//			public static void main(String[] args) {
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
		### 09/29 (금요일)
		- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
		- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.
		사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.
		---
		### 09/30 (토요일)
		- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.
		사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		---
		### 10/01 (일요일)
		- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.
		사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.
		---

		### 10/02 (월요일)
		- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.
		- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.
		1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.
		---
		### 10/03 (화요일)
		- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.
		- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.
		사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.


		### 09/28 (목요일)

		- **개념문제**: 메모리 분류 및 기본 데이터 유형에 대한 설명.

		    - **Java**:
		        - **메모리 분류**: Java에는 주요 메모리 영역으로 Stack, Heap, Method Area, PC Registers, Native Method Stack 등이 있습니다.
		        - **기본 데이터 유형**: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.

		    - **JavaScript**:
		        - **메모리 분류**: JavaScript에는 Java와 같은 명확한 메모리 영역 구분이 없습니다. 대신, 변수는 크게 기본형(Primitive)과 객체형으로 분류됩니다.
		        - **기본 데이터 유형**: `Number`, `String`, `Boolean`, Function, Object
		                             -`Undefined`, `Null`, `Symbol`, `BigInt`.

		### 09/29 (금요일)

		- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.

		    - **Java**:
		        - **형변환**: Java에서는 명시적 및 암시적 형변환이 가능합니다. 예: `(int) 10.5`.
		        	Integer.parseInt(), Double.parseDouble()
		        - **변수 선언 규칙**: 변수 이름은 문자, $, _로 시작해야 하며 예약어를 사용할 수 없습니다.

		    - **JavaScript**:
		        - **형변환**: JavaScript에서는 암시적 형변환이 자주 발생합니다. 예: `"5" + 1 = "51"`. 명시적 형변환도 가능합니다, 예: `Number("10.5")`.
		        - **변수 선언 규칙**: 변수 이름은 문자, $, _로 시작해야 하며 예약어를 사용할 수 없습니다.

		### 09/30 (토요일)

		- **개념문제**: 연산자들에 대한 설명 및 각 연산자의 용도 이해.

		    - **Java**: 주요 연산자로는 산술(`+`, `-`, `*`, `/`, `%`), 비교(`==`, `!=`, `>`, `<`, `>=`, `<=`), 논리(`&&`, `||`, `!`), 비트(`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`) 등이 있습니다.
		    
		    - **JavaScript**: Java와 유사하게 다양한 연산자들이 존재합니다. 추가적으로, JavaScript에는 등호 연산자(`==`, `===`)와 유형 별 비교 연산자(`typeof`) 등도 있습니다.

		### 10/01 (일요일)

		- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.

		    - **Java**: 주요 조건문에는 `if`, `if-else`, `switch-case` 등이 있습니다.
		    
		    - **JavaScript**: Java와 유사한 조건문 구조를 가지고 있으며, `if`, `if-else`, `switch-case`를 포함합니다. 
		    삼항연산자 활용도 동일

		### 10/02 (월요일)

		- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.

		    - **Java**: 주요 반복문에는 `for`, `while`, `do-while` 등이 있습니다.
		    
		    - **JavaScript**: Java와 유사한 반복문 구조를 가지고 있습니다. 주요 반복문으로는 `for`, `while`, `do-while`, 그리고 `for..of`, `for..in`이 추가로 있습니다.

		### 10/03 (화요일)

		- **개념문제**: 데이터 처리 방식 및 객체의 개념 이해.

		    - **Java**:
		        - **데이터 처리 방식**: Java는 값 타입(기본 데이터 타입)과 참조 타입(객체)으로 데이터를 처리합니다.
		        - **객체의 개념**: 클래스를 통해 객체를 생성하고, 객체는 메모리의 힙 영역에 저장됩니다.

		    - **JavaScript**:
		        -

		 **데이터 처리 방식**: JavaScript에서 모든 것은 객체로 취급될 수 있습니다. 단, 원시 타입(Primitive)은 값에 의해 처리되며 객체는 참조로 처리됩니다.
		        - **객체의 개념**: JavaScript에서 객체는 키와 값의 쌍으로 구성된다. 예: `let person = {name: "John", age: 30};`
		        - 함수형 객체
		        - class형 객체
		        - 내장객체
		        

		### 09/28 (목요일)
		- **코드연습문제**:
		    - **Java**:
		    ```java
		    public class Main {
		        public static void main(String[] args) {
		            double realNumber = 10.5;
		            int convertedNumber = (int) realNumber;
		            System.out.println(convertedNumber);

		            // int 123abc; // 숫자로 시작하는 변수명은 허용되지 않습니다.
		            // int my-name; // '-'는 변수 이름에 허용되지 않는 문자입니다.
		            // int for; // 'for'는 Java의 예약어이기 때문에 변수 이름으로 사용할 수 없습니다.
		        }
		    }
		    ```
		    - **JavaScript**:
		    ```javascript
		    
		    let realNumber = 10.5;
		    let convertedNumber = Math.floor(realNumber);
		    console.log(convertedNumber);

		    // let 123abc; // 숫자로 시작하는 변수명은 허용되지 않습니다.
		    // let my-name; // '-'는 변수 이름에 허용되지 않는 문자입니다.
		    // let for; // 'for'는 자바스크립트의 예약어이기 때문에 변수 이름으로 사용할 수 없습니다.
		    ```

		### 09/29 (금요일)

		- **코드연습문제**:
		    - **Java**:
		    ```java
		    import java.util.Scanner;

		    public class Main {
		        public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.println("두 정수 a와 b를 차례대로 입력하세요:");
		            int a = scanner.nextInt();
		            int b = scanner.nextInt();
		            
		            if (a > b) {
		                System.out.println("a가 b보다 큽니다.");
		            } else if (a < b) {
		                System.out.println("b가 a보다 큽니다.");
		            } else {
		                System.out.println("a와 b는 같습니다.");
		            }

		            System.out.println("a + b = " + (a + b));
		            System.out.println("a - b = " + (a - b));
		            System.out.println("a * b = " + (a * b));
		            System.out.println("a / b의 몫 = " + (a / b));
		            System.out.println("a % b의 나머지 = " + (a % b));
		        }
		    }
		    ```

		    - **JavaScript**:
		    ```javascript
		    let a = parseInt(prompt("정수 a를 입력하세요: "));
		    let b = parseInt(prompt("정수 b를 입력하세요: "));

		    if (a > b) {
		        console.log("a가 b보다 큽니다.");
		    } else if (a < b) {
		        console.log("b가 a보다 큽니다.");
		    } else {
		        console.log("a와 b는 같습니다.");
		    }

		    console.log("a + b =", a + b);
		    console.log("a - b =", a - b);
		    console.log("a * b =", a * b);
		    console.log("a / b의 몫 =", Math.floor(a / b));
		    console.log("a % b의 나머지 =", a % b);
		    ```

		### 09/30 (토요일)

		- **코드연습문제**:
		    - **Java**:
		    ```java
		    import java.util.Scanner;

		    public class Main {
		        public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.println("정수를 입력하세요:");
		            int num = scanner.nextInt();
		            
		            if (num > 0) {
		                System.out.println("입력한 수는 양수입니다.");
		            } else if (num < 0) {
		                System.out.println("입력한 수는 음수입니다.");
		            } else {
		                System.out.println("입력한 수는 0입니다.");
		            }
		        }
		    }
		    ```

		    - **JavaScript**:
		    ```javascript
		    let num = parseInt(prompt("정수를 입력하세요: "));

		    if (num > 0) {
		        console.log("입력한 수는 양수입니다.");
		    } else if (num < 0) {
		        console.log("입력한 수는 음수입니다.");
		    } else {
		        console.log("입력한 수는 0입니다.");
		    }
		    ```

		### 10/01 (일요일)

		- **코드연습문제**:
		    - **Java**:
		    ```java
		    // 코드는 09/30의 Java 코드와 동일합니다.
		    ```

		    - **JavaScript**:
		    ```javascript
		    // 코드는 09/30의 JavaScript 코드와 동일합니다.
		    ```

		### 10/02 (월요일)

		- **코드연습문제**:
		    - **Java**:
		    ```java
		    import java.util.Scanner;

		    public class Main {
		        public static void main(String[] args) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.println("정수를 입력하세요:");
		            int inputNum = scanner.nextInt();
		            int sum = 0;

		            for (int i = 1; i <= inputNum; i++) {
		                sum += i;
		            }

		            System.out.println("1부터 " + inputNum + "까지의 합: " + sum);
		        }
		    }
		    ```

		    - **JavaScript**:
		    ```javascript
		    let sum = 0;
		    let inputNum = parseInt(prompt("정수를 입력하세요: "));

		    for (let i = 1; i <= inputNum; i++) {
		        sum += i;
		    }

		    console.log("1부터", inputNum, "까지의 합:", sum);
		    ```

		### 10/03 (화요일)

		- **코드연습문제**:
		    - **Java**:
		    ```java
		    class Rectangle {
		        private double width;
		        private double height;

		        public Rectangle(double width, double height) {
		            this.width = width;
		            this.height = height;
		        }

		        public double getArea() {
		            return this.width * this.height;
		        }

		        public double getPerimeter() {


		            return 2 * (this.width + this.height);
		        }

		        public static void main(String[] args) {
		            Rectangle rect = new Rectangle(10.0, 5.0);
		            System.out.println("사각형의 넓이: " + rect.getArea());
		            System.out.println("사각형의 둘레: " + rect.getPerimeter());
		        }
		    }
		    ```

		    - **JavaScript**:
		    ```javascript 
		    //제이슨 형태
		    var rec = {width:0, height:0, 
                 getArea:function(){ 
                    return this.width+this.height;}
                 getPerimeter:function(){
                    return return 2 * (this.width + this.height); 
                 }
              }
    rec.width = 300; rec.height=200
    console.log(rec.getArea())
    console.log(rec.getPerimeter())
		    
		    
		    
		    
		    
		    
		    class Rectangle {
		        constructor(width, height) {
		            this.width = width;
		            this.height = height;
		        }

		        getArea() {
		            return this.width * this.height;
		        }

		        getPerimeter() {
		            return 2 * (this.width + this.height);
		        }
		    }

		    const rect = new Rectangle(10.0, 5.0);
		    console.log("사각형의 넓이:", rect.getArea());
		    console.log("사각형의 둘레:", rect.getPerimeter());
		    ```


		 * */
				
//			}
//
//		}

		
		