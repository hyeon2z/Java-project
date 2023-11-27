package javaexp.z02_homework.a21_hcj.h1011.fruit;

public class Strawberry {
	void CallKoreaMelon() {
		KoreaMelon km = new KoreaMelon();
		//System.out.println(km.sugarContent);	//private 본인 이외에는 접근 불가
		System.out.println(km.price); // 같은 패키지내라 가능
	}
}
