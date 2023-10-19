package javaexp.a08_access.story1.freindship;

public class WoodCutter {
	private String hiddenCloth = "뒷동산 바위 밑 깊은곳에";
	// 접근제어자가 붙지 않는것은
	// 외부 클래스에서 호출할 때
	// 1. 같은 패키지에 있는 클래스는 접근가능
	// 2. 다른 패키지에 있는 클래스는 접근불가능
	String hiddenDeer = "덤불속에 사슴을 숨기다";
	
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
		System.out.println("private : " + wc.hiddenCloth);
		System.out.println("x(default) : " + wc.hiddenDeer);
	}
}
