package javaexp.a06_object;

public class A05_ConstructorParam {
/*
# 매개변수의 선언과 활용
 1. 생성자와 메서드는 해당하는 이름과 함께 매개변수로 선언하여 식별한다.

 2. 매개변수는 특정한 객체에 데이터를 입력할 때, 사용하는 형태이다.

 3. 매개변수의 type(유형)에 맞게 호출하여야 한다.
     즉, 해당 데이터유형을 입력이 가능한 매개변수를 선언하고 호출하여야 한다.

 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ParamExp();
//		new ParamExp(5); String str = 5; (X)
		new ParamExp("홍길동"); // String str = 홍길동; (O)
		new ParamExp(25); // int num01 = 25; (O)
		
		// ex) class ParamExp2 로 선언하고,
		// 		매개변수가 없는 것, 문자열데이터 할당, 정수형데이터 할당, 실수형데이터 할당 생성자를 선언하고 호출.
		
		new ParamExp2();
		new ParamExp2("사과");
		new ParamExp2(100);
		new ParamExp2(3.1415);
		
		new ParamExp2("길동", 2);
		new ParamExp2(2, "길동");
		// 전달시, 구분해서 넘길 수 있을 때(타입다를때) 선언이 가능
		Person01 p01 = new Person01();
		System.out.println("이름 : " + p01.name);
		System.out.println("나이 : " + p01.age);
		System.out.println("거주지 : " + p01.loc);
		
		Person01 p02 = new Person01("홍길동", 54);
		System.out.println("#매개변수2(이름,나이)");
		System.out.println(p02.name);
		System.out.println(p02.age);
		
		Person01 p03 = new Person01("김길동", 23, "서울");
		System.out.println(p03.name);
		System.out.println(p03.age);
		System.out.println(p03.loc);
		
		// 주의) 객체로 생성하는 순간
		Product01 pro01 = new Product01();
		// 1. String과 같이 객체의 경우, 
		//     heap 메모리에 할당되지 않는 경우 default값이 null
		System.out.println(pro01.pName);
		// 2. 숫자형의 경우 객체는 default로 0이 할당이 된다.
		
		Product01 pro02 = new Product01("컴퓨터");
		System.out.println(pro02.pName);
		
		Product01 pro03 = new Product01(1000);
		System.out.println(pro03.pPrice);
		
		Product01 pro04 = new Product01("컴퓨터", 1000, 1);
		System.out.println(pro04.pName);
		System.out.println(pro04.pPrice);
		System.out.println(pro04.pNum);
	}

}
// ex) Product01 클래스에 필드로 물건명, 가격, 갯수를 선언하고 
//      매개변수 없는것(초기값선언), 매개변수1(물건), 매개변수1(가격), 매개변수3개(물건명, 가격, 갯수)로 선언하고 호출하게 하세요
class Product01{
	String pName;
	int pPrice;
	int pNum;
	
	Product01(){
		pName = "물건없음"; // null인 경우 의미없음. ""경우에는 공백문자가 들어간다.
		pPrice = 0; // 자동으로 0으로 초기화되기때문에 안써도됨.
		pNum = 0; // 0 말고 다른수로 기본값 초기화하려면 필요.
	}
	Product01(String pName) {
		this.pName = pName;
		System.out.println("#물건명#");
	}
//	Product01(int pNum) {
//		this.pNum = pNum; 	
//	}
	
	/*
	pNum와 pPrice로 이름은 구분되지만 실제로는 정수형으로 선언되는 것으로 구분하기에 int을 정의하면 에러 발생.
	new Product01(2000) <- pNum? pPrice?  
	 */

	Product01(int pPrice) {
		this.pPrice = pPrice;
		System.out.println("#가격#");
	}
	Product01(String pName, int pPrice, int pNum) {
		this.pName = pName;
		this.pPrice = pPrice;
		this.pNum = pNum;
		
		// main()에서 사용하는 데이터는 초기화를 하여야 사용이 가능하다.
		String name = null;
		System.out.println(name);
		int num01 = 0; // 지역변수는 초기화를 하여야 사용 가능. **
		System.out.println(num01);
		// 객체에 종속된 변수는 객체 생성시 자동으로 초기화가 되어있기 때문에 바로 사용할 수 있다. **
		
		
	}
	
}



// 동일한 package에서는 같은 이름의 클래스를 선언하지 못 한다.
class Person01 {
	String name;
	int age;
	String loc;
	Person01() { // default 값 설정 처리
		name = "무명";
		age = 1;
		loc = "거주지 없음";
	}
	Person01(String name) {
		this.name = name;
	}
	Person01(int age) {
		this.age = age;
	}
	Person01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person01(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
		System.out.println("#매개변수 3개 생성(이름,나이,주소)#");
	}
}

class ParamExp2 {
	ParamExp2() {
		System.out.println("매개변수 없음.");
	}
	ParamExp2(String str) {
		System.out.println("문자열데이터 : " + str);
	}
	ParamExp2(int int01) {
		System.out.println("정수형데이터 : " + int01);
	}
	ParamExp2(double dou01) {
		System.out.println("실수형데이터 : " + dou01);
	}
	ParamExp2(String name, int age) {
		System.out.println("#매개변수 2개#");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	ParamExp2(int age, String name) {
		System.out.println("#매개변수 2개#");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

class ParamExp{
	ParamExp(){
		System.out.println("매개변수가 없음.");
	}
	// 생성 오버로딩 규칙에 의해 여러가지 매개변수 추가 선언
	ParamExp(String str) {
		System.out.println("문자열 1개 입력 : " + str);
	}
	ParamExp(int num01) {
		System.out.println("정수형 1개 입력 : " + num01);
	}
	
	
}

