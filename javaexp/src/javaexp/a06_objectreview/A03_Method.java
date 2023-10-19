package javaexp.a06_objectreview;

public class A03_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# 메서드
 1. 객체안에 있는 기능함수를 메서드라고 한다.
     0) 기본형식
         리턴값 메서드명(매개변수1, 매개변수2,...){
             프로세스
             return 실제리턴값;
         }
     
     1) 리턴값
         void : 리턴값 없을 때
         실제리턴값에 할당가능한 리턴값유형을 선언하여야 한다.

     2) 매개변수
     
     3) 프로세스(로직처리)
     
     4) 3개의 구성요소 조합/객체의 필드와 조합된 내용
 */
		Person p01 = new Person();
		p01.call();
		int num01 = p01.call02();
		System.out.println("리턴된 데이터 : " + num01);
		System.out.println("리턴된 데이터 : " + p01.call03());
		// ex) Calculator 라는 클래스를 선언하고, 리턴유형이 없는 메서드,
		//     25+30 합산한 메서드, "+" 리턴한 메서드,
		//     25*4.5 리턴한 메서드 를 선언하고 호출하세요
		Calculator c01 = new Calculator(); // 
		c01.cal01(); // 메서드 호출
		System.out.println(c01.cal02());
		System.out.println(c01.cal03());
		System.out.println(c01.cal04());
		
		Student st01 = new Student("홍길동", 25, 201342);
		st01.showAll();
		st01.setName("길동");
		st01.setAge(23);
		st01.showAll();
		// ex) Airplane에 기종, 항로(노선), 속도를 필드로 하여
		// 생성자를 통해서 초기화하고, show()를 통해서 출력하게 하세요
		 
		Airplane a01 = new Airplane("비행기", "일본", 600);
		a01.show();
		a01.setLoc("방콕");
		a01.setSpeed(500);
	}

}
class Airplane{
	String plane;
	String loc;
	int speed;
	public Airplane(String plane, String loc, int speed) {
		this.plane = plane;
		this.loc = loc;
		this.speed = speed;
	}
	public void show() {
		System.out.println("항공편 정보");
		System.out.println("비행기 기종 : " + plane);
		System.out.println("비행기 항로 : " + loc);
		System.out.println("비행기 속도 : " + speed);
	}
	public String getPlane() {
		return plane;
	}
	public void setPlane(String plane) {
		this.plane = plane;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
class Person{
	void call() { // 메서드
		System.out.println("Person(객체)의 메서드 call 호출(리턴값없음)");
	}
	int call02() { // int num01 = 25;
		return 25;
	}
	String call03() { // String str = "홍길동";
		return "홍길동";
	}
}
// 필드와 연동해서 처리하는 형식
class Student {
	private String name; // 필드선언
	private int age;
	private int studentID;
	public Student(String name, int age, int studentID) { // 생성자설정
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	public void showAll() { // 메서드
		System.out.println("# 학생 정보 #");
		System.out.println("학생의 이름 :" + name);
		System.out.println("학생의 나이 :" + age);
		System.out.println("학생의 학번 :" + studentID);
	}
	// 저장된 필드값을 간접적으로 호출 처리
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
	void cal01() {
		System.out.println("리턴없음");
	}
	int cal02() {
		return 25 + 30;
	}
	String cal03() {
		return "+";
	}
	double cal04 () {
		return 25 * 4.5;
	}
}