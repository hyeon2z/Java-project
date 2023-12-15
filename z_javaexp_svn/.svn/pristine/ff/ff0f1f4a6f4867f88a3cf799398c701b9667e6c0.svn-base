package javaexp.z02_homework.a11_mhi.vo;

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
	
	public  void showInfo() {
		System.out.println("#사람 정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(address!=null) {
			System.out.println("주소:"+address.getPersonAddress());
			System.out.println("우편번호:"+address.getPostalCode());		
		}else {
			System.out.println("주소 정보가 아직 없습니다.");
		}
		System.out.println("============");
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
