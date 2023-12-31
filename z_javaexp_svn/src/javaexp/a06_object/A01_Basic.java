package javaexp.a06_object;

public class A01_Basic {
	/*
	# 객체 지향 플그램
	1. OOP:Object Oriented Programming
		부품 객체를 먼저 만들고 이것을 하나씩 조립해 완성된 프로그램을
		만드는 기법
	2. 객체란?
		1) 물리적으로 존재하는 것 - 자동차, 책, 사람
		2) 추상적인 것(회사, 날짜) 중에서 자신의 속성과 동작을 가지는 모든것
		3) 객체는 필드(속성)과 메소드(동작)으로 구성된다.
			자바 객체로 모델링 가능한다.
			-현실세계
				사람 -[속성] : 이름, 나이
					-[동작] : 웃다, 먹다, 말한다.
			-자바세계
				사람객체 - [필드] : 이름, 나이
					   - [메서드] : 웃다, 먹다, 말하다.
	3. 객체의 상호작용
		- 객체들은 서로 간의 기능(동작)을 이용해서 데이터를 주고 받는
			기능을 처리한다.
		- 사람 객체 <===> 전자계산기 객체
		- 물건 객체 <===> 쇼핑몰 객체
	# 객체와 클래스
	1. 현실세계 비유
	 	현실세계:설계도 ==> 구체적인 사물/객체
	 		ex) 롯데월드타워의 설계도를 통해서 롯데월드타워 건축
	 	자바 : 클래스 ==> 객체
	 		ex) class Tower{} ==> Tower t1 = new Tower();
	2. 클래스에서 객체를 생성하기 위한 필드와 메소드가 정의
	3. 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스(instance)
		instance:참조 - heap영역의 주소를 참조해서 변수를
			만들었기 때문에 참조변수라고 한다.
		ex) 하나의 클래스를 기준으로 여러 개의 객체가 여러개의
			참조변수로 생성가능하다.
			Person p01 = new Person();
			Person p02 = new Person();
			Person p03 = new Person();
			p01, p02, p03등 다른 주소로 객체가 생성이 된다.
	4. 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있다.
		하나의 롯데월드타워 도면으로부터 서울, 부산, 제주도에
		실제 건물을 건축할 수 있다.
		
			
			
			
			
			
			
			
			
			
			
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		





	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// main()에서만 실제 메모리를 만들고 처리가 된다.
		// 클래스를 기준으로 실제 객체를 p01이라는 인스턴스/참조변수로
		// 만든다.
		Person p01 = new Person();
		System.out.println(p01); // heap영역에 특정한 주소.
		p01.name = "홍길동";
		p01.age = 25;
		
		Person p02 = new Person();
		System.out.println(p02); // heap영역에 특정한 다른 주소
		p02.name = "마길동";
		p02.age = 27;
		System.out.println(p01.name+":"+p01.age);
		System.out.println(p02.name+":"+p02.age);
		Tower t1 = new Tower();
		Tower t2 = new Tower();
		Tower t3 = new Tower();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		t1.loc="서울에 있는 타워";
		t2.loc="부산에 있는 타워";
		t3.loc="제주도에 있는 타워";
		System.out.println(t1.loc);
		System.out.println(t2.loc);
		System.out.println(t3.loc);
		
	}

}
// 도면과 같은 클래스 정의
class Person{
	String name;
	int age;
}
// Tower 클래스, loc 속성을 지정해서..
// 이것을 통해서 만들어진  t1 t2 t3로 객체를 생성하고, loc
// 에 서울/부산/제주로 선언하여 heap영역의 주소값과 각각의 loc를
// 출력해보세요...
class Tower{
	String loc;
}













