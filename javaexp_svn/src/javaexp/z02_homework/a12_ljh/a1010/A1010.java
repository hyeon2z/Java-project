package javaexp.z02_homework.a12_ljh.a1010;

public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
/*
		// 부모 클래스
		class Animal {
		    String name;
		    public Animal(String name) {
		        this.name = name;
		    }
		    public void eat() {
		        System.out.println(name + "이(가) 먹는다.");
		    }
		}

		// 자식 클래스
		class Dog extends Animal {
		    public Dog(String name) {
		        super(name); // 부모 클래스의 생성자 호출
		    }

		    public void bark() {
		        System.out.println(name + "이(가) 짖는다.");
		    }
		}

		// 메인 클래스
		public class Main {
		    public static void main(String[] args) {
		        // Animal 클래스의 인스턴스 생성
		        Animal animal = new Animal("동물");

		        // Animal 클래스의 메서드 호출
		        animal.eat();

		        // Dog 클래스의 인스턴스 생성
		        Dog dog = new Dog("멍멍이");

		        // Dog 클래스는 Animal 클래스를 상속하므로 Animal 클래스의 메서드를 사용할 수 있음
		        dog.eat();

		        // Dog 클래스의 고유한 메서드 호출
		        dog.bark();
		    }
		}
*/

//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요.
		/*
		// 부모 클래스
		class Parents{
			String lastName = "홍";
			String bloodType = "A";
			String hobby;
			
			public void attribute() {
				System.out.println("키가 크다.");
			}
		}
		// 자식 클래스
		class Child extends Parents{
			String bloodType = "AB";
			String firstName = "길동";
			
			public void showInfo() {
				System.out.println("이름: " + lastName + firstName);
				attribute();
				System.out.println("취미: " + hobby);
			}
		}
		// 메인 클래스
		Child c1 = new Child();
		c1.hobby = "농구";
		c1.showInfo();
		*/
		
//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		/*
		- 필드: 하위 클래스에서 상위 클래스에 선언된 필드를 구분할 때 사용한다.
		- 생성자: 하위 클래스에서 반드시 상위 클래스에 선언된 생성자를 호출해야 하므로 super를 사용한다.
		- 메서드: 상위 클래스에 선언된 메서드와 구분하기 위해 사용한다.
		 */
		
//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		
		/*
				// 부모 클래스
				class Animal {
				    String kind;
				    public Animal(String kind) {
				        this.kind = kind;
				        System.out.println(kind);
				    }
				    public void sound() {
				        System.out.println(kind + "이(가) 짖는다.");
				    }
				}

				// 자식 클래스
				class Dog extends Animal {
				    public Dog(String kind) {
				        super(kind);
				    }

				    public void sound() {
				    	super.sound();
				        System.out.println(kind + ": 멍멍");
				    }
				}

				// 메인 클래스
				        Animal animal = new Animal("강아지");
				        Dog dog = new Dog("포메라니안");
				        dog.sound();
				    
		 */
		
//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//				introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//				introduce() 메서드를 통해 학년도 함께 소개합니다.
		
		/*
		// 부모 클래스
		class Person{
			String name;
			int age;
			
			public Person() {
			}
			
			public Person(String name, int age) {
				this.name = name;
				this.age = age;
			}
			
			public void introduce() {
				System.out.println("# 자기소개 #");
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
			}
		}
		
		// 자식 클래스
		class Student extends Person{
			
			int grade;
			
			@Override
			public void introduce() {
				System.out.println("# 자기소개 #");
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				System.out.println("성적: " + grade);
			}
			
		}
		*/
		
//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		
	/*
		// 부모 클래스
		class Animal {
		    String kind;
		    public Animal() {
		    }
		    public void sound() {
		        System.out.println(kind + "의 울음소리");
		    }
		}

		// 자식 클래스
		class Dog extends Animal {
		    public Dog(String kind) {
		        this.kind = kind;
		    }

		    public void sound() {
		    	super.sound();
		        System.out.println(kind + ": 멍멍");
		        System.out.println();
		    }
		}
		
		class Cat extends Animal {
			public Cat(String kind) {
				this.kind = kind;
			}
			
			public void sound() {
				super.sound();
				System.out.println(kind + ": 야옹");
				System.out.println();
			}
		}

		// 메인 클래스
		        Dog dog = new Dog("강아지");
		        Cat cat = new Cat("고양이");
		        dog.sound();
		        cat.sound();
		        
	*/
//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
		
		/*
		// 부모 클래스
		class Person{
			String name;
			int age;
			
			public Person(String name, int age) {
				this.name = name;
				this.age = age;
				
			}
		}
		
		// 자식 클래스
		class Employee extends Person{
			String company;
			String job;
			
			public Employee(){
				super("이름없음", 0);
				this.company = null;
				this.job = null;
			}
		}
		*/
		
		
//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, 
//					 Student 클래스의 생성자에서는 grade를 초기화합니다.
		
		/*
		// 부모 클래스
		class Person{
			String name;
			int age;
			
			public Person(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
		}
		
		// 자식 클래스
		class Student extends Person{
			int grade;
			
			public Student() {
				super("홍길동", 27);
				this.grade = 95;
			}
		}
		*/
		
//      # 위 과제는 개인톡으로 전달부탁합니다.		
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 프로젝트 진행관련 의문/요청사항
//		3. 오늘 지각(9:00기준)/수업시간 엄수(매시간0:00)/수업시간 집중 하였는가?
		

	}
	
}


