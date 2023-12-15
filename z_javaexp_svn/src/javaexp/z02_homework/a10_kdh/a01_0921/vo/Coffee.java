package javaexp.z02_homework.a10_kdh.a01_0921.vo;

public class Coffee {

	// 6. **커피 클래스**
	// - 필드: 종류, 가격, 원산지
	// - 생성자: 종류 초기화
	// - 메서드: 가격 변경, 원산지 입력, 정보 출력
	//
	private String kind;
	private int price;
	private String origin;

	public Coffee(String kind) {
		this.kind = kind;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void showInfo() {
		System.out.println("종류:" + kind);
		System.out.println("가격:" + price);
		System.out.println("원산지:" + origin);
	}
}
