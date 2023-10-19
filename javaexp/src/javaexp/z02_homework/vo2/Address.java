package javaexp.z02_homework.vo2;

public class Address {
	private String email;
	private String home;
	
	public Address () {}
	
	public Address (String email, String home) {
		this.email = email;
		this.home = home;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}
	
	
}
