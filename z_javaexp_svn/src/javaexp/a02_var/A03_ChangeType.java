package javaexp.a02_var;

public class A03_ChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 형변환 처리
		1. 기본 유형
			1) 작은데이터유형 ==> 큰데이터 유형
				자동(묵시적) 타입 변환 : promotion
			2) 큰데이터유형 ==> 작은데이터 유형
				강제(명시적) 타입 변환 : casting
			3) 연산에 의해서 꼭 형변환이 필요하는 경우에도 casting
				을 처리한다.
				int ==> char으로 표현..
				int code = 66;
				char char01 = (char)code;
				
				연산에 의해 실수가 표현하여야 할 때..
				double dbl01 = (double)10/3;
				10/3 ==> 정수형 3
				(double)10/3 ==> 실수형 3.3333..
				
				
				
		 * */
		byte num01 = 25;
		int num02 = num01; // 자동형변환
		double num03 = num02; // 자동형변환
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		double num04 = 24322.345;
		int num05 = (int)num04; // 강제형변환(casting) ***
		byte num06 = (byte)num05; // 강제형변환(casting)
		// 32bit(int) 2진수로 ==> 8bit casting해서 10진수로 
		// 변환한 데이터만 남음
		System.out.println(num04);
		System.out.println(num05);
		System.out.println(num06);
		// 자바에서 정수/정수 ==> 정수
		System.out.println(10/3);
		// 실수형데이터가 필요한 경우 나눗셈 피연산자 하나를
		// 강제제 형변환해서 처리하여야 한다.
		System.out.println(10/(double)3);
		/*
		1. 사용자로부터 초를 입력받아, 해당 초를 '시, 분, 초'의 
			형태로 출력하세요.
		 	(예: 3661초는 1시간 1분 1초입니다.)
		 * */
		int seconds = 5233; 
		// 초*60 ==> 분*60 ==> 시
		// 시 ==> 시/60(분) ==> 분/60(초)
		int hours = seconds/60/60; //초/60/60
		System.out.println(hours+"시");
		System.out.println(hours*60*60+"초(1시간)");
		int minues = seconds/60-(hours*60); 
		// 그냥 분?  
		System.out.println(minues+"분");
		int rest = seconds-(hours*60*60)-(minues*60);
		System.out.println(rest+"초");
		/*
		2. 문자열데이터와 숫자형 변환
			1) 전제조건
				숫자형 문자열이어야 한다.  "25", "35.17"
				그외 문자열 "이십오", "삼점일칠" 에러발생.
			2) 정수형문자열을 정수형
				int num01 = Integer.parseInt("25");
			3) 실수형문자열을 실수형
				double num02 = Double.parseDouble("3.17");
				
		 * */
		String num10Str = "25";
		int num10 = Integer.parseInt(num10Str);
		String num11Str = "3.17";
		double num11 = Double.parseDouble(num11Str);
		System.out.println("정수형 변환 숫자+10:"+(num10+10));
		System.out.println("실수형 변환 숫자+10.5:"+(num11+10.5));
		
		
		
		
		
		
		
		
		
		
		
	}

}
