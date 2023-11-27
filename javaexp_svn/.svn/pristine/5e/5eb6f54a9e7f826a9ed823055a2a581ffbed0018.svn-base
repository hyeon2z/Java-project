package javaexp.z02_homework.a03_ls.vo;

public class Team {
	int number;
	String tName;
	Member member;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Team(int number, String tName) {
		this.number = number;
		this.tName = tName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public void showMyTeam() {
		if(member!=null) {
			System.out.println("###맴버 정보###");
			System.out.println("소속된 팀 이름 : "+tName);
			System.out.println("소속된 팀 인원수 : "+number);
			System.out.println("맴버 이름 : "+member.getName());
			System.out.println("맴버 나이 : "+member.getAge());
		}else {
			System.out.println("소속된 팀이 없습니다.");
		} 
	}

}
