package backendweb.z01_vo.homework;

public class Vote {
	private String name;
	private String kind;
	private String score;
	public Vote() {
		// TODO Auto-generated constructor stub
	}
	public Vote(String name, String kind, String score) {
		this.name = name;
		this.kind = kind;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}
