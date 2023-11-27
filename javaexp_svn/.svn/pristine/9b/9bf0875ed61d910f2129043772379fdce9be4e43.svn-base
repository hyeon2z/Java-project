package javaexp.z02_homework.a12_ljh.a1011.fruit;

public class KoreanMelon {
	String taste = "달다.";
	private String color = "노란색";
	protected String type = "멜론 종류";
	public String kind = "음식";
	protected String relation = "참외와 가까운 친척 관계";
	
	/*
	# 상속 관계에 있는 같은 패키지에 있는 클래스에서는 default와 protected가 상관 없이 처리된다.
	 */
	
	public void showInfo() {
		KoreanMelon km1 = new KoreanMelon();
		// 상속 관계 없는 클래스에서 ==> 객체 생성 + 호출
		System.out.println(km1.taste);	// default
		System.out.println(km1.color);	// private
		System.out.println(type);	// protected
		// 상속 관계 있는 클래스에서 ==> 변수/메서드 호출
		System.out.println(relation);
		System.out.println(km1.kind);	// public
	}
	
}
