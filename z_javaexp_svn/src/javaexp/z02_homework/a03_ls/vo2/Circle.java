package javaexp.z02_homework.a03_ls.vo2;

public class Circle extends Shape {
	double a;

	public Circle(double a) {
		this.a=a;
	}
	public void area() {
		System.out.println("원의넓이"+(int)Math.floor(a*a*Math.PI));

	}
	
}
