package javaexp.z02_homework.a21_hcj;

public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
				//추상클래스는 1개이상의 추상메소드를 가지고있는것을 추상클래스라 하며
				//추상메소드는 선언만 해주고 상속받은 클래스에서 반드시 재정의해야 한다
				//고로 반드시 필수적으로 기능해야 하는 메서드들을 추상메서드화한다
				//일반클래스의 재정의는 필요에의해 기능을 변경하고싶을때마다 재정의를
				//할수있다.
		abstract class human{
			
			abstract void sleep();
			public void walk() {
				System.out.println("일반속도로걷는다");
			}
		}
		class busyman extends human{
			 void sleep() { 
			//잠자기라는 행동을 필수로 하며 사람에 맞춰 각기 다른방식으로 자기에 각자 재정의해준다 
				System.out.println("잠잘시간이 길지않아 쪽잠을 잔다");
			}
			
			public void walk() {
				//바쁜사람이므로 필요에 의해 빨리걷는다
				System.out.println("빠른속도로걷는다");
			}
		}
		class student extends human{
			void sleep() { //
				System.out.println("성장을위해 일찍잠을 잔다");
			}
			public void walk() {// 굳이 변경할필요없이 평소대로 걷는다
				super.walk();
			}
		}
		
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		Food  bread = new Bread();bread.name("건빵");bread.eat();bread.taste();
		Food  ramen = new Ramen();ramen.name("라면");ramen.eat();ramen.taste();
		Food  bibimbab = new Bibimbab();bibimbab.name("비빔밥");bibimbab.eat();bibimbab.taste();
		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		// 인터페이스의 변수는 자동적으로 public static final가 붙으며 생략선언이 가능하다
		// 인터페이스의 메소드는 기본적으로 추상메소드이며 고로 반드시 재정의 해야한다
		/* 인터페이스 정의
		interface Skill{
			String name = "기본스킬"; //상수선언
			void attack(); //추상클래스
		}*/
		class Fireball implements Skill{
			String skillname;
			Fireball(){
				skillname = "파이어볼";
			}
			@Override
			public void attack() { //재정의
				System.out.println(name+"공격 "+skillname+"!!! 활활 타오르다");//name공유
			}
			
		}
		class Waterball implements Skill{
			String skillname;
			Waterball(){
				skillname = "워터볼";
			}
			@Override
			public void attack() { //재정의
				System.out.println(name+"공격 "+skillname+"!!! 물에젖어 축축하다");
			}
		}
		class Player{
			private Skill skill;
			
			void readskillbook(Skill skill) {
				
				this.skill = skill;
				System.out.println("스킬북을읽어 스킬을 배웟다");
			}
			void skillattact() {
				if(skill !=null) {
					skill.attack();
				}else {
					System.out.println("아직 스킬을 배우지 못했다");
				}
				
			}
		}
		
		
		Player p1 = new Player();
		p1.skillattact();
		p1.readskillbook(new Fireball());
		p1.skillattact();
		p1.readskillbook(new Waterball());
		p1.skillattact();
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.

		Fisher f = new Fisher();
		f.goFishing();
		f.addFishingSkill(new SeaFishing());
		f.goFishing();
		f.addFishingSkill(new RiverFishing());
		f.goFishing();
		
//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
	}

}
// 2번
abstract class Food{
	String name;
	void name(String name) {
		this.name = name;
	}
	void eat() {
		System.out.println(name+"을 먹다");
	}
	abstract void taste();
}
class Ramen extends Food{
	void taste() {
		System.out.println("짭짤하고 뜨끈하다");
	}
}
class Bibimbab extends Food{
	void taste() {
		System.out.println("산뜻하고 향기로운 야채맛이 많이난다");
	}
}
class Bread extends Food{
	void taste() {
		System.out.println("뻑뻑하여 목이막히다");
	}
}


// 3번
interface Skill{
	String name = "기본스킬"; //상수선언
	void attack(); //추상클래스
}

// 4번 -----------------

interface FishingWay{
	void goFishing();
}
class SeaFishing implements FishingWay{

	@Override
	public void goFishing() {
		System.out.println("바다에서 낚시를 하다");
		
	}
	
}
class RiverFishing implements FishingWay{
	@Override
	public void goFishing() {
		System.out.println("강에서 낚시를 하다");
		
	}
	
}
class Fisher{
	private FishingWay fisway;
	
	void addFishingSkill(FishingWay way){
		fisway = way;
	}
	void goFishing() {
		if(fisway!=null) {
			fisway.goFishing();
		}else {
			System.out.println("아직 낚시하는법을 배우지 못했다");
		}
	}
	
	
}
