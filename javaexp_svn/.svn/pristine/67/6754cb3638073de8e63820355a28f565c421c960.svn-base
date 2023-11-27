package javaexp.z02_homework.a17_okw;

public class A1012_okw {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
//      [1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
      // # 추상 클래스
      // 1. 추상 클래스는 추상 메서드를 포함할 수 있다. 추상 메서드는 메서드 선언만 있고 구현이 없는 메서드이다.
      // 2. 서브클래스에서 추상 메서드를 '반드시' 구현(Overriding)해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
      // 3. 추상 클래스 자체로는 객체를 직접 생성할 수 없다.
      // # 일반 클래스에서의 메서드 재정의(Overriding)
      // 1. 일반 클래스는 모든 메서드를 구현할 수 있다.
      // 2. 메서드 재정의는 슈퍼클래스에 이미 구현된 메서드를 서브클래스에서 다시 정의하는 것을 의미한다.
//      [1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//            좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
      Food01 f01 = new BeefRibs(); f01.eat(); f01.taste();
      Food01 f02 = new Chicken(); f02.eat(); f02.taste();
      Food01 f03 = new Sausage(); f03.eat(); f03.taste();
      
//      [1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
      /*
      # 인터페이스의 구성요소의 특징
         상수 : 인터페이스에 선언된 모든 변수는 기본적으로 상수. public Static final 을 생략해도 컴파일시 자동 생성됨.
            interface Constants {
                int MAX_VALUE = 100;  // public Static final이 생략된 상태.
            }
         메서드 : 재정의 메서드가 기본적으로 컴파일시 생성된다. void cook(); ==> public abstact void cook(); 
         
         기타 : 자바 8버전 부터 default메서드 , static메서드를 지원함.
         
            interface Greeting {
                void greet();
                default void defaultGreet() {
                    System.out.println("안녕하세요!");
                }
            }
            interface PlusFunction{
               int sum(int a, int b);
               
               static int sum2(int a, int b){
                  return a + b;
               }
            }
       */
//      [1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//            addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
      System.out.println("\n# 낚시왕 #");
      Fisher fs01 = new Fisher(); fs01.takeABoat(); fs01.fishing();
      fs01.addFishingSkill(new OnlyHand()); fs01.takeABoat(); fs01.fishing();
      fs01.addFishingSkill(new WithFishingRod()); fs01.takeABoat(); fs01.fishing();
      
      
//            # 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//            1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//            2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//            3. 수업 시간 집중하였는가?
//              4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
   }

}
class Fisher {
   private String name;
   private FishingWay fishingway;
   public Fisher() {
      name = "강태공";
   }
   public void takeABoat() {
      System.out.println(name+"이 물고기를 잡으러 배를 탑니다.");
   }
   public void addFishingSkill(FishingWay fishingWay) {
      this.fishingway = fishingWay;
      System.out.println(name+"이 낚시하는 법을 깨우쳤습니다.");
   }
   public void fishing() {
      System.out.println(name+"이라는 이름의 사나이가..");
      if(fishingway!=null) {
         fishingway.goFishing();
      }else {
         System.out.println("물고기가 먹고싶어 주린 배를 움켜잡습니다ㅠㅠ \n");
      }
   }
}
interface FishingWay{
   String NAME = "[낚시인터페이스]";
   abstract void goFishing();
}

class OnlyHand implements FishingWay{
   @Override
   public void goFishing() {
      System.out.println("맨손으로 낚시를 합니다!\n");
   }
}
class WithFishingRod implements FishingWay{
   @Override
   public void goFishing() {
      System.out.println("훌륭한 낚시대로 낚시를 수월하게 합니다!!!\n");
   }
}
abstract class Food01{
   private String name;
   
   public void eat() {
      System.out.println("음식을 먹다.");
   }
   public abstract void taste();
}
class BeefRibs extends Food01{
   private String name = "소갈비";
   public void taste() {
      System.out.println(name+"는 부드럽고 달콤한 맛");
   }
}
class Chicken extends Food01{
   private String name = "치킨";
   public void taste() {
      System.out.println(name+"은 바삭하고 부드러운 맛");
   }
}
class Sausage extends Food01{
   private String name = "소세지";
   public void taste() {
      System.out.println(name+"는 쫄깃하고 훈제향이 좋은 맛");
   }
}