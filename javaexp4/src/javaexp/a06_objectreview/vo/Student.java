package javaexp.a06_objectreview.vo;

public class Student {
	private int num;
	private String name;
	private Subject subject;
	
	public Student() {}
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public void showMyPoint() {
		System.out.println("#학생의 정보#");
		System.out.println("학생의 번호 : " + num);
		System.out.println("학생의 이름 : " + name);
		if(subject != null) {
			System.out.println("과목 : " + subject.getClss());
			System.out.println("점수 : " + subject.getScore());
		}
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
