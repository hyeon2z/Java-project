package javaexp.z02_homework.a12_ljh.a1011.fruit2;

import javaexp.z02_homework.a12_ljh.a1011.fruit.KoreanMelon;

public class WaterMelon extends KoreanMelon{
	
	public void showInfo() {
		KoreanMelon km1 = new KoreanMelon();
		// 상속 관계 없는 클래스에서 ==> 객체 생성 + 호출
//		System.out.println(km1.taste);		// default
//		System.out.println(km1.color);		// private
		System.out.println(type);			// protected
		// 상속 관계 있는 클래스에서 ==> 변수/메서드 호출
		System.out.println(relation);
//		System.out.println(km1.relation);	// 객체 생성으로 호출하는 것으로 상속 개념으로 사용하는 것이 아니기에 접근 불가
		System.out.println(km1.kind);		// public
	}
}
