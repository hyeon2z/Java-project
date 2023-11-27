package javaexp.z02_homework.a11_mhi.vo;

public class Member {
	private String name;
	private int age;
	private Team team;
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public  void showInfo() {
		System.out.println("#멤버 정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(team!=null) {
			System.out.println("팀 이름:"+team.getTeamName());
			System.out.println("팀 인원:"+team.getPersonCnt());
		
		}else {
			System.out.println("팀 정보가 아직 없습니다.");
		}
		System.out.println("============");
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
}
