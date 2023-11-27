package javaexp.z02_homework.a06_psj;

public class A0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
			int [] arry;
			arry = new int[5];
			int[] arry1 = {1,2,3,4,5};
			String[] arrs = {"a", "b", "c", "d"};
			
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
			int[] dice = new int[5];
			for(int i=0; i<5; i++) {
				dice[i]=(int)(Math.random()*5+1);
			}
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
			int [] score = new int[30];
			for(int i=0; i<30; i++) {
				score[i]=(int)(Math.random()*100);
			}
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
//			장점: 배열의 처음 index부터 끝index까지 알아서 실행해준다. 문장이간결함
//			단점: 원하는 index구간을 정할수가없음 활용처가 제한적임
	}

}
