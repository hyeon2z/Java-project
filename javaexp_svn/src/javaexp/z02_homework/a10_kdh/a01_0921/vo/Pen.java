package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class Pen {
	// 10. **펜 클래스**
	// - 필드: 색상, 브랜드, 가격
	// - 생성자: 색상과 브랜드 초기화
	// - 메서드: 가격 변경, 정보 출력
	private String color;
	private String brand;
	private int price;

	public Pen(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("펜 색상:" + color);
		System.out.println("펜 브랜드:" + brand);
		System.out.println("가격:" + price);
	}

}
