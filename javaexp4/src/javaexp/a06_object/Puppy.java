package javaexp.a06_object;
// package : 어디 패키지에 소속되어 있는 클래스

public class Puppy {
	// 접근제어자 public : 외부 패키지에서 import를 사용하면 호출이 가능한 클래스
	// class Puppy : 클래스명을 대문자로 시작
	
	String kind; // 종류를 할당할 수 있는 필드
	// 같은 패키지내 클래스에서만 호출가능
	// 외부 패키지의 클래스에서는 호출불가
	
	public String name; // 이름을 할당할 수 있는 필드
	// public이 붙어서 외부패키지 클래스에서도 호출가능
	
	// public Puppy(){} : default 생성자 자동생성.
	// 설정된 생성자가 있으면 생성 X
	public Puppy(){}
}
