package javaexp.z02_homework.a10_kdh.a01_1012;

import java.util.jar.Attributes.Name;

public class A02_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		/*
		 abstract class Animal{
		 	void sound();
		 }
		 class Dog{
		 	void sound(){
		 		System.out.println("멍멍");
		 	}
		 }
		 추상클래스는 재정의가 필수이지만 일반 클래스는 필수가 아니다.
		 */
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
//		abstract class Food{
//			String name;
//			void eat() {
//				System.out.println("@@을 먹다");
//			}
//			abstract void taste();
//		}
//		class Pizza extends Food{
//			void eat() {
//				System.out.println("피자를 먹다");
//			}
//			@Override
//			void taste() {
//				System.out.println("늘어나는 치즈가 환상적");
//			}
//		}
//		class Burger extends Food{
//			void eat() {
//				System.out.println("햄버거를 먹다");
//			}
//			@Override
//			void taste() {
//				System.out.println("패티와 속재료의 궁합이 환상적");
//			}
//		}
//		class Chicken extends Food{
//			void eat() {
//				System.out.println("치킨을 먹다");
//			}
//			@Override
//			void taste() {
//				System.out.println("치킨의 튀김옷이 바삭바삭");
//			}
//		}
//		Food pizza = new Pizza();
//		pizza.eat();
//		pizza.taste();
//		Food burger = new Burger();
//		burger.eat();
//		burger.taste();
//		Food chicken = new Chicken();
//		chicken.eat();
//		chicken.taste();
//		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
//		interface Computer{
//			String BRAND = "SAMSUNG";
//			void typing();
//		}
//		인터페이스의 필드는 전부 상수이고, 메서드는 추상메서드이다.
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
//		interface FishingWay{
//			void goFishing();
//		}
//		class Fishing01 implements FishingWay{
//	
//			@Override
//			public void goFishing() {
//				System.out.println("낚시를 하다.");
//			}
//		}
//		class Fishing02 implements FishingWay{
//			@Override
//			public void goFishing() {
//				System.out.println("낚시를 하다.");
//			}
//		}
//		
//		class Fisher{
//			String name;
//			public FishingWay fishingWay;
//			public Fisher(String name) {
//				this.name = name;
//			}
//			
//			public void addFishingSkill(FishingWay fishingWay) {
//				if(fishingWay == null) {
//					System.out.println("낚시하는법을 배우지 못했습니다.");
//				}else {
//					this.fishingWay = fishingWay;
//					System.out.println("낚시하는 법을 배웠습니다.");
//					System.out.print(name+"이 ");
//					fishingWay.goFishing();
//				}
//			}
//		}
//		FishingWay fishing01 = new Fishing01();
//		FishingWay fishing02 = new Fishing02();
//		Fisher fs1 = new Fisher("낚시꾼1");
//		Fisher fs2 = new Fisher("낚시꾼2");
//		fs1.addFishingSkill(fishing01);
//		fs2.addFishingSkill(fishing02);
//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
	}
}
