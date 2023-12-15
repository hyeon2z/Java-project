package javaexp.z02_homework.a12_ljh.vo;

public class Student2 {
	private String name;
	private int sClass;
	private Teacher teacher;
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public Student2(String name, int sClass) {
		this.name = name;
		this.sClass = sClass;
	}
	
	public void showStudentInfo() {
		System.out.println("## 학생 정보 ##");
		System.out.println("학생 이름: " + name);
		System.out.println("학생 반: " + sClass);
		if(teacher != null) {
			System.out.println("담임: " + teacher.getName());
			System.out.println("담임 과목: " + teacher.getSubject());
			System.out.println();
		}else {
			System.out.println("담임 선생님이 아직 정해지지 않았습니다.");
			System.out.println();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getsClass() {
		return sClass;
	}

	public void setsClass(int sClass) {
		this.sClass = sClass;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
