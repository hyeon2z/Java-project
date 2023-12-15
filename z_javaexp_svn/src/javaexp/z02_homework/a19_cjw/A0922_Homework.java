package javaexp.z02_homework.a19_cjw;

import java.util.Scanner;

public class A0922_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
		  - 이름, 나이, 키 
		  - 좋아하는 음악명, 발매연도
		  - 오늘 지출금액 목록과 비용, 합산
		 * */
		System.out.println("# 문제 1 #");
		String name1 = "홍길동";
		int age1 = 25;
		int height = 170;
		System.out.println("이름: "+name1+"\t나이: "+age1+"\t키: "+height);
		String title = "음악이름";
		String outdate = "2023.09.22";
		System.out.println("좋아하는 음악명: "+title+"\t발매연도: "+outdate);
		String paylist1 = "교통비";
		String paylist2 = "식비";
		String paylist3 = "커피값";
		int fee1 = 5000;
		int fee2 = 13000;
		int fee3 = 6500;
		int sum = fee1+fee2+fee3;
		System.out.println("\t오늘 지출금액");
		System.out.println("1\t"+paylist1+"\t"+fee1);
		System.out.println("2\t"+paylist2+"\t"+fee2);
		System.out.println("3\t"+paylist3+"\t"+fee3);
		System.out.println("\t\t합산: "+sum);
		System.out.println();
		
//		[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		String name2 = "홍길동";
		int age2 = 25;
		double dbl = 235.1234;
		System.out.println("# 문제 2 #");
		System.out.println("출력+줄바꿈");		// System.out.println();은 괄호 안의 내용을 출력하고 줄을 바꾼다.
		System.out.print("출력+줄바꿈X");		// System.out.print();는 괄호 안의 내용을 출력하기만 한다.
		System.out.print("\t간격조정\n");		// \t는 탭, \n은 줄바꿈을 의미한다.(""안에 써야한다.)
												// System.out.printf();는 format 형식을 이용하여 출력한다. %n은 줄바꿈
		System.out.printf("이름: %s%n",name2);	// %s : 문자열 데이터 처리
		System.out.printf("나이: %d%n",age2);		// %d : 정수형 데이터 처리
		System.out.printf("실수: %f%n",dbl);		// %f : 실수형 데이터 처리
		System.out.printf("실수2: %2.3f%n",dbl); // %소숫점이상자릿수.소숫점이하자릿수f : 실수형 데이터 출력 자리수 지정
		System.out.println();
		
//		[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
		System.out.println("# 문제 3 #");
		int num1;
//		int 1num;(X)	변수명은 문자로 시작
//		int num 1;(X)	공백을 포함하면 안된다.
		int Num1;		// 대소문자를 구분한다
		int num_1;
		int num1$;
//		int num!;
//		int num@;		특수문자는 $와 _만 사용 가능하다.
//		int for;		미리 지정된 예약어는 변수명으로 사용 불가
//		int num1;		재선언 불가
		int allAdd;		// 변수는 되도록 소문자로 선언하고 합성어는 _나 대문자로 구분한다.
		System.out.println();
		
//		[1단계:개념] 4. 기본 데이터 유형을 나열하고
//						해당 데이터를 할당하여 출력하는 예제를 만드세요
		System.out.println("# 문제 4 #");
		System.out.println("정수형");
		byte byte1 = 2;
		short little = 30;
		int num = 230490;				// 정수형의 default값
		long big = 1024982309489023L;	// default값이 아니기에 L이라는 접미어를 붙어야한다.
		System.out.print(byte1+"\t");
		System.out.print(little+"\t");
		System.out.print(num+"\t");
		System.out.println(big+"\t");
		System.out.println("실수형");
		float flo = 234.453f;		// default값이 아니기에 f라는 접미어를 붙인다.
		double db = 123.47547;		// 실수형의 default값
		System.out.print(flo+"\t");
		System.out.println(db);
		System.out.println("문자형");
		char ch = 'a';		// 문자 하나를 저장할 수 있다. 문자에 대응하는 유니코드값(정수형)으로 저장된다.
		System.out.println(ch);
		System.out.println("문자열");
		String str = "letter";	// 문자의 배열. 저장형태가 다른 기본 데이터 유형과 다르다
		System.out.println(str);
		System.out.println("논리형");
		boolean isResult = true;	// true/false 값을 저장한다.
		System.out.println(isResult);
		System.out.println();
		
//		[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
		System.out.println("# 문제 5 #");
		int num5 = 4;
		double dble = num5;		// 자동 형변환 : 범위가 작은 데이터유형에서 큰 데이터유형으로 형변환할 때
		System.out.println(num5+" -> "+dble);
		double dble1 = 5.8;
		int num05 = (int) dble1;	// 캐스팅(강제 형변환) : 범위가 큰 데이터유형에서 작은 데이터유형으로 형변환할 때(데이터 일부가 잘린다.)
		System.out.println(dble1+" -> "+num05);
		System.out.println();

//		[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고,
//						합산결과를 변수를 선언하여 할당 출력하세요
		System.out.println("# 문제 6 #");
		int num6 = 2100000000;
		int num06 = 1500000000;
		long num6L = num6;		// int형은 대략 21억까지만 할당할 수 있기 때문에 합산 전에 형변환을 했다.
		long sum6 = num6L + num06;
		System.out.println(sum6);
		System.out.println();

//		[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
		System.out.println("# 문제 7 #");
		// char유형은 정수형에서 파생된 것이기 때문에 각 문자에 대응하는 유니코드값이 있다.
		System.out.println("char 문자에 대응하는 유니코드값(일부)");
		for(int cnt=48;cnt<=122;cnt++) {
			char let = (char) cnt;
			System.out.println(cnt+" : "+let);
		}
		System.out.println();

//		[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		System.out.println("# 문제 8 #");
		System.out.println("A~Z 코드값");
		for(int cnt=65;cnt<=90;cnt++) {
			char let = (char) cnt;
			System.out.print(cnt+":"+let+"\t");
		}
		System.out.println();
		System.out.println("a~z 코드값");
		for(int cnt=48;cnt<=57;cnt++) {
			char let = (char) cnt;
			System.out.print(cnt+":"+let+"\t");
		}
		System.out.println();
		System.out.println("0~9 코드값");
		for(int cnt=97;cnt<=122;cnt++) {
			char let = (char) cnt;
			System.out.print(cnt+":"+let+"\t");
		}
		System.out.println("\n");

//		[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		System.out.println("# 문제 9 #");
		// 연산자: 연산하는 기호,		피연산자: 연산자의 연산대상,	연산식: 연산자와 피연산자를 조합한 것
		System.out.println("10 + 5 = "+(10+5));
		// 10,5	=> 피연산자,		+ => 연산자,			10 + 5 => 연산식
		System.out.println();

//		[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
		System.out.println("# 문제 10 #");
		System.out.println("산술 연산자: +,-,*,/,%");
		System.out.println("더하기: 10 '+' 5 = "+(10+5));
		System.out.println("빼기: 10 '-' 5 = "+(10-5));
		System.out.println("곱하기: 10 '*' 5 = "+(10*5));
		System.out.println("나누기: 10 '/' 5 = "+(10/5));
		System.out.println("나머지: 10 '%' 5 = "+(10%5));
		System.out.println();
		
		/*
		[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다.
						소숫점 이하가 처리된 경우와 소숫점 이하가 처리되지 않는 경우를
						나누어 코딩하세요
		 * */
		System.out.println("# 문제 11 #");
		System.out.print("소숫점 이하 X\t");
		System.out.println("500cc / 3 = "+(500/3));
		System.out.print("소숫점 이하 O\t");
		System.out.println("500cc / 3 = "+((double)500/3));
		System.out.println();
		
//		[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		System.out.println("# 문제 12 #");
		int num12 = 1;
		System.out.println(num12++);
		System.out.println(num12++);
		System.out.println(num12++);	// num12 출력 => num12 = num12 + 1
		System.out.println(++num12);
		System.out.println(++num12);
		System.out.println(++num12);	// num12 = num12 + 1 => num12 출력
		System.out.println();
		

//		[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
		System.out.println("# 문제 13 #");
		int num13 = 2;
		System.out.println(num13+=2);		// 1씩 증감할 것이 아니면 (변수)(산술연산자)=(증감시킬수)로 사용한다.
		System.out.println(num13+=2);		// +=, -=, *=, /=, %= 모두 가능
		System.out.println(num13-=2);
		System.out.println(num13-=2);
		System.out.println(num13*=2);
		System.out.println(num13*=2);
		System.out.println(num13/=2);
		System.out.println(num13/=2);
		System.out.println(num13%=2);
		System.out.println();
		
		/*
		[2단계:코드] 14. 구매하는 김밥의 갯수를 선언하고,
						1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
							김밥 1개 구매  2500 
							김밥 2개 구매  5000
							김밥 3개 구매  7500
		 * */
		System.out.println("# 문제 14 #");
		int buy = 0;
		System.out.println("김밥 "+(++buy)+"개 구매\t"+(2500*buy));
		System.out.println("김밥 "+(++buy)+"개 구매\t"+(2500*buy));
		System.out.println("김밥 "+(++buy)+"개 구매\t"+(2500*buy));
		System.out.println();

//		[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
		System.out.println("# 문제 15 #");
		boolean same;
		String str15 = "same";
		String str015 = new String("same");
		same = str15==str015;
		System.out.print("== 사용: "+same+"\t");		// ==는  heap영역의 데이터가 아닌 stack영역의 주소값을 비교한다.(데이터가 같아도 주소가 다르면 false)
		same = str15=="different";
		System.out.println(same);
		same = str15.equals(str015);
		System.out.print("equals() 사용: "+same+"\t");	// equals()는 stack영역의 주소를 추적하여 heap영역의 데이터를 비교한다.
		same = str15.equals("different");
		System.out.println(same);
		System.out.println();

//		[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
		System.out.println("# 문제 16 #");
		System.out.println(args[0]);		// 우클릭 -> runas -> run configuration -> arguments -> program argument에 값 입력
		System.out.println(args[1]);		// 배열 값으로 데이터의 구분은 띄어쓰기로 한다.
		System.out.println(args[2]);
		System.out.println();
		
//		[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아
//						계산서(전체 총계포함)를 출력하세요.
		System.out.println("# 문제 17 #");
		System.out.println(args[0]+"\t"+args[1]+"\t"+args[2]);
		System.out.println(args[3]+"\t"+args[4]+"\t"+args[5]);
		int num17 = Integer.parseInt(args[1]);
		int price17 = Integer.parseInt(args[2]);
		int num017 = Integer.parseInt(args[4]);
		int price017 = Integer.parseInt(args[5]);
		System.out.println("\t총계: "+(num17*price17+num017*price017));
		System.out.println();

//		[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
		System.out.println("# 문제 18 #");
		Scanner sc= new Scanner(System.in);	//스캐너 사용 선언(system.in -> 입력, sc 변수에 저장, sc.nextLine() -> 입력창 뜨는 부분)
		String scan = sc.nextLine();	
		System.out.println(scan);
		System.out.println();

//		[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고
//						선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		System.out.println("# 문제 19 #");
//		Scanner sc= new Scanner(System.in);		위에서 한번 사용했기 때문에 또 사용하지 않는다(sc 대신 다른 변수명을 입력하면 사용할 수 있긴 함)
		System.out.println("타율계산방법: 안타수/타석수");
		System.out.print("선수명: ");
		String plname = sc.nextLine();
		System.out.print("타석수: ");
		int ball = Integer.parseInt(sc.nextLine());
		System.out.print("안타수: ");
		int hit = Integer.parseInt(sc.nextLine());
		System.out.println(plname+"의 타율: "+((double)hit/ball));
		System.out.println();

//		[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.

//		[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
		System.out.println("# 문제 21 #");
		System.out.print("나이: ");
		int age21 = Integer.parseInt(sc.nextLine());
		if(age21>=18) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다");
		}
		System.out.println();

//		[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.

//		[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
		
		/*
		[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
			            1) 200~300 10단위 출력
			            2) 1000~950 3단위 감소
			            3) 100~0까지 2로 나눈값
		 * */
		System.out.println("# 문제 24 #");
		System.out.println("1) 200~300 10단위 출력");
		for(int cnt=200;cnt<=300;cnt+=10) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
		System.out.println("2) 1000~950 3단위 감소");
		for(int cnt=1000;cnt>=950;cnt-=3) {
			System.out.print(cnt+"\t");
		}
		System.out.println();
		System.out.println("3) 100~0까지 2로 나눈값");
		for(int cnt=100;cnt>=0;cnt--) {
			System.out.print(cnt/2+"\t");
		}
		System.out.println();
		System.out.println();
		
//		[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요

//		[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요              

		/*
		[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아
						아래 형식으로 출력하되 총비용을 출력 하세요
			                no 과일명  가격
			                 1 사과    3000            
			                 2 바나나   4000           
			                 3 딸기    12000
			                   총계    19000            
		 * */
		System.out.println("# 문제 27 #");
		String fruit;
		int price27;
		String all = "no\t과일명\t가격\n";
		for(int cnt=1;cnt<=3;cnt++) {
			System.out.print("과일이름: ");
			fruit = sc.nextLine();
			System.out.print("과일가격: ");
			price27 = Integer.parseInt(sc.nextLine());
			all+=cnt+"\t"+fruit+"\t"+price27+"\n";
		}
		System.out.println(all);
		System.out.println();

		/*
		[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어
						(첫째날 2개, 둘째날 4개, 셋째날 6개 ...)
						총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
				            # 출력 형식
				            날짜  갯수 누적
				            1일차 2개  2개
				            2일차 4개  6개
				            3일차 6개 12개
		 * */
		System.out.println("# 문제 28 #");
		String all28 = "날짜\t갯수\t누적\n";
		int num28;
		int sum28=0;
		for(int cnt=1;cnt<=10;cnt++) {
			num28 = cnt*2;
			sum28+=num28;
			all28+=cnt+"일차\t"+num28+"개\t"+sum28+"개\n";
		}
		System.out.println(all28);
		System.out.println();
		
//		[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,
//						그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		System.out.println("# 문제 29 #");
		int sum29 = 0;
		for(int cnt=1;cnt<=100;cnt++) {
			if(cnt%4==0) {
				System.out.print("#");
				sum29+=cnt;
			}else {
				System.out.print(cnt);
			}
			System.out.print("\t");
		}
		System.out.println("\n"+sum29);
		System.out.println();

//		[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)
//						마지막에 3이 포함될 때 처리
		System.out.println("# 문제 30 #");
		for(int cnt=1;cnt<=20;cnt++) {
			if((cnt%10)%3==0 && cnt%10!=0) {
				System.out.print("짝!");
			}else {
				System.out.print(cnt);
			}
			System.out.print("\t");
		}
		System.out.println("\n");

//		[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.

		/*
		[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
						1) 2X2(행X열)로 ♥를 표시
						2) 3X2(행X열)로 ★표시
						3) 입력한 행/열로 입력한 기호표시
		 * */
		System.out.println("# 문제 32 #");
		System.out.println("1) 2X2(행X열)로 ♥를 표시");
		for(int cnt=1;cnt<=2;cnt++) {
			for(int col=1;col<=2;col++) {
				System.out.print("♥ ");
			}
			System.out.println();
		}
		System.out.println("2) 3X2(행X열)로 ★표시");
		for(int cnt=1;cnt<=3;cnt++) {
			for(int col=1;col<=2;col++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		System.out.println("3) 입력한 행/열로 입력한 기호표시");
		System.out.print("행: ");
		int colm = Integer.parseInt(sc.nextLine());
		System.out.print("열: ");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("기호: ");
		String symbol = sc.nextLine();
		for(int cnt=1;cnt<=row;cnt++) {
			for(int col=1;col<=colm;col++) {
				System.out.print(symbol+" ");
			}
			System.out.println();
		}
		System.out.println();

//		[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.

//		[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.

//		[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되,
//						등록을 종료시 -1를 입력해서 처리하세요.
		System.out.println("# 문제 35 #");
		int sum35 = 0;
		int num35 = 0;
		int grade;
		while(true) {
			System.out.print("점수 등록: ");
			grade = Integer.parseInt(sc.nextLine());
			if(grade==-1) {
				break;
			}
			sum35+=grade;
			num35++;
		}
		System.out.println("총점: "+sum35);
		System.out.println("평균: "+sum35/num35);
		System.out.println();

//		[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요

//		[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.

//		[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요

//		[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을
//						여러가지 데이터 유형에 따라 구분하여 출력하세요.

//		[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다.
//						배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.

//		[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서
//						데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		System.out.println("# 문제 41 #");
		int[] arg = new int[3];
		for(int i=0;i<arg.length;i++) {
			System.out.print("점수 입력: ");
			arg[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("총계: "+(arg[0]+arg[1]+arg[2]));
		System.out.println("평균: "+(arg[0]+arg[1]+arg[2])/3);
		System.out.println();

//		[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요

//		[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요

//		[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요

//		[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고
//						간단한 예제로 구현하세요

//		[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때,
//						어떤 차이점이 있는지 예제로 기술하세요.

		/*
		[1단계:확인] 47. 메서드(입력+로직) 선언 예제
						1) 3개에 입력값 중에 가장 큰수 출력
						2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
						3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고,
							입력으로 물건명으로 파는 물건 여부를 출력 표시.
		 * */
		System.out.println("# 문제 47 #");
		System.out.println("1) 3개에 입력값 중에 가장 큰수 출력");
		System.out.print("숫자1 입력: ");
		int num471 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자2 입력: ");
		int num472 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자3 입력: ");
		int num473 = Integer.parseInt(sc.nextLine());
		System.out.println("가장 큰 수 출력: "+(num471>=num472?(num471>=num473?num471:num473):(num472>=num473?num472:num473)));
		System.out.println("2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력");
		System.out.print("점수: ");
		int point = Integer.parseInt(sc.nextLine());
		if(point>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.");
//		String[] goods = {"가방",	"신발","재킷"};
//		System.out.print("구매할 물건: ");
//		String input = sc.nextLine();
//		switch(input) {
//		case goods[0]:
//		case goods[1]:
//		case goods[2]:
//			System.out.println(input+" 판매중");
//			break;
//		default:
//			System.out.println(input+" 없음");
//		}
		//문자열 배열 확인
		
		/*
		[1단계:확인] 48. 메서드(입력+로직+리턴) 선언 예제
						1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서
							리턴 메서드(5세미만 65이상 무료)
						2) 놀이공원 클래스에서 나이에 따라
							입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
						3) 배열로 등록된 회원 선언하고,
							입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
		 * */

		/*
		[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언 예제
						1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언,
							탑승자인원수 누적메서드 리턴 현재 총탑승자수
							탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
							버스번호 @@번 @@명이 탑승했습니다. 
		 * */
		
		
	}

}
