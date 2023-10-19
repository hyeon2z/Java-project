package javaexp.a04_process;

import java.util.Scanner;

public class A08_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# while문 : 조건에 따라 반복을 계속할지 결정하는 경우에 활용하는 반복문
//		 1. 기본형식
//		     while(반복할 조건) {
//		         반복할 조건이 true일 때, 처리할 내용
//		     }
//		     무한 반복 안에서 break
//		     while(true) {
//		         처리할 내용
//			 if(반복문을 벗어날 조건) {
//			     break;
//			   }
//		     }
//		int cnt = 1;
//		while(cnt<=10) {
//			System.out.println((cnt++) + "번째 반복");
//		}
//		// ex1) while문을 이용해서 10~20까지 출력하세요.
//		int i = 10;
//		while(i <= 20) {
//			System.out.println(i + " ");
//			i += 1;
//		}
//		
//		// ex2) 아래 Scanner를 이용해서 회원명을 등록하고 종료시 !로 처리하세요
//		Scanner sc = new Scanner(System.in);
//		String userName = "";
//		String stopInput = "";
//		while(!stopInput.equals("!")) {
//			System.out.println("회원명을 입력하세요(종료시 !) : ");
//			stopInput = sc.nextLine();
//			if(!stopInput.equals("!")) {
//				userName += stopInput + " ";
//			}
//		}
//		System.out.print("회원 리스트 : ");
//		System.out.println(userName);
//		
//		String memList = "회원명\t포인트\n";
//		String data = "";
//		while(!data.equals("!")) {
//			System.out.print("회원명 입력 (종료시 !) : ");
//			data = sc.nextLine();
//			if(!data.equals("!")) {
//				memList += data + "\t"; // 회원명 누적
//				System.out.print("기본 포인트 입력 : ");
//				data = sc.nextLine(); // 포인트누적
//				memList += data + "\n";
//			}
//		}
//		System.out.println("#등록 회원 정보#");
//		System.out.println(memList);
//		
//		
//		// 구매할 과일명을 입력 받아 리스트하고, 종료 할 때 Q를 입력처리
//	
//		String fruitList = "";
//		String inData = "";
//		while(!inData.equals("Q")) {
//			System.out.println("구매할 과일명을 입력(종료시 Q) : ");
//			inData = sc.nextLine();
//			if(!inData.equals("Q")) {
//				fruitList += inData + " ";
//			}
//		}
//		System.out.println("# 구매할 과일 리스트 #");
//		System.out.println(fruitList);
//		
////		while(true) {} : 부한반복
////		if(조건) break; : 반복문을 중단 처리할 때
//		
//		// 등록된 학생 리스트 처리
//		Scanner sc3 = new Scanner(System.in);
//		String stuList = "";
//		
//		while(true) {
//			System.out.println("학생명 등록(종료시 Q) : ");
//			String stName = sc3.nextLine();
//			if(stName.equals("Q")) {
//				break; // Q 입력 시 break(반복종료)
//			}else {
//				stuList += stName + ", ";
//			}
//		}
//		System.out.println("등록 학생명 : " + stuList);
//	
//		// 번호별로 학생의 점수를 입력 받아서 총점과 평균 처리
//		Scanner sc4 = new Scanner(System.in);
//		int stuNum = 0; // 학생 수 / 번호
//		int totScore = 0; // 누적되는 학생의 점수
//		while(true) {
//			System.out.println(++stuNum + "번째 학생의 점수 입력(종료시 -1) : ");
//			int pt = sc4.nextInt();
//			// 주의 : 동일한 유형을 입력받을 때는 문제가 없으나, 
//			// 숫자형과 문자열을 번갈아 받을 때는 반드시 형변환을 함수를 활용하여야 함.
//			// Integer.parseInt();
//			
//			if(pt == -1) {
//				--stuNum;
//				break;
//			}else {
//				totScore += pt;
//			}
//		}
//		System.out.println(stuNum + "명의 학생의 점수");
//		System.out.println("총점 : " + totScore);
//		System.out.println("평균 : " + (totScore / stuNum));
	
//		ex1) while/break 이용하여 좋아하는 점심 메뉴를 입력받아서
//			최종적으로 출력하세요. 종료시(!)로 처리
		Scanner sc = new Scanner(System.in);
		String luvMenu = "";
		int no = 0;
		while(true) {
			System.out.println("좋아하는 점심 메뉴를 입력하세요(종료시 !) : ");
			String menu = sc.nextLine();
			if(menu.equals("!")) {
				System.out.println("입력완료.");
				break;
			}else {
				luvMenu += ++no + ")" + menu + " ";
			}
		}
		System.out.println("좋아하는 메뉴 : " + luvMenu);
		
	}	
	

}
