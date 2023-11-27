package javaexp.z02_homework.a12_ljh.vo;

public class Member {
	private String name;
	private int age;
	private Team team;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void showMemberInfo() {
		System.out.println("## 멤버 정보 ##");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if(team != null) {
			System.out.println("구단: " + team.getClub());
			System.out.println("우승 횟수: " + team.getVictory());
			System.out.println();
		}else {
			System.out.println("아직 구단에 들어가지 않았습니다.");
			System.out.println();
		}
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
