package a01_diexp.z04_vo;

public class CarDriver {
	private String name;
	private Car car;
	public CarDriver() {
		// TODO Auto-generated constructor stub
	}
	public CarDriver(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void driving() {
		if(car != null) {
			System.out.println("#자동차 정보#");
			System.out.println("차종:"+car.getKind());
			System.out.println("배기량:"+car.getCc());
			System.out.println("최고속도:"+car.getMaxVel());
			System.out.println("운전을 합니다.");
		}else {
			System.out.println("자동차가 없습니다");
		}
	}
	// byName : set property명이 객체의 id와 같고
	//         매개변수가 Car 이어야 한다.
	public void setCar02(Car car) {
		this.car = car;
	}
	
}
