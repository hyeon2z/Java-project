package javaexp.z02_homework.a16_jsr;

import java.util.Scanner;

public class A0922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("#######1번#######");
////[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
////		  - 이름, 나이, 키 
////		  - 좋아하는 음악명, 발매연도
////		  - 오늘 지출금액 목록과 비용, 합산
//		String name="홍길동";
//		int age=35;
//		double hight=182.3;
//		System.out.println("이름:"+name+", 나이:"+age+", 키:"+hight);
//		String musicLike="ETA";
//		int srtMusic=2023;
//		System.out.println("좋아하는 음악명:"+musicLike+", 발매연도:"+srtMusic);
//		System.out.println("지출목록\t금액");
//		String[] thing= {"바나나","사과","포도"};
//		int[] price= {5000,3000,8000};
//		for (int i = 0; i < price.length; i++) {
//			System.out.println(thing[i]+"\t"+price[i]);
//		}
//		
//		System.out.println("#######2번#######");
////[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
//		
////		 1.print: 줄바꿈 없이 명령을 출력
//		 System.out.print("사과");
//		 System.out.print("딸기");
////		 2.println: 라인단위로 명령을 출력
//		 System.out.println("박태환");
//		 System.out.println("방지완");
//		 System.out.println("전창환");
////		 3.printf: 형식을 선언후, 해당 형식안에 들어갈 데이터를 처리하는 형식
//		 //%s : 문자열 데이터 처리
//		 //%n : 줄바꿈
//		 //%d : 정수형 데이터 처리
//		 //%f : 실수형 데이터 처리
//		 //%자리수s : 자리수와 문자열데이터 유형처리
//		 //%자리수d : 자리수와 정수형데이터 유형처리
//		 //%소숫점이상.소숫점이하f : 자리수와 실수형데이터 유형 처리
//		 String name02 = "홍길동";
//		 int age02 = 25;
//		 double salary = 5000.50;
//		 System.out.printf("이름: %s%n",name);
//		 System.out.printf("나이: %d%n",age);
//		 System.out.printf("연봉: %02f%n",salary);
//		 
//		
////[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
//		/*
//		 *	1)반드시 숫자가 아닌 문자로 시작해야한다.
//		 * 		ex) int 25Num01; (X)
//		 * 			int num01;   (O)	
//		 * 	2)공백을 포함해서는 안된다.
//		 * 		ex) int num 01;  (X)
//		 * 	3) 특수문자는 $,_만 선언이 가능하고 다른 특수문자는 사용할 수 없다.
//		 * 		ex) int $num01 = 30;  (O)
//		 * 		ex) int num01# = 30;  (X)
//		 * 		ex) int num_set = 30; (O)
//		 * 	4) 대소문자는 구분한다.
//		 * 		ex) int 25num01;
//		 * 		ex) int 25Num01;
//		 * 	5) 미리 지정된 예약어를 변수로 사용할 수 없다.
//		 *		ex) int for; (X)
//		 *		ex) int break; (X)
//		 *		예약어를 피하기 위해 변수명+01 등으로 numbering을 처리하는 경우도 있다.
//		 *		ex) int for01;
//		 *		ex) int break01;
//		 *	6) 이전에 선언된 변수 다시 선언시, 에러발생
//		 *		ex) int num01 = 30; (O)	
//		 *		ex) int num01 = 10; (X)	
//		 *		ex) num01 = 10; (O)	
//		 *2. 가독성을 위해서 준수할 내용(에러가 발생하지 않음)
//		 *		1) 클래스명은 대문자로 시작한다.
//		 *		2) 일반 변수명/메서드명은 소문자로 시작한다.
//		 *		3) 상수(한번 할당하면 변하지 않는 수)는 대문자로 선언
//		 *			final int PI = 3.14;
//		 *		4) 합성어는 구분자로 _, 구분시작시 대문자로 처리한다.
//		 *			ex) int num_age01;
//		 *			ex) int numAge01;
//		 */
//		
//		
////[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
//		/*
//		 #1. 숫자형
//		 * 	1)정수형
//		 * 		byte:1byte(8bit) -128~127 ex) byte num01=25;
//		 * 		short:2byte(16bit)
//		 * 		int:4byte(32bit)
//		 * 			-2147483648~2147483647 약 21억
//		 * 			데이터를 기본적으로 할당하면 int유형 이고, 특히, 연산을 하여 할당하는 경우, 반드시 int 유형이상으로
//		 * 			할당하여야한다. byte/short유형을 연산의 결과값을 할당하지 못한다.
//		 * 		long:8byte(64bit)
//		 * 				long num01 = 21474836473422L;
//		 * 			위 21이상의 int형 범위를 초과할 때는 반드시L이라고 붙여야 그 이상의 데이터를 사용할 수 있다.
//		 * 	2)실수형:소숫점이해 처리
//		 * 		float:4byte
//		 * 				float num01= 24.234585F;
//		 * 		double:8byte **(실수형의 default)
//		 * 2. 문자형(char)
//		 * 		문자형은 정수형에서 파생된 것으로 2byte로
//		 * 			정수형 0~065535범위로 코드값을 유니코드값으로 연결하여 처리한 것을 말한다.
//		 * 			보통 영문은 1byte로 표현할 수 있고, 
//		 * 			한글이나 기타 언어는 2byte범위로 표현한다.
//		 *	 	char==> char[] ==> String
//		 * 	 	문자 		문자배열		문자배열의 type화 하여 객체처리
//		 * 							객체지향프로그램에서는 꼭 필요
//		 * 							메서드(객체내함수)를 통해서 여러가지
//		 * 							기능을 지원하기 위해서 꼭 필요하다...
//		 * 							"홍길동 김길동 신길동" ==> 배열
//		 * 							index로 접근하여 추출, 숫자형 배열을 원하는
//		 * 							기본 데이터로 변경하는 등 많은 기능적인
//		 * 							필요성에 의해 객체화하여 메서드를 이용한다.
//		 *  		ex) char c01='a';
//		 *  		int c01Val =(int)c01;
//		 *  		char c02Val = 66;
//		 *  		int c02=(char)c02Val;
//		 * 3. 논리형
//		 * 		boolean값을 true/false값을 할당할 수 있는 데이터 유형이다.
//		 * 		int point=10;
//		 * 		boolean isPass = point>=20;
//		 * 		boolean isPass01 = true;
//		 * 		boolean isPass02 = false;
//		 */
//		
//		
////[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
//		/*
//		 #1. 작은데이터유형==> 큰데이터유형
//		 * 		자동(묵시적) 타입 변환:promotion
//		 * 		byte num01 = 25;
//		        int num02= num01; //자동형변환
//		 *	2) 큰데이터유형 ==> 작은데이터유형
//		 *		강제(명시적) 타입 변환:casting
//		 *		byte num01 = (byte)num02; //강제형변환
//		 *	3) 연산에 의해서 꼭 형변환이 필요하는 경우에도 casting을 처리한다.
//		 *		int ==> char으로 표현..
//		 *		int code = 66;
//		 *		char char01 = (char)code;
//		 *
//		 *		연산에 의해 실수가 표현하여햐 할 때..
//		 *		double dbl01 = (double)10/3;
//		 *		10/3 ==> 정수형 33
//		 *		(double) 10/3 ==> 실수형 3.3333..
//		 *
//		 *2. 문자열 데이터와 숫자형 변환
//		 * 	1) 전제조건
//		 * 		숫자형 문자열 "25","35.17"
//		 * 		그 외 문자열 "이십오","삼점일칠" 에러발생
//		 * 	2) 정수형문자열을 정수형
//		 * 		int num01 = Integer.parseInt("25");
//		 * 	3) 실수형문자열은 상수형
//		 * 		double num02 = Double.parseDouble("3.17");
//		 */
//		
//		 System.out.println("#######6번#######");
////[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
//		int a=2100000000;
//		int b=1500000000;
//		double c= a+b;
//		System.out.println("21억+15억="+c);
//		
////[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
////		 # int ==> char ==> char[] ==> String 
////		 char 문자는 2byte 크기와 유니코드 값을 가진다.
////		 사실, 문자 타입은 0부터 65535까지 저장할수있는 정수타입이기도 하다.
////		 따라서 int 타입의 code를 문자로 변환하면 각종 문자들로 변한다.
////		for(int code=15;code<=122;code++) {
////			System.out.println(code+":"+(char)code);
////		}
//		
//		System.out.println("#######8번#######");
////[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
////		알파벳(대문자): 65~90, (소문자):97~122, 정수 0부터 9까지 : 48~57로 구성됩니다.
//		for(int code=65;code<=90;code++) {
//			System.out.println(code+":"+(char)code);
//		}
//		for(int code=97;code<=122;code++) {
//			System.out.println(code+":"+(char)code);
//		}
//		for(int code=48;code<=57;code++) {
//			System.out.println(code+":"+(char)code);
//		}
//		
////[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
////		 1. 연산자 : 데이터를 처리하여 결과를 산출하는 것은 연산(operation)이라고 한다.
////		 			연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
////		 2. 피연산자 : 연산을 수행하기 위한 연산의 대상(리터럴(상수), 변수)
////		 3. 연산식(expression) : 연사자와 피연산자를 조합하여 계산하고자 하는 바를 
////		 						표현한 것을 식 또는 표현식
////		 ex)   a      +    b     =결과값;
////		 	(피연산자)(연산자)(피연산자)=결과값;
//		
////[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
////		 1. 산술 연산자(2순위) : 이항 연산자는 두 피연산자의 타입이 일치해야 연산이 가능하므로,
////		  		피연산자의 타입이 서로 다르면 연산 전에 형변환 연산자로 타입을 일치시켜야 한다.
////		  		대부분의 경우 두 피연산자의 타입 중 더 큰 타입으로 일치시키는데, 
////		  		그 이유는 작은 타입으로 형변환하면 원래의 값이 손실될 가능성이 있기 때문이다.
////			1) +: 더하기, 두 값을 더한다.
////			2) -: 빼기, 두 값을 뺀다.
////			3) /: 나누기, 두 값을 나눈다.
////			4) %: 나머지, 앞에 수를 뒷 수로 나눈 나머지값이 나온다.
////			5) *: 곱하기, 두 값을 곱한다.
////			앞의 수가 더 작을 경우 앞에 수가 그대로 출력.
////			ex) 
////			int num01=25;
////			int num02=7;
////			System.out.println(num01+"+"+num02+"="+(num01+num02));
////			System.out.println(num01+"-"+num02+"="+(num01-num02));
////			System.out.println(num01+"*"+num02+"="+(num01*num02));
////			System.out.println(num01+"/"+num02+"="+(num01/num02));
////			System.out.println(num01+"%"+num02+"="+(num01%num02));
////			System.out.println(num02+"%"+num01+"="+(num02%num01));
//		 
//		System.out.println("#######11번#######");
////[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
////        소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
//		int cc=500;
//		System.out.println("##소수점 이하가 처리된 경우##");
//		System.out.println((double)cc/3);
//		System.out.println("##소수점 이하가 처리안된 경우##");
//		System.out.println(cc/3);
//		
////[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
////		 2. 증감 연산자(1순위): 피연산자에 저장된 값을 1 증가 또는 1 감소시킨다.
////		 		a++ //처리 후 증가
////		 		++a //증가 후 처리
////		 		a-- //처리 후 감소
////		 		--a //감소 후 처리
//		//ex)
////		int cnt=1;
////		System.out.println((cnt++) + 1);// ==> 2 출력 후, cnt=2 된다.
////		System.out.println((++cnt) + 1);// ==> cnt=3 된 후, 출력 된다.
////		System.out.println((cnt--) + 1);// ==> 4 출력 후, cnt=2가 된다.
////		System.out.println((--cnt) + 1);// ==> cnt=1 된 후, 출력 된다.
//		
////[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
////		3. 증감대입연산자 : 대입 연산자(=)를 사칙 연산자와 함께 조합하여 활용할 수 있다.
////			하나의 변수만을 사용하여 산술 연산이 필요할 때, 코드를 간결하게 작성할 수 있는 장점이 있다.
////			종류는 +=, -=, *=, /=, %= 등이 있다.
////		ex)
////		int cnt=0;
////		cnt++;
////		cnt++;
////		cnt++; ====> cnt += 5; 간결하게 표현할 수 있다
////		cnt++;
////		cnt++;
//		
//		System.out.println("#######14번#######");
////[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
////			김밥 1개 구매  2500 
////			김밥 2개 구매  5000
////			김밥 3개 구매  7500
//		int buy = 1;
//		int price02 = 2500;
//		System.out.println("김밥\t"+buy++ +"개\t구매\t"+price02*buy);
//		System.out.println("김밥\t"+buy++ +"개\t구매\t"+price02*buy);
//		System.out.println("김밥\t"+buy++ +"개\t구매\t"+price02*buy);
//		
////[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
////		문자열==비교문자열 : 문자열이 가르키는 heep영역의 주소값을 비교하는 것이고
////		문자열.equals(비교문자열) : 비교문자열과 문자열이 같은지 비교하는 것이 차이점이다.
//		
////[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
////		1. String[] args을 활용하는 방법
////		1) java(소스코드)를 컴파일러(javac.exe)를 통해 컴파일 과정을 거치면 
////			@@@.class (바이트코드) 파일이 생성된다.
////			-> 그 후, 자바 가상 기계(java.exe)를 통해 기계어로 변환
////			-> 실행
////			ex) javac @@@.java 얘가
////			==> @@@.class 파일 생성
////			* java @@@ main()가 있으면 실행이 된다. main메소드가 없으면 컴파일만 되고 실행X
////		2) 이 컴파일과정을 거친 @@@.class는 
////			java @@@로 실행된다.
////		3) 이 때, 
////			java @@@ 사과 바나나 딸기 
////			형식으로 실행하면
////			String[]args 안에
////			{"사과","바나나","딸기"} 로 할당되어
////			args[0] : 배열명[index번호] 형태로 사용할 수 있게 된다.
////			우클릭 -> run as -> run configuration -> arguments -> 맨 위에 할당 (띄어쓰기로 구분)
////		4) eclipse에서는 이런 내용을 처리하기 위해서
////			실행 옵션에 argument가 있고, 그 옵션에
////			사과 바나나 딸기를 입력하면 위와 같이 데이터 
////			처리가 가능하다.
//		
//		System.out.println("#######17번#######");
////[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
//		System.out.println(args[5]);
//		System.out.println("물건명\t가격\t갯수");
//		System.out.println(args[0]+"\t"+args[1]+"\t"+args[2]);
//		System.out.println(args[3]+"\t"+args[4]+"\t"+args[5]);
//		System.out.println("총계:\t"+6000+"\t"+8);//##########################################
//		
////[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
////		1. import java.util.*;
////			외부 객체(Scanner)를 사용하기 위해 선언
////		2. Scanner sc = new Scanner(System.in);
////			객체를 생성하고 내장된 객체로 문자열 데이터 입력
////		3. String name = sc.nextLine();
////			Scanner 객체 안에 있는 sc.nextLine()을 통해
////			입력한 데이터를 String인 name에 할당한다.
////		4. System.out.println(name); 출력
//		
//		System.out.println("#######19번#######");
////[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.print("선수명:");
//		String nameString=sc.nextLine();
//		System.out.print("타석수:");
//		double play=Double.parseDouble(sc.nextLine());
//		System.out.print("안타수:");
//		double hits=Double.parseDouble(sc.nextLine());
//		System.out.println("##선수 정보##");
//		System.out.println("선수명:"+nameString);
//		System.out.println("타석수:"+play);
//		System.out.println("안타수:"+hits);
//		System.out.println("타율:"+hits/play);
//		
////[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
////		4. 비교 연산자(4순위)
////			1) >,<
////			25>3 :true, 25<3 :false
////			2) <=:이하, >=:이상
//////		    3)==:같다, !=:같지 않다
////			10==10 :true, 10!=10 :false
//		
//		System.out.println("#######21번#######");
////[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
//		System.out.print("나이를 입력해주세요:");
//		int age03=Integer.parseInt(sc.nextLine());
//		if(age03>=18) {
//			System.out.println("성인");
//		}else {
//			System.out.println("청소년");
//		}
//		
////[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
////		 	5. 논리 연산자 : 위 비교연산자에 의한 결과를 2개 이상으로 연결하여 처리할 때
//////		 (논리1)&&(논리2):AND,양쪽다 true이여야지 true
////		      	청소년 요금제 14이상 19이하일 때
////		      	age>=14 && age<=19
////		 	 (논리1)||(논리2):OR,한쪽만 true여도 true
////				과목 점수가 하나만이라도 80이상이면 true(pass)
////				kor>=80||eng>=80||math>=80
//		
////[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
////		for문의 기본 형식 : for(초기값;반복조건;증/감연산자){
////			 				반복해서 수행할 구문
//////			 			}
////		1) 초기값 : 반복구문에 사용할 변수의 최초값,
////			일반적으로 최소값인데, 역순위로 처리할때는 최대값을 넣는다.
////		2) 반복조건 : for문을 반복한 조건 또는 한계치를 지정할 때 사용.
////		3) 반복해서 수행할 구문 : 실제 {}(중괄호)로 반복할 내용
////		4) 증/감연산자 : 증/감 처리
////		for(int cnt=1;cnt<=10;cnt++) {
////			System.out.println("카운트업: "+cnt);
////		}
////		1~10까지 cnt가 1씩 증가하면서 반복
//		
//		System.out.println("#######24번#######");
////[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
////	              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
//		for(int cnt=200;cnt<=300;cnt+=10) {
//			System.out.println("카운트업: "+cnt);
//		}
//		for(int cnt=1000;cnt>=950;cnt-=3) {
//			System.out.println("카운트다운: "+cnt);
//		}
//		for(int cnt=100;cnt>=0;cnt--) {
//			System.out.println("100~0까지 2로 나눈값: "+cnt/2);
//		}
//		
//		System.out.println("#######25번#######");
////[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
////		전역변수 : 같은클래스에서 호출이 가능하며, 다른 클래스에서도 호출이 가능하다.
////		지역변수 : 지역변수 { }안에 생성되며 { }를 벗어나면 자동으로 삭제되어 호출이 불가능하다.
//		int tot=0; //전역변수
//		for(int cnt=1;cnt<=10;cnt++) {
//			tot+=cnt;
//		}
//		System.out.println(tot);
////		System.out.println(cnt); 에러 지역변수로 for문이 끝나면 삭제됨
//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요  
//		int tot=0; //전역변수
//		for(int cnt=1;cnt<=10;cnt++) {
//			tot+=cnt;
//		}
//		System.out.println(tot); //전역변수로써 class 안의 전체영역에서 사용하는 변수이다.
//		또한, class의 필드값으로 생성된 경우 전역변수 값은 new 를 만나면 초기화 되는데,
//		최기화 되지 않는 값을 유지하려면 static 변수를 사용하면 된다.
		
//		System.out.println("#######27번#######");
//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//	                no 과일명  가격
//	                 1 사과    3000            
//	                 2 바나나   4000           
//	                 3 딸기    12000
//	                   총계    19000            
//		int sum=0;
//		String prt="no\t과일명\t가격\n";
//		for(int cnt=1;cnt<=3;cnt++) {
//			System.out.print("구매하실 과일의 이름은?:");
//			String fr=sc.nextLine();
//			System.out.print("가격은?: ");
//			int price =Integer.parseInt(sc.nextLine());
//			prt+=cnt+"\t"+fr+"\t"+price+"\n";
//			sum += price;
//		}
//		System.out.print(prt);
//		System.out.println("\t총계\t"+sum);
		
//		System.out.println("#######28번#######");
//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		            # 출력 형식
//		            날짜  갯수 누적
//		            1일차 2개  2개
//		            2일차 4개  6개
//		            3일차 6개 12개
//		System.out.println("곰돌이 빵");
//		System.out.println("날짜 갯수 누적");
//		int sum = 0;
//		for(int cnt=1;cnt<=10;cnt++) {
//			int br=cnt*2;
//			sum +=br;
//			System.out.println(cnt+"일차 "+br+"개 "+sum+"개");
//		}
		
//		System.out.println("#######29번#######");
//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//		int sum2=0;
//		for(int cnt=1;cnt<=100;cnt++) {
//			if(cnt%4==0) { 
//				sum2+=cnt; //4의 배수 누적처리
//				System.out.print("#");
//			}
//			System.out.print(cnt+", ");
//		}
//		System.out.println();
//		System.out.println("1~100까지 4의 배수 합계: "+sum2);
		
//		System.out.println("#######30번#######");
//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
//		for(int cnt=1;cnt<=20;cnt++) {
//			if(cnt%3==0 || cnt%10==3) {
//				System.out.print("짝!, ");
//			}else {
//			System.out.print(cnt+", ");
//		}
//	} 
//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
//		중첩for문 : for문 안에 for문이 중첩적으로 사용되는 것을 말한다.
//		구구단을 예로들면 1번째 for문이 1일때 안에 있는 for문이 1,2,3,4,5,6,7,8,9까지 곱해준다.
//		for(int grade=2;grade<=9;grade++) {
//			for (int cnt = 1; cnt <=9; cnt++) {
//				System.out.printf("%dx%d=%d\n",grade,cnt,grade*cnt);
//			}
//		}
		
//		System.out.println("#######32번#######");
//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
//	1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//		   1) 2X2(행X열)로 ♥를 표시
//		for (int row = 0; row <2 ; row++) {
//			for(int col=0;col<2;col++) {
//				System.out.print("♥");
//			}
//			System.out.println();
//		}
//			2) 3X2(행X열)로 ★표시
//		for (int row = 0; row <3 ; row++) {
//			for(int col=0;col<2;col++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//			3) 입력한 행/열로 입력한 기호표시
//		Scanner sc=new Scanner(System.in);
//		System.out.print("몇 행?");
//		int row=Integer.parseInt(sc.nextLine());
//		System.out.print("몇 열?");
//		int col=Integer.parseInt(sc.nextLine());
//		System.out.print("기호?");
//		String point =sc.nextLine();
//		for (int row2 = 0; row2 < row ; row2++) {
//			for (int col2 = 0; col2 < col; col2++) {
//				System.out.print(point);
//			}
//			System.out.println();
//		}
		
//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
//		while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
//				조건식이 true이면 문장이 실행되고, false이면 종료된다.
//		int cnt=1;
//		while(cnt<=10) { //cnt가 10이하일때까지 반복
//			System.out.println((cnt++)+"번째 반복");
//		}
		
//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//		int cnt5=100;
//		int tot5=0;
//		while (cnt5>=90) {
//			System.out.print(cnt5--+" ");
//			tot5+=cnt5;
//		}
//		System.out.println("총합:"+tot5);
		
//		System.out.println("#######35번#######");
//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		int no = 0;//학생수/번호
//		int tot=0;//누적되는 학생의 점수
//		while (true) {
//			System.out.print(++no+"번째 학생의 점수를 입력(종료시 -1): ");
//			int pt = sc.nextInt();
//			//주의 : 동일한 유형을 입력받을 때는 문제가 없으나,
//			//숫자형과 문자열을 번갈아 받을 때는 반드시 형변환 함수를
//			//활용해야한다.(에러발생) Integer.parseInt();
//			if(pt==-1) {
//				--no;
//				break;
//			}else {
//				tot+=pt;
//			}
//		}
//		System.out.println(no+"명의 학생의 점수");
//		System.out.println("총점: "+tot);
//		System.out.println("평균: "+(tot/no));
		
//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
//		break : 반복은 중단 처리
//		continue: 해당 반복step에서 나머지 코드 부분은 건너뛰고 다음 step으로 진행
//		int grade = (int)(Math.random()*8+2);
//		for(int cnt=1;cnt<=9;cnt++) {
//			if(cnt==4)continue; //4는 다음단계로
//			if(cnt==8)break; //8일때 반복중지
//			System.out.println(grade+"X"+cnt+"="+grade*cnt);
//		}
		
//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
//		Stack(스택) 영역: 메소드가 호출될 때 메모리에 할당되고 종료되면 메모리가 해제된다. 
//			메소드 내에서 정의하는 기본 자료형(int, double, byte, long, boolean 등)에
//			해당되는 지역변수(매개 변수 및 블럭문 내 변수 포함)의 데이터의 값이 저장되는 공간
//			또한 for문 내에 int i를 정의하였는데 for문이 종료된 다음 i를 출력하지 못하는 이유는
//			지역변수이므로 for문의 종료와 함께 Stack 영역에서 해제되었기 때문이다.
//		Heap 영역 : 참조형(Reference Type)의 데이터 타입을 갖는 객체(인스턴스), 배열 등은 
//			Heap 영역에 데이터가 저장된다. 이때 변수(객체, 객체변수, 참조변수)는 Stack 영역의
//			공간에서 실제 데이터가 저장된 Heap 영역의 참조값(reference value, 해시코드 / 메모리에
//			저장된 주소를 연결해주는 값)을 new 연산자를 통해 리턴 받는다.
//			다시 말하면 실제 데이터를 갖고 있는 Heap 영역의 참조 값을 Stack 영역의 객체가 갖고 있다.
//			이렇게 리턴 받은 참조 값을 갖고 있는 객체를 통해서만 해당 인스턴스를 핸들 할 수 있다.
//		int[] a = null; // int형 배열 선언 및 Stack 영역 공간 할당
//		System.out.println(a); // 결과 : null
//		a = new int[5]; // Heap 영역에 5개의 연속된 공간 할당 및 
//		                // 변수 a에 참조값 할당
//		System.out.println(a); // 결과 : @15db9742 (참조값)

//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
//		배열부터는 객체로 포함되에 stack영역과 heap영역을 둘 다 활용하여 사용한다.
//			즉 heap영역에 실제 객체의 메모리를 사용하고,stack영역 에서는 
//			이 heap영역의 주소값을 저장해서 가지고 있다.
//		int [] arry = new int[3];
//		arry[0] = 5;
//		arry:배열의 heap영역 주소값 할당
//		arry[0] = 5; 각 구성요소에 실제 데이터 할당.
		 
//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
//		배열 객체의 사용 단계
//		  	1) 변수선언
//		  		타입[] 배열명;
//		 	2) 배열선언과 할당
//		 		배열명=new 타입[배열의 갯수]
//		 		현재 단계까지는 배열에 default 데이터만 할당된
//		 		상태 즉, int[]일 경우 0이 각 구성요소에 할당.
//		 		String[]일 경우 null이 할당.
//		 		double[] 경우 0.0이 각 구성요소에 할당
//		 	3) 각 구성요소 데이터 할당
//		 		배열명[index 번호] = 데이터;
//		 		index번호 : 0부터 시작하는 index번호에 실제
//		 		사용할 데이터를 할당한다.
//		 		ex) int [] arry = new int[3];
//		 		arry[0] = 5;
//		 		arry[1] = 10;
//		 		arry[2] = 15;
//		 		arry:배열의 heap영역 주소값 할당
//		 		arry[0] = 5; 각 구성요소에 실제 데이터 할당.
//		 	4) 배열의 선언 + 초기값 할당 처리
//		 		double[]arry ={10.7,20.5,30.17};
//		 		이와같이 선언과 동시에 0.0이외에 초기값을 할당하는
//		 		처리를 한번에 할 수 있다.
//		 		arry:배열의 heap영역 주소값 할당
//		 		arry[0] : 첫번째 데이터 10.7이 할당되어 있음
////		1. int형
//		int intArry[];//배열 선언
//		intArry = new int[5];//배열의 초기값이 할당된 heap영역의 주소값
//		System.out.println("int형 배열의 참조변수"+intArry);
////		2. long형
//		long [] larry = new long[3];
//		System.out.println("long형 배열의 참조변수"+larry);
//		System.out.println(larry[0]);
////		3. double형
//		double [] darry = new double[5];
//		System.out.println("double형 배열의 참조변수"+darry);
//		System.out.println(darry[1]);
////		4. String형
//		String [] sarry = new String[3];
//		System.out.println("String형 배열의 참조변수"+sarry);
//		System.out.println(sarry[0]);
		
//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
//		배열명.length는 배열이 가지고 있는 길이를 가져올 수 있다.
//		1) for(int idx=0;idx < 배열명.length;idx++){
//		  			배열명[idx]
//		  		}
//		  		//idx < 배열명.length : 배열의 index와 배열의 길이가
//		  		  정수형을 1차이가 나기때문에 <(미만)으로 표기해야한다.(주의)
//		2) for(단위 변수:배열 객체){
//		  		// 배열안에 있는 구성요소 하나씩 가져와서 처리 후, 
//		  		   단위 변수 안에 다음 index의 배열을 가져온다.
//		  		 }
		
//		System.out.println("#######41번#######");
//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//		int [] arry = new int[3];
//		int tot=0;
//		for (int i = 0; i < arry.length; i++) {
//			System.out.print("점수를 입력하세요:");
//			arry[i]=Integer.parseInt(sc.nextLine());
//			tot+=arry[i];
//		}
//		System.out.println("총계:"+tot);
//		System.out.println("평균:"+tot/3);
		
//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
//		클래스 : 클래스에서 객체를 생성하기 위한 필드와 메소드가 정의 = 객체를 생성하기 위한 도면
//			클래스는 필드(Field), 생성자(Constructor), 메소드(Method)로 구성된다.
//		객체 : 1) 물리적으로 존재하는 것 -자동차,책,사람
//	 		 2) 추상적인 것(회사,날짜) 중에서 자신의 속성과 동작을 가지는 모든것
//	 		 3) 객체는 필드(속성)고 메소드(동작)으로 구성된다
//		하나의 클래스로 부처 여러개의 인스턴스 만들 수 있음
//		설계도(클래스) ==> 구체적인 사물/객체(객체)
//		Tower t1=new Tower(); //롯데타워도면으로 객체를 생성해서 
//		t1.loc="부산"; //부산에서 롯데타워를 만듬
//		System.out.println("주소는:"+t1+" 지역은:"+t1.loc); 
//		//t1의 주소는 heap영역의 객체 주소를 가르킨다
		
//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
//		필드 : 클래스에 포함된 변수를 의미한다. 즉, 객체의 속성을 정의하는 공간이다.
//		사람 -[속성]:이름,나이 ==> 사람객체 -[필드]:이름,나이
//		필드에서 다루는 변수는 클래스 변수(cv)와 인스턴스 변수(iv)이다.
//		이 둘은 static 키워드를 통해 구분할 수 있다.
//		인스턴스 변수 : 인스턴스(클래스를 통해 생성된 객체)가 가지는 속성을 저장하기 위한 변수
//					따라서 new 생성자()를 통해 인스턴스가 생성될 때 만들어진다.
//		클래스 변수 : 클래스 변수는 인스턴스 변수와는 다르게 공통된 저장공간을 공유한다.
//				즉, 한 클래스로부터 생성되는 모든 인스턴스들이 특정한 값을 공유해야
//				하는 경우에 static 키워드를 사용하여 선언하게 된다.
		
//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
//		생성자 : 객체를 생성하기 위한 메서드, new 키워드를 통해서 해당 선언된 생성자가 호출되는데
//			클래스 내에 생성자가 없을 경우 기본 생성자 Public void 클래스명(){}이 자동으로 만들어진다.
//			필드값을 초기화할 때 사용하며, 매개변수 오버로딩 규칙(갯수,타입,순서)으로 여러 생성자를 선언할 수 있다.
//			생성자의 매개변수는 일반적으로 필드를 초기화하는 경우가 많아서 동일한 경우가 많다 이때 매개변수와 필드를
//			구분하기위해 this.필드명 = 매개변스명; 으로 this를 사용한다.
//		일반 메서드 : -[메서드]:웃다,먹다,말하다, -[동작]:웃다,먹다,말하다
//			객체의 동작을 표현하기 위해 사용된다.
//			데이터입력,데이터리턴처지, 조건문이나 반복문에 알고리즘처리등 여러가지 기능적인 처리를 하는 함수를 말한다.
//		  		1)리턴값 선언/리턴값 처리
//		  		2)입력값 처리
//		  		3)중괄호{}블럭을 통한 여러가지 비지니스 로직 처리
		
//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
////		1. 매개변수입력 + 프로세스X + 리턴값처리
//		int plus(int num01,int num02) {
//			System.out.println("합산 처리 메서드");
//			return num01+num02;
//		}
////		2. 매개변수입력 + 프로세스(저장/로직) + 리턴값X
//		void area2(int row) {
//			System.out.println("삼각형의 넓이는:"+row*row*Math.PI); //화면에 보이는 데이터 처리
//		}
////		3. 매개변수입력X + 프로세스 + 리턴처리
//		public int getRandomPoint() {
//			int pt=(int)(Math.random()*101);
//			return pt;
//		}
////		4. 매개변수입력 + 프로세스(저장/로직) + 리턴처리
//		public int getRandomPoint(int a) {
//			int pt=(int)(Math.random()*10+1);
//			if(pt==a)
//			return true;
//		}
		
//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
//		생성자 : 객체가 생성될 때 딱 한번 실행됨
//		클래스명(매개변수:들어오는 데이터){
//			this.필드값 = 들어오는 데이터 //필드값 초기화
//		}
//		메서드 : 여러 가지 기능으로 여러번 사용가능하고 여러가지 기능 수행 가능
//		메서드명(매개변수:들어오는 데이터){
//			로직을 통한 출력 또는 return
//		}
		
//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
//1) 3개에 입력값 중에 가장 큰수 출력
//		MethodsExp02 me02=new MethodsExp02();
//		me02.max();
		
//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
//		me02.isAgrade();
		
//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
//		me02.sale();
		
//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
//		World wd=new World();
//		if (wd.free()) {
//			System.out.println("무료");
//		}else {
//			System.out.println("유료");
//		}
		
//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
//		System.out.println("할인율은 "+wd.sale()+"% 입니다.");
		
//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//		if(wd.mem()) {
//			System.out.println("회원입니다.");
//		}else {
//			System.out.println("회원 아닙니다.");
//		}
		
//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//	버스번호 @@번 @@명이 탑승했습니다. 
//		Bus bus=new Bus(153);
//		bus.busInfo();
//		bus.setPeople(5);
//		bus.busInfo();
//		bus.setPeople(3);
//		bus.busInfo();
	}
}
class Tower{ //롯데타워를 만들기 위한 도면(설계서)
	String loc = "";
}
class MethodsExp02{
	void max() {
		Scanner sc = new Scanner(System.in);
		int[] args1=new int[3];
		int max=0;
		for (int i = 0; i < args1.length; i++) {
			System.out.print("숫자를 입력하세요:");
			args1[i]=Integer.parseInt(sc.nextLine());
			if(args1[i]>max) {
				max=args1[i];
			}
		}
		System.out.println("가장 큰 수: "+max);
	}
	void isAgrade() {
		System.out.print("점수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int pt = sc.nextInt();
		System.out.println("입력된 점수:"+pt);
		
		if (pt>=70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	void sale() {
		String[] sale= {"사과","딸기","바나나"};
		Scanner sc = new Scanner(System.in);
		System.out.print("사고 싶은 과일은?");
		String buy = sc.nextLine();
		for(String name:sale) {
			if(name.equals(buy)) {
				System.out.println("판매합니다.");
			    return;
			}
		}
		System.out.println("판매 안합니다.");
		
		
	}
}
 class World{
	 boolean free() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("나이를 입력하세요:");
		 int age=sc.nextInt();
		 return (5>age||age>=65);//5세미만 65이상
	 }
	 int sale() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("나이를 입력하세요:");
		 int age=sc.nextInt();
		 int disCount = 0;
		if(age>=60) {
			disCount=20;
		}else if (age>=50) {
			disCount=15;
		}else if (age>=40) {
			disCount=10;
		}else {
			disCount=0;
		}
		 return disCount;
	 }
	 boolean mem() {
		 Scanner sc = new Scanner(System.in);
		 String[] member= {"홍길동","김길동","신길동"};
		 System.out.print("등록 확인하고 싶은 회원은?");
		 String who = sc.nextLine();
			for(String name:member) {
				if(name.equals(who))
					return true;
			}
			return false;
	 }
	 
 }
		
 //버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
//탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//	버스번호 @@번 @@명이 탑승했습니다. 
 class Bus{
	 private int num;
	 private int people;
	 
	 public Bus(int num) {
		 this.num=num;
	 }
	public void setPeople(int people) {
		this.people += people;
	}
	
	public void busInfo() {
		System.out.println("버스번호 "+num+"번 "+people+"명이 탑승했습니다.");
	}
	 
 }
