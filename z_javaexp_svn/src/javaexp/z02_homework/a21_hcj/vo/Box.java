package javaexp.z02_homework.a21_hcj.vo;
//	4. **사각형 클래스**
//	    - 필드: 가로, 세로
//	    - 생성자: 가로와 세로 초기화
//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
public class Box {
	private int width;
	private int height;
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int Area() {
		return width * height;
	}
	public int Around() {
		return (width*2) + (height*2);
	}
	public void ShowInfo() {
		System.out.println("사각형 정보");
		System.out.println("넓이:"+width);
		System.out.println("높이:"+height);
	}
	
	
}
