package javaexp.a07_inherit.vo;

public class Mother {
	// 접근제어자 public
	// 어머니의 hobby(필드)
	// 어머니가 cooking() 요리를 한다.(메서드)
	public String hobby;
	public void cooking() {
		System.out.println("요리를 잘 한다!!");
	}
}
// ex) public class Daughter 위 Mother 상속
//          추가적인 필드 height(키)
//          추가적인 goShpping() 쇼핑을 하다(메서드)
// A01_Basice에서 Daughter 객체  필드 및 메서드호출

