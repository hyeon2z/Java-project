package javaexp.z02_homework.a03_ls;

public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		
		/*
		일반클래스 를 상속하는 경우 재정의가 필수는 아닙니다.
		하지만 추상클래스 같은 경우 추상클래스의 추상메서드는 바디가 없는 형태이기 때문에,
		상속받는 일반클래스에서 재정의가 꼭 필요합니다. 
		
		abstract class B{
			abstract void a01();
		}
		class B extends A{
			public void a01(){
				"나는 B"
			}
		} ==> 이런식으로 클래스 B에서 재정의를 꼭 해줘야 하지만
		
		class A{
			public void a01(){
				"나는 A"
			}
		}
		class B extends A(){
			public void a02(){
				"나는 B"
			}
		}
		이런식으로 재정의를 하지않고 일반클래스의 상속은
		새롭게 메서드를 만들수 있습니다.
		 * */
		
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), 
//				eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		Food_01 f01 = new Pizza_01();
		f01.eat();f01.taste();
		Food_01 f02 = new Gimbab();
		f02.eat();f02.taste();
		Food_01 f03 = new Kimchi();
		f03.eat();f03.taste();
		
		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		
		/*
		인터페이스는 쓴다면 상수와 추상메서드와 같이 선언하고 다른 메서드들도 사용할 수 있습니다.
		interface a{
			String NAME;
			void a01();
		}
		형태로 선언됩니다. 
		 * */
		
		
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
		Fisher fs01 = new Fisher();
		
		fs01.goFishing(); // 객체할당 ㄴㄴ
		fs01.addFishingSkill(new Hong()); fs01.name = "길동"; fs01.goFishing();
		fs01.addFishingSkill(new Kim()); fs01.name = "민수"; fs01.goFishing();

	}

}
class Fisher{
	private FishingWay fw;
	String name;
	public Fisher() {
		this.name=name;
	}
	public FishingWay getFw() {
		return fw;
	}
	public void addFishingSkill(FishingWay fw) {
		this.fw = fw;
	}
	public void goFishing() {
		if(fw!=null) {
			fw.goFishing();
			System.out.println("낚시꾼의 이름은 "+name+"입니다.");
			System.out.println("낚시대에 현질을 합니다.");
		}else {
			System.out.println("낚시꾼이 떠났습니다. ");
		}
	}
}
interface FishingWay{
	void goFishing();
}
class Hong implements FishingWay{
	@Override
	public void goFishing() {
		System.out.println("낚시꾼 홍은 강가에서 낚시를 합니다");
		}
	
}
class Kim implements FishingWay{
	@Override
	public void goFishing() {
		System.out.println("낚시꾼 김은 호수에서 낚시를 합니다");
	}
	
}
//==================================================================================================
abstract class Food_01{
	String name;
	public Food_01() {
	}
	public void eat() {
		System.out.println(name+"을 먹다");
	}
	abstract void taste();
	}
class Pizza_01 extends Food_01{
	public Pizza_01() {
		this.name="피자";
	}
	@Override
	void taste() {
		System.out.println("피자맛이 납니다");
	}
	
}
class Gimbab extends Food_01{
	public Gimbab() {
		this.name="김밥";
	}
	@Override
	void taste() {
		for(int i =1; i<=3; i++) {
		System.out.println(i+"번쨰 김밥맛이 납니다");}
	}
	
}
class Kimchi extends Food_01{
	public Kimchi() {
		this.name="김치";
	}
	@Override
	void taste() {
		System.out.println("김치맛이 납니다");
	}
	
}