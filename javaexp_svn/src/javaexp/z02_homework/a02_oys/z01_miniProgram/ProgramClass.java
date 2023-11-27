package javaexp.z02_homework.a02_oys.z01_miniProgram;

import java.util.Scanner;

public class ProgramClass {
	Scanner scan = new Scanner(System.in);
	User u01;
	public void call() {
		System.out.println("입력하세요:");
		String name = scan.nextLine();
		System.out.println(name);
	}
	public void login(User u) {
		u01 = u;
	}
	
	public void showInf() {
		System.out.println(u01.getUserId());
	}
	
}
