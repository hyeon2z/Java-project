package javaexp.z02_homework.a17_okw.vo;

public class Member {
	private String memberName;
	private String position;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberName, String position) {
		this.memberName = memberName;
		this.position = position;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
