package a01_diexp.z01_homework_vo;

public class Note {
	private String name;
	private Pen pen;
	public Note() {
		// TODO Auto-generated constructor stub
	}
	public Note(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	public void setPen01(Pen pen) {
		this.pen = pen;
	}
	public void setPen02(Pen pen) {
		this.pen = pen;
	}
	public void doScatch() {
		if(pen!=null) {
			System.out.println(pen.getColor());
			System.out.println(pen.getType());
		}else {
			System.out.println("펜없음");
		}
	}
}