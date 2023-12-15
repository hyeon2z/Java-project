package javaexp.z02_homework.a03_ls.vo;

public class Dog extends Animal {
	String sound = "멍멍";
	public Dog() {
		super("강아지");
	}
	public void sound() {
		super.sound();
		System.out.println(this.kind+"울음소리 : "+this.sound);
	}

}
