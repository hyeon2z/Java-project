package javaexp.z02_homework.a21_hcj.h1011.fruit;

public class Melon extends KoreaMelon {
	void showInf() {
		System.out.println("가격:"+price);	// 같은 패키지 내라 가능
	//	System.out.println("당도:"+sugarContent); private라 부모의 것을 가져올수 없음
		System.out.println("품종:"+kind);		// 자손이라 가능
		System.out.println("이름:"+name);		// public라 가능
	}
}
