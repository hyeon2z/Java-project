package frontweb.homework_vo;

import java.util.Date;

public class Emp7 {
	String ename;
	Date hiredate;
	public Emp7() {
		// TODO Auto-generated constructor stub
	}
	public Emp7(String ename, Date hiredate) {
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
