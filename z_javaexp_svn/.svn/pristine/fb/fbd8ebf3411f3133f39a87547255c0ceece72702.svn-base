package javaexp.z02_homework.a11_mhi;

import java.util.Scanner;

public class B01_0922_miniproject {

	public static void main(String[] args) {

//- 컴퓨터와 하는 숫자 맞추기 게임 (수업 내용 활용)
//- 1. 로그인 (스캐너에 아이디, 패스워드 입력해서 일치하는지 확인)
//- 2. 일치하면 게임 시작
//- 3. 게임 시작, 총 3번에 기회 있음
// -6. 3번 시도해도 틀리면 "게임종료"

		Scanner sc = new Scanner(System.in);

		// 스캐너 이용해서 로그인 (올바른 비밀번호 입력까지 계속 비번 물어보기)
//		String id = "hihimoon";
//		String pass = "1234";
//
//		do {
//			System.out.println("#아이디를 입력해주세요");
//			String inputId = sc.nextLine();
//			System.out.println("#패스워드를 입력해주세요");
//			String inputPass = sc.nextLine();
//
//			if (id.equals(inputId) && pass.equals(inputPass)) {
//				System.out.println("로그인 성공");
//				break;
//			} else {
//				System.out.println("로그인 실패");
//			}
//		} while (true);

		// 로그인 성공하여 게임 시작 (컴퓨터와 하는 숫자 맞추기 게임)
		// 1~10 랜덤 숫자
		int comRan = (int) (Math.random() * 10 + 1);
		int i = 0;

		while (i < 3) {
			System.out.println("1~10까지 컴퓨터의 임의의 숫자를 맞춰보세요(총 3번의 기회있음)"); // 기회 3번 주기
			int inputNum = Integer.parseInt(sc.nextLine());

			if (inputNum != comRan) {
				System.out.println("오답입니다. 숫자를" + (i + 1) + "회 잘못입력하셨습니다.");
				i++;

				if (i == 3) {
					System.out.println("GAME OVER... 프로그램을 종료합니다.");
					System.out.println("정답은:"+comRan+"이였습니다.");
				}
			} else if (inputNum == comRan) {
				System.out.println("축하합니다. 정답입니다");
				break;
			}
		}
	}
}