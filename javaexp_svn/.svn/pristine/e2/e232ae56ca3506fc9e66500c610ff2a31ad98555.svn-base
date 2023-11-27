package javaexp.a07_inherit;

public class A05_PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 다형성(Polymorphism)
		1. 공통 멤버를 가진 상위클래스를 상속받은 하위클래스에서
			기능적 분리를 하는 메서드를 상위 클래스의 이름(매개변수)와
			동일하게 정의하여 다양한 기능을 처리하는 것을 말한다.
		2. 상위 ==> 여러가지 하위 객체를 통해, 다양한 기능을
			처리하는 것을 말한다.
			ex) 컴퓨터 부분(Cpu, Ram, Ssd..)
			class Part{
				void showInf(){
					System.out.println("컴퓨터의 부품");
				}
			}
			class Cpu extends Part{
				void showInf(){
				    super.showInf();
					System.out.println("중앙처리장치")
				}
			}
			class Ram extends Part{
				void showInf(){
					super.showInf();
					System.out.println("메모리장치")
				}
			}
			// 상위 = 하위 : 같은 Part에서 상속받아서 여러가지
			// 재정의 된 메소드에 의해 다양한 기능을 처리한다는 개념으로
			// 다형성이라고 하고 있다.
			Part p01 = new Cpu();
			p01.showInf(); // 중앙처리장치
			Part p02 = new Ram();
			p02.showInf(); // 메모리장치 출력..
		3. 기본 형식
			1) 1단계
				상속하는 부모클래스 변수 = new 자식클래스생성자();
				class Animal{}
				class Cat extends Animal{}
				class Bird extends Animal{}
				
				Animal an01 = new Cat();
				Animal an02 = new Bird();
				an01.sound(); 
				an02.sound();
				// sound 이름은 같지만, 다양한 기능적 메서드 처리
				 * 
				
			
			
			
			
			
			
		*/
		// 상위 = 하위
		Animal an01 = new Cat();
		Animal an02 = new Dog();
		// 동일한 Animal 클래스에 할당한 참조변수이지만,
		// 상속에의해서 재정의된 내용이 처리된다.
		an01.sound();
		an02.sound();
		Company[] coms = {new Hyundai(),new Samsung()};
		coms[0].earnMoney();
		coms[1].earnMoney();
	}
}
// 상위 Company earMoney()   Hyundai 배를 건조해서 돈을 벌다
//                          Samsung 전자제품을 만들어 돈을 벌다.
//   상위 = 하위 다형성으로 재정의한 메서드 호출..
class Company{
	void earnMoney() {
		System.out.println("회사가 돈을 벌단ㄴ");
	}
}
class Hyundai extends Company{
	void earnMoney() {
		System.out.println("배를 건조해서 돈을 벌다.");
	}
}
class Samsung extends Company{
	void earnMoney() {
		System.out.println("전자제품을 만들어 돈을 벌다.");
	}
}
class Animal{
	void sound() {
		System.out.println("동물이 울다!");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("고양이가 야옹야옹하다");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("개가 멍멍하다");
	}
}
