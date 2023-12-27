package a01_diexp.z05_vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarDriver {
	private String name;
	// 소스 내 코드를 컨테이너에 객체가 있으면
	// 자동으로 할당처리 할 수 있게 설정 처리 옵션
	@Autowired
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
		System.out.println(name+"이 차를 몰려고 합니다.");
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
