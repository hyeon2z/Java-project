package javaexp.a04_process;

import java.util.Scanner;

public class A08_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
		1. 기본형식
			while(반복할 조건){
				반복할 조건이 true일 때, 처리할 내용
			}
			무한 반복 안에서 break
			while(true){
				처리할 내용
				if(반복문을벗어날조건){
					break;
				}
			}
		*/
//		int cnt = 1;
//		while(cnt<=10) {
//			System.out.println((cnt++)+"번째 반복");
//		}
//
//		
//		// 구매할 과일명을 입력 받아 리스트하고, 종료할 때, Q를 입력처리
//		Scanner sc = new Scanner(System.in);
//		String fruitList = "";
//		String inData="";
//		while(!inData.equals("Q")) {
//			System.out.print("구매할 과일명을 입력(종료시 Q):");
//			inData = sc.nextLine();
//			if(!inData.equals("Q")) {
//				fruitList+=inData+" ";
//			}
//		}
//		System.out.println("# 구매할 과일 리스트 #");
//		System.out.println(fruitList);
//		// ex1) while문을 이용해서 10~20까지 출력하세요..
//		System.out.println("# 10~20 출력 #");
//		int no = 10;
//		while(no<=20) {
//			System.out.print(no+++"\t");
//		}
//		System.out.println();
//		// ex2) 아래 Scanner를 이용해서 회원명을 등록하고 
//		//      종료시 !로 처리하세요.
//		Scanner sc2 = new Scanner(System.in);
//		String memList = "회원명\t포인트\n";
//		String data="";
//		while(!data.equals("!")) {
//			System.out.print("회원명 입력(종료시 !):");
//			data = sc2.nextLine();
//			if(!data.equals("!")) {
//				memList +=data+"\t";  // 회원명 누적
//				System.out.print("기본 포인트 입력:");
//				data = sc2.nextLine(); // 회원포인트 누적
//				memList +=data+"\n";
//			}
//		}
//		System.out.println("# 등록 회원 정보 #");
//		System.out.println(memList);
//		
//		while(true){} : 무한 반복
//      if(조건) break; : 반복문을 중단 처리할 때..
		// 등록된 학생 리스트 처리
//		Scanner sc3 = new Scanner(System.in);
//		String stuList="";
//		while(true) {
//			System.out.print("학생명등록(종료시Q):");
//			String stName = sc3.nextLine();
//			if(stName.equals("Q")) {
//				break; // Q입력시 break(반복종료)
//			}else {
//				stuList+=stName+", ";
//				//System.out.println("등록학생명:"+stName);
//			}
//		}
//		System.out.println("등록된 학생:"+stuList);
		// 번호별로 학생의 점수를 입력 받아서 총점과 평균 처리..
//		Scanner sc4 = new Scanner(System.in);
//		int no = 0; // 학생수/번호
//		int tot = 0; // 누적되는 학생의 점수
//		while(true) {
//			System.out.print(++no+"번째 학생의 점수입력(종료시-1):");
//			int pt = sc4.nextInt(); 
//			// 주의 : 동일한 유형을 입력받을 때는 문제가 없으나,
//			// 숫자형과 문자열을 번갈아 받을 때는 반드시 형변환 함수를
//			// 활용하여야 한다.(bug발생) Integer.parseInt()
//			if(pt==-1) {
//				--no;
//				break;
//			}else {
//				tot +=pt;
//			}
//		}
//		System.out.println(no+"명의 학생의 점수");
//		System.out.println("총점:"+tot);
//		System.out.println("평균:"+(tot/no));
//		ex) while/break를 이용하여 좋아하는 점심 메뉴를 입력받아서
//          최종적으로 출력하세요! 종료시(!)로 처리..
		Scanner sc4 = new Scanner(System.in);
		String favLunch="";
		int no = 0;
		while(true) {
			System.out.print(++no+"번째 좋아하는 점심 메뉴입력 종료시!:");
			String inData = sc4.nextLine();
			if(inData.equals("!")) {
				System.out.println("입력 완료!");
				no--;
				break;
			}else {
				favLunch+=no+")"+ inData+"\n";
			}
		}
		System.out.println("좋아하는 점심 메뉴 "+no+"가지 입력");
		System.out.println(favLunch);
		
		
		
	}

}
