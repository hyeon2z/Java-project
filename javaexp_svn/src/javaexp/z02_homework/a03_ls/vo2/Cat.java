package javaexp.z02_homework.a03_ls.vo2;

public class Cat extends Animal {
	public Cat() {
		super("고양이");
	}
	public void sound() {
		System.out.println(this.kind+"가 냥냥하고 웁니다" );
	}
}
