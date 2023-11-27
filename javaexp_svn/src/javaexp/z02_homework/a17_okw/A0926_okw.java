package javaexp.z02_homework.a17_okw;

public class A0926_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
		// 배열의 선언
		int[] intArry ;	// 정수형
		double[] dblArry;	// 실수형
		String[] strArry;	// 문자열
		// 배열의 할당
		intArry = new int[3]; // 배열 크기 지정.
		intArry[0] = 90;
		intArry[1] = 70;
		intArry[0] = 80;
		
		// 선언과 할당 동시에
		int [] intArry2 = {20,31,26};
		// 선언 후 배열 전체 동시 할당
		int [] intArry3;
		intArry3 = new int [] {50,40,70};
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
		// 배열명[index번호] = 데이터;
		// index번호: 0부터 시작하는 index번호에 실제 사용할 데이터를 할당한다
		// double[]arry = {10.7,20.8,30.99};
		// arry : heap영역의 주소값.
		// arry[0] : 첫번째 데이터인 10.7 할당되어 있음.
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
		int [] diceArry = new int [5];
		diceArry[0] = (int)(Math.random()*6+1);
		diceArry[1] = (int)(Math.random()*6+1);
		diceArry[2] = (int)(Math.random()*6+1);
		diceArry[3] = (int)(Math.random()*6+1);
		diceArry[4] = (int)(Math.random()*6+1);
		System.out.println("첫 번째 주사위 결과 : " + diceArry[0]);
		System.out.println("첫 번째 주사위 결과 : " + diceArry[1]);
		System.out.println("첫 번째 주사위 결과 : " + diceArry[2]);
		System.out.println("첫 번째 주사위 결과 : " + diceArry[3]);
		System.out.println("첫 번째 주사위 결과 : " + diceArry[4]);
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
			// 배열을 반복문을 통해 보다 효과적으로 사용할 수 있다.
			// 	1) 배열의 길이 : 반복문의 한계치/반복조건
			// 	2) 배열의 index : 반복문에서 사용할 변수
			// 대표적으로 for와 forEach구문을 사용
		// 예를 들어, 배열의 저장된 학생의 이름을 불러온다고 하면
		String [] name = {"김봉석","이희수","이강훈"};
		System.out.println("# 학생 명단 #");
		for(int idx = 0; idx < name.length; idx++) {
			System.out.println(idx+1 + "번. " + name[idx]);
		}
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
		int [] pts = new int[30];
		System.out.println("# 학생 30명의 점수 #");
		int cnt = 0;
		for(int pt:pts) {
			pt = (int)(Math.random()*101);
			cnt++;
			System.out.println(cnt + "번째 학생 : "+ pt);
		}
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
		  // 장점. foreach문을 사용하면 코드가 간단해진다.
	      // 단점. foreach문은 오직 읽기만을 위한 구문이기 때문에 반복문 내에서 배열의 값을 선언이나 변경할 수 없다.
	}

}
