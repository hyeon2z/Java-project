package javaexp.z02_homework.a17_okw.vo;

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
	
	public void showAddressInfo() {
		System.out.println("# 주민 정보 #");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		if(address != null) {
			System.out.println("# 주소지 정보 #");
			System.out.print("주소 : " + address.getLocation() + " ");
			System.out.println(address.getStreetNumber());
		}else {
			System.out.println("주소지 정보가 입력되지 않음.");
		}
		System.out.println("======================");
	}
	
}
