package javaexp.z02_homework.a12_ljh.a1018.vo;

public class Member {
	private String id;
	private String pass;
	private String name;
	private boolean excess;
	private int point;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pass, String name, boolean excess, int point) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.excess = excess;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExcess() {
		return excess;
	}

	public void setExcess(boolean excess) {
		this.excess = excess;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
