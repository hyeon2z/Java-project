package javaexp.z02_homework.a18_LSD.homework1010;

public class homework1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      [1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
//					public class Animal{}
//					public class Cat extends Animal{}
		
//      [1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 봐라
//					Child11 c11 = new Child11();
//					c11.inherit();

//      [1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
					//부모클래스의 멤버에 접근할 떄 사용
		
//      [1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.
		
		
//      [2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스는 name과 age를 필드로 가지고 있고, 
//            introduce() 메서드를 통해 자신을 소개합니다. Student 클래스는 grade를 추가 필드로 가지고 있고, 
//            introduce() 메서드를 통해 학년도 함께 소개합니다.
//				Student100 s100 = new Student100(5);
//				s100.introduce();
//      [2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요. 
//					Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. 
//					Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, 
//				    Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		
					Animal100 a100 = new Animal100();
					a100.sound();
		
					Dog100 d100 = new Dog100();
					d100.sound();
					
					Cat100 c100 = new Cat100();
					c100.sound();
//      [1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//         Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//         Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고, company와 job을 null로 초기화합니다.
//      [1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. Person 클래스의 생성자에서 name과 age를 초기화하고, 
//					Student 클래스의 생성자에서는 grade를 초기화합니다.
					
					
//      # 위 과제는 개인톡으로 전달부탁합니다.      
	}//main()

}//homework1010{}

class Parent11{
	public void inherit() {
		System.out.println("메서드 상속한 경우");
	}
}

class Child11 extends Parent11{
	
}
//////////////////////////////////////////////////
class Animal{
	public void sound() {
		System.out.println("동물이 운다");
	}
}

//class Dog extends Animal{
//	String kind="개";
//	
//	public Dog(String kind) {
//		this.kind = kind; 
//		// TODO Auto-generated constructor stub
//	}
//
//	public void dogsound() {
//		super.sound();
//		this.kind;
//	}
//}







