package javaexp.a06_objectreview.vo;

/*
CarOwner c01 = new CarOwner();
c01.name : null
c01.car : null
 * */
public class CarOwner {
	// 들어갈 공간 메모리를 할당할 준비.
	private String name;
	private Car car;
	public CarOwner() {
		// TODO Auto-generated constructor stub
	}
	public CarOwner(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Car getCar() {
		return car;
	}
	/*
	CarOwner c01 = new CarOwner();
	c01.setName("홍길동"); // 바로 할당
	String name01 = "마길동";
	c01.setName(name01); // 변수를 통해서 할당.
	 * */
	public void setName(String name) {  // String name="홍길동"
		this.name = name; // "홍길동" 문자열이 선언된 필드에 할당.
	}	
	/*
	c01.setCar(new Car("현대","그랜저",0));
	Car car = new Car("기아","k7",0);
	c01.setCar(car);
	c01.buyCar(new Car("대우","G5",0));
	 * */
	// 차의 객체를 할당할 때, setCar, buyCar를 통해서만
	// 할당이 가능.
	//                   
	public void setCar(Car car) { // Car car = new Car("현대","그랜저",0)
		this.car = car;    // new Car()객체가 필드에 할당.
	}
	public void buyCar(Car car) { // Car car = new Car("대우","G5",0)
		this.car = car;    // this.car로 필드에 할당..
	}
	public void showMyCarInfo() {
		System.out.println("자동차 주인의 이름:"+name);
		if(car!=null) { // 객체가 할당되어 있을 때..
			System.out.println(" 소유 차량 정보");
			System.out.println(car.getCompany());
			System.out.println(car.getModel());
			System.out.println(car.getSpeed());
		}else { // 객체가 할당되지 않을 때..
			System.out.println("자동차가 없군요!!");
		}
	}
	
	
}
