//0914
package javaexp.a02_var;

public class A03_ChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 형변환 처리
		1. 기본 유형
			1) 작은 데이터 유형 ==> 큰 데이터 유형
				자동(묵시적) 타입 변환 : promotion
			2) 큰 데이터 유형 ==> 작은 데이터 유형
				강제(명시적) 타입 변환 : casting
			3) 연산에 의해서 꼭 형변환이 필요하는 경우에도 casting을 처리한다.
				int ==> char 로 표현
				int code = 66;
				char char01 = (char)code;
				
				연산에 의해 실수가 표현되어야 할 때
				double dbl01 = (double)10/3;
				10/3 ==> 정수형 3
				(double)10/3 ==> 실수형 3.333..
		 */
		byte num01 = 25;
		int num02 = num01; // 자동형변환
		double num03 = num02; // 자동형변환
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		
		double num04 = 24322.345;
		int num05 = (int)num04; // 강제형변환(casting) *** 실수 ==> 정수
		byte num06 = (byte)num05; // 강제형변환(casting)
		// 32bit(int) 2진수 ==> 8bit casting 해서 10진수로 변환한 데이터만 남음
		System.out.println(num04);
		System.out.println(num05);
		System.out.println(num06);
		// 자바에서 정수/정수 ==> 정수
		System.out.println(10/3); 
		// 실수형 데이터가 필요한 경우 나눗셈 피연산자 하나를 강제 형변환 해서 처리하여야 한다.
		System.out.println(10/(double)3);
		
		/*
		1. 사용자로부터 초를 입력받아, 해당 초를 '시, 분, 초'의 형태로 출력하세요.
			(예: 3661초는 1시간 1분 1초 입니다.)
		 */
		
		int UsrSeconds = 5233;
		int second = 1;
		int minute = 60;
		int hour = 3600;
		// 초*60 ==> 분*60 ==> 시
		
		int hourAsw = UsrSeconds/hour;
		int minuteAsw = (UsrSeconds%hour) / minute;
		int secondAsw = ((UsrSeconds%hour) % minute) / second;
		
		System.out.println(UsrSeconds+"초는 "+hourAsw+"시간 "+minuteAsw+"분 "+secondAsw+"초 입니다.");
		
		/*
		2. 문자열 데이터와 숫자형 변환
			1) 전제조건
				숫자형 문자열이어야 한다. "25", "35.12", "3.14"
				그 외 문자열 "이십오", "삼점일사" 에러 발생.
			2) 정수형 문자열 => 정수형
				int num01 = Integer.parseInt("25");
			3) 실수형 문자열 => 실수형
				double num02 = Double.parseDouble("3.17");
				
		 */
		String num01Str = "25";
		int num07 = Integer.parseInt(num01Str);
		String num11Str = "3.17";
		double num08 = Double.parseDouble(num11Str);
		System.out.println("정수형 변환 숫자+10 : "+(num07+10));
		System.out.println("실수형 변환 숫자+10.5 : "+(num08+10.5));
	}

}
