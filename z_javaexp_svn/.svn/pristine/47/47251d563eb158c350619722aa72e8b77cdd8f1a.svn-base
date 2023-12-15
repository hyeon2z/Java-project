package javaexp.z02_homework.a20_kjw;

import java.util.Random;
import java.util.Scanner;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
		/*
		 * wrapper클래스 사용이유. 기본 자료형의 값을 단순히 값이 아닌, 값에 대한 메소드를 사용하기위해 사용된다.
		 *
		 */
		Integer one = Integer.valueOf(30);
		Integer two = Integer.valueOf(40);
		System.out.println(one.compareTo(two));

		 int ex1 = 30; //ex1 변수를 30이라는 정수를 대입한 상태로 선언
		 Integer ex1num =Integer.valueOf(ex1); //valueof에 의해 ex1을 string객체로 변환
		 System.out.println(ex1num.byteValue()); //ex1num의 값을 byte형의 값으로 출력.

//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		 //기본자료형 ->wrapper클래스(boxing형), 기본자료형<-wrapper클래스(unboxing형)
		 Double ex2 = 15.5; //ex1 변수를 30이라는 정수를 대입한 상태로 선언
		 double ex2num =ex2; //boxing, 기본 자료형을 클래스화
		 System.out.println(ex2num); //unboxing. 클래스로 감싼 내용물을 출력으로써 호출한다.
		 //unboxing,auto Unboxing.
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요

		int a=(int)(Math.random()*100),b=(int)(Math.random()*100),c=(int)(Math.random()*100);
		System.out.println("학생의 점수: a:"+a+" b:"+b+" c:"+c);
		int first = Math.max(a,b);

		if(first>c)
		{
			System.out.println(first+"가 제일 큰수입니다.");
		}else {
			System.out.println("c가 "+c+"으로 제일큽니다.");
		}


		int a1=(int)(Math.random()*100),b1=(int)(Math.random()*100),c1=(int)(Math.random()*100);
		System.out.println("학생의 점수: a1:"+a1+" b1:"+b1+" c1:"+c1);
		int last = Math.min(a1,b1);

		if(last<c)
		{
			System.out.println(last+"가 제일 작은 수입니다.");
		}else {
			System.out.println("c가 "+c1+"으로 제일큽니다.");
		}
		int sum = Math.round((a1+b1+c1)/3);
		System.out.println(sum+"이 평균입니다.");
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		/*
		 * Math.random과 random은 현재시간을 시드로 사용한다는 것은 동일하지만.
		 * 각클래스는 각각 최상위 클래스(Object),java.util패키지에 있기떄문에ㅔ
		 * Math.random()클래스는 import없이 바로 호출이 가능하고 현재시간을 시드로 설정하기 때문에
		 *  매번 다른 수가 나온다.
		 *  random클래스는 util패키지내에 있기 때문에import와 할당연산자 new가 사용되어야한다.
		 *
		 *
		 */
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Random com = new Random((3)+1); //java.util import
		int comnum = com.nextInt();
		int win=0,lose=0,draw=0;
		System.out.println("가위바위보 게임입니다./t 가위=1,바위=2,보=3중 하나를 숫자로 입력하세요");
		Scanner sc = new Scanner(System.in);
		int user =sc.nextInt();
		if(comnum == 2) {
			if(user == 3) {
				System.out.println("사용자 승리");
				win++;
			}else if(user ==2) {
				System.out.println("비겼습니다!");
				draw++;
			}else if(user ==1){
				System.out.println("졌거나 유효하지 않은 숫자를 내어 몰수패입니다!");
				lose++;
			} else if(win+lose+draw==3) {
				System.out.println("여기까지!, 총3판 중 "+"승리: "+win+"패배: "+lose+"무: "+draw+"입니다");
			}
		}
		
	


//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?



	}

	private static int round(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
