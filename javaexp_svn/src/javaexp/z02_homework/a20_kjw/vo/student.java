package javaexp.z02_homework.a20_kjw.vo;

public class student {
	
	private String name;
	private int stu_id;
public student() {
		
	}
public student(String name, int stu_id) {
	this.name = name;
	this.stu_id = stu_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStu_id() {
	return stu_id;
}
public void setStu_id(int stu_id) {
	this.stu_id = stu_id;
}
}
