package javaexp.z02_homework.a00_yhs;

public class A1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1(fruit) : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2(bev) : 당근, 양파
//		         패키지3(fruit2) : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
//
/*
### 1. `this`와 `super` 생성자를 구분해서 사용하는 이유

#### 설명:

- `this`는 현재 클래스의 다른 생성자를 호출하는 데 사용됩니다.
- `super`는 부모 클래스의 생성자를 호출하는 데 사용됩니다.
- 자바에서 하위 클래스의 생성자는 항상 상위 클래스의 생성자를 먼저 호출해야 합니다. 만약 호출하지 않으면 컴파일러는 부모 클래스의 기본 생성자를 자동으로 호출합니다.
- `this`와 `super`를 사용하여 현재 클래스 또는 부모 클래스의 특정 생성자를 명시적으로 호출할 수 있습니다.

#### 예시:

```java
class Parent {
    Parent() {
        System.out.println("Parent Default Constructor");
    }
    
    Parent(String message) {
        System.out.println(message);
    }
}

class Child extends Parent {
    Child() {
        // super()는 컴파일러에 의해 자동으로 추가됩니다.
        System.out.println("Child Default Constructor");
    }
    
    Child(String message) {
        super(message); // 부모 클래스의 매개변수 있는 생성자 호출
    }
    
    Child(int number) {
        this("Child Constructor with message"); // 현재 클래스의 다른 생성자 호출
        System.out.println("Child Constructor with number: " + number);
    }
}
```

### 2. 오버라이딩이란?

#### 설명:

- 오버라이딩은 부모 클래스에서 상속받은 메소드를 하위 클래스에서 재정의하는 것을 의미합니다.
- 오버라이딩된 메소드는 부모 클래스의 메소드와 같은 이름, 매개변수 목록, 반환 타입을 가져야 합니다.
- `@Override` 어노테이션을 사용하면 컴파일러가 오버라이딩을 올바르게 수행했는지 확인할 수 있습니다.

#### 예시:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

### 3. 오버라이딩과 오버로딩의 차이점

- **오버라이딩 (Overriding)**:
  - 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것입니다.
  - 메소드의 이름, 매개변수 목록, 반환 타입이 동일해야 합니다.
  
- **오버로딩 (Overloading)**:
  - 같은 클래스 내에서 같은 이름의 메소드를 여러 개 정의하는 것입니다.
  - 메소드의 이름은 같지만 매개변수의 타입, 개수 또는 순서가 다를 수 있습니다. 반환 타입은 오버로딩을 구분하는 데 사용되지 않습니다.

#### 예시:

```java
// 오버로딩 예시
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```
// [1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유
class Parent {
    String name;
    
    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String childName;
    
    Child(String name, String childName) {
        super(name); // 부모 클래스의 생성자 호출
        this.childName = childName;
    }
}

// [1단계:개념] 2. 오버라이딩이란?
class Animal {
    void sound() {
        System.out.println("동물의 소리");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹");
    }
}

// [1단계:확인] 4. 오버라이딩 연습예제
class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    double area() {
        return width * height;
    }
}

// [1단계:확인] 5. 접근제어자에 대한 예제는 패키지 별로 구성해야 해서 이 부분은 코드로 단순화하여 제시하지 못하겠습니다.
1. **접근제어자(Access Modifiers)**:
   - `public`: 어디에서나 접근이 가능하다.
   - `protected`: 같은 패키지 내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근 가능하다.
   - `(default)` (지정하지 않음): 같은 패키지 내의 클래스에서만 접근 가능하다.
   - `private`: 해당 클래스에서만 접근 가능하다.

2. 예제:

```java
// 패키지1
package package1;

public class Chamwee {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// 멜론 클래스는 참외를 상속받음
class Melon extends Chamwee {
    void accessMethods() {
        publicMethod();
        protectedMethod();
        defaultMethod();
        // privateMethod(); // 오류 발생: private method는 접근 불가능
    }
}

// 패키지2
package package2;

import package1.Chamwee;

public class Carrot {
    public void accessMethods() {
        Chamwee chamwee = new Chamwee();
        chamwee.publicMethod(); // public method만 접근 가능
        // chamwee.protectedMethod(); // 오류 발생
        // chamwee.defaultMethod(); // 오류 발생
        // chamwee.privateMethod(); // 오류 발생
    }
}

// 패키지3
package package3;

import package1.Chamwee;

public class Watermelon extends Chamwee {
    public void accessMethods() {
        publicMethod();
        protectedMethod(); // protected method는 상속받은 경우 접근 가능
        // defaultMethod(); // 오류 발생
        // privateMethod(); // 오류 발생
    }
}
```

위 예제에서, 패키지1의 `Chamwee` 클래스에는 4개의 접근제어자로 선언된 메서드가 있습니다. 같은 패키지 내의 `Melon` 클래스는 모든 메서드를 호출할 수 있지만, `privateMethod()`는 `private` 접근제어자로 선언되었기 때문에 접근할 수 없습니다. 패키지2의 `Carrot` 클래스와 패키지3의 `Watermelon` 클래스는 각각 접근 제한에 따라 메서드를 호출할 수 있습니다.
// [1단계:개념] 6. 다형성
Animal myDog = new Dog();
Animal myCat = new Cat();

// [1단계:확인] 7. 추상 클래스를 만드는 예제
abstract class Food {
    abstract void consume();
}

class Pizza extends Food {
    @Override
    void consume() {
        System.out.println("피자가 소비되었습니다.");
    }
}

class Salad extends Food {
    @Override
    void consume() {
        System.out.println("샐러드가 소비되었습니다.");
    }
}

class Burger extends Food {
    @Override
    void consume() {
        System.out.println("버거가 소비되었습니다.");
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // 멍멍
        
        Cat c = new Cat();
        c.sound(); // 야옹
        
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        
        Rectangle rect = new Rectangle(4, 5);
        System.out.println(rect.area());
        
        Pizza pizza = new Pizza();
        pizza.consume();
        
        Salad salad = new Salad();
        salad.consume();
        
        Burger burger = new Burger();
        burger.consume();
    }
}

 * */
		
	}

}
