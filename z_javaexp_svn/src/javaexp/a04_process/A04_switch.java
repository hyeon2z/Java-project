package javaexp.a04_process;

import java.util.Scanner;

public class A04_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 기본 switch구문 형식 
		switch(데이터){
			case 케이스1:
				처리할 내용
				break;
			case 케이스2:
				처리할 내용
				break;
			..
			default:
				위에 선언된 케이스가 아닐 때..
		}
		switch 데이터로 활용할 수 있는 유형.
		1. 정수형(char 포함)
		2. 문자열
		 * */
		switch(25) {}
		switch('A') {}
		switch("안녕") {}
//		switch(true) {}
//		switch(3.14) {}
		
		// 커피의 종류에 따른 내용.
		String chCoffee = "라떼";
		//사용자로부터 입력받은 커피 종류
		
		switch(chCoffee) {
			case "아메리카노":
				System.out.println("시원하고 깔끔한 선택");
				break;
			case "카푸치노":
				System.out.println("품성한 거품이 좋은신가보군요!");
				break;
			case "라떼":
				System.out.println("부드러운 우유를 좋아하는 당신!");
				break;
			default:
				System.out.println("그런 메뉴는 판매하지 않습니다!");
		}
		// 월별로 날수 처리.
		int month=(int)(Math.random()*12+1); //1~12월
		System.out.println("선택한 달은 "+month+"월");
		switch(month) {
			case 4:
			case 6:
			case 9:// 상위에서 하위로 내려가면서 break를 만나면
					// switch문을 벗어난다.
			case 11:
				System.out.println("30일까지 있는 달입니다");
				break;
			case 2:
				System.out.println("28일, 29일 있는 달입니다.");
				break;
			default:
				System.out.println("31일까지 있는 달입니다.");
		}
		// ex1) 이번주 날짜를 기준으로 해서
		//     날짜를 입력받아 요일을 출력하세요..
		// 	   18 ==> 월  ..  24 ==> 일
		Scanner sc = new Scanner(System.in);
		System.out.println("이번주 날짜를 입력하세요!");
		String date = sc.nextLine();
		switch(date) {
			case "18": System.out.println("월요일"); break;
			case "19": System.out.println("화요일"); break;
			case "20": System.out.println("수요일"); break;
			case "21": System.out.println("목요일"); break;
			case "22": System.out.println("금요일"); break;
			case "23": System.out.println("토요일"); break;
			case "24": System.out.println("일요일"); break;
			default:
				 System.out.println("날짜는 이번주 18~24일까지 입력 가능합니다"); 
		}
	    // ex2) 정답을 입력하세요, 1,3 ==> 정답, 2,4 오답
		//      그외 입력 번호는 1~4번까지 입력가능합니다.		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("문제의 정답을 입력하세요:");
		int inNum = sc2.nextInt();
		switch(inNum) {
			case 1:
			case 3:
				System.out.println("정답입니다!!"); break;
			case 2,4:
				System.out.println("오답입니다."); break;
			default :
				System.out.println("입력번호는 1~4까지 가능합니다.");
		}
	}

	

}
