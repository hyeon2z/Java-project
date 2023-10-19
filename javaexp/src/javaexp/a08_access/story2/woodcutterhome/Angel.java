package javaexp.a08_access.story2.woodcutterhome;

public class Angel {
	public void callWoodCutter() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private : " + wc.privSecurity);
	
		System.out.println("default : " + wc.savingMoney);
		System.out.println("protected : " + wc.inhiritance);
		System.out.println("public : " + wc.announce);
	}
}
