package javaexp.z02_homework.a11_mhi.vo;

public class Address {
	private String personAddress;
	private String postalCode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String personAddress, String postalCode) {
		this.personAddress = personAddress;
		this.postalCode = postalCode;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
