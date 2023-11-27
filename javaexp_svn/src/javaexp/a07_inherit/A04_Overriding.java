package javaexp.a07_inherit;

public class A04_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 메소드 재정의(overriding)
		1. 부모 클래스의 상속 메서드를 동일한 이름(매개변수도 동일)으로
			다시 자식 클래스에서 정의하는 것을 말한다.
		2. 목적
			최종적으로 상속관계에서 상위 클래스를 기반으로
			상속받은 여러 클래스가 다양한 형태로 변경하는 것을 말한다.
			ex) 부모가 돈을 버는 메서드가 있을 때, 자식들이
				동일한 기능 메서드를 다양한 형태로 활용하는 것이라고
				비유한다.
		4. 기본 형식
			class 상위클래스{
				void 기능메서드1(){
					상위에 기능내용 선언
				}
			}
			class 하위클래스 extends 상위클래스{
				void 기능메서드1(){
					상위와 동일한 메서드 선언,
					하지만, {}(블럭)내에 내용을 다른 내용을
					선언
				}
			}
		5. 오버라이딩 메서드 선언시 주의할 점
			1) 매개변수의 유형과 갯수도 동일하여야 한다.
				만약에 다르면 메서드 오버로딩이 된다.
			2) 상위에서 선언한 내용과 하위상속된 내용이 기능적으로
				차별성이 있어야 한다.
			3) 접근제어자는 하위 객체에서 재정의하는 메서드는
				상위와 같거나 더 넓어져야 한다.
				상위 default ==> 하위 default/protected/public(O)
				상위 public ==> 하위 default(X)
		 * */
		Police p01 = new Police();
		p01.working();
		Car01 c01 = new Car01();
		c01.driving();
		Bus b01 = new Bus();
		b01.driving();
	}
}
// Worker w = new Worker("경찰관");
// w.working();
class Worker{
	private String kind;
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(kind+" 일을 합니다.");
	}
}
// Police p01 = new Police();
// p01.working();
class Police extends Worker{
	public Police() {
		super("경찰관");
	}
	// 오버라이딩.
	public void working() {
		super.working(); // 상위 내용을 처리
		System.out.println("치안을 유지합니다.");
		// 추가적으로 하위에서 재정의하여 처리..
	}	
}
// Programmer 클래스를 선언하고, 재정의로 소프트웨어 개발합니다. 처리하세요.
// Programmer pg = new Programmer();
// pg.working();
class Programmer extends Worker{
	public Programmer() {
		super("프로그래머");
	}
	public void working() {
		super.working();
		System.out.println("소프트웨어 개발합니다.");
	}
}
// ex1) Fireman  소방관 불을 끄다..
class Fireman extends Worker{
	public Fireman() {
		super("소방관");
		
	}
	// 컴파일러에서 부모 클래스의 메소드 선언부와 동일한지 검사지시
	// 정확안 메소드 재정의 위해 붙여주면 된다.
	@Override 
	public void working() {
		super.working();
		System.out.println("불을 끄다!!!");
	}
	
}
// ex2) Vehicle 탈것종류, driving()  @@타고 운행하다.(상위)
//      Car(안락하게 운행하다), Bus(많을 사람을 태우고 운행하다..)
//     
class Vehicle01{
	private String kind;
	public Vehicle01(String kind) {
		this.kind = kind;
	}
	public void driving() {
		System.out.println(kind+" 운행하다!");
	}
}
class Car01 extends Vehicle01{
	public Car01() {
		super("자동차");
	}
	@Override
	public void driving() {
		// TODO Auto-generated method stub
		super.driving();
		System.out.println("안락하게 빠른 속도로 운행하다");
	}
}
class Bus extends Vehicle01{
	public Bus() {
		super("버스");
	}
	@Override
	public void driving() {
		// TODO Auto-generated method stub
		super.driving();
		System.out.println("많은 사람을 태워서 운행하다.");
	}
}




















