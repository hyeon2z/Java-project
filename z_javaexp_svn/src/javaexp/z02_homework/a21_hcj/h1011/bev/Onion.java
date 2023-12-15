package javaexp.z02_homework.a21_hcj.h1011.bev;

import javaexp.z02_homework.a21_hcj.h1011.fruit.KoreaMelon;

public class Onion {
	void CallKoreaMelon() {
		KoreaMelon km = new KoreaMelon();
		//System.out.println(km.sugarContent);	//private 본인 이외에는 접근 불가
		//System.out.println(km.price); //default 다른 패키지라 불가능
	}
}
