package javaexp.z02_homework.a14_cms.miniproject2;

import java.util.Scanner;

import javaexp.z02_homework.a14_cms.miniproject2.Login;

public class Main {
	//추석연휴 미니프로젝트 과제

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Login log01 = new Login(); // 회원가입, 로그인, 회원탈퇴를 처리하는 메서드가 포함된 객체 생성
		int choice = 0; // 사용자 입력을 받을 int형 데이터
		// 종료를 원하면 -1를 입력
		while (true) {
			System.out.println("======= 1. 회원가입, 2. 로그인 3. 회원탈퇴 4. 사용중인 닉네임 확인 5. 점수 확인 =======");
			System.out.println("프로그램 종료는 -1");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.println("**회원가입 화면입니다.**");
				log01.join(); // 회원가입 메서드
				break;
			case 2:
				System.out.println("**로그인 화면입니다.**");
				log01.login();
	
				
				break;
			case 3:
				System.out.println("**회원탈퇴 화면입니다.**");
				log01.secession();
				break;
			case 4:
				System.out.println("**사용중인 닉네임을 확인하는 화면입니다.**");
				log01.showNickname();
				break;
			case 5:
				System.out.println("** 점수 확인 화면입니다. **");
				log01.showScore();
				break;
			default:
				System.out.println("1~5 중에 선택하십시오.");
			}
			if(choice==-1) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
			
		}
	}

}
