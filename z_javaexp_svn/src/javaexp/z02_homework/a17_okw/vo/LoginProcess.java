package javaexp.z02_homework.a17_okw.vo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoginProcess {
	private String id;
	private String password;
	public static boolean loginFlag = false;
	HashMap<String, String> memberTable = new HashMap<String, String>();
	
	// id pw 가져오고 설정하기
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	// 메인 메뉴
	public char loginMenu() {
		System.out.println("1. 로그인  // 2. 회원가입  // 3. 로그아웃  // 4. 로또 추첨하기  // 5.종료  ");
		System.out.print("메뉴 번호 입력(1~4) : ");
		return input().charAt(0);
	}
	// 입력 메서드
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	// 회원가입
	public void join() {
		if(loginFlag) {
			System.out.println("로그아웃 후 새로운 회원가입을 시작합니다.");
			loginFlag = false;
		}
		while(true) {
			System.out.print("사용할 ID 입력 : ");
			String newId = input();
			if(memberTable.containsKey(newId)) {
				System.out.println("이미 존재하는 ID입니다.");
				continue;
			}
			System.out.print("사용할 PW 입력 : ");
			String newPw = input();
			memberTable.put(newId, newPw);
			break;
		}
		System.out.println("가입이 완료되었습니다.");
	}
	// 로그인
	public void login() {
		if(loginFlag) {
			System.out.println("이미 로그인 된 상태입니다.");
			return;			// 생략해도 되는 리턴이지만, 가독성을 위해 습관들이기 위해넣어봄.
		}
	}
	
	public void memberCheck(String id, String password) {
		if (memberTable.containsKey(id)) {
			if(!memberTable.get(id).equals(password)) {
				System.out.println("잘못된 비밀번호입니다.");
			}else {
				System.out.println("로그인 되었습니다!");
				loginFlag = true;
			}
		}else {
			System.out.println("존재하지 않는 ID 입니다.");
		}
	}
	
	// 로그아웃
	public void logout() {
		if(!loginFlag) {
			System.out.println("로그인된 상태가 아닙니다.");
			return;
		}
		System.out.println("로그아웃 합니다.");
		loginFlag = false;
	}
	// 로또 프로그램 링크
	public void runLottoProgram() {
		if(loginFlag) {
			LottoProgram lottoProgram = new LottoProgram();
			lottoProgram.runGame();
		}else {
			System.out.println("먼저 로그인을 하세요.");
		}
	}
	
}
