package javaexp.z02_homework.a17_okw.vo;

public class Team {
	private String teamName;
	private String hometown;
	private Member member;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName, String hometown) {
		this.teamName = teamName;
		this.hometown = hometown;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public void showMemberInfo() {
		System.out.println("# 소속팀 #");
		System.out.println("팀명 : " + teamName);
		System.out.println("연고지 : "+hometown);
		
		if(member != null) {
			System.out.println("# 선수 정보 #");
			System.out.println("선수명 : " + member.getMemberName());
			System.out.println("포지션 : " + member.getPosition());
		}else {
			System.out.println("선수가 지정되지 않음");
		}
		System.out.println("===================");
	}
	
}
