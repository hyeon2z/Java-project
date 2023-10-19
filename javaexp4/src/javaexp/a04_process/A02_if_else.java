//0915
package javaexp.a04_process;

import java.util.Scanner;

public class A02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# if else 구문
		1. 특정 조건이 true/false로 분기하여 처리해야하는 경우에 주로 사용된다.
		 */
		int iNum = 3; // 입력한 값
		if(iNum == 3) {
			System.out.println("3일 때, 정답");
		}else {
			System.out.println("오답입니다.");
		}
		// ex) 컴퓨터가 1~5까지 임의로 저장할 때,math.random 입력한 데이터가 위 컴퓨터의 수를 맞추면 정답
		// 		그 외는 오답을 출력하세요. Scanner 짝수 홀수 표시
		
		System.out.println("컴퓨터가 고른 숫자 맞추기 게임");
		int ranNum1 = (int)(Math.random() * 5 + 1);
		Scanner sc = new Scanner(System.in);
		if(ranNum1 % 2 == 0) {
			System.out.println("힌트 : 짝수");
		} else {
			System.out.println("힌트 : 홀수");
		}
		System.out.print("1~5 까지의 숫자를 입력하세요 : ");
		int Num1 = sc.nextInt();
		
		if(ranNum1 == Num1) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		System.out.println("컴퓨터가 고른 숫자 : " + ranNum1);
		/*
		1) 변수지정 하여 1~5 임의의 수 저장
			hint)짝/홀 표시
		2) Scanner를 통하여 예상되는 수를 입력받게 처리
		3) if else을 이용하여 맞추면 정답 그 외 오답.
		 */
	}

}
