package javaexp.a04_process;

public class A10_continue_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 반복문제어 continue, break
//		 1. if문과 함께 주로 사용된다.
//		 
//		 2. continue : 해당 반복 step에서 나머지 코드부분은 건너뛰고 다음 step으로 진행
//
//		 3. break : 반복은 중단 처리
		
//		int grade = (int)(Math.random() * 8 + 2);
//		for(int cnt = 1; cnt <= 9; cnt++) {
//			if(cnt == 4) continue; // *4는 다음 단계로 넘어간다
//			if(cnt == 8) break; // *8일때 반복 중지 처리
//			
//			System.out.println(grade + " x " + cnt + " = " + (grade * cnt));
//		}
//		// 1~10까지 홀수만 출력
//		for(int cnt = 1; cnt <= 10; cnt++) {
//			if(cnt % 2 == 0) continue; // 짝수일 때는 다음으로 넘어감
//			System.out.print(cnt + ", ");
//		}
//		System.out.println();
//		// 합계가 50 넘는 시점에 출력 및 중단처리
//		int sum = 0;
//		int cnt = 0;
//		while(true) {
//			cnt++;
//			sum += cnt;
//			if(sum > 50) {
//				System.out.println("합계가 50이 넘는 최초 : " + cnt);
//				System.out.println("합계 : " + sum);
//				break;
//			}
//		}
		// ex1) 1~50까지 출력하되 5의 배수는 제외하고 출력
		for(int cnt = 1; cnt <= 50; cnt++) {
			if(cnt % 5 == 0) continue;
			System.out.print(cnt + " ");
		}
		System.out.println();
		
		// ex2) 구구단 5단을 출력하되 *7일때 중단 처리
		System.out.println("구구단 5단");
		for(int cnt = 1; cnt <= 9; cnt++) {
			if(cnt == 7) break;
			System.out.println("5 x " + cnt + " = " + 5 * cnt + " ");
		}
		
		
		
		
	}

}
