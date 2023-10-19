package javaexp.a07_inherit;

public class A02_Super {

	public static void main(String[] args) {
		/*
		# 상속관계에 있어서 super
		1. 필드
			상위에서 선언된 필드를 그대로 사용할 수 있지만, 재정의했을 때
			상위에 선언된 필드와 하위에 선언된 필드를 구분할 때, super를 이용한다. (실무적 활용도는낮음)
			this.필드 : 현재필드
			super.필드 : 상위필드
		
		2. 생성자
			상속을 하는 순간, 반드시 상위에 선언된 생성자를 호출하여야 한다.
			1) default 생성자
			2) 사용자정의 생성자
				- 매개변수가 있는 경우
				- 매개변수가 없는 경우
		
		3. 메서드
			상위에 선언된 메서드와 구분을 위해 사용
		
		 */
		
//		Child c1 = new Child();
//		c1.show();
//		
//		ElectronCar ec1 = new ElectronCar();
//		Car c2 = new Car();
//		
//		c2.kind = "전기차";
//		c2.startEngine();
//		ec1.show();
//		
//		ec1.kind = "테슬라";
//		ec1.show();
		
		EleProduct ep = new EleProduct();
		System.out.println(ep.kind);
		EleProduct2 ep2 = new EleProduct2();
//		EleProduct2 ep3 = new EleProduct2("호출"); 매개변수가 맞는 생성자가 생성되어있지않아 오류
		EleProduct3 ep3 = new EleProduct3();
		
		Product01 pro01 = new Product01("사과");
		Fruit01 fru01 = new Fruit01("과일");
		System.out.println(pro01.name);
		System.out.println(fru01.name);
	}

}
class Product {
	String kind = "기본 물건";
}
class EleProduct extends Product {
//	public EleProduct () {} // default(컴파일시 자동호출)
}

class Product2 {
	String kind = "기본 물건";
}
class EleProduct2 extends Product2 {
	public EleProduct2 () {
		System.out.println("선언된 생성자 내용 호출");
	}
}
// EleProduct3 ep3 = new EleProduct3();
// 상위에 있는 System.out.println("선언된 생성자 내용 호출");
// 이 부분이 super 에 의해 호출되고
// 하위에있는 생성자 내용이 출력된다.
// default로 상위 클래스 생성자 호출이 있기때문

class EleProduct3 extends Product2 {
	public EleProduct3 () {
//		super() : default 상위클래스 생성자 호출
		// 상속관계에서 모든 생성자에서는 default 상위 생성자 호출 형식을 처리한다.
		System.out.println("선언된 생성자 내용 호출(default생성자)");
	}
}
class Product4 {
	Product4(){
		System.out.println("### 상위클래스 생성자 호출");
	}
}
class EleProduct4 extends Product4 {
	public EleProduct4(){
		// ## 주의 반드시 상위 생성자에 있는 생성자를 호출하여야 한다.
		// default로는 super()
		System.out.println("### 선언된 생성자 내용 호출4");
	}
}
class Product5 {
//	 Product5(){}
	// 상위에 매개변수가 있는 생성자 선언
	Product5(String name){
		System.out.println("### 상위클래스 생성자 호출 : " + name);
	}
}
class EleProduct5 extends Product5 {
	public EleProduct5(){
		//
		super("a");
		// ## 주의 반드시 상위 생성자에 있는 생성자를 호출하여야 한다.
		// default로는 super()
		System.out.println("### 선언된 생성자 내용 호출4");
	}
}
class Vehicle {
	String kind;
	Vehicle(String kind) {
		this.kind = kind;
	}
}
class Car extends Vehicle {
	// public Car() {}
	Car(){
		super("자동차"); // 상위에 있는 생성자를 반드시 호출하는 코드를 설정하여야 한다.
	}
}
// ex) Product01 클래스에 name으로 필드를 선언하고 초기화하는 생성자 선언
//		Fruit01 클래스로 과일이라는 문자열로 상위 생성자를 호출하여 처리
class Product01{
	String name;
	
	Product01(String name){
		this.name = name;
	}
}
class Fruit01 extends Product01 {
	String kind;
	Fruit01(String kind){
		super("바나나");
		this.kind = kind;
	}
}



// ex) Car(kind, startEngine()), ElectronCar 위 Car상속
//		super키를 활용해서 필드와 메서드를 상위/현재 클래스 호출해서 출력

class Parent{
	String name = "부모님";
	void show() {
		System.out.println("부모 클래스의 메서드");
	}
}
class Child extends Parent{
	String name = "자식"; // 상위클래스의 필드 재정의
	void show() {
		super.show(); // 같은 이름의 부모클래스의 메서드 호출
		System.out.println("자식 클래스의 메서드");
		System.out.println("# 필드 #");
		System.out.println("현재 객체의 필드 : " + this.name);
		System.out.println("부모 객체의 필드 : " + super.name);
	}
}