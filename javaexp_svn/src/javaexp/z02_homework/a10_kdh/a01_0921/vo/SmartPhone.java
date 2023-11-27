package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class SmartPhone {
	// 8. **스마트폰 클래스**
	// - 필드: 브랜드, 모델, 가격
	// - 생성자: 브랜드와 모델 초기화
	// - 메서드: 가격 변경, 정보 출력
	//
	private String brand;
	private String model;
	private int price;

	public SmartPhone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("브랜드:" + brand);
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
	}

}
