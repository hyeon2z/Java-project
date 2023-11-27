package javaexp.z02_homework.a14_cms.vo;

public class Student2 {
	private String name;
	private int grade; //학년
	private int classNo; //반
	private Teacher teacher;
	public Student2() {
	}
	public Student2(String name, int grade, int classNo) {
		this.name = name;
		this.grade = grade;
		this.classNo = classNo;
	}
	void showStudentInfo() {
		System.out.println("학생명: " + name);
		System.out.println("학년: " + grade);
		System.out.println("반: " + classNo);
		if(teacher!=null) {
			teacher.showTeacherInfo();
		}else System.out.println("반이 지정되지 않았습니다.");
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
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
