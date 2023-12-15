package javaexp.z02_homework.a11_mhi.fruit;

public class Apple {
	
	private String shape="동글동글 하다";
	
	public void callMelon() {
		// 상속하지않는 일반클래스 호출
		Melon me = new Melon();
//		System.out.println("private:"+me.privateStr);// 같은 클래스 내에서만 접근 가능하여 ,접근 불가능
		System.out.println("default:"+me.defaultStr);
		System.out.println("protected:"+me.protectedStr);
		System.out.println("public:"+me.publicStr);
		
		System.out.println(me.taste);
	}
	
	
	private void callApple() {
		Apple ap = new Apple();
		System.out.println(ap.shape);
	}
}
