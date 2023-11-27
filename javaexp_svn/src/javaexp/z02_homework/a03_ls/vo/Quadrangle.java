package javaexp.z02_homework.a03_ls.vo;

public class Quadrangle {
	int x;
	int y;
	public Quadrangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int area1() {
		return x*y;
	}
	public int area2() {
		return (x+y)*2;
	}
	public void quadrangleInfo() {
		System.out.println("# 사각형 정보 #");
		System.out.println("가로길이:"+x);
		System.out.println("세로길이:"+y);
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
