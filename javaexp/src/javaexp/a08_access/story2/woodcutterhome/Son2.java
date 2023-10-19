package javaexp.a08_access.story2.woodcutterhome;

public class Son2 extends WoodCutter{
	public void callWoodCutterInhit() {
		// 상속해도 private는 접근불가
		System.out.println("default : " + savingMoney);
		System.out.println("protected : " + inhiritance);
		System.out.println("public : " + announce);
	}
}