package javaexp.a06_objectreview.vo;

public class Student {
	private int no;
	private String name;
	private Subject subject;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public void showMyPoint() {
		System.out.println("# 학생 정보 #");
		System.out.println("번호:"+no);
		System.out.println("이름:"+name);
		if(subject!=null) {
			System.out.println("과목명:"+subject.getName());
			System.out.println("점수:"+subject.getPoint());
		}else {
			System.out.println("과목에 대한 정보가 없습니다.");
		}
		System.out.println("============");
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
