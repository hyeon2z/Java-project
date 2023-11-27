package javaexp.z02_homework.a17_okw.vo;

public class Address {
	private String location;
	private String streetNumber;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String location, String streetNumber) {
		this.location = location;
		this.streetNumber = streetNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
