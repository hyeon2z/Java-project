package javaexp.z02_homework.a14_cms;

import java.util.Scanner;

public class A0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
		//1) 선언 후 할당
		int intArry[];
		intArry  = new int[] {10, 20, 30};
		System.out.println(intArry[0]);
		System.out.println(intArry[1]);
		System.out.println(intArry[2]);
		//2) 선언과 할당 동시에
		double [] dblArry = {1.22, 3.14, 5.31};
		for(double data:dblArry) {
			System.out.println(data);
		}
		//선언 후 index별로 할당
		String strArry [] = new String[5];
		strArry[0] = "두리안";
		strArry[1] = "람부탄";
		strArry[2] = "망고스틴";
		strArry[3] = "파파야";
		strArry[4] = "코코넛";
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
		// 데이터 타입 배열명[index]
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
		int [] dices = new int[5];
		for(int i = 0; i<dices.length; i++) {
			dices[i] = (int)(Math.random()*6+1);
			System.out.println(i+"번째 주사위 결과는 : " + dices[i]);
			
		}
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
		//1) for문을 이용해서 배열의 값을 입력받는 예제
		int [] intArry02 = new int[3];
		for(int i=0; i<intArry02.length;i++) {
			System.out.println(i+"번째 정수 입력: ");
			intArry02[i] = Integer.parseInt(sc.nextLine());
		}
		//2) foreach문을 이용해서 intArry02의 값을 출력
		for(int data: intArry02) {
			System.out.println(data);
		}
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
		int [] stScores = new int[30];
		for(int i=0; i<stScores.length; i++) {
			stScores[i] = (int)(Math.random()*100); 
		}
		for(int data: stScores) {
			System.out.print(data+" ");
		}
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
		sc.close();
		


	}


}
