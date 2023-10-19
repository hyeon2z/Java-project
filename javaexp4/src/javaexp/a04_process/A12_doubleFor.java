package javaexp.a04_process;

public class A12_doubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문 안에 for문 처리
		
		for(int grade = 2; grade <= 9; grade++) {
			for(int cnt = 1; cnt <= 9; cnt++) {
				System.out.printf("%d x %d = %d\n", grade, cnt, grade * cnt);
			}
		}
		// 직사각형 모양 별 출력
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 8; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ex) 하루의 시:분 표시
		//		0시0분
		//		0시1분
		//		..
		//		1시0분
		//		..
		//		23시59분..
		for(int hour = 0; hour <=23; hour++) {
			for(int minute = 0; minute <= 59; minute++)
				System.out.printf("%d시%d분\n", hour, minute);
		}
		System.out.println();
		
		// ex2) 2중for문 활용 행/열 테이블 표시 (3행3열)
		//		(1행1열) (1행2열) (1행3열)
		//		..
		//					   (3행3열)
		
		for(int num1 = 1; num1 <= 3; num1++) {
			for(int num2 = 1; num2 <= 3; num2++) {
				System.out.print("(" +num1+"행"+num2+"열)\t");
			}
			System.out.println();
		}
		// star
		for(int row = 1; row <= 10; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
