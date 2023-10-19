package javaexp.a06_object.vo;

public class Car {
	private int speed;
	
	public Car(int speed, String kind) {
		this.speed = speed;
		this.kind = kind;
	}
	
	public void showInf() {
		System.out.println(kind + " 속도가 " + speed + "km/h 이다");
	}
	
	
	public void speedUp() {
		speed+=10;
		showInf();
	}
	
	public void speedDown() {
		speed-=10;
		showInf();
	}
	
	private String kind;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	
	
}
