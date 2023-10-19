package javaexp.a06_object.vo;

public class Student {
	private int num;
	private String name;
	private int grade;
	
	public void studentInfo() {
		System.out.println("#학생의 정보#");
		System.out.println("학생의 번호 : " + num);
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학년 : " + grade);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student(int num, String name, int grade) {
		this.num = num;
		this.name = name;
		this.grade = grade;
	}
}
