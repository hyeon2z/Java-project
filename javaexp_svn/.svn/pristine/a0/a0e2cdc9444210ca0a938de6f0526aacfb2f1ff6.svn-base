package javaexp.z01_homework.bev;

import javaexp.z01_homework.fruit.Mellon;

public class WaterMellon extends Mellon {
	/*
	#  상속관계에 있는 같은 패키지에 있는 클래스에선느
	  default와  protected가 상관없이 처리가 된다.
	 * */	
	// 상속관계 없는 클래스에서
	private void callMellonInfo() {		
		Mellon m = new Mellon();
//		System.out.println("default:"+m.taste);
//		객체생성으로 호출하는 것으로 상속개념으로 사용하는 것이 아니기에
//		접근 불가...
//		System.out.println("protected:"+m.spec);
	}
	// 상속관계가 있는 클래스에서
	private void callMellonInfoInherit() {
//		System.out.println("default:"+taste);
//		외부패키지 + 상속하기이 protected로 접근 가능..
		System.out.println("protected:"+spec);
	}	
}
