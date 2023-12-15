package javaexp.z02_homework.a03_ls.vo;

public class Cat extends Animal {
	public Cat() {
		super("고양이");
	}
	String sound = "냥냥";
	public void sound() {
		super.sound();
		System.out.println(this.kind+"울음소리 : "+this.sound);
	}
}
