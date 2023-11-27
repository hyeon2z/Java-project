package javaexp.z02_homework.a04_asy.vo;

public class Game {
	
	private String name;
	private int level=1;
	private int vit=1;
	
	public Game(String name) {
	this.name = name;
	}
	
	public Game(int level, int vit) {
		this.level = level;
		this.vit=vit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit= vit;
	}
	

}
