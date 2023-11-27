package javaexp.z02_homework.a10_kdh.mini;

import java.util.Scanner;

public class Member {

	private int memberNumber;
	private String memberID;
	private String passWord;
	boolean isMember;
	
	public Member() {}
	
	public Member(int memberNumber, String memberID, String passWord) {
		this.memberNumber = memberNumber;
		this.memberID = memberID;
		this.passWord = passWord;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void join() {
		System.out.print("아이디를 입력하세요:");
		setMemberID(scanner.nextLine());
		System.out.print("비밀번호를 입력하세요:");
		setPassWord(scanner.nextLine());
		System.out.println("회원가입 완료!!");
	}
	
	public void login() {
		System.out.print("아이디를 입력하세요:");
		String id = (scanner.nextLine());
		System.out.print("비밀번호를 입력하세요:");
		String password = (scanner.nextLine());
		if(id.equals(this.memberID) && password.equals(this.passWord)) {
			System.out.println("로그인 성공!!");
			System.out.println();
			this.isMember = true;
		}else if (id.equals(this.memberID)) {
			System.out.println("로그인 실패");
			System.out.println("비밀번호가 틀렸습니다.");
			System.out.println();
			this.isMember = false;
		}else {
			System.out.println("로그인 실패");
			System.out.println("아이디와 비밀번호를 확인하십쇼");
			System.out.println();
			this.isMember = false;
		}
	}
	
	
	
	
	
}
