package javaexp.z02_homework.a10_kdh.a01_1011.fruit;

public class Melon extends OrientalMelon {
	String taste = "달고 맛있습니다.";
	@Override
	public void callOMellon() {
		Melon melon = new Melon();
		System.out.println(melon.taste);
	}

	
}
