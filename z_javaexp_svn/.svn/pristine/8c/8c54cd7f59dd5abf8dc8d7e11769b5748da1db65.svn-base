package javaexp.z02_homework.a14_cms.vo;

public class Human {
	private String name;
	private int age;
	private Home home;
	public Human() {};
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showHumanInfo() {
		System.out.println("이 사람의 이름은 : " + name);
		System.out.println("이 사람의 나이는 : " + age);
		if(home!=null) {
			home.showHomeInfo();
		}else System.out.println("아직 거주지가 등록되지 않았습니다.");
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

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	
	

}
