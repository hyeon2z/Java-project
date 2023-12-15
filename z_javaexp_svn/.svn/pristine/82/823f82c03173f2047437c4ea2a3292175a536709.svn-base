package javaexp.z02_homework.a17_okw.vo;

public class Teacher {
	private String teacherName;
	private int grade;
	private Student student;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String teacherName, int grade) {
		this.teacherName = teacherName;
		this.grade = grade;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void showTeacherInfo() {
		System.out.println("# 담임 선생님 정보 #");
		System.out.println("이름 : "+teacherName);
		System.out.println("담당학년 : "+grade);
		if(student != null) {
			System.out.println("# 학생 정보 #");
			System.out.println("번호 : "+ student.getStudentNo());
			System.out.println("학생 이름 : "+student.getStudentName());
		}else {
			System.out.println("학생 정보가 없습니다.");
		}
		System.out.println("========================");
	}
}
