package javaexp.z01_homework;

import java.util.*; // 외부에 있는 객체를 사용할 때 import 선언

public class A0913_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. java의 출력형식을 이용해서 학생 3명의 성적 출력해보기
		System.out.println("진우, 100점");
		System.out.println("민수, 100점");
		System.out.println("준우, 100점");
		System.out.println("준우,\t100점\n진우,\t90점\n민수,\t95점");
		System.out.println("구매하려는 물건의 정보는");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		/*
		3. java의 입력처리형식 args, scanner를 통해서 구매할 물건 정보(물건명, 가격, 갯수) 입력해서 출력.
			1) 만들어진 클래스는 main()메서드가 있을 때, 아래와 같이 1단계로 컴파일을 하면
				class 파일이 생성된다. javac A0913_Homework.java
				==> A0913_Homework.class(기계어. 즉, 컴퓨터가 인식할 수 있는 binary 파일이 생성)
				2단계로 실행명령어를 수행하면 main()가 있는 클래스인 경우 수행하여 처리된다.
				java A0913_Homework
			2) 이렇게 수행할 때, 데이터를 이 수행내용에 전달할 때 다음과 같은 코드로 처리된다.
				java A0913_Homework 사과 바나나 딸기
			3) A0913_Homework(클래스파일) 뒤에 있는 사과 바나나 딸기는 
				위 main(String[] args)에 데이터가 할당이 된다.
				String[] args = {"사과", "바나나", "딸기"} 형태로 배열에 할당이 되며,
				이 배열은 args[0] : "사과"
						args[1] : "바나나"
						args[2] : "딸기" 에 할당이 되어 사용할 수 있게 된다.
		 */
		// + (연산자, 이어주는 역할)
		System.out.println(args[0] + args[1] + args[2]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("#물건정보(물건명, 가격, 개수) 입력#");
		
		System.out.print("물건명 : ");
		String name = sc.nextLine();
		
		System.out.print("가격 : ");
		String price = sc.nextLine();
		
		System.out.print("개수 : ");
		String count = sc.nextLine();
		
		System.out.println("#입력된 물건 정보#");
		System.out.println(name);
		System.out.println(price);
		System.out.println(count);
	}
}
