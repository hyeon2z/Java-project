// 1. 패키지 명
package javaexp.a06_objectreview;
import javaexp.a06_objectreview.vo.Bicycle;
import javaexp.a06_objectreview.vo.Book;
import javaexp.a06_objectreview.vo.Food;
// 2. 사용할 외부 패키지에 있는 클래스 import
import javaexp.a06_objectreview.vo.Person;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 클래스와 객체
 1. 클래스는 틀/도면 역할로 프로그램이 실제 실행되기 전에 선언하는 것을 말하고

 2. 객체는 이 틀/도면으로부터 main()에서
     실제 실행할 메모리를 할당하여 처리할 수 있는것을 말한다.
 
 3. 클래스로부터 여러가지 객체를 만들 수 있다.

# 연습
 1. 클래스 만들어 보기
     1) 같은 패키지

     2) 다른 패키지
 
 2. 클래스의 기본 구성형태에 따른 내용 확인
     1) package : 클래스를 통해서 만들어질 객체가 위치하는 묶음 단위

     2) 위 같은 패키지는 바로 사용가능/접근제어자도 필요없음

     3) 다른 패키지는 접근제어자 public 필요, import하여 호출하여 처리

 3. 클래스의 구성요소
     1) 필드 : 클래스로 부터 만들어질 객체가 사용하는
         기본 메모리를 설정하는 부분, 데이터의 유형에 따라 선언하고,
	 여러가지로 선언가능하다.

     2) 생성자 : 객체를 생성할 때, 필드값을 초기화 하기위한 기능 메서드이다.
                 클래스명하고 동일하다.

     3) 기능메서드 : 객체가 생성된 후, 사용할 공통 기능에 대한 처리나 데이터를
                  저장/호출할 때 사용된다.
		   - 리턴값
		   - 매개변수
		   - 프로세스
		   위 3가지 구성요소를 혼합해서 원하는 기능/로직을 처리한다.

     4) 각 구성요소를 혼합한 객체 처리

 4. 여러개의 객체를 혼합한 내용 처리하기.
     1) 접근제어자 public, X, protected, private
         이해 및 연습
		 */
		// 외부 패키지에 있는 클래스를 객체화하기 위해 선언할 때, 필요로 하는 접근제어자. : public
		// 1. 해당 클래스에서는 public이 선언
		// 2. 호출하는 곳에서는 import
		Person p01;
		// 같은 패키지 내의 클래스는 public이랑 import 필요없음
		Music m01; // 같은 패키지의 경우 public이 아니더라도 선언가능
		Bus b01;
		// ex) vo패키지에 Food 클래스 선언하고 main()에서 선언하고, 하단에 Computer 클래스를 선언하고 main()호출해서
//		        두 클래스의 접근범위의 차이점을 조원과 함께 이야기
		
		// 외부 패키지에 있으므로 접근제어자 public이 있어야 하고, 호출하려는 클래스에 해당 패키지가 import 되어있어야 함.
		Computer c01; // 같은 패키지 안에 있어서 import와 접근제어자가 필요없음
		// t = 같은 패키지에 있는 클래스는 import와 접근제어자 public을 선언하지 않아도 사용이 가능하다
		Computer c02 = null; // 반드시 초기화를 해야 사용이 가능.
		Computer c03;
		Computer c04 = null; // heap 메모리에 할당은 되지않은상태. stack영역에 변수만 선언 null(stack 주소값 없음)
		Computer c05;
		System.out.println(c02);
		// 클래스가 선언되면 어러개의 참조변수명으로 선언이 가능하다.
		
		c01 = new Computer(); // c01에 stack영역에 Computer 객체가 생성된 heap영역의 주소를 할당한다.
		System.out.println(c01); // heap 영역에 할당된 공간의 주소를 가져오는? 그 주소는 stack영역에 저장
		// javaexp.a06_objectreview.Computer@7c30a502
		// 패키지명.객체명@16진수heap영역주소
		// 비유 -> 빌딩도면을 가지고 
//				  서울에서 실제 빌딩만들고, 부산에서 실제 빌딩을 만들며 서로 위치가 다르듯
//				  위 Computer클래스를 통해 만든 객체의 참조변수는 다른 주소값을 가진다.
		
		// new 생성자()를 생성할 수 있는 이유는 클래스안에 생성자를 선언하지 않으면 
//		    컴파일시 default 생성자인 public 클래스(){} 자동생성
//		Bus b02 = new Bus(); 생성자가 선언되어있어서 에러발생
		Bus b02; // stack 주소
		b02 = new Bus("부산"); // heap 할당 b02에다가
		
		// 선언부분은 접근제어자 class
		// 생성자에도 접근제어자에 의해 접근여부를 처리한다.
		// ==> 클래스를 구성하는 모든 구성요소에 접근제어자에 따라 처리된다.
		Food f01 = null;
		f01 = new Food();
//		f01 = new Food("짜장면"); <- 접근제어자가 public이 아니기에 외부패키지에서는 접근이 불가능하다.

		// vo패키지 하위에 Book 클래스 선언
		// 매개변수가 없는 생성자와 매개변수 1개 있는 생성자를 호출하세요
		Book book1 = new Book();
		System.out.println("참조변수(외부에서 호출) : " + book1);
		// 외부에서는 book1(참조변수), 내부클래스에서는 this로 호출
		Book book2 = new Book("해리포터");
		System.out.println("참조변수(외부에서 호출) : " + book2);
		
//		ex) Bicycle 클래스 선언하고, 생성자가 없는것,
//			생성자의 매개변수1개, 매개변수2개 선언하고 호출
		Bicycle bi01 = new Bicycle();
		
		Bicycle bi02 = new Bicycle("따릉이");
		
		Bicycle bi03 = new Bicycle("자전거", 3);
	}

}

class Bus{
	Bus(String s){} // 선언하는 순간 compile시 default생성자가 만들어지지 않는다.
}

class Computer{
	// public Computer(){} 자동호출 (생성자가 아무것도 선언되어 있지 않을 시 default)
}
	


