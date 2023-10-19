package javaexp.z01_homework;

import java.util.Scanner;

public class A0918_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		#`switch-case` 문을 사용하는 사용하여 아래 문제를 풀어보세요
//		 1. 커피의 종류를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요. 
		Scanner sc = new Scanner(System.in);
		
		String cof1 = "아메리카노";
		String cof2 = "카페라떼";
		String cof3 = "에스프레소";
		
		System.out.println("메뉴 : " + cof1 + ", " + cof2 + ", " + cof3);
		
		System.out.print("커피의 종류를 입력하세요 : ");
		String cof = sc.nextLine();
		
		switch(cof) {
			case "아메리카노":
				System.out.println("3000원 입니다.");
				break;
			case "카페라떼":
				System.out.println("5000원 입니다.");
				break;
			case "에스프레소":
				System.out.println("1500원 입니다.");
				break;
		}
		
//		 2. **계절 출력기**: 월(1-12)을 입력받아 해당 월의 계절을 출력하세요. 
		System.out.print("몇월 인지 입력하세요 : ");
		int month = Integer.parseInt(sc.nextLine());
		
		switch(month) {
			case 12,1,2:
				System.out.println("겨울입니다.");
				break;
			case 3,4,5:
				System.out.println("봄입니다.");
				break;
			case 6,7,8:
				System.out.println("여름입니다.");
				break;
			case 9,10,11:
				System.out.println("가을입니다.");
		}
		
		
//		 3. **도형의 넓이 계산기**: 도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요.
//		     필요한 추가 정보(예: 길이, 반지름)는 사용자로부터 입력받아 계산합니다.
		double PI = 3.14;
 		System.out.println("**도형의 넓이 계산기**");
		System.out.println("도형 종류 : 직사각형, 원, 삼각형");
		
		System.out.print("도형의 종류를 입력하세요 : ");
		String num3 = sc.nextLine();
		
		if(num3.equals("직사각형")) {
			System.out.print("직사각형의 가로길이를 입력하세요 : ");
			double square_1 = Double.parseDouble(sc.nextLine());
			System.out.print("직사각형의 세로길이를 입력하세요 : ");
			double square_2 = Double.parseDouble(sc.nextLine());
			System.out.println("직사각형의 넓이는 : " + square_1 * square_2);	
		
		}else if(num3.equals("원")) {
			System.out.print("원의 반지름을 입력하세요 : ");
			double circle_1 = Double.parseDouble(sc.nextLine());
			System.out.println("원의 넓이는 : " + circle_1 * circle_1 * PI);
		
		}else {
			System.out.print("삼각형의 밑면의 길이를 입력하세요 : ");
			double tri_1 = Double.parseDouble(sc.nextLine());
			System.out.print("삼각형의 높이를 입력하세요 : ");
			double tri_2 = Double.parseDouble(sc.nextLine());
			System.out.println("삼각형의 넓이는 : " + tri_1 * tri_2 * 1/2);
		}
		
		
		
		
//		# for문 활용 
//		 1. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요 
//		     1) 200~300 10단위 출력
		for(int cnt = 200; cnt <= 300; cnt += 10) {
			System.out.print(cnt + " ");
		}
//		     2) 1000~950 3단위 감소
		for(int cnt = 1000; cnt >= 950; cnt -= 3) {
			System.out.print(cnt + " ");
		}
//		     3) 100~0까지 2로 나눈값 
		 for(int cnt = 100; cnt >= 0; cnt--) {
			 System.out.print(cnt/2 + " ");
		 }
		 System.out.println();
//		 2. 김밥의 단가를 입력받아서 1~20개의 갯수별 총가격을 출력하세요.
		 System.out.print("김밥의 가격을 입력하세요 : ");
		 int price_1 = Integer.parseInt(sc.nextLine());
		 
		 for(int cnt = 1; cnt <= 20; cnt++) {
			 System.out.println("김밥" + cnt + "개 의 가격은 : " + price_1 * cnt);
		 }
//		 3. 입력할 과일의 3개의 과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
//		     no 과일명 가격
//		     1  사과  3000
//		     2  바나나 4000 
//		     3  딸기  12000
//		     총계 19000 
//		 출력할 내용 전역변수
		 int sum01 = 0;
		 System.out.println("no\t과일명\t가격");
		 for(int cnt = 1; cnt <= 3; cnt++) {
			 if(cnt == 1) {
				 String fruit1 = "사과";
				 int price1 = 3000;
				 System.out.println(cnt + "\t" + fruit1 + "\t" + price1);
				 sum01 += price1;
				 
			 }else if(cnt == 2) {
				 String fruit2 = "바나나";
				 int price2 = 4000;
				 System.out.println(cnt + "\t" + fruit2 + "\t" + price2);
				 sum01 += price2;
				 
			 }else if(cnt == 3) {
			 	String fruit3 = "딸기";
			 	int price3 = 12000;
			 	System.out.println(cnt + "\t" + fruit3 + "\t" + price3);
			 	sum01 += price3;
			 }
		 }
		 System.out.println(sum01);
		 
		 int sum03 = 0;
		 for (int cnt = 1; cnt <= 3; cnt++) {
			 System.out.println(cnt + "번째 과일명 입력 : ");
			 String fruitName = sc.nextLine();
			 System.out.println("과일의 가격 입력 : ");
			 int fruitPrice = Integer.parseInt(sc.nextLine());
			 
		 }
		 
		 
		 
//		 4. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...)
//		     총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
//		     # 출력 형식 날짜 갯수 누적 
//		 			  1일차 2개 2개 
//		 			  2일차 4개 6개 
//		 			  3일차 6개 12개 
		 int sum04 = 0;
		 for(int cnt = 1; cnt <= 10; cnt++) {
			 int bread = cnt * 2;
			 sum04 += cnt * 2;
			 if(cnt == 1) {
				 System.out.println("날짜\t갯수\t누적");
				 }
			 System.out.println(cnt + "일차\t" + bread * cnt + "개\t" + sum04 + "개");
			 }
		 
//		 5. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시. 
		 int sum05 = 0;

		 for(int cnt = 1; cnt <= 100; cnt++) {
			 if(cnt % 4 != 0) {
				 System.out.print(cnt + " ");
			 }else {
				 System.out.print("# ");
				 sum05 += cnt;
			 }
			 if(cnt == 100) {
				 System.out.println("\n" + "4의 배수의 합산은 : " + sum05);

			 }

		 }
		 
//		 6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		 for(int cnt = 1; cnt <= 20; cnt++) {

			 if(cnt % 3 != 0) {
				 System.out.print(cnt + " ");
			 }else {
				 System.out.print("짝 ");

			 }

		 }
		 
		 for(int i = 1; i <= 20; i ++) {
			 if(i%10!=0 && i%10 %3 == 0) {
				 System.out.println("짝");
			 }else {
				 System.out.println(i);
			 }
				 
		 }
		 
	}

}
