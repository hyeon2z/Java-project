package javaexp.z02_homework.a12_ljh.a1011.beg;

import javaexp.z02_homework.a12_ljh.a1011.fruit.Apple;
import javaexp.z02_homework.a12_ljh.a1011.fruit.KoreanMelon;

public class Carrot {
	
	Apple a01 = new Apple();
	KoreanMelon km1 = new KoreanMelon();
	
//	public void callAppleInfo() {
//		Apple a = new Apple();
//		System.out.println(a.tasteSec);
//	}
	// private
			
		
		public void showInfo() {
//			System.out.println(km1.taste);	// default
//			System.out.println(km1.color);	// private
//			System.out.println(km1.type);	// protected
//			System.out.println(relation);	// 같은 패키지 X, 상속 X
			System.out.println(km1.kind);	// public
//			System.out.println(a01.color);	// private
		}
		
}
