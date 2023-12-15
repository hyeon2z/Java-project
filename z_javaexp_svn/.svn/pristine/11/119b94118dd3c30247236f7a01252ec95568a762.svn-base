package javaexp.a06_objectreview;

public class A03_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 메서드
		1. 객체안에 있는 기능 함수를 메서드라고 한다.
			0) 기본형식
				리턴값유형 메서드명(매개변수1, 매개변수2,...){
					프로세스
					return 실제리턴값;
				}
		
			1) 리턴값..
				void :리턴값 없을 때..
				실제리턴값에 할당가능한 리턴값유형을 선언하여야 한다.
			2) 매개변수
			3) 프로세스(로직처리)
			4) 3개의 구성요소 조합/객체의 필드와 조합된 내용..
		 * */
		Person p01 = new Person();
		p01.call();
		int num01 = p01.call02();
		System.out.println("리턴된 데이터:"+num01);
		System.out.println("리턴된 데이터:"+p01.call03());
		// ex) Calculator 라는 클래스를 선언하고,
		//     리턴유형이 없는 메서드, 25+30 합산한 메서드,
		//     "+" 리턴한 메서드, 25*4.5 리턴한 메서드
		//     를 선언하고 호출하세요.
		Calculator cal01 = new Calculator();
		cal01.show();
		int plsNum = cal01.plus();
		System.out.println("합산:"+plsNum);
		System.out.println("리턴 문자열:"+cal01.cal());
		double dblNum = cal01.multi();
		System.out.println("실수 리턴:"+dblNum);
		Student st01 = new Student("홍길동",25,230101);
		st01.showAll();
		st01.setName("마길동"); // 변경
		st01.setAge(22);
		st01.showAll();
		// ex) Airplane에 기종, 항로(노선), 속도를 필드로 하여
		//     생성자를 통해서 초기화하고, set/getXXX메서드 추가
		//     show()를 통해서 출력하게 하세요.
		Airplane ap = new Airplane("보잉948","서울~LA",30000);
		ap.showInf();
	}
}
class Airplane{
	private String type;
	private String route;
	private int speed;
	public Airplane(String type, String route, int speed) {
		this.type = type;
		this.route = route;
		this.speed = speed;
	}
	public void showInf() {
		System.out.println("# 비행기 정보 #");
		System.out.println("기종:"+type);
		System.out.println("항로:"+route);
		System.out.println("속도:"+speed);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
// 필드와 연동해서 처리하는 형식
class Student{
	private String name;
	private int age;
	private int studentID;
	public Student(String name, int age, int studentID) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	public void showAll() {
		System.out.println("# 학생 정보 #");
		System.out.println("학생의 이름:"+name);
		System.out.println("학생의 나이:"+age);
		System.out.println("학생의 학번:"+studentID);
	}
	
	// 저장된 필드값을 간접적으로 호출 처리..
	public String getName() {
		return name;
	}
	// 매개변수로 받아서 필드값 변경 메서드
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
}


class Calculator{
	void show() {
		System.out.println("리턴 유형이 없음!!");
	}
	int  plus() {
		return 25+30; 
	}
	String cal() {
		return "+";
	}
	double multi() {
		return 25*4.5;
	}
}
class Person{
	void call() {
		System.out.println("Person의 메서드 call 호출(리턴값없음)");
	}
	// int num01 = 25;
	int call02() {
		return 25;
	}
	// String str = "홍길동";
	String call03() {
		return "홍길동";
	}
}






