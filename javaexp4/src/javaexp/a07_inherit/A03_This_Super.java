package javaexp.a07_inherit;

public class A03_This_Super {

	public static void main(String[] args) {
		Fruit f1 = new Fruit(3000);
		System.out.println(f1.name);
		System.out.println(f1.cnt);
		System.out.println(f1.price);
		Fruit f2 = new Fruit("과일", 3, 3);
		System.out.println(f2.name);
		System.out.println(f2.price);

	}

}
/*
# this() 생성자
1. 현재 클래스에서 정의된 생성자 호출
2. 현재 재정의된 생성자를 호출할 때, 사용된다.
3. 현재 클래스와 상위 클래스의 생성자와 구분할 때도 사용된다. 
 */
class Person{
	String name;
	int age;
	String loc;
	
	Person(){
		name = "이름없음";
		loc = "지역없음";
	}
	Person(String name){
		this(); // 현재 정의된 생성자중에 매개변수가 없는 생성자 호출
		this.name = name;
		// this.필드, this.메서드()
		// 현재 이 객체(클래스)가 포함하고 있는 구성요소를 호출할 때
	}
	Person(String name, int age) {
		this(name); // 현재 정의된 생성자중에 이름이 있는 생성자 호출
		this.age = age;
	}
	Person(String name, int age, String loc){
		this(name, age); // 현재 정의된 생성자 중 이름과 나이가 있는 생성자 호출
		this.loc = loc;
	}
}
class Man extends Person {
//	default로 들어가 있는데.. 상위에 매개변수가 없는 생성자가 없는 순간 반드시 호출하여야함.
//	public Man() {
//		super();
//	}
	public Man(String name) {
		// 상위 여러개의 매개변수 생성자 중에 추가하여 선택적으로 호출
		// super()
		super(name);
	}
	public Man(String name, int age) {
//		this(name); // 현재 클래스에 있는 생성자 호출
		super(name, age); // super, this 생성자는 호출 첫 라인에서 호출하여야 한다.
		
	}
	
}
// 같은 패키지에 동일한 이름의 클래스가 선언되면 에러 발생
// this() 여러 매개변수 생성자를 이용해서
// 물건명, 가격, 갯수를 선언하되, 다양한 매개변수로 초기화하게 처리하세요.
class Product02{
	String name;
	int price;
	int cnt;
	public Product02() {
		this.name = "물건명 입력없음";
		this.cnt = 1;
	}
	
	public Product02(String name) {
		this();
		// 이름을 제외하고 다른 데이터는 default 생성자의 초기값 활용
		this.name = name;
	}
	public Product02(String name, int price) {
		this(name);
		this.price = price;
	}
	public Product02(String name, int price, int cnt) {
		this(name,price);
		this.cnt = cnt;
	}
}
class Fruit extends Product02 {
	Fruit(int price){
		// 상위에 선언된 생성자 중에, 매개변수가 2개 있는 생성자 호출
		super("과일", price);
	}
	Fruit(String name, int price, int cnt) {
		super(name, price, cnt);
	}
}


















