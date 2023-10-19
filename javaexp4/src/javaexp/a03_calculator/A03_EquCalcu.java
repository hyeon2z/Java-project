//0914~5
package javaexp.a03_calculator;

import java.util.Scanner;

public class A03_EquCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 비교연산자
		1. 비교를 통해서 논리값 boolean(true/false)을 저장하거나 출력하는 연산자를 말한다.
			>, <, >=, <=, ==, !=
			25>3 : true
			25<3 : false
			25>=3 : true
			25<=3 : false
			25==3 : false 같을때
			25!=3 : true 같지 않을 때.
			ex) 20세 이상은 성년여부를 처리할 때
			int age = 17
			성년여부 : age>=20
			
		# 논리연산자
		1. 위 비교연산자에 의한 결과를 2개 이상으로 연결하여
		
		2. 논리합(or) : 비교연산식을 2개 이상 처리할 때, 두 조건비교 연산식에서 하나이상 true 이면 true
			ex) 놀이공원에서 나이가 3세미만, 65세이상은 무료입장일 때, 무료여부를 확인시.
				age<3 || age>=65
			ex) kor>=80 || eng>=80 || math>=80
				과목의 점수가 하나라도 80점 이상이면 true
				
		3. 논리곱(and) : 두 조건비교 연산식에서 모두 다 true 면 true 그외는 false
			ex) 로그인 시 아이디와 패스워드 모두 다 인증되어야 로그인된다.
			ex) 청소년요금제는 14이상 19이하일 때 적용된다.
				age>=14 && age<=19
				
		4. 부정연산자(not) : 위 논리연산식 포함 비교연산자가 true이면 false
							false이면 true로 처리되는 연산자 조건식 !(조건식)
			ex) !(age>=14 && age<=19) 청소년 요금제에 해당하지 않을 때, true
			ex) 불합격하는 조건 !(point>=70)
		 */
		int age = 25;
		System.out.println(age + "세 성년여부 : " + (age >= 20));
		age = 18;
		System.out.println(age + "세 성년여부 : " + (age >= 20));
		int corNum = 3;
		int inputNum = 2;
		boolean isHit = corNum==inputNum;
		System.out.println("정답여부 : " + isHit);
//		System.out.println("# 놀이공원 입장 #");
//		System.out.print("나이를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		// import 추가 단축키 : ctrl + shift + o
//		int inAge = Integer.parseInt(sc.nextLine());
//		boolean isFree = inAge >= 65 || inAge <3;
//		// 논리합으로 둘 중에 하나이상 true 이면 true 처리
//		System.out.println("무료여부 : " + isFree);
		
		// ex) Scanner를 통해 국어/영어/수학 점수를 입력받아
		// 논리합(or)로 하나라도 80점 이상이면 상금여부가 true로 처리되게 하기.
		// 1. Scanner 객체 생성
		// 2. 국어 입력 변수로 할당
		// 3. 영어 입력 변수로 할당
		// 4. 수학 입력 변수로 할당
		// 5. 상금여부 isDadPrize 로 선언하여
		// 		국어>=80 || 영어>=80 || 수학>=80
		// 6. 상금여부 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어점수를 입력하세요 : ");
		int eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학점수를 입력하세요 : ");
		int math = Integer.parseInt(sc.nextLine());

		boolean win = kor >= 80 || eng >= 80 || math >= 80;
		
		System.out.println("상금여부 : " + win);
	}

}
