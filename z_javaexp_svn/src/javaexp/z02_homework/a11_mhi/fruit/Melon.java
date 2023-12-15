package javaexp.z02_homework.a11_mhi.fruit;

public class Melon {
	private String privateStr="참외롭다"; // 같은 클래스 내에서만 접근 가능
	String defaultStr = "참외 참외"; // 같은 패키지 내에서만 접근가능
	protected String protectedStr="총각네 야채가게";  // 같은 패키지 내에서는 접근 가능하며, 하위 클래스에서도 접근 가능
	public String publicStr = "참외는 맛있다."; //어떤 클래스에서나 접근 가능
	
	String taste = "단 맛";
	
	protected String relationship ="참외와 가까운 친척";
	
	// 상속하는 클래스에서 호출
		public void callMelonInhit() {
			System.out.println("private:"+privateStr);
			System.out.println("default:"+defaultStr);
			System.out.println("protected:"+protectedStr);
			System.out.println("public:"+publicStr);
			
			System.out.println("default"+taste);
			System.out.println("protected"+relationship);
		}
		// 상속하지않는 일반클래스 호출
		public void callMelon() {
			Melon me = new Melon();
			System.out.println("private:"+me.privateStr);
			System.out.println("default:"+me.defaultStr);
			System.out.println("protected:"+me.protectedStr);
			System.out.println("public:"+me.publicStr);
			
			System.out.println("default"+me.taste);
			System.out.println("protected"+me.relationship);
		}
		
			
		private void CallMellonInfo() {
			Melon me = new Melon();
			
			System.out.println("default"+me.taste);
			System.out.println("protected"+me.relationship);	
		}
		
		
		private void CallMellonInfoInherit() {
		
			System.out.println("default"+taste);
			System.out.println("protected"+relationship);	
		}
		
		
			
			
		
		
		public void callApple() {
			Apple ap = new Apple();
			//System.out.println(ap.shape); //사과 클래스에서 private로 선언된 변수 외부 클래스에서 접근 불가능
		}
	
}
