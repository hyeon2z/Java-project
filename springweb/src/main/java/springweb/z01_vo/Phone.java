package springweb.z01_vo;

public class Phone {
	private String name;
	private String phonenumber;
	public Phone(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
