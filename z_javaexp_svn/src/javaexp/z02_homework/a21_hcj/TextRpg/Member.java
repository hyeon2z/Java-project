package javaexp.z02_homework.a21_hcj.TextRpg;

import java.util.Scanner;

public class Member {
	private String id;
	private String pass;
	private String name;
	private Charactor mycharactor;
	

	public Charactor getMycharactor() {
		return mycharactor;
	}


	public void setMycharactor(Charactor mycharactor) {
		this.mycharactor = mycharactor;
	}
	public Member() {}

	public Member(String id, String pass, String name) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.mycharactor = new Charactor(this.name);
		this.mycharactor.newinven(5);
	}


	public void callinfo() {
		mycharactor.showinfo();
	}
	public String getId() {
		return id;
	}


	public String getPass() {
		return pass;
	}


	public String getName() {
		return name;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("##회원가입##");
		System.out.println("아이디:");
		id = sc.nextLine();
		System.out.println("패스워드:");
		pass = sc.nextLine();
		System.out.println("닉네임:");
		name = sc.nextLine();
		mycharactor = new Charactor(name);
	}
	
	
	
	
}
