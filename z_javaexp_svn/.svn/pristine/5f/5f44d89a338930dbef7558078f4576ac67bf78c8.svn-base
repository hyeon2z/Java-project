package javaexp.z02_homework.a14_cms;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Scanner;

public class A0922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		[1단계:코드] 1. 변수명과 타입을 적절하게 선언하여 아래와 같이 선언하고 출력하세요
//		  - 이름, 나이, 키 
//		  - 좋아하는 음악명, 발매연도
//		  - 오늘 지출금액 목록과 비용, 합산
		int age=25;
		double height = 168.7;
		String music = "거미줄";
		String puDate = "2022년 2월";
		int sum = 0;
		ArrayList<Integer> moneyList = new ArrayList<Integer>();
		moneyList.add(12000);
		moneyList.add(22000);
		moneyList.add(500);
		moneyList.add(7000);
		System.out.println(age);
		System.out.println(height);
		System.out.println(music);
		System.out.println(puDate);
		for(int i = 0; i<moneyList.size();i++) {
			sum+=moneyList.get(i);
		}
		System.out.println("지출 합계는 :" + sum);
		
		
		
//[1단계:개념] 2. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		System.out.println("행전환");
		System.out.print("행전환 x");
		System.out.println("\t 한 탭 간격두기");
		System.out.println("\n 행변환 간격두기");
		System.out.printf("%d, %s, %f", 5, "안녕하세요.", 3.14);
		
//[1단계:개념] 3. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
		System.out.println("숫자로 시작하는 변수는 안된다. ex) int 1int(x)");
		System.out.println("특수문자는 '$'와 '_'만 가능하다. ex) int @int(x)");
		System.out.println("변수명에는 공백이 들어가서는 안된다.");
		System.out.println("자바에서는 대소문자를 구분한다. ex) int no과 int NO은 서로 다른 변수이다.");
//[1단계:개념] 4. 기본 데이터 유형을 나열하고, 해당 데이터를 할당하여 출력하는 예제를 만드세요
		byte byte01 = 1;
		short short01 = 2;
		int num01 = 100; //정수형
		long long01 = 211111111111111L;
		double dbl01 = 3.141592;
		float ft01 = 3.1234f;
		char ch01 = 'A';
		String str = "안녕하세요";
//[1단계:개념] 5. 형변환이란 무엇인가 예제를 통해서 기술하세요.
		System.out.println("형변환이란 서로 다른 타입의 데이터를 변환해주는 것이다.");
		//명시적 형변환
		int a = 8;
		byte b01 = (byte)a;
		byte b02 = 2;
		int num03 = b02; //자동형변환
		
//[1단계:코드] 6. 21억, 15억 데이터를 int에 할당하고, 합산결과를 변수를 선언하여 할당 출력하세요
		int billion = 210000000;
		int five = 150000000;
		int sum01 = billion + five;
		System.out.println(sum01);
//[1단계:개념] 7. char유형과 code값의 관계에 대하여 기술하세요.
		/*
		 char은 문자 하나를 나타내는 데이터 유형이다.
		 char는 각각 하나의 code값을 가지고 있다.
		 * */
		char ch02 = 'A';
		System.out.println("char 유형 A의 code:" + (int)ch02);
//[1단계:코드] 8. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의 코드값 범위를 확인하고 출력하세요.
		for(int i=0;i<=128;i++) {
			System.out.print(i+"번째 : "+(char)i+"\t");
			if(i%10==0) System.out.println();
		}
		for(int i=48; i<=57;i++) {
			System.out.print((char)i + "\t");
		}
//[1단계:개념] 9. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
		int num02 = 5;
		int num04 = 18;
		System.out.println("3+2=5 연산식에서 '+'는 연산자, 피연산자는 3과 2이다. " );
	
//[1단계:개념] 10. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요.
		// 산술연산자는 사칙연산을 하는 연산자이다.
		System.out.println("+" + (num02 + num04));
		System.out.println("-" + (num02 - num04));
		System.out.println("*" + (num02 * num04));
		System.out.println("/" + (num02 / num04));
		System.out.println("%" + (num02 % num04));
//[1단계:코드] 11. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//      소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
		int juice = 500;
		int resultInt = juice/3;
		double resultDouble = juice/3.0;
		System.out.println("소수점 이하 처리 x" + resultInt );
		System.out.println("소수점 이하 처리 O" + resultDouble );
//[1단계:개념] 12. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
		int front = 0 ;
		int back = 0;
		System.out.println("앞에 ++는 계산 후 출력," + ++front);
		System.out.println("앞에 ++는 계산 후 출력," + ++front);
		System.out.println("앞에 ++는 계산 후 출력," + ++front);
		System.out.println("뒤에 출력후 계산," + back--);
		System.out.println("뒤에 ++는 출력 후 계산," + back--);
		System.out.println("뒤에 ++는 출력 후 계산," + back--);
		
//[1단계:개념] 13. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요.
		
		
	
//[2단계:코드] 14.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
//			김밥 1개 구매  2500 
//			김밥 2개 구매  5000
//			김밥 3개 구매  7500
		  int gimCnt = 4;
	      int gimPrice = 2500;
	      for(int i=0;i<=gimCnt;i++) {
	         System.out.println("김밥 "+ i +"개 구매 " + i*gimPrice);
	      }

//[1단계:개념] 15. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
	    //문자열의 내용을 비교하기 위해서는 equals()를 사용해야 한다.
	      // ==를 사용하면 두 문자열의 주소를 비교하는 것이다.

//[1단계:개념] 16. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
		for(int i=0;i<args.length;i++) {
			
		}
		
//[2단계:코드] 17. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요.
		
//[1단계:개념] 18. Scanner의 처리방법을 간단한 예제와 함께 기술하세요.
		int number = Integer.parseInt(sc.nextLine()); //int형 변수 입력받기
		String str01 = sc.nextLine(); //문자열 입력받기
		char ch03 = sc.nextLine().charAt(0); //문자 입력받기
		System.out.println("scanner 예시 : " + number+str01+ch03);
		
//[1단계:코드] 19. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요.
		System.out.println("선수명을 입력하십시오. ");
		String athles = sc.nextLine();
		double hit = Double.parseDouble(sc.nextLine()); //타석 입력받기
		double anta = Double.parseDouble(sc.next()); //안타수 입력받기
		System.out.println(athles+"선수의 타율은 " + anta/hit );
//[1단계:개념] 20. 비교연산자의 종류를 예시와 함께 기술하세요.
		System.out.println("5>4 5는 4초과이다." );
		System.out.println("3<4 3는 4미만이다." );
		System.out.println("5>=4 5는 4이상이다." );
		System.out.println("3<=4 3는 4이하이다." );
//[1단계:코드] 21. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 
		System.out.print("나이를 입력하십시오: ");
      int age01 = Integer.parseInt(sc.nextLine());
      String isAdult = age01>=18?"성입입니다.":"성인이 아닙니다.";
      System.out.println(isAdult);

//[1단계:개념] 22. 논리연산자의 종류를 예제와 함께 기술하세요.
      int age02 = 12;
      if(age02>=14 && age02 <=19) { //and 연산자
    	  System.out.println("청소년입니다.");
      }
      if(age02<5 || age>65) { //or 연산자
    	  System.out.println("버스 요금을 받지 않습니다.");
      }
      if(!(age02<19)) { //not 연산자
    	  System.out.println("성인입니다.");
      }
//[1단계:개념] 23. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
      int expSum = 0;
      for(int i=0; i<10; i++) { //초기값 i는 0, 반복 조건 i가 10미만일 때까지, 증감연산자 i는 1씩 증가
    	  expSum+=i; //반복해서 수행할 구문 expSum = expSum+i;
      }
//[1단계:코드] 24. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
//	              1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
      for(int i=200;i<=300;i+=10) {
          System.out.print(i+"\t");
             
       }
       System.out.println();
       for(int i=1000;i>=950;i-=3) {
          System.out.print(i+" ");
       }
       for(int i=100; i>=0; i--) {
          System.out.print(i/2+" ");
          if(i%10==0) System.out.println();
       }

//[1단계:개념] 25. for문의 지역변수와 전역변수의 개념을 예제를 통해서 설명하세요
       int sumAg = 0; //전역변수
       for(int i=0; i<=10; i+=2) { //int i는 for문 안에서만 사용되는 지역변수로 for문에 종료될시 초기화된다.
    	   sumAg+=i;
       }
       System.out.println("총계는: " + sumAg);
//[1단계:개념] 26. for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요  
       double agv = 0; //평균을 구할 전역변수
       int sum10 = 0; //합을 구할 전역변수
       for(int i=10;i>=0;i--) {
    	   sum10 += i;
    	   agv = sum10/10;
       }
       System.out.println("10~0까지 수의 합은: " + sum10);
       System.out.println("10~0까지 수의 합의 평균은: " + agv);
//[1단계:코드] 27. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//	                no 과일명  가격
//	                 1 사과    3000            
//	                 2 바나나   4000           
//	                 3 딸기    12000
//	                   총계    19000
       System.out.println("no\t과일명\t가격");
//     int [] priceArray = new int[3];
//     String [] fruitArray = new String[3];
//     int sumPrice = 0;
//     for(int i=0;i<3;i++) {
//        System.out.println("과일명을 입력하십시오");
//        fruitArray[i] = sc.nextLine();
//     }
//     for(int i=0;i<3;i++) {
//        System.out.println("가격을 입력하십시오");
//        priceArray[i] = Integer.parseInt(sc.nextLine());
//     }
//     for(int i=0;i<3;i++) {
//        sumPrice +=  priceArray[i];
//        System.out.println(i+"\t"+fruitArray[i]+"\t"+priceArray[i]);
//        System.out.println("총계\t" + sumPrice);
//        
//     }

       
//[1단계:코드] 28. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		            # 출력 형식
//		            날짜  갯수 누적
//		            1일차 2개  2개
//		            2일차 4개  6개
//		            3일차 6개 12개
//       System.out.println("날짜\t갯수\t누적");
//       int sumBread = 0;
//       for(int i = 1; i<=10; i++) {
//          sumBread +=i;
//          System.out.println(i+"일차\t"+2*i+"개\t누적"+2*sumBread+"개");
//       }

       
//[1단계:코드] 29. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
       for(int i=1; i<=100;i++) {
           
           if(i%4==0) System.out.print("# ");
           else System.out.print(i+" ");
           if(i%10==0) System.out.println();
        }

       
//[2단계:코드] 30. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
       for(int i=1; i<=20;i++) {
           if(i<10) {
              if(i%3==0) System.out.print("짝 ");
              else System.out.print(i+" ");
           }
           else {
              if(i%10!=0) {
                 if(i%10%3==0) System.out.println("짝 ");
                 else System.out.print(i+" ");
              }
           }
        }

//[1단계:개념] 31. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
       //2~4단 출력하기
       for(int i=2;i<=4;i++) {
    	   for(int j=1;j<=9;j++) {
    		   System.out.printf("%d X %d = %d", i, j, i*j);
    	   }
       }
      
//[1단계:코드] 32. 아래 내용을 2중 for문을 활용하여
//	1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
       for(int i=1;i<=2;i++) {
           for(int j=1;j<=2;j++) {
              System.out.print("♥");
           }
           System.out.println();
        }
        for(int i=1;i<=3;i++) {
           for(int j=1;j<=2;j++) {
              System.out.print("★");
           }
           System.out.println();
        }

       
//[1단계:개념] 33. while문의 기본 형식을 예제를 통해 설명하세요.
//[1단계:개념] 34. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
        int cnt=100;
        int sumHundred = 0;
        while(cnt>=90) {
           
           System.out.println(cnt);
           sumHundred+=cnt;
           cnt--;
           
           
        }

//[1단계:코드] 35. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
        ArrayList<Integer> scoresList = new ArrayList<Integer>();
//      while(true) {
//         System.out.println("점수를 입력하십시오: (그만 입력은 -1)");
//         int score = Integer.parseInt(sc.nextLine());
//         scoresList.add(score);
//         if(score == -1)
//            break;
//      }
//      for(int i=0; i<scoresList.size();i++) {
//         sumScore+=scoresList.get(i);
//      }
//      System.out.println("합계는 : " + sumScore+1);

        
//[1단계:개념] 36. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
        for(int i=0; i<=20; i++) {
        	if(i%7==0) continue; //i가 7의 배수이면 건너 뛰고 다음 step으로 간다.
        	if(i%9==0) break; //i가 9의 배수이면 for문을 중단한다.
        }
//[1단계:개념] 37. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
        //java는 stack영역과 heap 영역으로 이루어지며 stack은 주로 작은 크기의 데이터가 들어간다. int, double, char 등
        //stack영역의 데이터는 프로그램이 종료시 초기화되며 크기가 변하지 않는다.
        //heap 영역에는 데이터의 주소 및 크기가 큰 데이터가 들어가며 프로그램이 종료 후에도 초기화 되지 않는다.
//[1단계:개념] 38. 배열의 구성요소를 예제를 통해서 기술하세요
        String strArray[] = {"사과", "바나나", "딸기"}; //String은 배열에 들어가는 데이터의 유형, strArray는 배열명, {"사과", "바나나", "딸기"}는 배열의 요소이다.
//[1단계:개념] 39. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요.
        double [] dblArray = new double[3]; //배열을 선언하고, 배열의 크기를 할당하며 배열을 초기화한다.
        char [] charArray = {'A', 'B', 'C', 'D', 'F'}; //배열을 선언하고 요소를 집어넣는다.
//[1단계:개념] 40. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
        for(int i=0; i<charArray.length;i++) {
        	System.out.println("charArray의 요소는: " + charArray[i]); 
        	//반복문을 통해서 charArray에 들어있는 요소들을 한번에 출려한다.
        }
//[1단계:코드] 41. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
        int [] scoreArray = new int[3];
        int sumScores = 0;
        for(int i=0;i<scoreArray.length;i++) {
        	System.out.println("점수를 입력하십시오: ");
        	scoreArray[i] = Integer.parseInt(sc.nextLine());
        	sumScores+=scoreArray[i];
        }
        System.out.println("점수의 총계는: " + sumScores);
        System.out.println("평균 점수는: " + sumScores/scoreArray.length);
        
//[1단계:개념] 42. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
        //객체는 클래스에 포함되는 개념으로 클래스를 선언하고 선언한 클래스로 객체를 만들 수 있다.
        //클래스를 설계도로 비유하면 객체는 그 설계도로 만들어진 건물로 비유할 수 있다.
        Exp01 exp01 = new Exp01();
//[1단계:개념] 43. 필드의 특성을 예제를 통해 기술하세요
        //필드는 클래스 내부에 소속되는 멤버로, 클래스가 생성되면 자동으로 초기화가 된다.
        exp01.age = 0; //Exp 클래스의 필드인 age를 exp01객체가 사용할 수 있다.
//[1단계:개념] 44. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
        //생성자는 클래스 이름과 동일한 이름을 가지는 메서드로 클래스의 필드를 초기화 할 때 사용된다.
        //메서드는 클래스내에 내부요소로 클래스에서의 로직을 수행할 때 사용된다.
//[1단계:개념] 45. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
        Exp02 exp02 = new Exp02();
        exp02.method01();
        exp02.method02(3, 10);
        exp02.method03();
        exp02.method04(9, 10);
//[1단계:개념] 46. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
        //생성자로 데이터를 사용하면 클래스 생성과 함께 데이터도 생성되기 때문에 지속적으로 사용이 가능하다.
        //메서드로 데이터를 사용하면 메서드를 실행할 때만 사용되며, 메서드가 종료된 이후에는 초기화 된다.
//[1단계:확인] 47. 메서드(입력+로직) 선언 예제
//1) 3개에 입력값 중에 가장 큰수 출력
        System.out.println("3개의 숫자를 입력하십시오.");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println("제일 큰 수는: "+(a1>=a2?(a1>=a3?a1:a1):(a2>=a3?a2:a3)));
        
        
//2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
        System.out.print("점수를 입력하십시오: ");
        int scores02 = sc.nextInt();
        String isPassed = scores02>=70?"합격":"불합격";
        System.out.println("합격 여부는: " + isPassed);
//3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
        String [] productArray = {"지우개", "연필", "볼펜"};
        System.out.print("물건명을 입력하십시오.: ");
        String inputProduct = sc.nextLine();
        for(int i=0; i<productArray.length; i++) {
        	if(inputProduct.equals(productArray[i]))
        		System.out.println("판매하는 제품입니다.");
        	else
        		System.out.println("판매하지 않는 제품입니다.");
        	
        }
//[1단계:확인] 48. 메서드(입력+로직+리턴) 선언  예제
//1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
        Amusement a01 = new Amusement(56);
        System.out.println("무료/유료 여부: " + a01.isFree());
        
//2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
        System.out.println("할인율은: " + a01.getDiscount());
//3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
//[1단계:확인] 49. 클래스(필드,생성자,메서드) 선언  예제
//1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
//탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
//	버스번호 @@번 @@명이 탑승했습니다. 
        Bus bus01 = new Bus(5712);
        System.out.println("현재 탑승 인원은"+bus01.getCntBoard());
        bus01.plusBoardCnt(3);

	}

}
class Exp01 {
	int age;
	String name;
	
}
class Exp02{
	public void method01() {
		System.out.println("나는 매개변수도 없고 리턴값도 없어요");
	}
	public void method02(int a, int b) {
		System.out.println("나는 리턴값은 없지만 매개변수는 있어요" + a+b);
	}
	public int method03() {
	System.out.println("저는 리턴값은 있지만 매개변수는 없어요");
	return 5;}
	public int method04(int a, int b) {
		System.out.println("저는 매개변수도 있 리턴값도 있어요");
		return a+b;
	}
}
class Amusement{
	private int age;
	public Amusement(int age){
		age = this.age;
	}
	public String isFree() {
		String free = (age<5 || age>=65)?"무료입니다.":"유료입니다";
		return free;
	}
	public double getDiscount() {
		double dis = 0;
		if(age>=5 && age<20) {
			dis = 0.9;
		}
		else if(age<=34) {
			dis = 0.85;
		}
		else if (age<65) {
			dis = 0.8;
			}
		return dis;
	}
	
}
class Bus {
	int busNo;
	int cntBoard;
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	public int getCntBoard() {
		return cntBoard;
	}
	public void plusBoardCnt(int person) {
		cntBoard+=person;
		System.out.println(busNo+"번 버스 " + person + "명 탑승했습니다.");
	}
}