package javaexp.z02_homework.a14_cms.vo;

public class Team {
	private String name;
	private String hometown; // 연고지
	
	public Team() {}

	public Team(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
	};
	public void showTeamInfo() {
		System.out.println("팀명은 "  + name);
		System.out.println("연고지 "  + hometown);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	

}
