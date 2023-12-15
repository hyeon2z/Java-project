package javaexp.z02_homework.a02_oys;

public class A0926 {
	public static void main(String[] args) {
		
		// # 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요

		// [개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
		/*
		 * 1. 선언 / 할당
		 * int[] intArray = new int[4];
		 * intArray = {10, 20, 30, 40}; 
		 * 2. 선언, 할당
		 * int[] intArray = {10, 20, 30, 40};
		 * */
		
		// [개념] 2. 배열의 기본 속성들을 기술하세요.
		// 요소, 인덱스, 길이
		
		// [확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
		/*int[] dices = new int[5];
		for (int i = 0; i < dices.length; i++) {
			dices[i] = (int)(Math.random() * 6 + 1);
		}
		for (int i = 0; i < dices.length; i++) {
			System.out.println(dices[i]);
		}*/
		
		// [개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
		/*
		 * for (int i = 0; => index는 0부터 시작 i < 배열.length; => index값은 배열 길이 - 1 i++)
		 * */
		// [확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
		/*int[] studentScores = new int[30];
		for (int i = 0; i < studentScores.length; i++) {
			studentScores[i] = (int)(Math.random() * 101);
		}
		for (int i = 0; i < studentScores.length; i++) {
			System.out.println(i + 1 + "번째 학생 점수 : " + studentScores[i]);
		}*/
		
		// [토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
		
	}
}
