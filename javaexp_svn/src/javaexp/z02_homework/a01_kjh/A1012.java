package javaexp.z02_homework.a01_kjh;

public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	[1단계:개념]
//		1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//			추상클래스는 하위클래스에서 추상메서드를 반드시 재정의해야함 -> 안하면 오류발생
//			추상메서드가 하나라도 있다면 추상클래스가 되고
//			추상메서드는 바디가 없어야함.
//			추상클래스는 각 메서드들의 공통되는 특성을 정의해놓고
//			하위클래스에서 이들을 이용하는 형식이다.
//		일반클래스의 메소드는 참조변수 변수명 () {}
//		추상메서드는 참조변수 변수명();
			
//	[1단계:개념] 
//		2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 
//			다양한 맛을 출력 좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
//		abstract class Food{
//			String name;
//			Food(String name){
//				System.out.println(name + "먹다");
//				this.name = name;
//			}
//			abstract void taste();
//		}
//		class Burger extends Food{
//			Burger(){
//				super("햄버거");
//			}
//
//			void taste() {
//				System.out.println("빵/고기와 소스맛");
//			}
//		}
//		class Pizza extends Food{
//			Pizza(){
//				super("피자");
//			}
//			void taste() {
//				System.out.println("토마토와 빵과 치즈맛");
//			}
//		}
//		class Kimbab extends Food{
//			Kimbab(){
//				super("피자");
//			}
//			void taste() {
//				System.out.println("김밥 속재료에 따라 다른 맛");
//			}
//		}
//		
//		Burger b01 = new Burger();
//		b01.taste();
//		Pizza p01 = new Pizza();
//		p01.taste();
//		Kimbab k01 = new Kimbab();
//		k01.taste();
		
//	[1단계:개념] 
//		3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
//		인터페이스는 추상메서드만 가질수 있고 구현부는 가질수 없는것이 특징.
//		인터페이스에 선언된 모든 변수들은 기본적으로 상수이다. -> 변하지않음
//		int NUM = 1; -> 앞에 public static final 생략
//		인터페이스는 메서드가 기본적으로 추상메스드가 된다
//		void count(); -> 앞에 public abstract 가 자동으로 붙음
		
//	[1단계:확인] 
//		4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고,
//			실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//			addFishingSkill() 할당하게 하면  해당 어부가 낙시하는
//			goFishing()메서드를 호출하여 처리하세요.
		interface FishingWay{
			void goFishing();
		}
		class FishOne implements FishingWay{
			public void goFishing() {
				System.out.println("서해로 낚시를 가다");
			}
		}
		class FishTwo implements FishingWay{
			public void goFishing() {
				System.out.println("동해로 낚시를 가다");
			}
		}
	      class Fisher{
	          private String name;
	          private FishingWay fishingway;
	          
	          public Fisher() {
	             name = "낚시꾼";
	          }
	          
	          void addFishingSkill(FishingWay fishingway) {
	             this.fishingway = fishingway;
	             System.out.println("낚시를갑니다.");
	          }
	          void goFishing() {
	             if(fishingway != null) {
	                fishingway.goFishing();
	             }else {
	                System.out.println(name + "낚시를 못합니다");
	             }
	             
	          }
	       }
	       
	       Fisher fish1 = new Fisher();
	       fish1.addFishingSkill(new FishOne());
	       fish1.goFishing();
	       fish1.addFishingSkill(new FishTwo());
	       fish1.goFishing();
		
//			# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//			1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//			2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//			3. 수업 시간 집중하였는가?
//		       4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
	}

}
