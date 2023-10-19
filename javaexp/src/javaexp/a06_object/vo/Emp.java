package javaexp.a06_object.vo;

public class Emp {
	// 기본속성(private - 외부접근불가)
	private int empno;
	private String ename;
	private String job;
	private double salary;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String ename, String job, double salary) { //생성자
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("사원번호 : " + empno);
		System.out.println("사원명 : " + ename);
		System.out.println("직책명 : " + job);
		System.out.println("급여 : " + salary);
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
