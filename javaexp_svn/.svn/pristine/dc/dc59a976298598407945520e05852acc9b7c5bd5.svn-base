package javaexp.z02_homework.a02_oys.vo0921;

/*4. **사각형 클래스**
    - 필드: 가로, 세로
    - 생성자: 가로와 세로 초기화
    - 메서드: 넓이 계산, 둘레 계산, 정보 출력*/
public class Rectangle {
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	// 넓이
	public int area() {
		return width * length;
	}
	
	// 둘레
	public int circum() {
		return (width + length) * 2;
	}
	
	// 정보출력
	public void rectangleInfo () {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + length);
		System.out.println("둘레 : " + this.circum());
		System.out.println("넓이 : " + this.area());
	}
}
