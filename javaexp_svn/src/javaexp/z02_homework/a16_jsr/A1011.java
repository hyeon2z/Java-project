package javaexp.z02_homework.a16_jsr;

import java.util.ArrayList;

public class A1011 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
//      [1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
//         this는 현재 속해있는 클래스 내부의 생성자를 불러올 때 사용하는 변수이고
//         super는 해당 클래스가 상속받고 있는 부모의 생성자를 불러올 때 사용하는 변수입니다.
//         class Car{
//            Car(){
//               System.out.print("차의 종류는");
//            }
//         }
//         class Kia{
//            String tire;
//            Kia(){
//               super();
//               System.out.println("기아차입니다.");
//            }
//            Kia(String tire){
//               this();
//               System.out.println("타이어는 "+tire);
//            }
//         }
      
//      [1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
//         오버라이딩이란 부모 클래스로부터 상속받은 메서드의 내용을 재정의(변경) 하는 것을 오버라이딩이라고 한다.
//         상속받은 메서드를 그대로 사용해도 되지만 내용을 변경하고 싶을 떄 사용한다.
//         1) - 이름이 같아야 한다.
//         - 매개변수가 같아야 한다.
//         - 반환타입이 같아야 한다.
//         2) 접근 제어자는 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//         3) 부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
//         4) 인스턴스 메서드를 static 메서드 또는 그 반대로 변경할 수 없다.
//         class Car{
//            void my() {
//               System.out.println("차주는 부모님");
//            }
//         }
//         class Kia extends Car{
//            void my() {
//               System.out.println("차주는 자식");
//            }
//         }
//      [1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
//         오버로딩은 한 클래스 내에 같은 이름을 가진 메소드가 있더라도
//         매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
//         메소드의 이름과 리턴값 접근제어자의 이름이 다르더라도 매개변수가 동일하면 오버로딩이 되지 않는다.
//         즉, 오버로딩은 매개변수의 차이로만 구현이 가능하다.
      
//         오버라이딩과 오버로딩의 차이점은 오버라이딩은 부모로 부터 상속받은 메서드를 재정의하는 것이고
//         오버로딩은 한 클래스 내에 있는 메소드를 매개변수 변화를 통해 여러개 생성할 수 있는것이 다르다.
//      [1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//         1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. 
//         Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
         Animal1 an01=new Cat1();
         Animal1 an02=new Dog1();
         an01.sound();
         an02.sound();
//         2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다.
//            두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
         Shape[] sh= {new Circle(),new Rectangle()};
         sh[0].area();
         sh[1].area();
//         3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다.
//            두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
         ArrayList<Calculator> cal=new ArrayList<Calculator>();
         cal.add(new Adder());
         cal.add(new Subtractor());
         cal.get(0).operation();
         cal.get(1).operation();
//      [1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//         1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//               패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//               패키지2 : 당근, 양파
//               패키지3 : 수박(참외상속)
//               패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//              1) private: 필드, 생성자, 메서드
//                 모든 외부 클래스에서 접급할 수 없다. 내부클래스에서만 사용가능
//              2) default: 클래스, 필드, 생성자, 메서드
//                다른 패키지에 소속된 틀래스에서는 호출할 수 없다.
//                 같은 패키지에 있는 클래스들까지 호훌
//              3) protected: 필드, 생성자, 메서드
//                자식 클래스가 아닌 다른 패키지에 소속된 클래스는 접근 불가
//                 외부 패키지라도 상속관계가 있으면 접근 가능하다.
//              4) public: 클래스, 필드, 생성자, 메서드
//                 외부 패키지라도 import만 하면 접근 사용할 수 있다.
//                 패키지명.클래스명 선언 형식으로 처리하면 사용할 수 있다.
//         public class Omelon {
//
//            private String privateString;
//            String defaulrString;
//            protected String protectedString;
//            public String publicString;
//            
//            public void show() {
//               Omelon om=new Omelon();
//               System.out.println("private"+privateString);
//               System.out.println("X"+defaulrString);
//               System.out.println("protected"+protectedString);
//               System.out.println("public"+publicString);
//            }
//         }
//      [1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//         다형성(polymorphism)이란 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질을 의미한다.
//         부모클래스의 참조 변수로 자손 클래스의 참조 변수를 다루거나, 동일한 이름을 같은 여러 형태의 매소드를 만들 수 있다.
//         자바에선 대표적으로 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅, 인터페이스, 추상메소드, 추상클래스 방법이 
//         모두 다형성에 속하다고 생각하면 된다.
         //상위=하위
//         Animal an01=new Cat();
//         Animal an02=new Dog();
//         an01.sound();
//         an02.sound();
//         class Animal{
//            void sound() {
//               System.out.println("동물소리");
//            }
//         }
//         class Cat extends Animal{
//            void sound() {
//               System.out.println("야옹");
//            }
//         }
//         class Dog extends Animal{
//            void sound() {
//               System.out.println("멍멍");
//            }
//         }
//      [1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//            음식 추상 클래스:
//            Food라는 추상 클래스를 생성하세요.
//            consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//            이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
            Food[] fd= {new Pizza(1500,"페페로니피자"),new Salad(12000,"닭가슴살샐러드"),new Burger(9500,"치즈버거")};
            fd[0].consume();
            fd[1].consume();
            fd[2].consume();
   }

}
abstract class Food{
   abstract void consume();
}
class Pizza extends Food{
   int price;
   String type;
   
   public Pizza(int price, String type) {
      super();
      this.price = price;
      this.type = type;
   }

   @Override
   void consume() {
      System.out.println(type+"가 소비되었습니다.");
   }
}
class Salad extends Food{
   int price;
   String type;
   
   public Salad(int price, String type) {
      super();
      this.price = price;
      this.type = type;
   }

   @Override
   void consume() {
      System.out.println(type+"가 소비되었습니다.");
   }
}
class Burger extends Food{
   int price;
   String type;
   
   public Burger(int price, String type) {
      super();
      this.price = price;
      this.type = type;
   }

   @Override
   void consume() {
      System.out.println(type+"가 소비되었습니다.");
   }
}
class Animal1{
   void sound() {
      System.out.println("동물이 운다.");
   }
}
class Cat1 extends Animal1{
   void sound() {
      super.sound();
      System.out.println("야옹");
   }
}
class Dog1 extends Animal1{
   void sound() {
      super.sound();
      System.out.println("멍멍");
   }
}
class Shape{
   int base=5;
   void area() {
      System.out.println("도형의 면적");
   }
}
class Circle extends Shape{
   void area() {
      super.area();
      System.out.println("원의 면적은 "+base*base*Math.PI);
   }
}
class Rectangle extends Shape{
   void area() {
      super.area();
      System.out.println("직사각형의 면적은 "+base*base);
   }
}
class Calculator{
   int a=10;
   int b=5;
   void operation() {
      System.out.println("##결과값##");
   }
}
class Adder extends Calculator{
   void operation() {
      super.operation();
      System.out.println(a+"+"+b+"="+(a+b));
   }
}
class Subtractor extends Calculator{
   void operation() {
      super.operation();
      System.out.println(a+"-"+b+"="+(a-b));
   }
}