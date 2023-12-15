package javaexp.z02_homework.a12_ljh.vo;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public void InputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		score = Integer.parseInt(sc.nextLine());
		System.out.println("입력한 성적: " + score);
	}
	
	public void showScore() {
		System.out.println("[성적 조회]");
		System.out.println(name + "님의 성적은 " + score + "점 입니다.");
	}
	
	public void showInfo() {
		System.out.println("[정보 조회]");
		System.out.println("학번: " + id +  " 이름: " + name);
	}
	
	
}
