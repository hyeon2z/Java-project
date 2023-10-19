package javaexp.a06_object.vo;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) { // source -> field
		this.name = name;
		this.age = age;
	}
	public void showInf() { // return 없음. 필드 데이터 출력
		System.out.println("# Person 객체의 정보 #");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	public String getName() { // source -> getter setter
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
