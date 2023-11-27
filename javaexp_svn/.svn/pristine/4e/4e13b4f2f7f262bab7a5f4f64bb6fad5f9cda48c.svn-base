package javaexp.z02_homework.a06_psj.vo;

import java.util.Scanner;

public class Shopping {
	Scanner sc = new Scanner(System.in);
	private String[] id = new String[2];
	private String[] pwd = new String[2];
	private String tmpId;
	private String tmpPwd;
	private boolean succes=false;
	public void register() {
		System.out.println("계정 생성");
		for (int i=0; i<id.length; i++) {
			System.out.println("새 아이디 입력하세요");
			id[i]=sc.nextLine();
			System.out.println("새 비밀번호를 입력하세요");
			pwd[i]=sc.nextLine();
		}
	}
	public void login() {
		while (succes==false) {
			for (int i=0; i<id.length; i++) {
				System.out.println("아이디를 입력하세요");
				tmpId=sc.nextLine();
				System.out.println("비밀번호를 입력하세요");
				tmpPwd=sc.nextLine();
				
				if (tmpId.equals(id[i]) && tmpPwd.equals(pwd[i])) {
					System.out.println("\n로그인 성공");
					System.out.println(tmpId+"님 어서오세요");
					succes=true;
					break;
				}
				else {
					System.out.println("ID나 비밀번호가 틀렸습니다 다시입력하세요");
				}
			}
		}
	}
	public void buy() {
		System.out.println("물품을 구매합니다!");
	}
}
