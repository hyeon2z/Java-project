package javaexp.a07_inherit.vo;

public class ElectronCar extends Car {
	public ElectronCar() {}
	
	// 같은 필드에 다른 이름을 사용
	// 클래스 하위에서 선언하여 호출하여야 한다.
	// 현재 클래스에 있는 멤버(구성요소)와 상위 클래스에 있는 내용을
	// 구분하기 위해서 super, this 사용
	public void show() {
		System.out.println("차량 종류 : " + this.kind);
		startEngine();
		System.out.println("부모 : " + super.kind);
	}
}
/*
public class ElectronCar extends Car{
	public String kind = "전기자동차";
	
	public void startEngine(){
		System.out.println(super.kind+"를작동")
		System.out.println("자동차의 종류"+ this.kind)
		super.startEngine();
 */
