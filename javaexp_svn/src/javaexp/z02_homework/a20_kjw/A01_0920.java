package javaexp.z02_homework.a20_kjw;



public class A01_0920 {

		public static void main(String[] args) {
			Bookinfo bk1 = new Bookinfo();
			Stuin si1 = new Stuin();
			Car c1 = new Car();
			Accountinfo a01 = new Accountinfo("주인장",3000,20230920,201901010);
			Product p1 = new Product(100,100,100, "귀중품","현대");
			
			//책
			bk1.title = "책의제목";
			bk1.author = "글쓴이";
			bk1.brand = "교보문고";
			bk1.price = 9000;
			bk1.pages = 300;
			
			//학생
			si1.id = 201900001;
			si1.grade = 3;
			si1.avgscore = 87;
			si1.name="신입생";
			si1.study="정보통신";
			
			//자동차
			c1.brand="현대";
			c1.model="sport";
			c1.color="blue";
			c1.old=19;
			c1.min=120;
			c1.max=200;
			
			
			
		
			//책
			System.out.println(bk1.title);
			System.out.println(bk1.author);
			System.out.println(bk1.brand);
			System.out.println(bk1.price);
			System.out.println(bk1.pages);
			
			//학생
			System.out.println(si1.id);
			System.out.println(si1.grade);
			System.out.println(si1.avgscore);
			System.out.println(si1.name);
			System.out.println(si1.study);
			
			//자동차
			System.out.println(c1.brand);
			System.out.println(c1.model);
			System.out.println(c1.color);
			System.out.println(c1.old);
			System.out.println(c1.min);
			System.out.println(c1.max);
			
			//은행계좌
			System.out.println(a01.owner+":"+a01.balance+":"+a01.opendate+":"+"accountno");
			
			//상품
			System.out.println(p1.name+":"+p1.price+":"+p1.count);
			
			

			
		}
	}
		class Bookinfo{
			
			String title;
			String author;
			String brand;
			int price;
			int pages;
			
		}
		class Stuin{
			int id;
			int grade;
			int avgscore;
			String name;
			String study;
		}
		class Car{
			String brand;
			String model;
			String color;
			int old;
			int min;
			int max;
		}
		class Accountinfo{
			int accountno;
			int balance;
			int opendate;
			String owner;
			Accountinfo(String owner, int opendate, int accountno,int balance){
				this.accountno = accountno;
				this.balance = balance;
				this.opendate = opendate;
				this.owner = owner;
			}
		}
		class Product{
			int code,price,count;
			String name,maker;
			Product(int code,int price,int count,String name,String maker) {
				this.code = code;
				this.price = price;
				this.count = count;
				this.name = name;
				this.maker = maker;
			}
		}
//		class Movie {
//			String title,directer,actor,genre;
//			int date,hour;
//			Movie(String title,String directer,String actor,String genre,int date,int hour) {
//					System.out.println("title: ");
//					Scanner title1 = new Scanner(System.in);
		
		
//	}
	//	}
		
		
		
		
		//패키지: 클래스&인터페이스를 그룹화하고 관리하는 방법,

		//접근제어자: 해당 클래스를 다른 패키지 내부,외부에서의 접근방법을 결정

				 //패키지가 다를때 (ex: A패키지에서 b패키지정보에 접근할때 public변수인것만 접근가능
	
//		# 아래 내용을 객체를 생성하세요
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
//		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
//		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		
		


