package javaexp.a08_access.fruit2;

import javaexp.a08_access.fruit.Apple;
import javaexp.a08_access.fruit.Melon;

public class WaterMelon extends Melon{
	void callinfo() {
		System.out.println(cousin);
	}
	private void callMelonInfo() {
		System.out.println(cousin);
//	외부 + 상속이기에 protected 가능
	}
	private void callMelonInfor() {
		Melon a = new Melon();
//		객체생성으로 호출하는 것이기에 상속개념으로 사용하는 것이 아니라 접근 불가
//		System.out.println(a.cousin);
	}
	
}
