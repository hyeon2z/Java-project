package javaexp.z02_homework.a01_kjh.vo2;

public class Teacher {
	private String grade;
	private String name;
	private int age;
	private Student student;
	
	public Teacher() {}
	public Teacher(String grade, String name, int age) {
		this.grade = grade;
		this.name = name;
		this.age = age;
	}
	public void teacherInfo() {
		System.out.println("#교사정보#");
		System.out.println("담당 학반 : " + grade);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if(student != null) {
			System.out.println("담당학생 이름 : " + student.getName());
			System.out.println("담당학생 번호 : " + student.getNum());
		}else {
			System.out.println("담당학생이 없습니다.");
		}
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
