package javaexp.z02_homework.a03_ls.vo2;

public class Rectangle extends Shape {
	int x ;
	int y ;

	public Rectangle(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void area() {
		System.out.println( "사각형의 넓이"+(x*y)); 

	}
}
