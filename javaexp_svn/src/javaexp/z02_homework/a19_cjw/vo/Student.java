package javaexp.z02_homework.a19_cjw.vo;

import java.util.Scanner;

public class Student {

	private int no;
	private String name;
	private int point;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int inputpoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int nowpoint = Integer.parseInt(sc.nextLine());
		point = nowpoint;
		System.out.print("점수: ");
		return point;
	}
	
	public void studentInfo() {
		System.out.println("학번: "+no);
		System.out.println("이름: "+name);
		System.out.println("성적: "+point);
	}

	public int getPoint() {
		System.out.print("성적 조회: ");
		return point;
	}
	
}
