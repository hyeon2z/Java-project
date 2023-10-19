package javaexp.a03_calculator;

import java.util.Scanner;

public class A04_EquCalcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개 이상의 조건이 모두 다 true 일 때,
		// 1) 숫자인 경우 연속된 범위에 있을 때
		// 청소년 요금제 범위(나이가 14~19), 점수의 유효 범위(0~100)
		// 2) 입력된 id와 pass가 다 맞을 때 인증여부가 true 처리
		//		String 객체 api에서 한번 더 언급(java)
		int inputAge = 18;
		boolean isAdolpay = inputAge >= 14 && inputAge <= 19;
		System.out.println("입력한 나이 : " + inputAge);
		System.out.println("청소년 요금제 여부 : " + isAdolpay);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("#로그인#");
//		System.out.print("아이디 입력 : ");
//		String id = sc.nextLine();
//		System.out.println("himan여부 : " + id.equals("himan"));
//		
//		// == : stack 영역의 데이터 비교
//		// equals() : 문자열 비교 시 사용
//		
//		System.out.print("패스워드입력 : ");
//		String pass = sc.nextLine();
//		System.out.println("입력한 아이디 : " + id);
//		System.out.println("입력한 패스워드 : " + pass);
//		boolean isValid = id.equals("himan") && pass.equals("7777");
//		System.out.println("로그인 성공 여부 : " + isValid);
		
		// ex) 점수를 입력해서 입력 된 점수가 유효한지 여부를 출력
		//		유효범위 (0~100)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		
//		int score = Integer.parseInt(sc.nextLine());
//		boolean scoreValid = score <= 100 && score >= 0;
//		
//		System.out.println("입력된 점수 : " + score);
//		System.out.println("유효범위 여부 : " + scoreValid);
		
		/*
		# !(not) : 부정연산자
		1. 논리식을 처리할 때, true 이면 false, false이면 true를 처리해야하는 경우가 있다.
			이 때, 활용하는 논리연산자가 부정연산자 !(not) 이다.
		2. 기본적인 비교연산식을 true <=> false로 처리할 뿐 아니라.
			!(age>=18) ==> age<18
		3. and, or가 포함된 논리연산자는 !을 통해서 드모르강법칙이 적용된 내용을 처리해준다.
			조건1 && 조건2 ==> 조건1이 true이고 조건2가 true일 때.
			!(조건1 && 조건2) ==> 드모르강법칙에 의해
				!조건1 || !조건2 로 처리를 하는 경우이다.
			ex) himan//7777이 인증 조건이라면
				로그인 되지 않을 조건은 himan이지 않거나 7777이 아닌경우를 말한다.
				age>=65 || age<3 : 무료
				!(age>=65 || age<3) : 우료
				 age<65 && age>=3
		 */
		int pt = 70;
		boolean isPass = pt>=70;
		System.out.println("합격여부 : " + isPass);
		System.out.println("불합격여부 : " + !isPass);
		
		int age = 20;
		boolean isFree = age>=65 || age<3;
		System.out.println("무료여부 : " + isFree);
		System.out.println("유료여부 : " + !isFree);
		// 1~10까지의 임의의 수를 출력하고 ( 점수%2==1 홀수, 점수%3==0 3배수)
		// 1. 홀수이면서 3의 배수인경우와 
		// 2. 짝수이거나 3의 배수가 아닌 경우를 위 !(not)연산자를 이용해서 출력하세요
		
		double num01 = Math.random();
		int num02 = (int)(num01 * 10 + 1);
		System.out.println("임의의 수 : " + num02);
		boolean num03 = (num02 % 2==1) && (num02 % 3==0);
		System.out.println("홀수이면서 3의 배수인 경우 : " + num03);
		System.out.println("짝수이거나 3의 배수가 아닌 경우 : " + !num03);
	}

}
