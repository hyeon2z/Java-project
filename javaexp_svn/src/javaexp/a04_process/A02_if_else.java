package javaexp.a04_process;

import java.util.Scanner;

public class A02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# if else 구문
		1. 특정 조건이 true/false로 분기하여 처리해야하는 경우에
			주로 사용된다.
		 * */
		int iNum = 3; // 입력한 값..
		if(iNum == 3) {
			System.out.println("3일 때, 정답");
		}else {
			System.out.println("오답입니다!");
		}
		// ex) 컴퓨터가 1~5까지 임의로 저장(Math.random())할 때,
		//    입력한 데이터가 위 컴퓨터의 수를 맞추면 정답
		//    그 외는 오답을 출력하세요.. Scanner 활용
		// 1) 변수지정해서 1~5 임의의 수 저장
		//    hint) 짝수/홀수 표시..
		// 2) Scanner를 통해서 예상되는 수를 입력받게 처리..
		// 3) if else을 이용해서 맞추면 정답 그외 오답..
		int comR = (int)(Math.random()*5+1);
		
		System.out.println("#컴퓨터와 함께하는 숫자 맞추기 게임#");
		System.out.print("hint) ");
		if(comR%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.print("예상되는 수 입력(1~5):");
		Scanner sc = new Scanner(System.in);
		int myNum = Integer.parseInt(sc.nextLine());
		System.out.println("컴퓨터의 수:"+comR);
		if(comR==myNum) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		// 16:05~
	}

}
