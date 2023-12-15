package javaexp.a06_object.vo;

public class Emp {
	// 기본속성(private-외부접근불가)
	private int empno;
	private String ename;
	private String job;
	private double salary;
	public Emp() {
	}
	public Emp(int empno, String ename, String job, double saleary) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = saleary;
	}
	public void show() {
		System.out.print("사원번호:"+empno);
		System.out.print("사원명:"+ename);
		System.out.print("직책명:"+job);
		System.out.print("급여:"+salary);
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
