package javaexp.z02_homework.a17_okw;

import java.util.Scanner;

public class A0922_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//		  - 이름, 나이, 키 
//		  - 좋아하는 음악명, 발매연도
//		  - 오늘 지출금액 목록과 비용, 합산
		System.out.println("## 1번 ##");
		String myName = "오근우";
		int myAge = 17;
		int myHeight = 200;
		String favSong = "Everything Happens To Me";
		String favSongRelease = "Chat Baker, 1950년";
		String[] strArry = {"커피","점심","교통비"};
		int[] intArry = {1600,7000,5000};
		int sumDay = 0;
		System.out.println("이름 : "+myName+"\n나이 : "+myAge+"\n키 : "+myHeight+"cm");
		System.out.println("좋아하는 음악 : "+favSong+"("+favSongRelease+")");
		System.out.println("지출내역\t가격");
		for(int idx=0;idx<strArry.length;idx++) {
			System.out.print(strArry[idx]+"\t");
			System.out.print(intArry[idx]+"원\n");
			sumDay += intArry[idx];
		}System.out.println("오늘 지출 총합 : "+sumDay+"원");
//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		System.out.println("## 2번 ##");
		int age2 = 20;
		String name2 = "오근우";
		char grade2 = 'A';
		System.out.printf("번호:%d%n이름:%s\n등급:%c",age2, name2, grade2);
////[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
//		int age = 27;	//(O) 기본형
//		int Age = 37;	//(O) 대/소문자 다르게 쓰면 다른 변수임
//		Srting 2name = "인욱";	//(X) 변수명 숫자로 시작안됨
//		int $num01 = 1376061416;	// (O)변수명에 특수문자는 $,_만 포함 가능
//		int for = 30; 	//(X) 지정된 예약어 사용 불가능
//		int num = 3;	// (O)
//		int num = 5;	// (X)	이전에 선언된 변수명 사용 불가
//		num =4;		// 다시 할당하는것은 괜찮음
//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		// 정수형
		System.out.println("## 4번 ##");
		byte byt1 = 127;
		short sht1 = -200;
		int int1 = 2000000000;
		long lng = 123456789101112L;
		// 실수형
		float flt =  3.141592f;
		double dub = 3.141592;
		//문자형
		char cha = 'a';
		String str = "안녕하세요";
		// 논리형
		boolean isBool = false;
		System.out.println(byt1); System.out.println(sht1); System.out.println(int1);
		System.out.println(lng); System.out.println(flt);	System.out.println(dub);
		System.out.println(cha); System.out.println(str);
//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
		System.out.println("## 5번 ##");
		byte num01 = 10;
		int num02 = num01; 	// 묵시적 형변환(자동 형변환)
		int num03 = (int)3.141592;	//명시적 형변환 (강제 형변환)
//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
		System.out.println("## 6번 ##");
		int num04 = 2100000000;
		int num05 = 1500000000;
		long num06 = (long)num04 + num05;
		System.out.println(num03);
//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
		/*
		char 유형은 문자를 나타내는 데이터 유형이다.  char은 자바에서 유니코드(2byte 문자체계)를 사용한다.
		저장할 수 있는 값의 범위는 0~2^16-1 이며 이는 약 65,000 까지를 의미한다.
		각 문자는 아스키코드로 0~127까지의 숫자로 표현될수 있다.
		예를 들면 'A'는 ASCII코드 값 65에 해당한다.
		'a'는 ASCII코드 값 97에 해당함으로써 숫자로 32 값 차이가 난다.
		이러한 특성을 이용해 char 변수로 출력한 대문자를 소문자로 변경한다면 다음과 같다.
		 */
		System.out.println("## 7번 ##");
		char character = 'A'+(char)32;
		System.out.println(character);
//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		// 알파벳의 범위 : 대문자 => 65~90,		소문자 => 97~122,		숫자 => 48~57
		System.out.println("## 8번 ##");
		for(int i=65;i<=90;i++) {
			System.out.println(i+" : "+(char)i);
		}
		for(int i=97;i<=122;i++) {
			System.out.println(i+" : "+(char)i);
		}
		for(int i=48;i<=57;i++) {
			System.out.println(i+" : "+(char)i);
		}
//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		System.out.println("## 9번 ##");
		int num9_1 = 2;
		int num9_2 = 4;	// 피연산자
		// +, -, * ...  ==> 연산자
		System.out.println(num9_1 + "X"+ num9_2 + "=" + (num9_1*num9_2));	// 연산식 출력
//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
		// 산술연산자의 종류 
		// +, -, *, /, %, <<, >>   ==> 사칙연산과 나머지연산
		// 사칙연산은 쉬우니 나머지 연산에 대한 예시는
		System.out.println("## 10번 ##");
		System.out.println("10%3(10을 3으로 나눈 나머지)"+ "=" +10%3);
//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//        소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		System.out.println("## 11번 ##");
		int juice = 500;
		int intCup = 500/3;
		double dubCup = (double)500/3;
		System.out.println("소숫점 이하 처리: " + intCup);
		System.out.println("소숫점 이하 처리X: " + dubCup);
//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		System.out.println("## 12번 ##");
		int num12_1 = 0;
		int num12_2 = 0;
		System.out.println("num12_1 : " + num12_1);		// 더하고 출력
		System.out.println("++num12_1 : " + ++num12_1);
		System.out.println("++num12_1 : " + ++num12_1);
		System.out.println("++num12_1 : " + ++num12_1);
		System.out.println("num12_2 : " + num12_2);		// 출력하고 더함
		System.out.println("num12_2++ : " + num12_2++);
		System.out.println("num12_2++ : " + num12_2++);
		System.out.println("num12_2++ : " + num12_2++);
//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
		int num13 = 0;
		num13 += 1;	// num13 = num13 + 1
		num13 *= 2;// num13 = num13 * 2
		num13 /= 2; // num13 = num13/2
		num13 -= 1; // num13 = num13-1
//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//			김밥 1개 구매  2500 
//			김밥 2개 구매  5000
//			김밥 3개 구매  7500
		System.out.println("## 14번 ##");
		int gimbob = 3;
		int price = 2500;
		for(int i = 1; i<=gimbob; i++) {
			System.out.println("김밥 "+ i + "개 구매 " + i*price);
		}
//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
//		 == 는 대소비교 연산자와는 달리 모든 자료형(기본형,참조형)에 사용할 수 있다. 두 값이 같으면 true, 아니면 false 이다.
//		 단, 문자열을 비교할 땐 equals()를 사용해야 한다. 예를 들면
		System.out.println("## 15번 ##");
		 String str1 = "abc";
		 String str2 = new String("abc"); // 비교를 위해 새로운 문자열 객체 생성
		 System.out.println(str1 == "abc"); // 출력
//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
		 // java가 컴파일 과정을 거치면 @@@.class가 생성된다. java @@@는 main()가 있으면 실행된다.
		 // 이 때, java@@@ 고양이 강아지 토끼  형식으로 실행하면
		 // String[]args 안에  {"고양이", "강아지", "토끼"}로 할당되어
		 // args[0] ==> 배열명[index번호] 로 사용할 수 있게 됨. 
		 // eclipse의 실행옵션에 있는 argument를 이용하면 위의 할당된 {"고양이", "강아지", "토끼"}을 출력할 수 있다.
//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
		 System.out.println("## 17번 ##");
		 int itemSum = 0;
		 for(int i =0; i < args.length; i +=3) {
			 String itemName = args[i];
			 int itemPrice = Integer.parseInt(args[i+1]);
			 int itemQ = Integer.parseInt(args[i+2]);
			 int total = itemPrice*itemQ;
			 itemSum += total;
			 System.out.println(itemName+"\t"+itemPrice+"원\t"+itemQ+"개");
		 }	
		 System.out.println("전체 총계 : "+ itemSum+"원");
//		````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
////[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
////	 Scanner sc = new Scanner(System.in);	// 내장된 Scanner 객체 생성
////	 String hello = sc.nextLine();			// 입력한 데이터를 hello라는 String 변수에 할당.
////[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
//		 System.out.println("## 19번 ##");
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("선수명을 입력 : ");
//		 String player = sc.nextLine();
//		 System.out.print("타석수를 입력 : ");
//		 int pa = Integer.parseInt(sc.nextLine());
//		 System.out.print("안타 횟수를 입력 : ");
//		 double hit = Double.parseDouble(sc.nextLine());
//		 System.out.println("타율은 "+hit/pa);
////[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
//		 // 비교연산자의 종류 : > < >= <= == !=
//		 // x < 3   
//		 // x <= 3
//		 //if(x %3 !=0) => x가 3의 배수가 아니라면 (3으로 나눈 나머지가 0이 아니다)
////[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
//		 System.out.println("## 21번 ##");
//		 Scanner sc2 = new Scanner(System.in);
//		 System.out.print("나이를 입력하세요 : ");
//		 int age = Integer.parseInt(sc2.nextLine());
//		 if(age>=18) {
//			 System.out.println("성인입니다.");
//		 }else System.out.println("성인이 아닙니다.");
//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
		 // 논리연산자의 종류 : && || ! & | ^ ~ 
		 System.out.println("## 22번 ##");
		 int num22 = 3;
		 int num22_1 = 11;
		 int num22_2 = 11;
		 if(num22>0 && num22<10) System.out.println("&&은 and의 의미.");
		 if(num22_1>0 || num22_1 >10) System.out.println("||은 or의 의미");
		 if(!(num22_2>0 && num22_2<10)) System.out.println("!는 부정연산자로, !뒤의 식의 역을 출력");
//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
//		 for(int i=1 ; i<=3 ;i++) { // for(초기값;범위;연산(주로 n씩증가))
//			 System.out.println("*");	// *을 i번 출력할 때 까지 반복.
//		 }
//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//	              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
		 System.out.println("## 23번 ##");
		 System.out.print("1) ");
		 for(int i=200; i<=300; i+=10) {
			 System.out.print(i + " ");
		 }
		 System.out.print("\n2) ");
		 for(int i = 1000; i >=950; i-=3) {
			 System.out.print(i + " ");
		 }
		 System.out.print("\n3) ");
		 for(int i = 100; i >= 0; i--) System.out.print(i/2 + " ");
//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
		 // 전역변수 : {} 위에 선언하여 누적된 데이터를 처리할 수 있다. 전역변수는 상대적인 개념으로,
		 // 			현재 블럭단위와 하위의 블럭에 따라서 지역변수가 될 수도 있다.
		 // int num25_1 = 3;	==> 전역변수
		 // for(){
		 //		int num25_2 = 25; ==> 지역변수
		 //	}
//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요           
		 System.out.println("## 26번 ##");
		 int sum26 = 0;	// 전역변수
		 for(int i=1; i <= 3;i++) {
			 sum26 += i;
			 System.out.print(i+" + ");
		 }
		 System.out.println("합산값 : " + sum26);
//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//	                no 과일명  가격
//	                 1 사과    3000            
//	                 2 바나나   4000           
//	                 3 딸기    12000
//	                   총계    19000      
//		 System.out.println("## 27번 ##");
//		 Scanner sc3 = new Scanner(System.in);
//		 int total27 = 0;
//		 String fruit = "no\t과일명\t가격\n";
//		 for (int i=1; i<=3;i++){
//			 System.out.print(i+"번째 과일 입력 : ");
//			 String fruitName = sc3.nextLine();
//			 System.out.print("과일의 가격 입력 : ");
//			 int fruitPrice = Integer.parseInt(sc3.nextLine());
//			 fruit += i + "\t" + fruitName + "\t" + fruitPrice + "\n";
//			 total27 += fruitPrice;
//		 }
//		 System.out.print(fruit);
//		 System.out.print("\t총계\t" + total27);
				 
				 
//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		            # 출력 형식
//		            날짜  갯수 누적
//		            1일차 2개  2개
//		            2일차 4개  6개
//		            3일차 6개 12개
		 System.out.println("## 28번 ##");
		 int totalBread = 0;
		 System.out.println("날짜\t갯수\t누적");
		 for(int i=1; i<=10; i++) {
			 totalBread += i*2;
			 System.out.println(i + "일차\t"+ i*2 + "개\t" + totalBread + "개");
		 }
//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		 System.out.println("## 29번 ##");
		 int fourTot = 0;
		 for(int i=1; i <= 100; i++) {
			 if(i%4==0) {
				 fourTot += i;
				 System.out.print("# ");
			 }else {
				 System.out.print(i + " ");
			 }
		 }
		 System.out.println("\n4의배수의 총합 : "+fourTot);
//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		 System.out.println("## 30번 ##");
		 for (int i = 1; i <= 20; i++) {
			 if(i%10!=0 && i%10%3 == 0) {
				 System.out.print("짝! ");
			 }else {
				 System.out.print(i + " ");
			 }
		 }
		 System.out.println();
//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
		 System.out.println("## 31번 ##");
		 for(int grade = 2; grade <= 9; grade++) {
			 for(int i = 1; i <= 9; i ++) {
				 System.out.printf("%d X %d = %d%n", grade, i, grade*i);
			 }
			 System.out.println();
		 }
////[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
////	1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
//		 System.out.println("## 32번 ##");
//		 for(int i = 0; i < 2; i++) {
//			 for(int j =0; j < 2; j++) {
//				 System.out.print("♥");
//			 }
//			 System.out.println();
//		 }
//		 System.out.println();
//		 for(int i = 0; i < 3; i++) {
//			 for(int j=0;j<2;j++) {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
//		 System.out.println();
//		 Scanner sc4 = new Scanner(System.in);
//		 System.out.print("행을 입력 : ");
//		 int row = Integer.parseInt(sc4.nextLine());
//		 System.out.print("열을 입력 : ");
//		 int col = Integer.parseInt(sc4.nextLine());
//		 System.out.print("기호를 입력 : ");
//		 String symbol = sc4.nextLine();
//		 for (int i = 0; i < row; i++) {
//			 for (int j = 0; j < col; j++) {
//				 System.out.print(symbol);
//			 }
//			 System.out.println();
//		 }
//		 System.out.println();
//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
		 // 조건식이 true인 동안 반복한다. while(true)를 적으면 무한반복이 된다.
		 System.out.println("## 33번 ##");
		 int i33 = 6;
		 while (i33-- != 0) {
			 System.out.println(i33 + "초 후 발사");
		 }
//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
		 System.out.println("## 34번 ##");
		 int i34 = 100;
		 int total34 = 0;
		 while(i34>=90) {
			 total34 += i34;
			 System.out.print(i34-- + " ");
		 }
		 System.out.println("총합 : "+ total34);
////[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
//		 System.out.println("## 35번 ##");
//		 Scanner sc5 = new Scanner(System.in);
//		 int stuNo = 0;
//		 int stuTot = 0 ;
//		 while(true){
//			 System.out.print(++stuNo + "번째 학생의 점수 입력(종료시-1) : ");
//			 int stuPt = Integer.parseInt(sc5.nextLine());
//			 if(stuPt==-1) {
//				 --stuNo;
//				 break;
//			 }else {
//				 stuTot +=stuPt;
//			 }
//		 }
//		 System.out.println(stuNo + "명의 학생의 점수");
//		 System.out.println("총점 : " + stuTot);
//		 System.out.println("평균 : " + stuTot/stuNo);
//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
		 System.out.println("## 36번 ##");
		 int grade = (int)(Math.random()*8+2);
		 for(int i = 1; i <=9; i++) {
			 if(i==4) continue;	// 4일 때 나머지 코드는 건너뛰고 다음으로 넘어간다.
			 if(i==8) break;	// 8이 되면 반복 중지.
			 System.out.println(grade + " X "+ i + " = " + grade*i);
		 }
//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
		 // 1) heap 영역
		 //		인스턴스를 생성할 때 사용되는 메모리 영역이다.
		 //		참조형 데이터 객체의 실제 데이터가 저장되는 공간이다. (String, 배열(array), enum, class, interface), Object... 
		 //		Stack 영역에서 실제 데이터가 존재하는 heap영역의 참조값을 가지고 있다.
		 //		new키워드로 인스턴스를 생성할 때, heap 영역에는 생성된 객체가 저장, Stack 영역에서 생성된 객체에 대한 주소 값이 저장된다.
		 //		ex) String name = "keunwoo";	// "keunwoo"는 heap 영역에 저장, name부분은 Stack영역에 저장. 
		 //			(name은 주소를 갖고 있으며 ==> heap영역의 "keunwoo"를 가르킨다.
		 //	2) stack 영역
		 // 	기본 자료형, 지역변수, 매개변수가 저장되는 메모리.(int, double, boolean, byte)
		 //		메서드 내부의 기본자료형에 해당하는 변수 적재. heap 영역에 생성된 데이터의 참조값이 할당됨.
		 // 	메서드가 호출될 때 메모리에 할당, 메서드 종료시 메모리에서 삭제됨.
		 //		자료구조 Stack의 구조이다. 후입선출., 
//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
		 // ** 배열명[index번호] = 데이터;
		 // 	index번호 : 0부터 시작하는 index번호에 실제 사용할 데이터를 할당.
		 //		ex) int[] arry = new int[3];
		 //		arry[0] = 5;
		 //		arry[1] = 10;
		 //		arry[2] = 15;
		 //		arry : 배열의 heap영역 주소값 할당.
		 //		arry[0] = 5; 각 구성요소에 실제 데이터 할당.
//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
		 // 배열의 선언 + 초기값 할당 처리
		 System.out.println("## 39번 ##");
		 double[] dubArry = {1.1, 2.12, 3.123};	// 이처럼 선언과 동시에 초기 값을 할당할 수 있다.
		 String[] striArry = {"강아지", "토끼", "고양이"};
		 System.out.println(dubArry[0]);
		 System.out.println(dubArry[1]);
		 System.out.println(dubArry[2]);
		 System.out.println(striArry[1]);
//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
		 System.out.println("## 40번 ##");
		 String[] mNames = {"김봉석","이희수","이강훈"};
		 int[] mAge = {18, 22, 31};
		 System.out.println("번호\t회원명\t나이");
		 for(int idx=0; idx < mNames.length; idx++) {
			 System.out.print(idx+1 + "\t");
			 System.out.print(mNames[idx] + "\t");
			 System.out.print(mAge[idx] + "\n");
		 }
////[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
//		 System.out.println("## 41번 ##");
//		 Scanner sc6 = new Scanner(System.in);
//		 int[] scores = new int[3];
//		 int totalScore = 0;
//		 for(int i=0; i <scores.length;i++) {
//			 System.out.println(i+1 + "번째 점수를 입력하세요..");
//			 scores[i] =Integer.parseInt(sc6.nextLine());
//			 totalScore += scores[i];
//		 }
//		 double avgScore = (double) totalScore / scores.length;
//		 System.out.println("총계 : "+totalScore+ ", 평균 :" + avgScore);
//		 System.out.println();
//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		 // 클래스 ==> 객체		ex) class Tower ==> Tower t1 = new Tower();
		 // 클래스에서 객체를 생성하기 위한 필드와 메소드가 정의.
		 // 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스 라고 한다.
		 //	instance : heap영역의 주소를 참조해서 변수를 만들었기 때문에 참조변수 라고 한다.
		 //		ex) 하나의 클래스를 기준으로 여러 개의 객체가 여러 개의 참조변수로 생성 가능
		 //			Person p01 = new Person();
		 //			Person p02 = new Person();
		 //			Person p03 = new Person();
		 //		p01, p02, p03 등 다른 주소로 객체가 생성됨.
		 // 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있다. 마치 하나의 도면으로 여러 지역에 같은 건물을 건축할 수 있듯이.
//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
		 // 1. 필드란? : 객체의 데이터가 저장되는 곳.
		 // 2. 필드의 종류
		 //		1) 객체의 고유 데이터 선언
		 //		2) 객체가 가져야 할 부품 객체..		1:1, 1:다객체 
		 //		3) 객체의 현재 상태 데이터
		 //	3. 필드의 접근 제어자
		 //		필드는 일반적으로 private로 접근 제어자를 선언하여 외부에서 직접적으로 접근할 수 없게한다.
		 //		간접적인 접근을 할 수 있다. (특정한 기능 메서드를 통해..)
		 //	4. 필드의 사용
		 //		1) 객체 생성 후,
		 //			ex) Person p01 = new Person();
		 //		2) 참조변수. 필드명 형태 (접근제어자가 호출가능한 범위로 선 인식)
		 //			ex) p01.name = "홍길동";
		 //				System.out.println(p01.name);
		 //		3) 하나의 객체 안에는 여러가지 형태의 필드를 선언할 수 있다. (ex)이름, 나이, 사는곳 등 여러 유형으로 선언..)
		 //		4) 이 필드는 클래스의 관점에서 보면 전역변수로, 해당 클래스 내에서
		 //			다른 구성요소(생성자, 메서드)에서는 접근해서 할당할 수 있다.
		 //		5) 생성자나 메서드의 매개변수나 지역변수가 동일한 명으로 선언되어 있을 때는 this.필드명으로 구분하여 사용.
		 //		맨 밑 43번 클래스 참조
//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		 //	생성자와 메서드는 해당하는 이름과 함께 매개변수로 선언하여 식별한다.
		 // 매개변수는 특정한 객체에 데이터를 입력할 때, 사용되는 형태이다.
		 // 생성자는 클래스가 new 표현식에 의해 인스턴스화 되어 객체를 생성할 때 객체의 레퍼런스를 생성하기 전에
		 // 객체의 초기화를 위해 사용되는 코드의 블록이다.
		 // 따라서, 생성자는 자바 클래스의 멤버가 아니므로 상속되지 않는다. 또한 일반적인 메소드 호출방법으로 호출할 수 없다.
//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
		 /*  
		 1. 메서드의 기본 형식
		 		접근제어자 리턴유형 메서드명(매개변수1, 매개변수2...){
		 			프로세스 처리
		 			return 리턴할데이터;
		 		}
		 2. 메서드의 여러가지 형태	==> 맨아래 클래스로..
		 	1) 매개변수입력  + 프로세스X + 리턴처리
		 	2) 매개변수입력	 + 프로세스  + 리턴값X
		 	3) 매개변수입력X + 프로세스	 + 리턴처리
		 */
		 System.out.println("## 45번 ##");
		 MethodsExp01 me01 = new MethodsExp01();
		 int plusTot = me01.plus(10,20);
		 System.out.println("1) "+plusTot );
		 MethodsExp02 me02 = new MethodsExp02();
		 System.out.println("2)");	// 출력문 내부에 me02.getMultiple(3)을 못넣는 이유 : 반환값 없는 void 유형이기 때문에
		 me02.getMultiple(3);
		 System.out.println("3) 임의의 점수(1~100) : "+me02.getRandom());
		 System.out.println();
////[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
//		 // 생성자는 클래스와 동일한 이름을 가지면서 return 타입이 없는 메서드로 볼 수 있다. 일반적으로 생성자의 목적은
//		 // 객체의 멤버 변수를 초기화 하는 것이다.
//		 // 생성자로 데이터를 사용할 때는 new 키워드를 사용하여 객체를 생성하면 자동으로 생성자가 호출 된다.
//		 ConstructorExp01 my01 = new ConstructorExp01("오근우", 30);	// 생성자의 호출
//		 System.out.println(my01.myName +"("+ my01.myAge + ")");
//		 ConstructorExp01 my02 = new ConstructorExp01("김이박",25);
//		 System.out.println(my02.myName +"("+ my02.myAge + ")");
//		 my02.setMyName("오박사");	// 메서드를 사용한 데이터 변경 
//		 my02.setMyAge(27);
//		 System.out.println(my02.myName +"("+ my02.myAge + ")");
////[1단계:확인] 47. 메서드(입력+로직) 선언 예제
////1) 3개에 입력값 중에 가장 큰수 출력
//		 System.out.println("## 47번 ##");
//		 MethodsExp03 me03 = new MethodsExp03();
//		 System.out.println("가장 큰 수는 : " +me03.whatMax(50,60,70));
////2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
//		 me03.isPassFail(80);
////3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
//		 String[] products = {"사과", "바나나", "딸기"};
//		 Scanner sc7 = new Scanner(System.in);
//		 System.out.print("판매 여부 확인할 과일명을 입력 : ");
//		 me03.findItem(sc7.nextLine(), products);
////[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
////1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
//		 System.out.println("## 48번 ##");
//		 AmusementPark ap01 = new AmusementPark();
//		 Scanner sc8 = new Scanner(System.in);
//		 System.out.print("나이를 입력하세요 : ");
//		 int age = Integer.parseInt(sc8.nextLine());
//		 boolean isFree = ap01.isFreeEnt(age);
//		 if(isFree) {
//			 System.out.println("무료입장");
//		 }else {
//			 System.out.println("유료입장");
//		 }
////2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
//		 AmusementPark ap02 = new AmusementPark();
//		 int entAge = 30;
//		 double entPrice = 30000;
//		 double discountPrice = ap02.discountRate(entAge,entPrice);
//		 System.out.println("기존 입장료 : "+ entPrice);
//		 System.out.println("할인된 입장료 : "+ discountPrice);
////3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//		 Members member01 = new Members();
//		 String memberName = "이강훈";
//		 boolean isRegist = member01.isMemberRegist(memberName);
//		 if(isRegist) {
//			 System.out.println(memberName + "님은 회원으로 등록되어 있습니다.");
//		 }else {
//			 System.out.println(memberName + "님은 회원이 아닙니다.");
//		 }
//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
// 탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//	버스번호 @@번 @@명이 탑승했습니다. 
		 Bus bus01 = new Bus("3300");
		 int totalPassengers = bus01.totalPassenger(37);
		 System.out.println("현재 버스 탑승자 수 : "+totalPassengers);
		 String boardMessage = bus01.boardPassenger(6);
		 System.out.println(boardMessage);
		 int busTotal = bus01.getPassengerCnt();
		 System.out.println("현재 버스 탑승자 수 : "+ busTotal);
		
		
	}

}
// 49번 클래스
class Bus{
	private String busNumber;
	private int passengerCnt;
	public Bus(String busNumber) {
		this.busNumber = busNumber;
		this.passengerCnt = 0;
	}
	public int totalPassenger(int passengerCnt) {
		this.passengerCnt +=passengerCnt;
		return this.passengerCnt;
	}
	public String boardPassenger(int passengerCnt) {
		totalPassenger(passengerCnt); 
		return busNumber+"번 버스에 " + passengerCnt + "명이 탑승 했습니다.";
	}
	public int getPassengerCnt() {
		return passengerCnt;
	}
}
// 48번 클래스
class AmusementPark{
	public boolean isFreeEnt(int age) {
		return (age <5 || age >= 65);
	}
	public double discountRate(int age, double entPrice) {
		double discount = 0;
		if(age>=5 && age<18) {
			discount = 0.15;
		}else if(age>=18 && age<65) {
			discount = 0.1;
		}else {
			discount = 0.2;
		}
		return entPrice - (entPrice*discount);
	}
}
class Members{
	private String[] registMembers = {"김봉석","이희수","이강훈"};
	
	public boolean isMemberRegist(String memberName) {
		for (int i=0; i<registMembers.length;i++) {
			if(registMembers[i].equals(memberName)) {
				return true;
			}
		}
		return false;
	}
}
// 47번 클래스
class MethodsExp03 {
	public int whatMax(int num1, int num2, int num3) {
		int max = num1;
		
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		return max;
	}
	public void isPassFail(int score) {
		if (score>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
	public void findItem(String itemName, String[] items) {
		boolean isFind = false;
		for (int i=0; i <items.length; i++) {
			if(items[i].equals(itemName)) {
				System.out.println(itemName + "은(는) 판매하는 물건입니다.");
				isFind = true;
				break;
			}
		}
		if (!isFind) {
			System.out.println(itemName + "은(는) 판매하지 않습니다.");
		
		}
	}	
}

// 46번 클래스
class ConstructorExp01{
	String myName;
	int myAge;
	public ConstructorExp01(String myName, int myAge) {
		this.myName = myName;
		this.myAge = myAge;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
}
// 45번 클래스
//	1) 매개변수입력  + 프로세스X + 리턴처리
class MethodsExp01{
	public int plus(int num45_1,int num45_2) {
		System.out.println("합산처리 메서드");
		return num45_1 + num45_2 ;
	}
}
//	2) 매개변수입력	 + 프로세스  + 리턴값X
class MethodsExp02{
	public void getMultiple(int grade) {
		System.out.println("<<"+ grade + "단>>");
		for(int cnt=1; cnt<=9;cnt++) {
			System.out.println(grade + " X "+ cnt + " = " + (grade*cnt));
		}
	}
//	3) 매개변수입력X + 프로세스	 + 리턴처리 
	public int getRandom() {
		int pt = (int)(Math.random()*100+1);
		return pt;
	}
}
// 43번 클래스
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void call() {
		String name = "안녕";		// 메서드 지역변수.
		// 지역변수를 전역변수에 할당.
		// this : 지역변수와 전역변수 구분을 위해 사용.
		this.name = name;
	}
	
}