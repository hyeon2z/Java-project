package javaexp.z02_homework.a03_ls;

import javaexp.z02_homework.a03_ls.vo.Cat;
import javaexp.z02_homework.a03_ls.vo.Child;
import javaexp.z02_homework.a03_ls.vo.Dog;
import javaexp.z02_homework.a03_ls.vo.Employee;
import javaexp.z02_homework.a03_ls.vo.Student_01;

public class A1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. 상속의 기본 구조를 예제로 함께 기술하세요.
		
		/*
		상속이란 상위 클래스의 필드, 메서드, 생성자를 하위 클래스에서 따로 정의하지 않아도 그대로
		쓸 수 있는 기능이다. 
		
		class A (){
			int n= 1;
		}
		class B extends A(){
		
		} 
		구조로 만들수 있으며 클래스B에서는 따로 int n을 선언하지않아도 쓸수있다. 
		 * */

//		[1단계:확인] 2. Child, Parent 상속관계에 있어서 메서드를 상속한 경우를 만들어 보세요
		Child c02 = new Child();
		c02.show();
		

//		[1단계:개념] 3. 상속에서 super를 쓰는 경우를 기술하세요.
		
		
//		상속하면 상위 클래스의 필드 등이 하위클래스의 필드 등과 같은 이름으로 선언하는 경우가 생기는데, 
//		서로 다른 정보값을 입력을 한다면 구분을 해줘야하는 경우가 생긴다.
//		이런경우 상위클래스의 정보에는 super.를 입력하고 
//		하위 클래스의 정보는 this. 를 입력하여 구분해줄수있다. 
		 

//		[1단계:확인] 4. Animal Dog를 this, super를 이용해서 필드(kind), 메서드(sound())를 처리해보세요.

//		[2단계:조별] 5. Person 클래스를 상속받는 Student 클래스를 작성하세요. 
//					Person 클래스는 name과 age를 필드로 가지고 있고, 
//					introduce() 메서드를 통해 자신을 소개합니다. 
//					Student 클래스는 grade를 추가 필드로 가지고 있고, 
//					introduce() 메서드를 통해 학년도 함께 소개합니다.
		Student_01 s01 = new Student_01("2학년");
		s01.introduce();
		System.out.println("==========================");

//		[2단계:조별] 6.Animal 클래스를 상속받는 Dog 클래스와 Cat 클래스를 작성하세요.
//				Animal 클래스는 sound() 메서드를 통해 자신의 울음소리를 출력합니다. 
//				Dog 클래스는 sound() 메서드를 재정의하여 "멍멍"을 출력하고, 
//				Cat 클래스는 sound() 메서드를 재정의하여 "야옹"을 출력합니다.
		Dog d01 = new Dog();
		d01.sound();
		Cat c01 = new Cat();
		c01.sound();
		System.out.println("==========================");
		

//		[1단계:확인] 7.(상위생성자호출) Person 클래스를 상속받는 Employee 클래스를 작성하세요. 
//			Employee 클래스는 company와 job을 추가 필드로 가지고 있습니다. 
//			Employee 클래스의 기본 생성자는 부모 클래스의 생성자를 호출하여 name과 age를 초기화하고,
//			company와 job을 null로 초기화합니다.
		Employee e01 = new Employee("null","null");
		e01.show();
		
		
		

//		[1단계:조별] 8.(상위생성자호출)Person 클래스를 상속받는 Student 클래스를 작성하세요. 
//		Person 클래스의 생성자에서 name과 age를 초기화하고,
//		Student 클래스의 생성자에서는 grade를 초기화합니다.
		Student_01 s02 = new Student_01("3학년");
		s01.introduce();
		System.out.println("==========================");

		
//      # 위 과제는 개인톡으로 전달부탁합니다.		



	}

}
