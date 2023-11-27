package javaexp.z02_homework.a02_oys;

public class A1004 {
	public static void main(String[] args) {

//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		/*
		 * - 필드 선언
		 * class Score {}
		 * class Student{
		 * 		private int num;
		 * 		private String name;
		 * 		private Score score;
		 * 
		 * 		public void setScore(Score score){
		 * 			this.score = score;
		 * 		}
		 * }
		 * 
		 * - 생성자 호출
		 * Student student = new Student();
		 * student.setScore(new Score());
		 * 
		 * */

//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
				/*Client client = new Client("홍길동", "서울시 강남구");
				client.showClientInfo();
				client.setOrder(new Order(123457, "사과"));
				client.showClientInfo();*/
			
//			2) 학생과 담임교사 
				/*Student student = new Student(12, "홍길동");
				student.showStudentInfo();
				student.setTeacher(new Teacher(3, "김철수"));
				student.showStudentInfo();*/
		
//			3) Person 객체와 Address 객체의 관계
				/*Person person = new Person("홍길동");
				person.showPerson();
				person.setAddress(new Address("서울시", "123-123"));
				person.showPerson();*/
				
//			4) Book 객체와 Author 객체의 관계
//			5) Member 객체와 Team 객체의 관계

//		# javascript
//		[개념] 1. 선언적 함수과 변수형함수의 차이점을 예제를 통해서 설명하세요.
//		[확인] 2. 선언적 함수로 매개변수로, 구구단의 시작단수와 마지막단수를 입력받아 console.log로 구구단을 출력하세요.
//		[개념] 3. js의 함수의 매개변수와 리턴값을 기본예제를 만들어 설명하세요.
//		[개념] 4. js의 arguments는 어떤 때 사용되는지 기본예제를 통해서 설명하세요
//
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 위 내용 중에 개념부분에 대한 의견을 조원들과 함께 나누고 정리해서 제출하세요
//		3. 오늘 지각(9:00기준)인원과 사유, 수업 중 집중 의무 준수 여부

	}

}

/*class Order {
	private int orderNum;
	private String itemName;

	public Order(int orderNum, String itemName) {
		this.orderNum = orderNum;
		this.itemName = itemName;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void showOrderInfo() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("물건명 : " + itemName);
	}
}

class Client {
	private String name;
	private String loc;
	private Order order;

	public Client(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void showClientInfo() {
		System.out.println("고객 이름 : " + name);
		System.out.println("사는 지역 : " + loc);

		if (order != null) {
			order.showOrderInfo();
		} else {
			System.out.println("주문 정보가 없습니다.");
		}
	}

}*/

/*class Teacher {
	private int classNum;
	private String teacherName;
	
	public Teacher(int classNum, String teacherName) {
		this.classNum = classNum;
		this.teacherName = teacherName;
	}
	
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public void showTeacherInfo() {
		System.out.println("반 : " + classNum);
		System.out.println("선생님 성함 : " + teacherName);
	}

	
	
}

class Student {
	private int studentNum;
	private String studentName;
	private Teacher teacher;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void showStudentInfo() {
		System.out.println("학생 번호 : " + studentNum);
		System.out.println("학생 이름 : " + studentName);
		
		if (teacher != null) {
			teacher.showTeacherInfo();
		} else {
			System.out.println("선생님 정보가 없습니다.");
		}
	}
	
}*/

/*class Person {
	private String name;
	private Address address;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showPerson() {
		System.out.println(name);
		
		if (address != null) {
			System.out.println(address.getLoc());
			System.out.println(address.getNum());
		} else {
			System.out.println("없음");
		}
	}
}

class Address {
	private String loc;
	private String num;

	public Address(String loc, String num) {
		this.loc = loc;
		this.num = num;
	}
	
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}*/
