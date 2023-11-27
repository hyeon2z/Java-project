package javaexp.z02_homework.a12_ljh.a1004;

import javaexp.z02_homework.a12_ljh.vo.*;
import javaexp.z02_homework.a12_ljh.vo.Book;

public class A1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[개념] 1. 객체의 1:1관계에서 필드 선언, 생성자 호출, 메서드 선언 내용과 각 내용에 대한 역할 부분을 기본 예제를 통해 설명하세요
		/* 
		# 캐릭터(String name, int level)와 직업(String work, int power)에 대한 예제
			// Character 클래스
			public class Character {
			    private String name;
			    private int level;
			    private Job job;
			
			    public Character(String name, int level) {
			        this.name = name;
			        this.level = level;
			    }
			
			    public void setJob(Job job) {
			        this.job = job;
			    }
			
			    public void displayCharacterInfo() {
			        System.out.println("Name: " + name);
			        System.out.println("Level: " + level);
			        if (job != null) {
			            System.out.println("Job: " + job.getWork());
			            System.out.println("Power: " + job.getPower());
			        } else {
			            System.out.println("Job: Not assigned");
			        }
			    }
			}
		// Job 클래스
		public class Job {
		    private String work;
		    private int power;
		
		    public Job(String work, int power) {
		        this.work = work;
		        this.power = power;
		    }
		
		    public String getWork() {
		        return work;
		    }
		
		    public int getPower() {
		        return power;
		    }
		}	
		
		필드: 객체의 상태를 저장하는 데 사용된다.
		생성자: 객체를 초기화하고 필요한 정보를 설정한다.
		메서드: 객체의 동작을 정의하고 객체 간의 상호 작용을 제어한다.


				
		*/
//		[확인] 2. 아래의 내용을 1:1관계로 설정한 클래스와 main()에서 호출하여 처리하세요(필드는 임의로 설정, 모든 정보를 출력 메서드 추가 처리)
//			1) 고객과 주문 
				System.out.println("No.1 고객과 주문");
				Client cli01 = new Client(1, "홍길동");
				cli01.showClient();
				Order od01 = new Order("사과", 3, 3000);
				cli01.setOrder(od01);
				cli01.showClient();
				System.out.println();
				
//			2) 학생과 담임교사 
				System.out.println("No.2 학생과 담임교사");
				Student2 stu01 = new Student2("김철수", 3);
				stu01.showStudentInfo();
				Teacher t01 = new Teacher("홍길동", "수학");
				stu01.setTeacher(t01);
				stu01.showStudentInfo();				
				System.out.println();
				
//			3) Person 객체와 Address 객체의 관계
				System.out.println("No.3 사람과 주소");
				Person p01 = new Person("박길동", 27);
				p01.showPersonInfo();
				Address a01 = new Address("서울특별시", "롯데캐슬");
				p01.setAddress(a01);
				p01.showPersonInfo();
				System.out.println();
				
//			4) Book 객체와 Author 객체의 관계
				System.out.println("No.4 책과 저자");
				Book b01 = new Book("자바의 정석", "영진닷컴", 320);
				b01.showBookInfo();
				Author at01 = new Author("김영진");
				b01.setAuthor(at01);
				b01.showBookInfo();
				System.out.println();
				
//			5) Member 객체와 Team 객체의 관계
				System.out.println("No.5 멤버와 팀");
				Member m01 = new Member("손흥민", 30);
				m01.showMemberInfo();
				Team tm01 = new Team("토트넘", 3);
				m01.setTeam(tm01);
				m01.showMemberInfo();
				System.out.println();
		
	}

}
