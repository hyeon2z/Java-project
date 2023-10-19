package javaexp.a07_inherit.compart;

abstract public class Part {
	// 공통으로 컴퓨터 부품입니다. 출력 메서드 선언
	// 하위에 재정의할 기능 처리.. @@기능을 가지고
	// Cpu, Ram, Ssd 클래스 생성 재정의 메서드 처리
	// 공통기능
	void mainPrint() {
		System.out.println("컴퓨터 부품 입니다.");
	}
	// 재정의한 기능 :
	// ex) 추상메서드 정의 ==> 추상클래스 선언
	// 메인에서 에러나지 않게 처리
	void partUse() {
		mainPrint();
		System.out.println("`부품` 기능을 가지고 있습니다.");
	}
	abstract void execute();
}
