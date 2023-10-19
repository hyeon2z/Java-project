package javaexp.a11_collection.vo;

public class Person {
	String name;
	int age;
	String home;
	public Person(String name, int age, String home) {
		this.name = name;
		this.age = age;
		this.home = home;
	}
	public Person() {
		// TODO Auto-generated constructor stub
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
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
}
