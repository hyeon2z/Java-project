package javaexp.z02_homework.vo2;

public class Team {
	private String tname;
	private int year;
	private Member member;
	
	public Team() {}
	
	public Team(String tname, int year) {
		this.tname = tname;
		this.year = year;
	}
	public void teamInfo() {
		System.out.println("#팀 정보#");
		System.out.println("팀 이름 : " + tname);
		System.out.println("설립일 : " + year);
		if(member != null) {
			System.out.println("멤버 이름 : " + member.getName());
			System.out.println("멤버 나이 : " + member.getAge());
		}else {
			System.out.println("멤버가 없습니다");
		}
	}
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
}
