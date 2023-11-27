package javaexp.z02_homework.a21_hcj.vo.a1004;

public class Person {
	private String name;
	private int age;
	private Address address;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPersonInfo() {
		System.out.println("##개인정보##");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(address != null) {
			System.out.println("주소:"+address.getLocation());
		}else
			System.out.println("주소가 존재하지 않습니다.");
		System.out.println("=============");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
