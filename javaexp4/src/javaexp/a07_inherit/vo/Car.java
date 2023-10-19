package javaexp.a07_inherit.vo;

public class Car {
	public String kind = "자동차";
	
	public Car() {}
	
	public void startEngine() {
		System.out.println("시동걸림");
	}
}
/*
 super는 클래스 안에서 현재 클래스와 상속해주는 상위 클래스와 멤버의 구분을 위해 사용한다.
 this.필드/메서드 : 상속관계에서는 상위 클래스에 있는 동일한 필드와 메서드를 구분하기 위해 사용한다.
 super.필드/메서드 : 상속관계에서 상위클래스의 필드와 메서드를 지칭하는 것으로 현재 필드와 메서드가 동일하게 선언되어 있을 때, 구분하기 위하여 사용한다.
 */