package javaexp.z02_homework.a11_mhi.fruit;

public class KoMelon extends Melon{
	
	/* 
	 # 상속관계에 있는 같은 패키지에서는 default와 protected가 상관 없이 처리된다.
	 */
	
	// 상속하는 클래스에서 호출
			public void callMelonInhit() {
				//System.out.println("private:"+privateStr);//같은 클래스 내에서만 접근 가능하여 ,접근 불가능
				System.out.println("default:"+defaultStr);
				System.out.println("protected:"+protectedStr);
				System.out.println("public:"+publicStr);		
				
				System.out.println("default"+taste);
				System.out.println("protected"+relationship);
				
				
				
			}
			
			// 상속하지않는 일반클래스 호출
			public void callMelon() {
				Melon me = new Melon();
				
				System.out.println("default"+me.taste);
				System.out.println("protected"+me.relationship);
				
			}
			
			
			
			
			
			
}
