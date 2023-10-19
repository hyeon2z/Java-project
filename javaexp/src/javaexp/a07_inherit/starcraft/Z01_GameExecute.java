package javaexp.a07_inherit.starcraft;

public class Z01_GameExecute {

	public static void main(String[] args) {
//		Larba l1 = new Larba();
		// 추상클래스는 하위 객체를 위해 만들어지기 때문에
		// 독립적으로 객체생성을 하지 못한다.
//		l1.attack();
		Dron d1 = new Dron();
		d1.attack(); // 동일한 메서드에서 재정의(오버라이딩) 호출
		Zergling z1 = new Zergling();
		z1.attack();
		Hydra h1 = new Hydra();
		h1.attack();
		// 공통으로 동일한 내용 처리
//		l1.gameInfo();
		d1.gameInfo();
		z1.gameInfo();
		h1.gameInfo();
		Larba l2 = new Dron();
		Larba l3 = new Zergling();
		Larba l4 = new Hydra();
		System.out.println("다형성에 의해 만들어진 재정의 메서드");
		l2.attack();
		l3.attack();
		l4.attack();
	}

}
