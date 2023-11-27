package javaexp.z02_homework.a10_kdh.a01_0922;

import java.util.Scanner;

public class A02_0922 {

//	[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//	  - 이름, 나이, 키 
//	  - 좋아하는 음악명, 발매연도
//	  - 오늘 지출금액 목록과 비용, 합산
	public static void main(String[] args) {
		//1.
		String name = "홍길동";
		int age = 25;
		int height = 180;
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("키:" + height);
		String favoriteMusic = "아리랑";
		String year = "2023";
		System.out.println("좋아하는 음악명:" + favoriteMusic);
		System.out.println("발매 연도:" + year);
		int[] todayAmount = {8000,3000,4000};
		String[] todayAmonntList = {"밥","커피","교통비"};
		int total=0;
		for(int i = 0 ; i < todayAmonntList.length ; i++) {
			System.out.println("오늘 지출 목록" + (i+1)+":" + todayAmonntList[i] +"  "+ todayAmount[i]+"원");
			total+=todayAmount[i];
		}
		System.out.println("합산:"+total+"원");
		
		//2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		System.out.printf("%d %s %f",2,"Hi",3.14);
		//정수형은 %d 문자열은 %s 실수형은 %f
		
		//3. 변수명의 선언 규칙을 예제를 통하여 기술하세요
		//camel notation으로 변수명은 소문자로 시작하며 단어가 바뀔때 첫글자를 대문자로 선언.
		String studentName = "마길동";
//		int 3total; // 변수명은 숫자로 시작할 수 없음
//		int #total; // 변수명을 선언할때 특수문자는 $랑_만 사용가능
		
		//4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		byte val0 = 3;
		short val1 = 5;
		int val2 = 10;
		long val3 = 10000L;
		float val4 = 2.5f;
		double val5 = 10.5;
		char val6 = 'a';
		boolean val7 = true;
		System.out.println(val0);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		
//		5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
		int num1 = 3;
		double num2 = num1;  //묵시적 형변환
		double num3 = 3.5;
		int num4 = (int)num3;  //명시적 형변환
		
//		6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
		int no1 = 2100000000;
		int no2 = 1500000000;
		long sum1 = (long)no1 + (long)no2;
		System.out.println(sum1);
		
//		7. char유형과 code값의 관계에 대하여 기술하세요.
		//char는 기본형 타입에서 문자 타입으로 분리되었지만, 사실상 2 바이트의 정수이다.
		//아스키코드 값으로 맵핑되어 표현가능
		
//		8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		//48~57 숫자
		//65~90 대문자
		//97~122 소문자
		for(int i = 48 ; i <= 57; i++) {
			System.out.println(i+":"+(char)i);
		}
		for(int i = 65 ; i <= 90; i++) {
			System.out.println(i+":"+(char)i);
		}
		for(int i = 97 ; i <= 122; i++) {
			System.out.println(i+":"+(char)i);
		}
		//9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		int num9_1 = 2; //피연산자
		int num9_2 = 5; //피연산자
		//+-*/ : 연산자
		System.out.println(num9_1 + num9_2); //연산식
		
//		10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
//		+ : 덧셈 연산
//		- : 뺄셈 연산
//		* : 곱셈 연산
//		/ : 나눗셈 연산
//		% : 나머지 연산
		
//		11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//			소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		int juice = 500;
		int result1 = juice/3;
		double result2 = (double)juice/3;
		System.out.println("소수점 이하 처리:" + result1);
		System.out.println("소수점 이하 처리x:" + result2);
		
//		12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		int no = 0;
		System.out.println(--no);  //먼저 감소 후 출력
		System.out.println("no:" + no);
		System.out.println(no--); //출력 후 감소
		System.out.println("no:" + no);
		System.out.println(++no); //먼저 증가 후 출력
		System.out.println("no:" + no);
		System.out.println(no++); //증가 후 출력
		System.out.println("no:" + no);
		
		//13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
		int result3 = 0;
		result3 += 4;	//result3 = result3 + 4 와 같은 의미
		result3 -= 2;	//result3 = result3 - 4 와 같은 의미
		result3 *= 2;	//result3 = result3 * 4 와 같은 의미
		result3 /= 2;	//result3 = result3 / 4 와 같은 의미
		result3 %= 2;	//result3 = result3 % 4 와 같은 의미
		
//		14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//		김밥 1개 구매  2500 
//		김밥 2개 구매  5000
//		김밥 3개 구매  7500
		int n = 3;
		int price = 2500;
		for(int i = 1; i <= n ; i++) {
			System.out.println("김밥 "+ i + "개 구매  " + i*price );
		}
//		15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
//		==연산은 참조값을 비교하기 때문에 문자열이 같아도 참조값이 다르면 false를 반환
//		equals는 실제 값을 비교하기 때문에 문자열이 같으면 true 반환
		
//		16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
//		메인 메서드 안에 String 타입의 문자열들을 args[]라는 배열에 넣어 처리하겠다.
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
//		18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
//		Scanner scanner = new Scanner(System.in); //Scanner 선언
//		int a = scanner.nextInt();	//정수형 입력
//		String b = scanner.nextLine(); // 문자열 입력
//		double c = scanner.nextDouble(); //실수형 입력
		
//		19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 
//		해당 타자의 타율을 출력하세요.
		
//		20. 비교연산자의 종류를 예시와 함께 기술하세요.
		//==, !=, >=, >, <=, <
		int a1 = 5;
		int b1 = 10;
		System.out.println(a1==b1);
		System.out.println(a1!=b1);
		System.out.println(a1>=b1);
		System.out.println(a1>b1);
		System.out.println(a1<=b1);
		System.out.println(a1<b1);
		
//		21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int inAge = scanner.nextInt();
		if(inAge >= 18) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년입니다.");
		}
		scanner.nextLine();
		
//		22. 논리연산자의 종류를 예제와 함께 기술하세요.
//		&& || ^ ! 이 있고 피연산자로는 boolean 타입만 사용 가능
		int num5 = 1;
		int num6 = 7;
		System.out.println(num5 >= num6 || num5 <= num6);
		// ||은 피연산자 중 하나라도 true이면 true
		// &&은 피연산자 둘 다 true이면 true
		// ^은 피연산자 둘이 다를때  true
		// !은 피연산자가 true이면 false이고 피연산자가 false이면 true이다.(반대)
		
//		23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
		for(int cnt = 0 ; cnt <= 10 ; cnt++) {
			
		}
		//for(초기화 ; 조건식 ; 증감식)의 구조이다.
		
//		24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//		            1) 200~300 10단위 출력, 
		for (int cnt = 200; cnt <= 300; cnt += 10) {
			System.out.println(cnt);
		}
//		2) 1000~950 3단위 감소
		for (int cnt = 1000; cnt >= 950; cnt -= 3) {
			System.out.println(cnt);
		}
//		3)100~0까지 2로 나눈값
		for (int cnt = 100; cnt >= 0; cnt--) {
			System.out.println(cnt/2);
		}
//		25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
		int sum25 = 0;
		for (int cnt = 1; cnt <= 10; cnt ++) {
//			int total += cnt; //지역변수이다. for문이 실행될때마다 초기화가 됨
			sum25+=cnt;
			
		}
//		26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요
		int sum26 = 0;
		for (int cnt = 1; cnt <= 10; cnt ++) {
			sum26+=cnt;
			
		}
		System.out.println(sum26);
		// 전역변수 sum26을 선언하고 for문안에서 sum26에 cnt값이 변할때 마다 더해줘서
		// for문이 끝나고 합산이 되도 초기화 되지않고 남아있음
		
//		27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//        no 과일명  가격
//        1 사과    3000            
//        2 바나나   4000           
//        3 딸기    12000
//          총계    19000   
		Scanner scanner2 = new Scanner(System.in);
		String result = "no\t과일명\t가격\n";
		
		for(int i = 0 ; i < 3 ; i++) {
			result+=(i+1)+"\t";
			System.out.print("과일명을 입력하세요:");
			String fruit = scanner2.nextLine();
			result += fruit + "\t";
			System.out.print("과일 가격을 입력하세요:");
			int price22 = Integer.parseInt(scanner.nextLine());
			result += price22+"\n";
		}
		System.out.println(result);
		
//		28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//			            # 출력 형식
//			            날짜  갯수 누적
//			            1일차 2개  2개
//			            2일차 4개  6개
//			            3일차 6개 12개
		System.out.println("날짜  갯수 누적");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int today = i * 2;
			sum += today;
			System.out.println(i + "일차 " + today + "개  " + sum + "개");
		}

//		29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		int fourSum = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 4 == 0) {
				System.out.print("# ");
				fourSum+=i;
			}else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("4의배수 합계:" + fourSum);
		System.out.println();
//		30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		for(int i = 1 ; i <= 20 ; i++) {
			int a = i / 10;
			int b = i % 10;
			int cnt = 0;
			
			if(a == 3 || a == 6 || a == 9) {
				cnt++;
			}
			if (b == 3 || b == 6 || b == 9) {
				cnt++;
			}
			
			if(cnt == 2) {
				System.out.print("짝짝 ");
			}else if (cnt == 1) {
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//		31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
		for(int row = 2 ; row < 10 ; row++) {
			for(int col = 2 ; col < 10 ;col++) {
				System.out.println(row + " X " + col + " = " + row * col );
			}
		}
		//겉의 for문과 내부 for문으로 이루어지면
		//내부 for문이 끝나면 겉의 for문이 증감식에 의해서 진행되고 겉의 for문이 끝나면 종료.
//		32. 아래 내용을 2중 for문을 활용하여

		// 2x2 ♥
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
              System.out.print("♥ ");
          }
          System.out.println();
      }
      System.out.println();

//      // 3x2 ★
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 2; j++) {
              System.out.print("★ ");
          }
          System.out.println();
      }
      System.out.println();

//      // 사용자 입력 행/열/기호
		Scanner sc = new Scanner(System.in);
		System.out.println("행, 열, 기호를 입력하세요:");
		System.out.print("행을 입력:");
		int row = Integer.parseInt(sc.nextLine());
		System.out.print("열을 입력:");
		int col = Integer.parseInt(sc.nextLine());
		System.out.print("기호를 입력:");
		String symbol = sc.nextLine();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
		System.out.println();

//		33. while문의 기본 형식을 예제를 통해 설명하세요.
		int num33 = 10;
		while(num33>0) {
			System.out.println(num33);
			num33--;
		}
//		while문 안에 반복될 내용과 조건식을 적어 조건이 만족하는 이상 계속 반복
//		34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
		int num34 = 100;
		int sum34 = 0;
		while(num34>=90) {
			System.out.println(num34);
			sum34+=num34;
			num34--;
			
		}
		System.out.println("합산 결과:" + sum);
		
		
//		35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
		Scanner scanner3 = new Scanner(System.in);
		int sum35 = 0;
		double avg = 0;
		int cnt = 0;
		while(true) {
			System.out.print("점수를 입력하세요(종료시 -1):");
			int input = scanner3.nextInt();
			if(input != -1) {
				sum35 += input;
				cnt++;
			}else {
				break;
			}
		}
		avg = (double)sum35 / cnt;
		System.out.println("총점:" + sum35);
		System.out.println("평균:" + avg);
		
		// 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
		// break는 반복문을 중단하고 continue는 특정 조건에서의 반복을 건너띠고 계속 실행한다.
		for(int i = 0 ; i <= 10 ; i++) {
			if(i%2 == 0) {
				continue;
			}else if(i==8){
				break;
			}else {
				System.out.print(i + " ");
			}
		}
		// 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
		Student st1 = new Student(); 
		st1.name = "홍길동";
		st1.age = 25;
		//st1이라는 참조변수는 stack메모리에 생성이 되고
		//st1 인스턴스의 값인 "홍길동" 과 25라는 데이터는 heap영역에 생성이됨.
		// 38. 배열의 구성요소를 예제를 통해서 기술하세요
		int[] num38 = new int[30];
		num38[0] = 1;
		num38[1] = 2;
		num38[2] = 3;
		//배열의 요소들은 index로 접근하며 index는 0부터 시작이다.
		
		// 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
		int[] num39 = new int[30];
		num38[0] = 1;
		num38[1] = 2;
		num38[2] = 3;
		//선언할때 크기를 정해주고 할당을 할때는 index값을 명시해서 할당한다.
		
		// 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
		String[] str = {"사과","바나나","딸기"};
		for(String item : str) {
			System.out.println(item);
		}
		// 순차적으로 모든 요소들을 처리할때 foreach문을 사용하면 된다.
		
		// 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		int[] score41 = new int[3];
		int sum41 = 0;
		for(int i = 0 ; i < score41.length ; i++) {
			System.out.print("점수를 입력하세요:");
			score41[i] = sc.nextInt();
			sum41 += score41[i];
		}
		System.out.println();
		System.out.println("총점:" + sum41);
		System.out.println("평균:" + (double)sum41/score41.length);
		// 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		// 클래스는 객체를 만들기 위해 필드와 메서드를 통해 작성한 설계도 같은것이고 
		// 이 클래스를 통해서 세우는 건물1, 건물2, 건물3이 객체이다. 하나의 클래스로부터 여러개의 객체생성 가능
		
		// 43. 필드의 특성을 예제를 통해 기술하세요
		// 멤버변수는 접근 제어자(public, default, protected, private)로 접근을 제어할 수 있다.
		
		// 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		// 생성자는 객체를 생성하거나 객체를 생성할때 필드를 초기화하고 메서드는 이런 필드를 이용해서 기능을 구현한것이다.
		
		// 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
		// public void show(){
		// 		System.out.println();
		// }
		//	메서드는 반환타입을 적어 리턴타입을 정해주고 매개변수를 사용할 수 도 안할 수 도있다. 또한 반환타입이나 매개변수의 개수,순서
		//	등으로 같은 이름의 메서드를 여러개 생성할 수있고 이것을 오버로딩이라고 한다.
		
		// 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
		//		생성자 필드를 초기화하고 메서드는 이 필드들을 이용한다.
		
		// 47. 메서드(입력+로직) 선언 예제
		//1) 3개에 입력값 중에 가장 큰수 출력
		Exam48 ex48 = new Exam48();
		System.out.println(ex48.maxCalc(10, 20, 30));
		//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
		
		//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
		
		// 48. 메서드(입력+로직+리턴) 선언  예제
		//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
		//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
		//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
		
		// 49. 클래스(필드,생성자,메서드) 선언  예제
		//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
		//탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
		//버스번호 @@번 @@명이 탑승했습니다. 
		Bus bus =  new Bus(100);
		bus.Take(10);
		bus.Take(20);
		System.out.println(bus.passanger);


	}
}
class Student{
	String name;
	int age;
}

class Bus{
	int busNumber;
	int passanger;
	
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	public int Take(int passanger) {
		this.passanger += passanger;
		return passanger;
	}
}

class Exam48{
	
	public int maxCalc(int a, int b, int c) {
		return (a > b) && (b > c) ? a : (b > c) ? b : c;
	}
}
	

 



