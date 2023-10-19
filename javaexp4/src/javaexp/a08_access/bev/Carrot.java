package javaexp.a08_access.bev;

import javaexp.a08_access.fruit.Apple;
import javaexp.a08_access.fruit.Melon;

public class Carrot {
	public void callTaste() {
		Melon m1 = new Melon();
//		System.out.println(m1.cousin);
//		m1.taste();
	}
	void callApple() {
		Apple ap1 = new Apple();
//		System.out.println(ap1.apple);
	}
	private void callMelonInfo() {
//		System.out.println(cousin);
	}
	private void callAppleInfo() {
		Apple a = new Apple();
//		System.out.println(a.cousin);
	}
}
