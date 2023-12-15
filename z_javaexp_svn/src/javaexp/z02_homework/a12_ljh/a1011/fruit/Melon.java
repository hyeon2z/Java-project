package javaexp.z02_homework.a12_ljh.a1011.fruit;

public class Melon extends KoreanMelon {


		public void showInfo() {
			KoreanMelon km1 = new KoreanMelon();
			System.out.println(km1.taste);	// default
	//		System.out.println(km1.color);	// private
			System.out.println(type);	// protected
			System.out.println(km1.kind);	// public
			System.out.println(relation);
		}
		
}
