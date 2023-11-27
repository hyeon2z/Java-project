package javaexp.z02_homework.a03_ls.vo2;

public class Dog extends Animal {
	public Dog() {
		super("강아지");
	}
	public void sound() {
		System.out.println(this.kind+"가 멍멍하고 웁니다" );
	}
}
