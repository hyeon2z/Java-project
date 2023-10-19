package javaexp.a06_objectreview.vo;

public class Subject {
	private String clss;
	private int score;
	
	public Subject() {}
	
	public Subject(String clss, int score) {
		this.clss = clss;
		this.score = score;
	}

	public String getClss() {
		return clss;
	}

	public void setClss(String clss) {
		this.clss = clss;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
