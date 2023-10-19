package javaexp.z01_homework.vo;

public class Square {
	int width;
	int length;
	
	public Square(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public void sqInfo() {
		System.out.println("#사각형의 정보#");
		System.out.println("가로 : " + width + " 세로 : " + length);
		System.out.println("사각형의 넓이 : " + sq01());
		System.out.println("사각형의 둘레 : " + sq02());
	}
	
	public int sq01() {
		return width * length;
	}
	
	public int sq02() {
		return (width + length) * 2;
	}
	
}
