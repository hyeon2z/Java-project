package springweb.z01_vo;

public class Depart {
	private int no; // DEPTNO
	private String name; // DNAME
	private String location; // LOC
	public Depart() {
		// TODO Auto-generated constructor stub
	}
	public Depart(int no, String name, String location) {
		this.no = no;
		this.name = name;
		this.location = location;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
