package javaexp.z02_homework.a21_hcj.h1011.fruit2;

import javaexp.z02_homework.a21_hcj.h1011.fruit.KoreaMelon;

public class WaterMelon extends KoreaMelon {
	void showInf() {
		//	System.out.println("가격:"+price);	// 같은 패키지 가 아니라 불가능
		//	System.out.println("당도:"+sugarContent); private: 부모의 것을 가져올수 없음 본인이외의 접근불가
			System.out.println("품종:"+kind);		// protected :자손이라 import 시가능
			System.out.println("이름:"+name);		// public: import 시가능
		}
}
