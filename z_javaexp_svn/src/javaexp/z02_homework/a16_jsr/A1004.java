package javaexp.z02_homework.a16_jsr;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
			/*
			 * Computer라는 큰 클래스가 있을 때 그 안에 들어가는 부품 Cpu도 클래스로 Computer안에 부품 객체으로 들어간다.
			 * 이것이 1:1 관계이다.
			 * 1) public class Computer {
					private String brand;
					private Cpu cpu; // 객체를 지정 1:1 관계
					public Computer() {
					}
					public Computer(String brand) {
						this.brand = brand;
					}
					public String getBrand() {
						return kind;
					}
					public void setBrand(String brand) {
						this.brand = brand;
					}
					public Cpu getCpu() {
						return cpu;
					}
					public void setCpu(Cpu cpu) { // 부품인 cpu를 객체로 할당할 수 있게 처리
						this.cpu = cpu;
					}
					public void show() { //컴퓨터의 정보를 출력하기 위한 메소드
						System.out.println("컴퓨터의 종류:"+brand);
						if(cpu!=null) { // 객체가 할당되어 있을 때.
							System.out.println("CPU 제조사:"+cpu.getCompany());
							System.out.println("CPU 사양:"+cpu.getSpec());
						}else { // 객체가 할당되지 않았을 때..
							System.out.println("현재 컴퓨터에는 CPU가 없습니다.");
						}
					}
				}
				2)public class Cpu {
					private String company;
					private String spec;
					
					public Cpu(String company, String spec) { //제조사와 사양의 모두 받아 객체 생성
						this.company = company;
						this.spec = spec;
					}
					public String getCompany() { //Cpu의 제조사를 전해주기 위한 get메서드
						return company;
					}
					public void setCompany(String company) {
						this.company = company;
					}
					public String getSpec() { //Cpu의 사양을 전해주기 위한 get메서드
						return spec;
					}
					public void setSpec(String spec) {
						this.spec = spec;
					}
					
				}
			 * 
			 */
//		[확인] 2. 아래의 내용을 1:1관계로 설저한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
		Customer c01=new Customer("홍길동", 33);
		c01.setOrder(new Order("짜장면", 5000));
		c01.customerInfo();
		System.out.println("==================");
//			2) 학생과 담임교사 
		Student1 st01=new Student1("김길동", 15);
		st01.setTeacher(new Teacher("이순신", "법과정치"));
		st01.studentInfo();
		System.out.println("==================");
//			3) Person 객체와 Address 객체의 관계
		Person p01=new Person("나길동", 22);
		p01.setAddress(new Address("서울시 성북구 정릉동"));
		p01.personInfo();
		System.out.println("==================");
//			4) Book 객체와 Author 객체의 관계
		Author a01=new Author("김승호", 53);
		a01.setBook(new Book2("시장학개론", 22500));
		a01.authorInfo();
		System.out.println("==================");
//			5) Member 객체와 Team 객체의 관계
		Team t01=new Team("기아 타이거즈");
		t01.setMember(new Member("안치홍", 36, 12));
		t01.teamInfo();
		
	}
}
class Order{
	private String food;
	private int price;
	public Order(String food, int price) {
		this.food = food;
		this.price = price;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
class Customer{
	private String name;
	private int age;
	private Order order;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void customerInfo() {
		System.out.println("#고객정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(order!=null) { // 객체가 할당되어 있을 때.
			System.out.println("주문하신 음식:"+order.getFood());
			System.out.println("음식 가격:"+order.getPrice());
		}else { // 객체가 할당되지 않았을 때..
			System.out.println("주문 정보가 없습니다.");
		}
	}
}
class Student1{
	private String name;
	private int age;
	private Teacher teacher;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void studentInfo() {
		System.out.println("#학생정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(teacher!=null) { // 객체가 할당되어 있을 때.
			System.out.println("선생님 성함:"+teacher.getName());
			System.out.println("선생님 전공:"+teacher.getMajor());
		}else { // 객체가 할당되지 않았을 때..
			System.out.println("담당선생님이 없습니다.");
		}
	}
}
class Teacher{
	private String name;
	private String major;
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
class Person{
	private String name;
	private int age;
	private Address address;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void personInfo() {
		System.out.println("#사람정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(address!=null) { // 객체가 할당되어 있을 때.
			System.out.println("주소:"+address.getLoc());
		}else { // 객체가 할당되지 않았을 때..
			System.out.println("주소가 없습니다.");
		}
	}
	
}
class Address{
	private String loc;

	public Address(String loc) {
		this.loc = loc;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
class Author{
	private String name;
	private int age;
	private Book2 book;
	public Author(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Book2 getBook() {
		return book;
	}

	public void setBook(Book2 book) {
		this.book = book;
	}

	public void authorInfo() {
		System.out.println("#작가정보#");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		if(book!=null) { // 객체가 할당되어 있을 때.
			System.out.println("책제목:"+book.getTitle());
			System.out.println("가격:"+book.getPrice());
		}else { // 객체가 할당되지 않았을 때..
			System.out.println("만든 책이 없습니다.");
		}
	}
	
}
class Book2{
	private String title;
	private int price;
	public Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
class Team{
	private String name;
	private Member member;
	public Team(String name) {
		this.name = name;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public void teamInfo() {
		System.out.println("#팀정보#");
		System.out.println("팀이름:"+name);
		if(member!=null) { // 객체가 할당되어 있을 때.
			System.out.println("이름:"+member.getName());
			System.out.println("나이:"+member.getAge());
			System.out.println("넘버:"+member.getNo());
		}else { // 객체가 할당되지 않았을 때..
			System.out.println("멤버가 없습니다.");
		}
	}
}
class Member{
	private String name;
	private int age;
	private int no;
	public Member(String name, int age, int no) {
		this.name = name;
		this.age = age;
		this.no = no;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
}