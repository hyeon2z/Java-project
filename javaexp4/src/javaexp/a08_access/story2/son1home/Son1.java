package javaexp.a08_access.story2.son1home;

import javaexp.a08_access.story2.woodcutterhome.WoodCutter;

public class Son1 extends WoodCutter {
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSecurity);
//		System.out.println("default : " + wc.savingMoney);
		System.out.println("protected : " + inhiritance);
		// 상속한 클래스는 protected 외부패키지에 있더라도 접근 가능
		System.out.println("public : " + announce);
		
	}
}