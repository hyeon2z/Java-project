package javaexp.a07_inherit.compart;

public class Cpu extends Part {
	void partUse() {
		mainPrint();
		System.out.println("정보들을 처리하는 기능");
	}
	void execute() {
		System.out.println("중앙정보처리장치");
	}
}
