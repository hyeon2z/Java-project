package javaexp.z02_homework.a11_mhi;


public class A1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		// 추상클래스의 재정의
		// 추상클래스는 하나 이상의 추상 메서드를 포함할 수 있다.
		// 하위 클래스에서 이러한 추상 메서드를 반드시 재정의 해야한다.
		Food1 f1 = new gimbab();
		f1.taste();
		Food1 f2 = new noodle();
		f2.taste();
		Food1 f3 = new sushi();
		f3.taste();
		
		Fisher fi1 = new Fisher();
		fi1.addFishingSkill(new RiverFish());
		fi1.goFishing();
		Fisher fi2 = new Fisher();
		fi2.addFishingSkill(new OceanFish());
		fi2.goFishing();
		
	}}
		abstract class Job {
		    abstract void sing(); // 추상 메서드
		}

		class Singer extends Job {
		    @Override
		    void sing() {
		        System.out.println("노래를 부릅니다.");
		    }
		}
		
	   // 일반클래스의 재정의
	   // 모든 메서드를 구체적으로 구현하며, 하위 클래스에서 메서드를 재정의 할 수 있다.
		class Stationery {
		    void write() {
		        System.out.println("필기도구를 쓰다");
		    }
		}

		class Pen extends Stationery {
		    @Override
		    void write() {
		        System.out.println("펜으로 필기합니다.");
		    }
		}
		
	
		
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		abstract class Food1 {
		    abstract void taste(); // 추상 메서드
		    void eat() {
		    	System.out.println("먹다");
		    }
		}
		class gimbab extends Food1{
			@Override
			void taste() {
				System.out.println("참치김밥 맛");
			}
		}
		
		class noodle extends Food1{
			@Override
			void taste() {
				System.out.println("잔치 국수맛");
			}
		}
		
		class sushi  extends Food1{
			@Override
			void taste() {
				System.out.println("초밥 맛");
			}
		}
		
		
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		interface SleepingWay{ //인터페이스는 메서드의 선언만을 가짐.
			String NAME = "잠인터페이스"; //인터페이스에 선언된 변수는 기본적으로 상수임.
			void sleep(); // 앞에 public abstract가 자동으로 붙음
		}
		class bed01 implements SleepingWay{
		@Override
		public void sleep() {
			System.out.println(NAME+"침대 1로 잠을 자다 ");
		}
		}
		class bed02 implements SleepingWay{
			@Override
			public void sleep() {
				System.out.println(NAME+"침대 2로 잠을 자다 ");
			}
			}
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 
		//상속받은 실제클래스를 2개를 선언하고(인터페이스 상속받는 애를 2개 만들어라), 
		//실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낚시하는 goFishing()메서드를
		//호출하여 처리하세요.
		
		class Fisher{
			private FishingWay fishingWay;
			private String name;
			public Fisher() {
				name = "강태공";
			}
			
			public void action() {
				System.out.println(name+" 낚시를 한다.");
			}
			
			public void addFishingSkill(FishingWay fishingWay) {
				this.fishingWay = fishingWay;
				System.out.println(name+"이 낚시 스킬을 씁니다.");
			}
			public void goFishing() {
				System.out.println(name+"!!!");
				if(fishingWay!=null) {
					fishingWay.goFishing();
				}else {
					System.out.println("아직 낚시 스킬이 없습니다 ㅠㅠ");
				}
			}
			
		}
		
		
		interface FishingWay{
			String NAME ="(낚시인터페이스)";
			void goFishing();
		}
		class RiverFish implements FishingWay{
			@Override
			public void goFishing() {
				System.out.println(NAME+"강에서 물고기를 잡다");
			}
		}
		class OceanFish implements FishingWay{
			@Override
			public void goFishing() {
				System.out.println(NAME+"바다에서 물고기를 잡다");
			}
		}
	
		
		
//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.
		// 요구사항정의서 , 플로우
		//
		
		//강사님 답안
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.

/*
### [1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점 예제
추상 클래스는 일반적으로 완전히 구현되지 않은 메서드(추상 메서드)를 
포함할 수 있지만, 일반 클래스는 그렇지 않다. 따라서, 추상 클래스를 
상속 받는 하위 클래스는 추상 메서드를 반드시 재정의(오버라이드)해야 한다.
```java
// 추상 클래스
abstract class AbstractAnimal {
    abstract void sound(); // 추상 메서드
}

class Dog extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("Woof!");
    }
}

// 일반 클래스
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() { // 선택적으로 재정의 가능
        System.out.println("Meow");
    }
}
```

### [1단계:개념] 2. Food 예제

```java
abstract class Food {
    protected String name;
    Food(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + "을(를) 먹다");
    }

    abstract void taste(); // 추상 메서드
}

class Pizza extends Food {
    Pizza() {
        super("피자");
    }

    @Override
    void taste() {
        System.out.println("짭짤하고 맛있다.");
    }
}

class IceCream extends Food {
    IceCream() {
        super("아이스크림");
    }

    @Override
    void taste() {
        System.out.println("달콤하고 시원하다.");
    }
}

class Spaghetti extends Food {
    Spaghetti() {
        super("스파게티");
    }

    @Override
    void taste() {
        System.out.println("매콤하고 알싸하다.");
    }
}
```

### [1단계:개념] 3. 인터페이스의 구성요소의 특징 예제

인터페이스는 주로 추상 메서드와 상수만을 포함한다. (자바 8부터는 default 메서드와 static 메서드도 포함 가능하다.)

```java
interface ExampleInterface {
    int CONSTANT = 100; // 상수 (public static final이 자동으로 붙는다.)

    void abstractMethod(); // 추상 메서드 (public abstract이 자동으로 붙는다.)
    // default 라고 붙여서 공통메서드도 사용할 수 있다.
    default void defaultMethod() { // default 메서드
        System.out.println("This is a default method");
    }
    // static으로 객체 생성 없이 사용하는 메서드 가능하다.
    // ExampleInterface.staticMethod();
    static void staticMethod() { // static 메서드
        System.out.println("This is a static method");
    }
}
```
### [1단계:확인] 4. FishingWay 예제

```java
interface FishingWay {
    void goFishing();
}

class NetFishing implements FishingWay {
    @Override
    public void goFishing() {
        System.out.println("그물로 낚시를 한다.");
    }
}

class RodFishing implements FishingWay {
    @Override
    public void goFishing() {
        System.out.println("낚싯대로 낚시를 한다.");
    }
}

class Fisher {
    private String name;
    private FishingWay fishingWay;

    Fisher(String name) {
        this.name = name;
    }

    void addFishingSkill(FishingWay way) {
        this.fishingWay = way;
    }

    void performFishing() {
        System.out.print(name + "이(가) ");
        if(fishingWay!=null)
        	fishingWay.goFishing();
        else
        	System.out.println("아직 낚시하는 방법을 설정하지 않았습니다");
    }
}

public class Main {
    public static void main(String[] args) {
        Fisher john = new Fisher("John");
        john.addFishingSkill(new RodFishing());
        john.performFishing();
        
        Fisher jane = new Fisher("Jane");
        jane.addFishingSkill(new NetFishing());
        jane.performFishing();
    }
}
```


 
 * */