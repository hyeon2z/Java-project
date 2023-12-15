package javaexp.z02_homework.a19_cjw;

public class A0926_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요

//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
		// 1) 선언 후, 크기지정 그리고 초기값 할당
			int[] intArry1;
			intArry1 = new int[3];
			intArry1[0] = 1;
			intArry1[1] = 2;
			intArry1[2] = 3;
			System.out.print(intArry1[0]+", ");
			System.out.print(intArry1[1]+", ");
			System.out.println(intArry1[2]);
		// 2) 선언 후 초기값 할당(크기는 할당한 인덱스 수에 따라 자동 지정)
			int[] intArry2;
			intArry2 = new int[] {11,12,13};	// 다른 프로그램들은 [11,12,14]을 사용
			intArry2[0] = 10;	// 재할당 가능
			System.out.print(intArry2[0]+", ");
			System.out.print(intArry2[1]+", ");
			System.out.println(intArry2[2]);
		// 3) 선언과 초기값 할당 동시에(크기는 할당한 인덱스 수에 따라 정해짐)
			int[] intArry3 = {21,22,23};
			System.out.print(intArry3[0]+", ");
			System.out.print(intArry3[1]+", ");
			System.out.println(intArry3[2]);
		
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
			/*
			배열 : 같은 유형의 데이터들이 하나의 메모리에 저장되어있다.
			배열명 : 배열을 지칭하는 이름. 배열명에는 데이터들이 저장된 주소값이 할당되어있다(stack영역)
			index : 배열명[index번호] => 데이터를 저장하고 호출하는데 사용된다.
			
			 * */
			
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
			int[] dices = new int[5];
			for(int dice:dices) {
				dice = (int)((Math.random()*6+1));
				System.out.println(dice);
			}
		
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
			/* 반복문에서 반복할 변수를 배열의 index값으로 지정하고 범위를 설정하면
			배열의 모든 데이터를 같은 처리를 하여 출력할 수 있다.
			 * */
				String[] fruits = new String[] {"사과","딸기","바나나"};
				System.out.println("# 등록된 과일 #");
				for(int idx=0;idx<fruits.length;idx++) {
					System.out.println(idx+1+") "+fruits[idx]);
				}
			// 그 외에 foreach 구문을 활용해서 각 배열의 데이터들을 순서대로 변수에 넣고 처리하고를 반복할 수 있다.
				for(String fruit:fruits) {
					System.out.println(fruit);
				}
		
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
			int[] pts = new int[30];
			for(int idx=0;idx<pts.length;idx++) {
				pts[idx] = (int)(Math.random()*100);
				System.out.println(idx+1+"번째 학생의 점수: "+pts[idx]+"점");
			}
				
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
			/*
			 for : 배열의 데이터를 직접적으로 사용하거나 변경할 수 있다.
			 foreach : 배열의 데이터를 변수에 할당하여 사용하기 때문에
			 			배열의 값을 가져오기에는 용이하지만 수정할 수는 없다.
			 * */
	}

}
