package javaexp.z01_homework.fruit;

public class Apple {
	private String tasteSec="좋은 날씨와 성실한 농부";
	
	void callAppleInfo() {
		Apple a = new Apple();
		System.out.println(a.tasteSec);
	}
	
	
	public void callMellonInfo() {
		Mellon m = new Mellon();
		System.out.println(m.taste);
	}
}
