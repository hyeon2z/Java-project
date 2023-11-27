package javaexp.z02_homework.a16_jsr;


public class A1012{

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//					일반클래스는 상속을 받고 그 안에 있는 메서드를 반드시 재정의할 필요가 없지만,
//					추상클래스의 추상메서드는 강제성을 띄기 때문에 상속을 받으면 반드시 재정의를 해야한다.
//					또한 추상메서드는 {}안에 내용을 작성할 수 없고 재정의로 {}기능을 추가해야한다.
//					class Food{
//						public void how() {
//							System.out.println("어떻게 먹나요?");
//						}
//					}
//					class noodle extends Food{
//						private String type="국수";
//					}
					//재정의를 하지 않아도 에러가 발생하지 않는다.
//					abstract class Food{
//						public abstract void how();
//					}
//					class noodle extends Food{
//						private String type="국수";
//					}
					//추상클래스의 추상메서드를 재정의를 하지 않아서 에러가 발생한다.
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
//					Food1 f01=new Pizza1("페페로니 피자");
//					Food1 f02=new noodle("짜장면");
//					Food1 f03=new Hamburger("빅맥");
//					f01.eat();
//					f01.taste();
//					f02.eat();
//					f02.taste();
//					f03.eat();
//					f03.taste();
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
//					인터페이스의 구성요소는 상수와 추상메서드이다.
//					인터페이스의 필드값은 변경이 안돼어 자동으로 상수처리가 된다.
//					(public static final이 컴파일과정에서 자동으로 붙는다)
//					인터페이스의 추상메서드 또한 자동으로 추상메서드 된다.
//					(public abstract가 자동으로 붙는다)
//					interface Me{
//						String gender = "여자";
//						void scool();
//					}
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 
//				실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
				Fisher f01=new Fisher();
				f01.addFishingSkill(new Common());
				f01.goFishing(); // 일반낙시대
				f01.addFishingSkill(new Premium());
				f01.goFishing(); // 프리미엄 낙시대
		
	}
}
abstract class Food1{
	String name;
	
	public Food1(String name) {
		this.name = name;
	}
	//공통메서드
	public void eat() {
		System.out.println(name+"을 먹다.");
	}
	abstract void taste();
}
class Pizza1 extends Food1{
	
	public Pizza1(String name) {
		super(name);
	}
	@Override
	void taste() {
		System.out.println("페페로니 햄과 치즈의 조합!");
	}
}
class noodle extends Food1{
	
	public noodle(String name) {
		super(name);
	}
	@Override
	void taste() {
		System.out.println("달달하고 부드러운 맛!");
	}
}
class Hamburger extends Food1{
	
	public Hamburger(String name) {
		super(name);
	}
	@Override
	void taste() {
		System.out.println("입안가듯 풍미로운 맛!");
	}
}
interface FishingWay{
	void goFishing();
}

class Common implements FishingWay{
	public void goFishing() {
		System.out.println("일반낙시대로 낙시를 합니다.");
	}
}
class Premium implements FishingWay{
	public void goFishing() {
		System.out.println("프리미엄낙시대로 낙시를 합니다.");
	}
}

class Fisher{
	private String name="홍길동";
	private FishingWay fishingWay;

	public void addFishingSkill(FishingWay fishingWay) {
		this.fishingWay=fishingWay;
		System.out.println(name+"이 낙시중");
	}
	public void goFishing() {
		if (fishingWay!=null) {
			fishingWay.goFishing();
		}else {
			System.out.println("낙시안함");
		}
	}
}

