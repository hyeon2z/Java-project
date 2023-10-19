package javaexp.a04_process;

import java.util.Scanner;

public class A11_doubleFor_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 중첩 if문
//		 1. if문 안에 if문을 처리하는 것을 말한다
//
//		 2. 중첩 if 구문의 경우 &&로 처리할 수 있다.
		// 나이와 성별을 입력받아서 4가지 조건으로 중첩문을 사용하자.
//		int age = 25;
//		String gender = "남";
//		if(age >= 18) {
//			System.out.println("성인입니다.");
//			// if(age >= 18 && gender.equals("남")) 으로 처리가능
//			if(gender.equals("남")) {
//				System.out.println("신사입니다.");
//			} else {
//				System.out.println("숙녀입니다.");
//			}
//		}else {
//			System.out.println("미성년입니다.");
//			if(gender.equals("남")) {
//				System.out.println("소년입니다.");
//			} else {
//				System.out.println("소녀입니다.");
//			}
//		}
		
		// ex) 주말여부를 선언, 공휴일여부를 선언
		//		주말이면서 공휴일이 아닌 경우 ==> 휴일
		//		주말이면서 공휴일인 경우 ==> 대체휴일
		//		그 외는 평일
//		boolean isWeekend = true; // 주말여부
//		boolean isHoliday = false; // 공휴일여부
//		
//		if(isWeekend = true) {
//			if(isHoliday = true) {
//				System.out.println("대체휴일 예정입니다.");
//			}else {
//				System.out.println("휴일입니다.");
//			}
//		}else {
//			System.out.println("평일입니다.");
//		}
//		
//		ex2) 영화 입장료가 15000일 때, 성별과 나이를 입력받아
//				남성과 25세 미만일 경우 5%할인
//				여성과 25세 이상일 경우 10%할인
//				최종금액 출력.
		Scanner sc = new Scanner(System.in);
		int movieTicket = 15000;
		Double disCountM = 0.95;
		Double disCountW = 0.90;
		
		System.out.print("성별을 입력 하세요 [남성/여성] : ");
		String gender = sc.nextLine();
		System.out.print("나이를 입력 하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		if(gender.equals("남성")) {
			if(age < 25) {
				System.out.println("할인 된 영화 입장료는 : " + (int)(movieTicket * disCountM));
			}else {
				System.out.println("영화입장료는 : " + movieTicket);
			}
		}else if(gender.equals("여성")) {
			if(age >= 25) {
				System.out.println("할인 된 영화 입장료는 : " + (int)(movieTicket * disCountW));
			}else {
				System.out.println("영화입장료는 : " + movieTicket);
			}
		}
		
		double dis = 0.0;
		if(gender.equals("남성")) {
			if(age<25) {
				dis = 0.05;
			}
		}else if (gender.equals("여성")) {
			if(age>=25) {
				dis = 0.1;
			}
		}
		int pay = 15000;
		int result = pay - (int)(pay * dis);
		System.out.println("할인율 : " + (int)(dis*100) + "%");
		System.out.println("최종금액 : " + (result) + "원");
		
		
		
		
		
		
//
//		# 중첩 for문
//		 1. for문 안에 for문이 중첩적으로 사용되는 것을 말한다.
	}

}
