package frontweb.vo;

public class DeptCntAvgSal {
 	private int deptno;
 	private int cnt;
 	private double avgsal;
	public DeptCntAvgSal() {
		// TODO Auto-generated constructor stub
	}
	public DeptCntAvgSal(int deptno, int cnt, double avgsal) {
		this.deptno = deptno;
		this.cnt = cnt;
		this.avgsal = avgsal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public double getAvgsal() {
		return avgsal;
	}
	public void setAvgsal(double avgsal) {
		this.avgsal = avgsal;
	}
 	
}
