package javaexp.a04_process;

public class A07_for_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# for문에서 if문 활용
//	    1. 반복문 처리 시 여러가지 화면 처리나 조건에 의해 원하는 데이터를 출력 할 수 있다.
//	    
//	    2. for문에서 if문 처리 유형
//	        1) 조건에 따른 출력형식 처리
		// 1~100까지 출력하되 각 단위별로 기본 탭간격, 5단위 마다 줄바꿈처리
		for(int cnt = 1; cnt <= 100; cnt++) {
			System.out.print(cnt + "\t");
			if(cnt % 5 == 0) {
				System.out.println("");
			}
		}
		// 1~10까지 홀/짝 표시
		for(int cnt = 1; cnt <= 10; cnt++) {
			System.out.print(cnt);
			if(cnt % 2 == 0) {
				System.out.print("(짝)\t");
			} else {
				System.out.print("(홀)\t");
			}
		}
		// ex1) 0~100까지 짝수만 출력하기 2, 4, ... 100
		System.out.println("");
		for(int cnt = 0; cnt <= 100; cnt++) {
			if(cnt % 2 == 0) {
				if(cnt < 100) {
					System.out.print(cnt + ", ");
				} else {
					System.out.println(cnt);
				}
			}
			
		}
		
		// ex2) 1~100중 3과 5의 공배수 출력하기 (3의배수 && 5의배수)
		for(int cnt = 1; cnt <= 100; cnt++) {
			if(cnt % 3 == 0) {
				if(cnt % 5 == 0) {
					System.out.print(cnt + " ");
				}
			}
		}
		System.out.println();
		// ex3) 1~100까지 합계 중 1000을 초과하는 최초의 숫자 출력
		int sum_1 = 0;
		for(int cnt = 1; cnt <= 100; cnt++) {
			sum_1 += cnt;
			if(sum_1 > 1000) {
				System.out.println(sum_1);
				break;
			}
		}
//		int First1000 = 0; // 초과할 때, 번호
//		int sum = 0; // 누적 합계
//		boolean isFirst = false; // 첫번째일때 true 할당
//		for(int cnt = 1; cnt <= 100; cnt++) {
//			sum += cnt; // 누적 처리
//			if(sum >= 1000) { // 1000을 넘었을 때
//				if(!isFirst) { // isFirst = false; 처음만 처리
//					first1000 = cnt; // 데이터할당
//					isFirst = true; // isFirst = true; 로 변경
		
		
		// ex4) 1~100까지 숫자 중에 7로 나누었을 때 4인 숫자 출력
		for(int cnt = 1; cnt <= 100; cnt++) {
			if(cnt / 7 == 4) {
				System.out.println(cnt);
				break;
			}
		}
		
		// ex5) 10부터 50까지 숫자중에 13으로 나누었을 때 떨어지는 첫번째 숫자 출력
		for(int cnt = 10; cnt <= 50; cnt++) {
			if(cnt % 13 == 0) {
				System.out.println(cnt);
				break;
			}
		}
//		int chFirst = 0;
//		boolean isFirst2 = False;
//		for(int cnt = 10; cnt <= 50; cnt++) {
//			if(cnt % 13 == 0) {
//				if(!isFirst2) {
//					chFirst = cnt;
//					isFirst2 = true;
//				}
//			}
		}
		
		
	}

//}
