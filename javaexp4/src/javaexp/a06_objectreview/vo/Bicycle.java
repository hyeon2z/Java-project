package javaexp.a06_objectreview.vo;

public class Bicycle {
//	Bicycle bi01 = new Bicycle();
	public Bicycle() {
		System.out.println("매개변수없음 " + this);
	}
//	Bicycle bi02 = new Bicycle("이름");
	public Bicycle(String name) {
		System.out.println("매개변수 1개 " + this);
		System.out.println("자전거의 이름 : " + name);
	}
//	Bicycle bi03 = new Bicycle("이름", 0);
	public Bicycle(String name, int num) {
		System.out.println("매개변수 2개 " + this);
		System.out.println("자전거의 이름 : " + name);
		System.out.println("자전거의 개수 : " + num);
	}
}
