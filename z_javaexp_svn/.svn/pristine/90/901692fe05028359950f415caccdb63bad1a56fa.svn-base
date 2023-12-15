package javaexp.z02_homework.a14_cms.vo;

public class Member {
	private String name;
	private int height;
	private int age;
	private int no; //등번호
	private Team team;
	
	public Member() {
		
	}

	public Member(String name, int height, int age, int no) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.no = no;
	};
	public void show() {
		System.out.println("선수명: " + name);
		System.out.println("신장: " + height);
		System.out.println("선수 나이: " + age);
		System.out.println("선수 등번호: " + no);
		if(team!=null) {
			team.showTeamInfo();
		}else System.out.println("팀 정보 없음");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	

}
