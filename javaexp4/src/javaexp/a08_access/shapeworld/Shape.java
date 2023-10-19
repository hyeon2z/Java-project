package javaexp.a08_access.shapeworld;

public class Shape {
	protected void drawing() { // 상속 + 외부패키지
		System.out.println("도형을 그리다");
	}
	void painting() { // 패키지가 동일할 때 접근가능
		System.out.println("색칠");
	}
	// public : 상속관계 없더라도 접근하여 호출 가능
}
