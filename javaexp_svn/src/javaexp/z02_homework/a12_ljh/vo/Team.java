package javaexp.z02_homework.a12_ljh.vo;

public class Team {
	private String club;
	private int victory;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(String club, int victory) {
		super();
		this.club = club;
		this.victory = victory;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getVictory() {
		return victory;
	}
	public void setVictory(int victory) {
		this.victory = victory;
	}
	
	
}
