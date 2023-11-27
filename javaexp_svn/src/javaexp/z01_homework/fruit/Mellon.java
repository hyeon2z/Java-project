package javaexp.z01_homework.fruit;

import javaexp.z01_homework.bev.Carrot;

public class Mellon {
	String taste = "달고 맛난 참외맛";
	protected String spec = "참외와 가까운 친척들 접근!!";
	// 상속관계 없는 클래스에서
	private void callMellonInfo() {
		Mellon m = new Mellon();
		System.out.println("default:"+m.taste);
		System.out.println("protected:"+m.spec);
	}
	// 상속관계가 있는 클래스에서
	private void callMellonInfoInherit() {
		System.out.println("default:"+taste);
		System.out.println("protected:"+spec);
	}	
	public void callAppleInfo() {
		Apple a = new Apple();
//		System.out.println(a.tasteSec);
		Carrot c = new Carrot();
		c.callMellonInfo();
	}
	
	
	
}
