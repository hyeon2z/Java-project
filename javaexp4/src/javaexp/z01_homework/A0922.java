package javaexp.z01_homework;

import java.util.Scanner;

public class A0922 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//		    - 이름, 나이, 키 
//		    - 좋아하는 음악명, 발매연도
//		    - 오늘 지출금액 목록과 비용, 합산
//		String name00 = "철수";
//		int age00 = 25;
//		int height00 = 175;
//		
//		System.out.println("이름 : " + name00);
//		System.out.println("나이 : " + name00);
//		System.out.println("키 : " + height00);
//		
//		String music00 = "Blue";
//		int year00 = 2012;
//		
//		System.out.println("좋아하는 음악 : " + music00);
//		System.out.println("발매연도 : " + year00);
//		
//		String product00 = "김밥";
//		int price00 = 2000;
//		String product01 = "커피";
//		int price01 = 4000;
//		int tot00 = price00 + price01;
//		
//		System.out.println("지출금액 목록");
//		System.out.println(product00 + "\t" + product01);
//		System.out.println(price00 + "\t" + price01);
//		System.out.println("총 지출금액 : " + tot00);
//		
//		
		    
//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
//		기본 출력형식에는 1. System.out.println();
//		           2. System.out.print();
//		           3. System.out.printf(); 가 있다.
//		1번은 출력 후 줄바꿈을 처리하는 명령어이고.
//		2번은 출력 후 줄바꿈을 처리하지 않는다.
//		3번은 변수를 미리 선언한 뒤 출력할 때 해당 변수이름과 데이터유형을 처리하면 된다.
//		    ex) System.out.printf("이름 : %s%n", name00);

//[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
//		1. 반드시 숫자가 아닌 문자로 시작
//			ex) int 123; (X)
//				int a01	 (O)
//		2. 공백을 포함하면 안된다.
//			ex) int a123 a; (X)
//				int a123a; (O)
//		3. 특수문자는 $와_만 선언이 가능하다.
//			ex) int !123; (X)
//				int $123; (O)
//		4. 대/소문자는 구분한다.
//			ex) int Box1;
//				int box1;
//		
//		5. 미리 지정되어있는 예약어를 변수로 사용할수없다.
//			ex) int break; (X)
//				int break01; (O)
//		6. 이미 선언되어있는 변수를 다시 선언시 에러발생한다.
//			ex) int app01 = 1;
//				int app01 = 2; (X)
		

//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
//		1) 정수형
//			- byte	 byte num04_1 = 12;
//			- short  short num04_2 = 2000;
//			- int	 int num04_3 = 100000;
//			- long   long num04_4 = 1000000000000000L;
//		2) 실수형
//			- double	double double04_1 = 3.14159701;
//			- float		float double04_2 = 2.1234F;
//		3) 문자형
//			- char		char char04 = 'A';
//		3) 논리형
//			- boolean	boolean bool04 = 45>12;
		
		
//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
//		기본유형
//			1. 작은 데이터 유형 -> 큰 데이터 유형 (promotion)
//				- 자동으로 타입이 변환된다
//					ex) short num05_1 = 245;
//						int num05_2 = num05_1; <- 자동으로 int형으로 형변환
//			2. 큰 데이터 유형 -> 작은 데이터 유형(casting)
//				- 데이터타입을 명시해야한다. 데이터가 옮기려는 유형보다 큰 경우에는 10진수로 변환한 데이터만 남게 된다.
//					ex) double num05_3 = 3.141597;
//						int num05_4 = (int)num05_3;
//			3. 문자열 데이터 -> 숫자형 변환
//				반드시 숫자로 된 문자열이어야 한다. "12"
//					정수형문자열 -> 정수형
//					ex) int num05_5 = Integer.parseInt("12");
//					실수형문자열 -> 실수형
//					ex) double num05_6 = Double.parseDouble("3.14");
		
//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
//		int num06_1 = 2100000000;
//		int num06_2 = 1500000000;
//		System.out.println((long)(num06_1) + (long)(num06_2));
		
		
//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
//		문자형은  2byte로 정수형 0~65535범위의 코드값을 유니코드값으로 연결하여 처리한 것을 말한다.
//		영문은 1byte로 표현할수있고, 한글이나 기타언어는 2byte범위로 표현가능하다.

//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
//		for(int i = 0; i < 128; i ++) {
//			System.out.println(i + " = " + (char)i);
//		}
		
//		for(int i = 48; i <= 122; i ++) { // 48~57 65~90 97~122
//			if(i == 58) i+=7;
//			if(i == 91) i+=6;
//			System.out.println(i + " = " + (char)i);
//		}
		
//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
//		int x = 5;
//		int y = 10;
//		int z = 0;
//		변수 x나 y들을 피연산자라고 하고, 이들을 연산할때 사용되는 표시나 기호를 연산자 라고 한다.
//		연산자와 피연산자들을 이용해서 입력한 연산의 과정를 연산식이라 한다.
//			ex) z = x + y;

//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
//		int x = 10;
//		int y = 20;
//		int z = 0;
		
//		z = x + y; // 덧셈 연산식
//		z = x - y; // 뺄셈 연산식
//		z = x * y; // 곱셈 연산식
//		z = x / y; // 나눗셈 연산식
//		z = x % y; // 나머지를 구하는 연산식
//
//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//        소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
//		int juice = 500;
//		System.out.println(juice / 3); // 소숫점 이하 처리 X
//		System.out.println((double)juice / 3); // 소숫점 이하 처리 O
//        
//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
//		int num12 = 0;
//		System.out.println(++num12); // 출력되기전에 변수에 1을 더하고 출력된다.
//		System.out.println(num12++); // 출력되고난 뒤 변수에 1을 더한다.
//
//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
//		int num13 = 5;
//		대입연산자의 종류 =, +=, -=, *=, /=, %=
//		대입연산자는 우변의 값을 좌변에 연산식에 따른 계산 후, 대입하는 연산자.
//		ex) num13 *= 4;
//				num13에 20이 저장된다.
		
//		증감연산자의 종류 ++ -- 1만큼 증가/감소 시키는 연산자.
//			ex) num13++
//					num13에 1이 더해져 6이됨.
//
//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//			김밥 1개 구매  2500 
//			김밥 2개 구매  5000
//			김밥 3개 구매  7500
//		int num14 = 1;
//		int kbPrice = 2500;
//		
//		System.out.println("김밥 " + num14 + "개 구매 " + kbPrice * num14);
//		System.out.println("김밥 " + ++num14 + "개 구매 " + kbPrice * num14);
//		System.out.println("김밥 " + ++num14 + "개 구매 " + kbPrice * num14);
//			
//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
//		== 은 stack 영역의 데이터를 비교하는 연산자이고
//		equals() 문자열을 비교할때 사용한다.
//
//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
//		1) java를 컴파일 과정을 거치면 @@@.class 파일이 생성된다.
//	 	 	ex) javac @@@.java
//	 	 		  ==> @@@.class
//	 	 	ex) java @@@ 은 main()가 있으면 실행이 된다.
//	 	 
//	 	2) 이 컴파일과정을 거친 @@@.class 는
//	 	 	java @@@로 실행된다.
		
//	 	3) 이 때, 
//	 	 	java @@@ 사과 바나나 딸기 형식으로 실행하면
//	 	 	String[]args 안에 args[0] : 배열명[index번호] 형태로 사용할 수 있게 된다.
		
//		이클립스에서는 run as -> run configurations -> argument에서 사과 바나나 딸기를 입력하면
//		위와같이 데이터 처리 가능
		
//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
//		System.out.println("물견명\t가격\t갯수");
//		System.out.println(args[0] + "\t" + args[1] + "\t" + args[2]);
//		System.out.println(args[3] + "\t" + args[4] + "\t" + args[5]);
//		System.out.println("총계 : " + ((Integer.parseInt(args[1])*Integer.parseInt(args[2]))
//				+ (Integer.parseInt(args[4])*Integer.parseInt(args[5]))));
//
		
//[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
//		Scanner 는 외부(콘솔)에 입력된 내용을 처리하는 java.util.* 패키지에 내장된 객체이다.
//		import java.util.* <- java.util 패키지 불러온 뒤
//		Scanner sc = new Scanner(System.in); <- Scanner 객체를 생성한다.
//												이때 System.in은 화면에 입력한 내용을 처리하는 내장객체.
//		String name18 = sc.nextLine(); <- Line자리에따라 입력받을 데이터타입을 다르게 할수있음.
//		
//[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.print("선수명 입력 : ");
//		String member19 = sc.nextLine();
//		System.out.print("안타수 입력 : ");
//		double anta19 = Double.parseDouble(sc.nextLine());
//		System.out.print("타석수 입력 : ");
//		double cnt19 = Double.parseDouble(sc.nextLine());
//		
//		System.out.println(member19 + "의 타율은 " + (anta19/cnt19));
//
//[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
//		비교를 통해 논리값 boolean을 저장하거나 출력하는 연산자.
//		>, <, >=, <=, ==, !=
//			ex) 25!=3 <- 같지 않을 때 true
//			    25>3 <- true
//		
//[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요
//		System.out.print("나이를 입력 하세요 : ");
//		int age21 = Integer.parseInt(sc.nextLine());
//		System.out.println("성인 여부 : " + (age21 >= 18));
//
//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
//		1. 논리합(or) : 비교연산식 2개 이상 처리 시 하나 이상 true이면 true 출력
//			ex) num < 5 || num > 70 -> 둘중하나이상 만족하면 true 출력
		
//		2. 논리곱(and) : 조건비교 연산식에서 모두 다 true면 true 그외 false
//			ex) num < 5 && num > 70 -> 둘 다 만족해야 true
		
//		3. 부정연산자(not) : 비교연산자가 true면 false, false면 true로 처리
//			ex) !(num < 5 && num > 70) -> (num >= 5 || num <= 70)
//
//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
//		for(초기값;반복조건;증/감연산자) {
//			반복해서 수행할 구문
//		}
		
//		1. 초기값은 반복구문에 사용할 변수의 최초값 설정에 사용. 최소 또는 최대값을 넣음. ex) int i = 1;
//		2. 반복조건은 for문을 반복할 조건 또는 한계치 지정 시 사용. ex) i <= 5 : 5까지 반복
//		3. 증/감연산자 i++, i--, i+=3, i-= 2
//		4. 반복해서 수행할 구문 : 반복할 내용 기술
		
//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//	  	1) 200~300 10단위 출력
//		for(int i = 200; i <= 300; i += 10) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
////		2) 1000~950 3단위 감소
//		for(int i = 1000; i >= 950; i -= 3) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
////		3) 100~0까지 2로 나눈값
//		for(int i = 100; i >= 0; i -= 1) {
//			System.out.print((double)i/2 + " ");
//		}
//		System.out.println();
//
//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
//		전역변수는 상대적인 개념으로 현재 블럭단위와 하위블럭에 따라 지역변수가 될 수도 있고 전역이 될수도 있다.
//		
		// num25 에다가 i의 수를 누적해서 더하고싶을때, for 안에 num25를 선언하면 아래와 같이 된다.
//		for(int i = 0; i <= 20; i += 1) {
//			int num25 = 0; <- 이런식으로 선언을 하면 for 안의 지역변수 취급이라 반복을 할때 계속 값이 0이되어 더해지 않는다.
//		}
//			for 문 위에 따로 int num25 = 0; 를 입력하여야 순차적으로 더해진 값이 저장된다.
		
//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요
//		int num26 = 0; // 1~10까지의 수를 합한 결과를 구하고 싶을 때
//		for(int i = 1; i <= 10; i ++) {
//			num26 += i;
//		}
//
//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//	                no 과일명  가격
//	                 1 사과    3000            
//	                 2 바나나   4000           
//	                 3 딸기    12000
//	                   총계    19000
		
//		String[] fruit = new String[3];
//		int[] price = new int[3];
//		
//		System.out.print("첫번째 과일 명 입력 : ");
//		fruit[0] = sc.nextLine();
//		System.out.print("입력한 과일의 가격 입력 : ");
//		price[0] = Integer.parseInt(sc.nextLine());
//		System.out.print("두번째 과일 명 입력 : ");
//		fruit[1] = sc.nextLine();
//		System.out.print("입력한 과일의 가격 입력 : ");
//		price[1] = Integer.parseInt(sc.nextLine());
//		System.out.print("세번째 과일 명 입력 : ");
//		fruit[2] = sc.nextLine();
//		System.out.print("입력한 과일의 가격 입력 : ");
//		price[2] = Integer.parseInt(sc.nextLine());
//		
//		int tot = 0;
//		
//		System.out.println("no\t과일명\t가격");
//		for(int i = 0; i <= 2; i ++) {
//			System.out.println(i+1 + "\t" + fruit[i] + "\t" + price[i]);
//			tot += price[i];
//			while(i==2) {
//				System.out.println("총 비용 : " + tot);
//				break;
//			}
//		}
		
//	                   
//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		            # 출력 형식
//		            날짜  갯수 누적
//		            1일차 2개  2개
//		            2일차 4개  6개
//		            3일차 6개 12개
//		int bread = 2;
//		int cnt1 = 0;
//		
//		System.out.println("#\t출력\t형식");
//		for(int i = 1; i <= 10; i ++) {
//			cnt1 += bread * i;
//			System.out.println(i + "일차\t" + bread*i + "개\t" + cnt1 + "개");			
//		}
//		            
//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
//		int sum = 0;
//		
//		for(int i = 0; i <= 100; i ++) {
//			if(i % 4 != 0) {
//				System.out.print(i + " ");
//				
//			}else {
//				System.out.println("# ");
//				sum += i;
//			}
//			while(i == 100) {
//				System.out.println("4의 배수의 합산 : " + sum);
//				break;
//			}
//			
//		}
		
		
//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
//		for(int i = 1; i <= 20; i ++) {
//			if(i % 3 == 0 && (i%10) % 3 == 0) {
//				System.out.println("짝");
//			}else if(i > 9 && (i%10) % 3 == 0 && i < 20){
//				System.out.println("짝");
//			}else {
//				System.out.println(i);
//			}
//		}
		
//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
//		for(int i = 0; i < 5; i ++) {
//			for(int e = 0; i < 10; i ++) {
//				~반복할 구문~		
//			}
//		}
//		위와같이 for을 이중으로 사용 할 경우 i가 0일때 e가 0~10까지 반복되고, 
//		이후 i가 1일때 e 0~10... 와 같은 방법으로 진행 된다.
		
//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
//		1) 2X2(행X열)로 ♥를 표시 
//		for(int i = 1; i <= 2; i ++) {
//			for(int e = 1; e <= 2; e ++) {
//				System.out.print("♥");
//			}
//			System.out.println();
//		}
		
		
//		2) 3X2(행X열)로 ★표시 
//		for(int i = 1; i <= 3; i ++) {
//			for(int e = 1; e <= 2; e ++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		
//		3) 입력한 행/열로 입력한 기호표시
//		System.out.print("몇행인지 숫자를 입력하세요 : ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.print("몇열인지 숫자를 입력하세요 : ");
//		int num2 = Integer.parseInt(sc.nextLine());
//		System.out.print("입력할 문자 : ");
//		String str1 = sc.nextLine();
//		
//		for(int i = 1; i <= num1; i ++) {
//			for(int e = 1; e <= num2; e ++) {
//				System.out.print(str1);
//			}
//			System.out.println();
//		}
		

//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
//		while(반복할 조건) { // 기본 형식
//			조건이 true 일 때, 처리할 내용
//		}
//		ex)
//			int i = 0;
//			while(i <= 5) {
//				i++; <-- 5가 될때까지 반복
//			}
		
//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
//		int i = 100;
//		int sum = 0;
//		
//		while(i >= 90) {
//			sum += i;
//			System.out.println(i--);
//		}
//		
//		System.out.println("합산결과 : " + sum);
		
//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		int score = 0;
//		int tot = 0;
//		int cnt = 0;
//		
//		while(score != -1) {
//			System.out.print("학생의 점수를 입력(종료시 -1) : ");
//			score = sc.nextInt();
//			tot += score;
//			cnt++;
//		}
//		System.out.println("학생의 총점 : " + tot);
//		System.out.println("학생의 평균 : " + tot/cnt);
		

//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
//		break : 반복문 중단
//		continue : 해당 단계에서 나머지 코드부분은 건너뛰고 다음 단계로 진행
//		ex)
//			for(int i = 0; i <= 10; i ++) {
//				if(i == 3)
//					continue;
//				if(i == 8)
//					break;
//				System.out.println(i);
//			} // 3은 건너뛰고, 8일때 중지
		
//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
//		자바의 주요 메모리에는 stack영역와 heap영역이 있는데,
//		heap 영역에 실제 객체의 메모리를 사용하고, stack 영역에서는 heap 영역에 저장한 데이터의
//		주소값을 저장해서 가지고 있다.

//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
//		int [] num = new int[4]; <- num 에 heap영역 주소값 할당
//							[index 번호] 는 데이터를 할당할 배열의 개수
//		num[0] = 1; <- index 0 에 1의값을 할당
//
//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
//		String [] str = {"사과", "바나나", "배"};
//		System.out.println(str[1]);
//		
//		int [] num = {1, 5, 9};
//		System.out.println(num[2]);

//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
//		String [] fruit = {"사과", "참외", "귤"};
//		for(int i = 0; i <= 2; i ++) {
//			System.out.println(fruit[i]);
//		}

//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//		int sum = 0;
//		int cnt = 0;
//		
//		int [] score = new int[3];
//		System.out.print("첫번째 점수 입력 : ");
//		score[0] = sc.nextInt();
//		System.out.print("두번째 점수 입력 : ");
//		score[1] = sc.nextInt();
//		System.out.print("세번째 점수 입력 : ");
//		score[2] = sc.nextInt();
//		
//		for(int i = 0; i <= 2; i ++) {
//			sum += score[i];
//			cnt++;
//		}
//		System.out.println("총계 : " + sum);
//		System.out.println("평균 : " + sum/cnt);

//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
//		클래스는 붕어빵 틀과 같다.
//		객체는 클래스라는 틀을 가지고 필드와 메소드를 추가해서 만든 붕어빵이라고 생각하면 된다.
//
//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
//		필드는 객체의 데이터가 저장되는곳이다. 필드는 선언하면 기본적으로 초기화까지 이루어진다.
//		필드는 변수라고 부르지 않으며 생성자와 메소드 전체에서 사용되고 객체가 없어지지 않는 한 객체와 함께 존재함
//
//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
//		생성자는 필드를 초기화 할 때 사용된다. 클래스에서 선언된 필드값에 데이터를 할당해서 초기값을 설정할 필요가 있을때 사용된다.
//		리턴타입이 없으며 클래스이름과 똑같아야 한다.
//		
//		메소드는 클래스에서 구성된 구성요소로 객체가 가지고 있는 기능적인 역할을 하는 함수
//		함수가 특정한 기능을 처리하고 결과를 리턴하는 기능이 있다면, 이것이 객체에 종속될 때 메소드라고 부른다.
//		메소드는 리턴값이 있다. (void 포함)
//		
//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
//		1. 매개변수입력 + 프로세스X + 리턴처리
//		2. 매개변수입력 + 프로세스(저장/로직처리) + 리턴값(X)
//		3. 매개변수입력X + 프로세스 + 리턴처리

//		ex) 1번 예제
//			class MethodsExp01 {
//				int plus(int num01, int num02) {
//					System.out.println("합산 처리 메서드");
//					return num01 + num02;
//				}
//			}
		
//			2번 예제 (리턴없이 없을 때는 void를 작성해야하고, 있을때는 값에 맞는 데이터타입을 적으면 된다.)
//			public static void power(int x, int y) {
//				System.out.println(x + y);
//			}
		
//			3번 예제
//			public int getRandomPoint() {
//				int pt = (int)(Math.random() * 101);
//				return pt;
//			}
			
//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
//		생성자는 클래스와 이름이 같은 특수 메서드이며 개체의 값을 기본 또는 사용자 정의 값으로 설정 할 수 있다.
//		메서드는 다른 별개의 이름을 가질수 있으며 생성자와 다르게 메서드는 직접 명시해서 호출한다는 점이 있다.
//		생성자는 객체를 초기화하는데 도움이 되고, 메서드는 객체의 기능을 나타낸다.
		
//		즉 생성자가 해당 클래스의 객체를 초기화하는 역할이라면
//		메소드는 클래스와 연관된 명령어 세트를 실행하는 역할이다.
		
		
		A0922 exp = new A0922();  
		Land land1 = new Land();
		Bus b01 = new Bus(7552);
		
//		System.out.println(exp.bigNum()); // 47-1
//		System.out.println(exp.isPass()); // 47-2
//		System.out.println(exp.product()); // 47-3
		
//		land1.setAge(4);
//		System.out.println(land1.getAge()); // 48-1
//		land1.setAge(20);
//		System.out.println("할인율 : " + (int)(land1.disCount() * 100) + "%"); // 48-2
		
//		land1.setMember("김철수");
//		land1.getMember();
//		land1.getMem();
		
		
//		b01.setPeople(5);
//		b01.setPeople(2);
//		b01.setPeople(1);
//		System.out.println("총 탑승자 수 : " + b01.getPeople());
//		b01.busInfo(); // 49 버스
		
		
	}
	
//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
//	1) 3개에 입력값 중에 가장 큰수 출력
//	int bigNum() {
//		System.out.print("첫번째 수 입력 : ");
//		int num01 = sc.nextInt();
//		System.out.print("두번째 수 입력 : ");
//		int num02 = sc.nextInt();
//		System.out.print("세번째 수 입력 : ");
//		int num03 = sc.nextInt();
//		if(num01 > num02 && num01 > num03) {
//			return num01;
//		}else if(num02 > num03) {
//			return num02;
//		}else {
//			return num03;
//		}	
//	}
	
//	2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
//	String isPass() {
//		System.out.print("점수 입력 : ");
//		int num01 = sc.nextInt();
//		return num01 >= 70? "합격":"불합격";
//	}
	
	
//	3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
//	String product() {
//		String [] prduct = {"사과", "딸기", "포도"};
//		String f1 = "사과는 2개 있습니다.";
//		String f2 = "딸기는 12개 있습니다.";
//		String f3 = "포도는 5개 있습니다.";
//		System.out.print("사과, 딸기, 포도 중 하나를 입력하세요 : ");
//		String str = sc.nextLine();
//		
//		if(str.equals(prduct[0])) {
//			return f1;
//		}else if(str.equals(prduct[1])) {
//			return f2;
//		}else {
//			return f3;
//		}
//	} 
	
	
}

//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
	

//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)


//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.


class Land {
	int age;
	String member;
	
	public Land() {
	}
	String a1 = "회원입니다";
	String a2 = "회원이 아닙니다";
	String [] mem = {"홍길동", "김철수", "박진혁"};
	String free = "무료입니다";
	String unfree = "유료입니다";
	double dis1 = 0.1;
	double dis2 = 0.15;
	double dis3 = 0.2;
	int ticket = 30000;
//	public String getAge() {
//		if(age<5 || age>=65) {
//			return free;
//		}else {
//			return unfree;
//		}
//	}
	
//	public double disCount() {
//		if(age<17) {
//			return dis2;
//		}else if(age>=17 && age<60) {
//			return dis1;
//		}else {
//			return dis3;
//		}
//	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMem() {
		if(member.equals(mem)) {
			return a1;
		}else {
			return a2;
		}
	
	}
	
	public String getMember() {
		return member;
	}
	
	public void setMember(String member) {
		this.member = member;
	}
	
}

//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
//버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
//	탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//	버스번호 @@번 @@명이 탑승했습니다. 
class Bus {
	int busNum;
	int people;
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	int sum = 0;
	public void busInfo() {
		System.out.println("버스번호 " + busNum + "번 " + sum + "명이 탑승했습니다.");
	}
	
	public int getPeople() {
		return sum;
	}
	
	public void setPeople(int people) {
		this.people = people;
		sum += people;
	}
	
}










