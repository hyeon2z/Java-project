/* # 연휴과제         
# 미니프로젝트 1개와 아래 일자별 과제 진행         
# 일자별 진행할 내용         
# javascript와 java로 처리하고 차이점에 대하여 기술하세요.         
         
### 09/28 (목요일)         
- **개념문제**: 자바의 메모리 분류 및 기본 데이터 유형에 대한 설명.         
Heap영역 : 실질적인 배열과 객체가 저장되는 공간          
Stack영역 : 변수이름, 배열이름, 객체이름이 저장되는 공간   
      
*java         
정수형 byte short int long         
실수형 float double         
문자열형 String         
문자형 char         
boolean형 true/false  
       
*javascript         
정수,실수 구분 없이 var         
숫자형 number         
문자열 문자형 구분 없이 String         
boolean형 true/false         
Function
Object

- **코드연습문제**: 다양한 기본 데이터 유형을 가진 변수를 선언하고 값을 할당하는 코드 작성.         
1. 실수 유형의 10.5 값을 `정수` 유형으로 형변환하여 출력하세요.
         
*java         
double d=10.5;         
int I = (int)d;         
System.out.println(i);  
       
*javascript         
alert(Math.floor(10.5));         floor : 소수점 버림

2. 변수명으로 적절하지 않은 것들을 선언해보고, 왜 그것이 적절하지 않은지 설명하세요.         

*java         
1a : 숫자로 시작 불가         
#1 : 특수문자는 $,_만 가능 
        
*javascript          
1a : 숫자로 시작 불가         
#1 : 특수문자는 $,_만 가능         

      
### 09/29 (금요일)         
- **개념문제**: 데이터 유형의 형변환 및 변수 선언 규칙에 대한 이해.
         
*java         
작은범위에서 큰범위를 사용할땐 형변환 필요. 큰범위에서 작은 범위를 사용할땐 안해도 됨.         
작은범위-큰범위 : promotion         
byte<short<int<float<long<double         
큰범위-작은범위 : typecasting  
       
*javascript         
double>long>float>int>short>byte         
 +는 문자열로 인식하며 그 외는 타입을 인식하여 자동형변환 됨.
          
- **코드연습문제**: 형변환을 요구하는 다양한 상황의 코드 작성 및 변수 선언 규칙을 따르는 코드 작성.         
사용자로부터 두 개의 정수 `a`와 `b`를 입력받아, 그 중 어느 수가 큰지 판별하고, 두 수의 합, 차, 곱, 나눗셈의 몫과 나머지를 출력하세요.         
Scanner sc = new Scanner(System.in);         
System.out.print("첫번째 정수를 입력하세요:");         
int a = sc.nextInt();         
System.out.print("두번째 정수를 입력하세요:");         
int b = sc.nextInt();         
System.out.println("합:"+(a+b));         
System.out.println("차:"+(a-b));         
System.out.println("곱:"+(a*b));         
System.out.println("나누기몫:"+(a/b));         
System.out.println("나누기나머지:"+(a%b));         
    
### 09/30 (토요일)         
- **개념문제**: 자바의 연산자들에 대한 설명 및 각 연산자의 용도 이해.         
 + 덧셈 -뺄셈 * 곱셈 /나눗셈 %나눈후의 나머지         
 ==같음 !=같지않음 >,< 큼 또는 작음 <=,>= 작거나같음 또는 크거나같음         
 &&  둘다참일시 결과가 참  !참이면 거짓으로, 거짓일시 참으로  
        
- **코드연습문제**: 주어진 문제 상황에 맞는 연산자를 사용하여 코드를 작성.         
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.         
      Scanner sc = new Scanner(System.in);         
        System.out.print("정수를 입력하세요: ");         
        int number = sc.nextInt(); // 정수 입력 받기         
                 
        if (number > 0) {         
            System.out.println("입력한 수는 양수입니다.");         
        } else if (number < 0) {         
            System.out.println("입력한 수는 음수입니다.");         
        } else {         
            System.out.println("입력한 수는 0입니다.");         
        }         
         
         
### 10/01 (일요일)         
- **개념문제**: 조건문의 개념 및 각 구문의 사용 방법에 대한 이해.         
if : 주어진 조건이 참인경우 실행         
else : if참 else거짓 실행         
else if : if,else if 조건이 참일때 실행하고 else은 그를 제외한 모든 조건일시 실행         
switch : 표현식…case 조건에 실행 default 그 외 조건 실행    
삼항 연산자 활용도 동일
java script는 for of, for in이 추가로 있다.     

- **코드연습문제**: 주어진 문제 상황에 맞는 if-else 문 또는 switch-case 문을 사용하여 코드를 작성.         
사용자로부터 정수를 하나 입력받아, 그 수가 양수인지, 음수인지, 또는 0인지 판별하세요.         
 Scanner sc = new Scanner(System.in);         
        System.out.print("정수를 입력하세요: ");         
        int number = sc.nextInt(); // 정수 입력 받기         
                 
        if (number > 0) {         
            System.out.println("입력한 수는 양수입니다.");         
        } else if (number < 0) {         
            System.out.println("입력한 수는 음수입니다.");         
        } else {         
            System.out.println("입력한 수는 0입니다.");         
        }         
         
### 10/02 (월요일)         
- **개념문제**: 반복문의 개념 및 각 구문의 사용 방법에 대한 이해.         
- **코드연습문제**: 주어진 문제 상황에 맞는 for, while, do-while 문을 사용하여 코드를 작성.         
1부터 사용자가 입력한 수까지의 모든 정수의 합을 구하세요.         
*for /java         
  Scanner sc = new Scanner(System.in);         
        System.out.print("정수를 입력하세요: ");         
        int number = sc.nextInt(); // 정수 입력 받기         
                 
        int sum = 0; // 합을 저장할 변수 초기화         
                 
        for (int i = 1; i <= number; i++) {         
            sum += i; // 정수 합 계산         
        }         
                 
        System.out.println("1부터 " + number + "까지의 합: " + sum);         
*for / javascript         
var number = parseInt(prompt("정수를 입력하세요:"));         
var sum = 0; // 합을 저장할 변수 초기화         
var i = 1; // 반복 변수 초기화         
         
do {         
    sum += i; // 정수 합 계산         
    i++;         
} while (i <= number);         
         
alert("1부터 " + number + "까지의 합: " + sum);         
*while /java         
 Scanner sc = new Scanner(System.in);         
        System.out.print("정수를 입력하세요: ");         
        int number = sc.nextInt(); // 정수 입력 받기         
                 
        int sum = 0; // 합을 저장할 변수 초기화         
        int i = 1; // 반복 변수 초기화         
                 
        while (i <= number) {         
            sum += i; // 정수 합 계산         
            i++;         
        }         
                 
        System.out.println("1부터 " + number + "까지의 합: " + sum);         
* while / javascript         
var number = parseInt(prompt("정수를 입력하세요:"));         
var sum = 0; // 합을 저장할 변수 초기화         
var i = 1; // 반복 변수 초기화         
         
while (i <= number) {         
    sum += i; // 정수 합 계산         
    i++;         
}         
         
alert("1부터 " + number + "까지의 합: " + sum);         
*do-while /java         
   Scanner sc = new Scanner(System.in);         
        System.out.print("정수를 입력하세요: ");         
        int number = sc.nextInt(); // 정수 입력 받기         
                 
        int sum = 0; // 합을 저장할 변수 초기화         
        int i = 1; // 반복 변수 초기화         
                 
        do {         
            sum += i; // 정수 합 계산         
            i++;         
        } while (i <= number);         
                 
        System.out.println("1부터 " + number + "까지의 합: " + sum);         
*do-while /javascript         
var number = parseInt(prompt("정수를 입력하세요:"));         
var sum = 0; // 합을 저장할 변수 초기화         
var i = 1; // 반복 변수 초기화         
         
do {         
    sum += i; // 정수 합 계산         
    i++;         
} while (i <= number);         
         
alert("1부터 " + number + "까지의 합: " + sum);         
         
---         
### 10/03 (화요일)         
- **개념문제**: 자바의 데이터 처리 방식 및 객체의 개념 이해.         
- **코드연습문제**: 배열과 객체를 활용하는 코드 작성 및 클래스의 구성요소에 따라 메서드와 필드를 가진 클래스 설계.         
사각형 클래스를 만들고, 넓이와 둘레를 구하는 메서드를 포함시키세요. 객체를 생성하고 해당 메서드를 호출하여 결과를 출력하세요.         
         
    }         
}         
*/