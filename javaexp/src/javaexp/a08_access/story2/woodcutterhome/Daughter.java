package javaexp.a08_access.story2.woodcutterhome;

public class Daughter extends WoodCutter{
	public void callWoodCutterInhit() {
		System.out.println("default : " + savingMoney);
		System.out.println("protected : " + inhiritance);
		System.out.println("public : " + announce);
	}
	/*
	ex) a08_access.shapeworld
			Shape 클래스 선언
				protected 메서드
					도형을 그리다
		a08_access.triworld
			Triangle 클래스를 위 Shape를 상속받아서
				protected 메서드를 호출하게 처리.
	*/
}
