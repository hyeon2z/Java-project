package javaexp.a08_access.fruit;

public class Melon {
	protected String cousin = "참외와 가까운 친척";
	void taste() {
		System.out.println("맛");
	}
	void callApple() {
		Apple ap1 = new Apple();
//		System.out.println(ap1.apple);
	}
	private void callMelonInfo() {
		System.out.println(cousin);
	}
	private void callAppleInfo() {
		Apple a = new Apple();
//		System.out.println(a.cousin);
	}
}
