package javaexp.z02_homework.a03_ls.vo2;

public class Subtractor extends Calculator {
	int a;
	int b;
	public Subtractor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void operation() {
		System.out.println("빼기 결과 : " + (a-b));
	}

}
