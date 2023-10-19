package javaexp.a07_inherit.starcraft;

public class Dron extends Larba {
	// 오타에 의해 재 정의가 아닌 추가메서드로 인식
	public void attack1() {
		System.out.println("드론이 공격합니다");
	}
	// 추상메서드를 상속받은 클래스는
	// 추상메서드를 반드시 선언하여야 한다. (필수오버라이딩)
	@Override
	public void attack() {
		System.out.println("드론이 공격합니다(new)");
		// TODO Auto-generated method stub
		
	}
}
