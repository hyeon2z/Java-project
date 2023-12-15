package javaexp.z02_homework.a01_kjh.vo;

public class Student {
	int num;
	String name;
	int grade;
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
		
	}
	public void stuInfo() {
		System.out.println("#학생의 정보#");
		System.out.println("학번 : " + num);
		System.out.println("이름 : " + name);
		setGrade(grade);
	}
	
	// 성적 조회
	public int getGrade() {
		return grade;
	}
	
	// 성적 입력
	public void setGrade(int grade) {
		this.grade = grade;
		System.out.println("성적 : " + grade);
	}
	
	
	
	
}
