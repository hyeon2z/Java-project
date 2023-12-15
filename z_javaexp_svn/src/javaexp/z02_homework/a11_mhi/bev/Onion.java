package javaexp.z02_homework.a11_mhi.bev;

import javaexp.z02_homework.a11_mhi.fruit.Apple;
import javaexp.z02_homework.a11_mhi.fruit.Melon;

public class Onion {
	// 상속하지않는 일반클래스 호출
			public void callMelon() {
				Melon me = new Melon();
				//System.out.println("private:"+me.privateStr);
				//System.out.println("default:"+me.defaultStr);
				//System.out.println("protected:"+me.protectedStr);
				System.out.println("public:"+me.publicStr);
				
				//System.out.println(me.taste); //타 패키지 default 접근제어자 접근x 
			}
//			
			public void callApple() {
				Apple ap = new Apple();
	//			System.out.println(ap.shape); //사과 클래스에서 private로 선언된 변수 외부 클래스에서 접근 불가능
			}
			
}
