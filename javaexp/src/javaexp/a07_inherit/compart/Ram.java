package javaexp.a07_inherit.compart;

public class Ram extends Part {
	void partUse() {
		mainPrint();
		System.out.println("Ram의 기능을 가지고 있습니다.");
	}
	void execute() {
		System.out.println("Ram의 기능");
	}
}
