package javaexp.z02_homework.a01_kjh.vo2;

public class Person {
	private String name;
	private int age;
	private Address address;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void personInfo() {
		System.out.println("#사람의 정보#");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		if(address != null) {
			System.out.println("이메일주소 : " + address.getEmail());
			System.out.println("집주소 : " + address.getHome());
		}
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
}
