package javaexp.z02_homework.a03_ls.vo;

public class Teacher {
	String name;
	int stuNo;
	Stu stu;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int stuNo) {
		this.name = name;
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public Stu getStu() {
		return stu;
	}
	public void setStu(Stu stu) {
		this.stu = stu;
	}
	

}
