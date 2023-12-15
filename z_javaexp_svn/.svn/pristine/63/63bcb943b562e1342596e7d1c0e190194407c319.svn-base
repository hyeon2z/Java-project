package javaexp.z02_homework.a19_cjw;

public class A1012_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		/*
		추상클래스 : 추상메서드가 한개 이상 존재하는 클래스로, 일반적으로 실체클래스들의 공통되는 부분을 추상화한다.
				   반드시 상속받은 하위 클래스에서 추상메서드를 재정의(overriding) 해야한다.
		abstract class Music{
			// 추상메서드
			abstract void sound(){
				System.out.println("음악 소리가 들린다.");
			}
			// 공통된 메서드(하위클래스끼리 공통된 부분으로 그대로 사용)
			void turnon{
				System.out.println("음악을 틀다.");
			}
		}
		class Jazz extends Music{
			void sound(){	// 상위의 추상클래스의 추상메서드를 재정의하지 않으면 에러가 발생
				System.out.println("재즈음악이 들린다.");
			}
		}
		
		//Music music = new Music() => 추상클래스는 객체로 선언 불가
		Music m01 = new Jazz();
		m01.sound(); => 재즈음악이 들린다. 출력
		m01.turnon(); => 음악을 틀다. 출력
		----------------------------------------------------------------------
		일반클래스 : 상위클래스의 메서드를 활용할 필요가 없다면 재정의(overriding)할 필요는 없다.
		class Clothes{
			void wear(){
				System.out.println("옷을 입다.");
			}
		}
		class Shirts extends Clothes{
			void wear(){
				System.out.println("셔츠를 입다.");
			}
		}
		Clothes c01 = new Clothes();
		c01.wear(); => 옷을 입다. 출력
		Clothes c01 = new Shirts();
		c01.wear(); => 셔츠를 입다. 출력
		 * */
		
		/*
		[1단계:개념] 2. Food를 추상클래스로 선언하고
					  name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
					  좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		 */
		Foods f01 = new Fruits(); f01.eat(); f01.taste();
		Foods f02 = new Burger1(); f02.eat(); f02.taste();
		Foods f03 = new Sushi(); f03.eat(); f03.taste();
		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		/*
		인터페이스 : 변수(상수), 메서드(추상메서드)
		interface WayHome{
			String NAME="집가는길";	// static final을 붙이지 않아도 변수로 선언된다. 접근제어자도 public
			void gohome();	// abstract을 붙이지 않아도 추상메서드로 선언되기 때문에 {}입력할 필요가 없다.
		}
		class Subway implements WayHome{
			void gohome(){
				System.out.println(NAME+": 지하철을 타고 가다.");
			}
		}
		class Bus implements WayHome{
			void gohome(){
				System.out.println(NAME+": 버스를 타고 가다.");
			}
		}
		class ToHome{
			private WayHome wayhome;
			private kind;
			public ToHome(){
				kind = "퇴근길";
			}
			public void setWayHome(WayHome wayhome){
				this.wayhome = wayhome;
				System.out.println(kind+"을 정하다.");
			}
			public void gohome(){
				if(wayhome!=null){
					wayhome.gohome();
				}else{
					System.out.println("정해지지 않았습니다.");
				}
			}
		}
		
		ToHome home = new ToHome();
		home.gohome();	// 정해지지 않았습니다. 출력
		home.setWayHome(new Subway());	// wayhome에 인터페이스 WayHome을 상속받은 Subway 할당
		home.gohome();	// 지하철을 타고 가다. 출력
		 * */
		
		/*
		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고,
					  실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
					  addFishingSkill() 할당하게 하면
					  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
		 */
		Fisher fisher = new Fisher();
		fisher.fishing();
		fisher.addFishingSkill(new CatchFish());
		fisher.fishing();
		fisher.addFishingSkill(new CatchNoFish());
		fisher.fishing();
		
	}

}

/*
[1단계:개념] 2. Food를 추상클래스로 선언하고
			  name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
			  좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
 */
abstract class Foods{
	String name;
	void eat() {
		System.out.println("음식을 먹다.");
	}
	abstract void taste();
}
class Fruits extends Foods{
	String name;
	public Fruits() {
		name="과일";
	}
	void eat() {
		System.out.println(name+"을 먹다.");
	}
	@Override
	void taste() {
		System.out.println("상큼한 맛");
	}
}
class Burger1 extends Foods{
	String name;
	public Burger1() {
		name="버거";
	}
	void eat() {
		System.out.println(name+"을 먹다.");
	}
	@Override
	void taste() {
		System.out.println("달고 짠 맛");
	}
}
class Sushi extends Foods{
	String name;
	public Sushi() {
		name="초밥";
	}
	void eat() {
		System.out.println(name+"을 먹다.");
	}
	@Override
	void taste() {
		System.out.println("신선한 맛");
	}
}

/*
[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고,
			  실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
			  addFishingSkill() 할당하게 하면
			  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
 */
interface FishingWay{
	void goFishing();
}
class CatchFish implements FishingWay{
	public void goFishing() {
		System.out.println("물고기를 잡다.");
	}
}
class CatchNoFish implements FishingWay{
	public void goFishing() {
		System.out.println("물고기를 놓치다.");
	}
}
class Fisher{
	private FishingWay fishingway;
	void addFishingSkill(FishingWay fishingway) {
		this.fishingway = fishingway;
		System.out.println("낚시대를 던지다.");
	}
	void fishing() {
		if(fishingway!=null) {
			fishingway.goFishing();
		}else {
			System.out.println("낚시대를 아직 던지지 않았습니다.");
		}
	}
}
