package javaexp.z02_homework.a11_mhi.vo;

public class Author {

	private String name;
	private String affiliation;
	private String phoneNumber;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(String name, String affiliation, String phoneNumber) {
		this.name = name;
		this.affiliation = affiliation;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}

