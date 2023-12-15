package javaexp.z02_homework.a12_ljh.a1012;

public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		// 추상 클래스 : 일반 메서드 - body가 있다.
//					  추상 메서드 - body가 없으며, 하위 클래스에서 반드시 재정의가 필요하다.
//					  객체를 직접 생성할 수 없다.
		// 일반 클래스 : 모든 메서드가 body를 가지고 있으며 객체를 직접 생성할 수 있다.
		/*
		// 추상 클래스 Android
		abstract class Android{
			public void kakaoTalk() {
				System.out.println("채팅을 합니다.");
			}
			public abstract void playStore();
		}
		
		// 하위 클래스 JunPhone, 추상 메서드 playStore 재정의
		class JunPhone extends Android{
			@Override
			public void playStore() {
				System.out.println("앱을 설치합니다.");
			}
			
		}
		*/
		
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		
		/*
		abstract class Food{
			String name = "음식종류";
			public void eat() {
				System.out.println(name + "을 먹다.");
			}
			
			public abstract void taste();
		}
		class Ramen extends Food{
			public Ramen() {
				this.name = "라멘";
			}

			@Override
			public void taste() {
				System.out.println(name + "의 맛은 매웠다.");
				
			}
		}
		class Pizza extends Food{
			public Pizza() {
				this.name = "피자";
			}
			
			@Override
			public void taste() {
				System.out.println(name + "의 맛은 느끼했다.");
				
			}
		}
		class Porkbelly extends Food{
			public Porkbelly() {
				this.name = "삼겹살";
			}
			
			@Override
			public void taste() {
				System.out.println(name + "의 맛은 고소했다.");
				
			}
		}
		
		Food f01 = new Ramen();			f01.eat();	f01.taste();
		Food f02 = new Pizza();			f02.eat();	f02.taste();
		Food f03 = new Porkbelly();		f03.eat();	f03.taste();
		
		*/
		
		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		
		// 인터페이스의 구성요소
		// 1) 상수: public, static 및 final로 선언되며, 일반적으로 상수 값을 정의하는데 사용한다.
		// 2) 추상 메서드: 구체적인 메서드 내용을 제공하지 않으며, 이는 하위 클래스에서 반드시 재정의 해야 한다.
		
		/*
		interface StartApp{
			String App = "[앱 인터페이스] \n";
			void start();
		}
		class Iphone implements StartApp{
			
			@Override
			public void start() {
				System.out.println(App + "앱 스토어를 실행합니다.");
			}
			
		}
		Iphone i01 = new Iphone();
		i01.start();
		*/
		
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
		
		/*
		interface FishingWay{
			void goFishing();
		}
		class Lake implements FishingWay{
			
			@Override
			public void goFishing() {
				System.out.println("가 호수로 낚시하러 간다.");
			}
		}
		class Ocean implements FishingWay{

			@Override
			public void goFishing() {
				System.out.println("가 바다로 낚시하러 간다.");
				
			}
		}
		
		class Fisher{
			private FishingWay fishingway;
			private String name;
			
			public Fisher(){
				name = "어부";
			}
			
			public void search() {
				System.out.println(name + "가 낚시터를 찾고 있습니다.");
			}
			
			public void setFishingway(FishingWay fishingway) {
				this.fishingway = fishingway;
				System.out.println(name + "가 낚시터를 찾았다.");
			}
			public void goFishing() {
				System.out.print(name);
				if(fishingway != null) {
					fishingway.goFishing();
				}
				else {
					System.out.println("낚시터를 찾지 못했습니다.");
				}
			}
			
		}
		
		Fisher f01 = new Fisher();
		f01.search();
		f01.goFishing();
		System.out.println();
		
		f01.setFishingway(new Ocean());
		f01.goFishing();
		System.out.println();
		
		Fisher f02 = new Fisher();
		f01.search();
		f01.setFishingway(new Lake());
		f01.goFishing();
		*/
		
//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
	}

}
