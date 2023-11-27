package javaexp.a04_process;

public class A11_doubleFor_If {
	public static void main(String args[]) {
		// # 중첩if문 
		// 1. if문 안에 if문을 처리하는 것을 말한다.
		// 2. 중첩 if 구문의 경우 &&로 처리할 수 있다.
		// 나이와 성별을 입력받아서 4가지 조건으로 중첩문을 사용하자.
		int age = 27;
		String gender = "여";
		if(age>=18) {
			System.out.println("성인입니다.");
			// if(age>=18 && gender.equals("남"))
			if(gender.equals("남")) {
				System.out.println("신사입니다");
			}else {
				System.out.println("숙녀입니다");
			}
		}else {
			System.out.println("미성년입니다.");
			if(gender.equals("남")) {
				System.out.println("소년입니다");
			}else {
				System.out.println("소녀입니다");
			}			
			
		}
		// ex1) 주말여부를 선언, 공휴일여부를 선언
		// 주말이면서 공휴일이 아닌 경우 ==> 휴일
		// 주말이면서 공휴일인 경우 ==> 대체휴일
		// 그외는 ==> 평일..
		boolean isWeekend= true; // 주말여부
		boolean isHoliday= false; // 공휴일여부
		if(isWeekend==true) { // 주말
			if(isHoliday) { // 주말인데 휴일 ==> 대체휴일
				System.out.println("대체휴일");
			}else {
				System.out.println("휴일");
			}
		}else { // 주말아님
			System.out.println("평일");
		}		
		// ex2) 영화 입장료가 15000일 때,
		//      성별과 나이를 입력받아
		//      남성과 25세 미만일 경우 5%할인
		//      여성과 25세 이상일 경우 10%할인.. 최종 금액 출력.
		double dis = 0.0;
		if(gender.equals("남")) {
			if(age<25) {
				dis = 0.05;
			}
		}else if(gender.equals("여")) {
			if(age>=25) {
				dis = 0.1;
			}
		}
		//if(gender.equals("남")&&age<25 ) dis = 0.05;
		//if(gender.equals("여")&&age>=25 ) dis = 0.1;
		int pay = 15000;
		int result = pay -(int)(pay*dis);
		System.out.println("할인율:"+(int)(dis*100)+"%");
		System.out.println("최종금액:"+result+"원");
		// # 중첩for문
		// 1. for문 안에 for문이 중첩적으로 사용되는 것을 말한다.
	}
}
