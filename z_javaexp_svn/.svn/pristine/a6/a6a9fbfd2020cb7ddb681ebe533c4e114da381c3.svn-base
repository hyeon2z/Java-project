package javaexp.z02_homework.a12_ljh.vo;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void showPersonInfo() {
		System.out.println("## 인물 정보 ##");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if(address != null) {
			System.out.println("주소: " + address.getCity() + " " + address.getApt());
			System.out.println();
		}else {
			System.out.println("주소를 입력하세요.");
			System.out.println();
		}
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
