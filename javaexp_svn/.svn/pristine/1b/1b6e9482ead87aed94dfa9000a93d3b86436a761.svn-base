package javaexp.z02_homework.a13_ajh.vo0921;

public class Vehicle {
	private String vehicleNumber;
    private String model;
    private int year;
	public Vehicle(String vehicleNumber, String model, int year) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.year = 0;
	}
	public void setYear(int year) {
	     if (year >= 0) {
	            this.year = year;
	            System.out.println(model + " 차량의 연식이 변경되었습니다.");
	     } else {
	            System.out.println("유효하지 않은 연식입니다. 0 이상의 값을 입력하세요.");
	     }
	}
	public void printInfo() {
        System.out.println("차량 번호: " + vehicleNumber);
        System.out.println("모델: " + model);
        if (year > 0) {
            System.out.println("연식: " + year + "년");
        } else {
            System.out.println("연식: 연식이 설정되지 않았습니다.");
        }
    }
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	

}
