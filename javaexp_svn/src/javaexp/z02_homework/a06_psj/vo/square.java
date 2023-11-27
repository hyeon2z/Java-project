package javaexp.z02_homework.a06_psj.vo;

public class square {
	int w;
	int h;
	public square(int w, int h) {
		this.w = w;
		this.h = h;
	}
	public int sqArea() {
		return w*h;
	}
	public int sqRound() {
		return 2*(w+h);
	}
	public void sqInfo() {
		System.out.println("가로길이: "+w);
		System.out.println("세로길이: "+h);
		System.out.println("넓이: "+sqArea());
		System.out.println("둘레: "+sqRound());
	}
}
