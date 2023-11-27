package javaexp.z02_homework.a13_ajh;

import java.util.Scanner;

public class A0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		# 아래 내용을 객체를 생성하세요
		
//		1. **책 정보 클래스**(생성자X)
//		    - 필드: 제목, 저자, 출판사, 가격, 페이지 수
		System.out.println("# 1번 문제 #");
		Book b01 = new Book();
		b01.tit = "알라딘";
		b01.name = "안재홍";
		b01.company = "학지사";
		b01.price = 12000;
		b01.pNo = 99;
		System.out.println(b01.tit+":"+b01.name+":"+b01.company+":"+b01.price+":"+b01.pNo);
		
		System.out.println();
		
//		2. **학생 정보 클래스**(생성자X)
//		    - 필드: 학번, 이름, 전공, 학년, 평균 성적
		System.out.println("# 2번 문제 #");
		Stu s01 = new Stu();
		Stu s02 = new Stu();
		Stu s03 = new Stu();
		s01.no = 13;
		s01.name = "안재홍";
		s01.major = "영화과";
		s01.gra = 4;
		s01.sco = 4.0;
		s02.sco = 4.0;
		s03.sco = 4.5;
		System.out.println(s01.no+"학번 "+s01.name+" "+s01.major+" "+s01.gra+"학년");
		System.out.println("평균성적: "+((s01.sco+s02.sco+s03.sco)/3));
		
		System.out.println();
		
//		3. **자동차 클래스**(생성자X)
//		    - 필드: 브랜드, 모델, 연식, 색상, 최대속도, 현재속도
		System.out.println("# 3번 문제 #");
		Car c01 = new Car();
		c01.bra = "현대";
		c01.mod = "소나타";
		c01.yea = 13;
		c01.col = "검정";
		c01.maxSp = 180;
		c01.reSp = 100;
		System.out.println("브랜드: "+c01.bra);
		System.out.println("차종: "+c01.mod);
		System.out.println("연식: "+c01.yea+"연식");
		System.out.println("색상: "+c01.col);
		System.out.println("최대속력:"+c01.maxSp+"km/h / "+"현재속력:"+c01.reSp+"km/h");
		
		System.out.println();
		
//		4. **계좌 정보 클래스**(생성자O)
//		    - 필드: 계좌번호, 예금주, 잔액, 개설일
		System.out.println("# 4번 문제 #");
		BankNum ba01 = new BankNum(123,"안재홍",2000,17);
		BankNum ba02 = new BankNum(321,"김재홍",1500,16);
		BankNum ba03 = new BankNum(132,"최재홍",1700,15);
		System.out.println(ba01.baNum+":"+ba01.mas+"님:"+ba01.bal+"원:"+ba01.day+"일");
		System.out.println(ba02.baNum+":"+ba02.mas+"님:"+ba02.bal+"원:"+ba02.day+"일");
		System.out.println(ba03.baNum+":"+ba03.mas+"님:"+ba03.bal+"원:"+ba03.day+"일");
		
		System.out.println();
		
//		5. **상품 정보 클래스**(생성자O)
//		    - 필드: 상품코드, 상품명, 가격, 재고수량, 제조사
		System.out.println("# 5번 문제 #");
		Goods go01 = new Goods(1,"과자",3000,3,"과자공장");
		Goods go02 = new Goods(2,"우유",2000,5,"우유공장");
		Goods go03 = new Goods(3,"사탕",1000,2,"사탕공장");
		System.out.println("상품코드"+"\t"+"상품명"+"\t"+"가격"+"\t"+"재고수량"+"\t"+"제조사");
		System.out.println(go01.goCode+"\t"+go01.goName+"\t"+go01.price+"\t"+go01.avaiSto+"\t"+go01.maker);
		System.out.println(go02.goCode+"\t"+go02.goName+"\t"+go02.price+"\t"+go02.avaiSto+"\t"+go02.maker);
		System.out.println(go03.goCode+"\t"+go03.goName+"\t"+go03.price+"\t"+go03.avaiSto+"\t"+go03.maker);
		
		System.out.println();
		
////		6. **영화 정보 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
////		    - 필드: 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//		System.out.println("# 6번 문제 #");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("제목/감독/배우/개봉일/상영시간/장르 순서로 입력하세요");
//		Movie no6 = new Movie(sc);
//		
//		System.out.println();
//		
////		7. **운동선수 클래스**(매개변수없는 생성자, 매개변수입력하는 생성자)
////		    - 필드: 이름, 스포츠 종류, 팀명, 포지션, 경력 년수, 선수 번호
//		System.out.println("# 7번 문제 #");
//		
//		
//		System.out.println();
		
//		8. **음악 트랙 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (곡 제목, 아티스트), (재생 시간, 장르), 앨범명
		System.out.println("# 8번 문제 #");
		Music m01 = new Music("호랑나비","깅흥국");
		Music m02 = new Music(180,"트로트");
		Music m03 = new Music("호랑나비1집");
		System.out.println(m01.tit+m01.art+m02.dur+m02.gen+m03.alb);
		
		System.out.println();
		
//		9. **동물 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: (이름), (종류, 나이), 체중, 색상
//		System.out.println("# 9번 문제 #");
//		Ani a01 = new Ani("사자");
//		Ani a02 = new Ani("포유류",4);
//		Ani a03 = new Ani(83);
//		Ani a04 = new Ani("흰색");
//		System.out.println(a01.name+a02.obj+a02.year+a03.wei+a04.color);
//		
//		System.out.println();
//		
//		10. **사용자 프로필 클래스**(생성자O, 생성자 오버로딩 규칙으로 선언)
//		    - 필드: 사용자 ID, 비밀번호, 이름, 이메일, 연락처, 생년월일
//		System.out.println("# 10번 문제 #");
//		User a01 = new User("안재홍");
//		User a01 = new User("비밀번호");
//		User a01 = new User("안재홍");
//		User a01 = new User("이메일");
//		User a01 = new User(010);
//		User a01 = new User(5);
//		
//		System.out.println();
		
//		# 패키지와 접근제어자 연습.
//		11. 패키지와 class 접근제어자의 관계를 정리하고, 패키지가 다를 때, 접근제어자 처리 예시를 만드세요.
		System.out.println("# 11번 문제 #");
		
		
		System.out.println();
		
	}

}

// 1번
class Book{
	String tit;
	String name;
	String company;
	int price;
	int pNo;
}
// 2번
class Stu{
	int no;
	String name;
	String major;
	int gra;
	double sco;
}
// 3번
class Car{
	String bra;
	String mod;
	int yea;
	String col;
	int maxSp;
	int reSp;
}
// 4번
class BankNum{
	int baNum;
	String mas;
	int bal;
	int day;
	BankNum(int baNum,String mas,int bal,int day){
		this.baNum = baNum;
		this.mas = mas;
		this.bal = bal;
		this.day = day;
		
	}

}
// 5번
class Goods{
	int goCode ;
	String goName;
	int price;
	int avaiSto;
	String maker;
	Goods(int goCode,String goName,int price,int avaiSto,String maker){
		this.goCode = goCode;
		this.goName = goName;
		this.price = price;
		this.avaiSto = avaiSto;
		this.maker = maker;
		
	}

}
//// 6번 제목, 감독, 배우, 개봉일, 상영 시간, 장르
//class Movie{
//	String a,b,c,f;
//	int d, e;
//	Movie(Scanner sc){
//		System.out.println("제목/감독/배우/개봉일/상영시간/장르 순서로 입력하세요");
//		this.a = sc.nextLine();
//        this.b = sc.nextLine();
//        this.c = sc.nextLine();
//        this.d = sc.nextInt();
//        this.e = sc.nextInt();
//        this.f = sc.nextLine();
//	}
//	
//}
//// 7번
//


// 8번
class Music{
	String tit;
	String art;
	int dur;
	String gen;
	String alb;
	
	Music(String tit,String art) {
	    this.tit = tit;
	}
	Music(int dur, String gen){
		this.dur = dur;
	    this.gen = gen;
	}
	Music(String alb) {
		this.alb = alb;
	}

}
//// 9번
//class Ani{
//	String name;
//	String obj;
//	int year;
//	double wei;
//	String color;
//	Ani(String name){
//		this.name = name;
//	}
//	Ani(String obj, int year){
//		this.obj = obj;
//	    this.year = year;
//	}
//	Ani(int wei) {
//		this.wei = wei;
//	}
//	Ani(String color) {
//		this.color = color;
//	}
//
//}
// 10번
//class User{
//	String usID;
//	String pas;
//	String nam;
//	String emai;
//	int caNum;
//	int bir;
//	User(String usID){
//		this.usID = usID;
//	}
//	User(String pas){
//		this.pas = pas;
//	}
//	User(String nam){
//		this.nam = nam;
//	}
//	User(String emai){
//		this.emai = emai;
//	}
//	User(int caNum){
//		this.caNum = caNum;
//	}
//	User(int bir){
//		this.bir = bir;
//	}
//}
