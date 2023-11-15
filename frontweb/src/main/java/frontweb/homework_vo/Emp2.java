package frontweb.homework_vo;

import java.util.Date;

public class Emp2 {
	String ename;
	Date hiredate;
	public Emp2() {
		// TODO Auto-generated constructor stub
	}
	public Emp2(String ename, Date hiredate) {
		this.ename = ename;
		this.hiredate = hiredate;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}
