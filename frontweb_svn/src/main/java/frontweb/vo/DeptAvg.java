package frontweb.vo;


public class DeptAvg {
	private int deptno;
	private double avsal;
	public DeptAvg() {
		// TODO Auto-generated constructor stub
	}
	public DeptAvg(int deptno, double avsal) {
		this.deptno = deptno;
		this.avsal = avsal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getAvsal() {
		return avsal;
	}
	public void setAvsal(double avsal) {
		this.avsal = avsal;
	}
	
	
}
