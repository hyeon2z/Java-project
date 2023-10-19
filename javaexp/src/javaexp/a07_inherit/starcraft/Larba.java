package javaexp.a07_inherit.starcraft;

abstract public class Larba {
	// 모든 유닛에 공통되는 내용 처리
	public void gameInfo() {
		System.out.println("저그 유닛입니다");
	}
	
	// 각 유닛마다 재정의할 내용..
	// 추상클래스마다 재정의할
	public abstract void attack();

}
