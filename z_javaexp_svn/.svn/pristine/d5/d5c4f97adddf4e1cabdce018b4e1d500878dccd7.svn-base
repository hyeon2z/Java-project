package javaexp.z02_homework.a20_kjw;



public class A0921 {

	public static void main(String[] args) {
        // 도서 객체 생성 및 정보 출력

        Book book1 = new Book("해리포터", "JK롤링", 19000, 2012);
        book1.displayBookInfo();
        
        Acinfo ai1 = new Acinfo("2021014","익명",150000.70);
        ai1.displayAcInfo();



        // 가격 변경 후 정보 출력

        book1.setPrice(17000);

        System.out.println("가격 변경 후 도서 정보:");

        ai1.setbalance(15000);
        
        ai1.setoutbalance(10000);
        
        ai1.setinbalance(16000);

        
        System.out.println("잔고 변경 후 정보: ");

	//	1. **도서 클래스**
	//	    - 필드: 제목, 저자, 가격, 출판년도
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 도서 정보 출력, 가격 변경
	//	
	//	2. **계좌 클래스**
	//	    - 필드: 계좌번호, 예금주, 잔액
	//	    - 생성자: 계좌번호와 예금주 초기화, 잔액은 0으로 초기화
	//	    - 메서드: 입금, 출금, 잔액 확인
	//	
	//	3. **학생 클래스**
	//	    - 필드: 학번, 이름, 성적
	//	    - 생성자: 학번과 이름 초기화
	//	    - 메서드: 성적 입력, 성적 조회, 정보 출력
	//	
	//	4. **사각형 클래스**
	//	    - 필드: 가로, 세로
	//	    - 생성자: 가로와 세로 초기화
	//	    - 메서드: 넓이 계산, 둘레 계산, 정보 출력
	//	
	//	5. **차량 클래스**
	//	    - 필드: 차량 번호, 모델, 연식
	//	    - 생성자: 차량 번호, 모델 초기화
	//	    - 메서드: 연식 변경, 정보 출력
	//	
	//	6. **커피 클래스**
	//	    - 필드: 종류, 가격, 원산지
	//	    - 생성자: 종류 초기화
	//	    - 메서드: 가격 변경, 원산지 입력, 정보 출력
	//	
	//	7. **여행 정보 클래스**
	//	    - 필드: 목적지, 출발일, 도착일
	//	    - 생성자: 모든 필드 초기화
	//	    - 메서드: 여행 일수 계산, 정보 출력
	//	
	//	8. **스마트폰 클래스**
	//	    - 필드: 브랜드, 모델, 가격
	//	    - 생성자: 브랜드와 모델 초기화
	//	    - 메서드: 가격 변경, 정보 출력
	//	
	//	9. **게임 캐릭터 클래스**
	//	    - 필드: 이름, 레벨, 체력
	//	    - 생성자: 이름 초기화, 레벨과 체력은 1로 초기화
	//	    - 메서드: 레벨 업, 체력 회복, 정보 출력
	//	
	//	10. **펜 클래스**
	//	    - 필드: 색상, 브랜드, 가격
	//	    - 생성자: 색상과 브랜드 초기화
	//	    - 메서드: 가격 변경, 정보 출력

	}

}
class Book{
    private String title;

    private String author;

    private double price;

    private int publicationYear;
    
    public Book(String title, String author, double price, int publicationYear) {

        this.title = title;

        this.author = author;

        this.price = price;

        this.publicationYear = publicationYear;

    }
    public void displayBookInfo() {

        System.out.println("도서 제목: " + title);

        System.out.println("저자: " + author);

        System.out.println("가격: " + price);

        System.out.println("출판년도: " + publicationYear);

    }
    public void setPrice(double newPrice) {

        this.price = newPrice;

    }
}


class Acinfo{
    private String num;

    private String owner;

    private double balance;

	private double inbalance;

	private double outbalance;



    
    public Acinfo(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	public void Book(String num, String owner, double balance) {

        this.num = num;

        this.owner = owner;

        this.balance = balance;


    }
    public void displayAcInfo() {

        System.out.println("계좌번호: " + num);

        System.out.println("소유주: " + owner);

        System.out.println("잔액: " + balance);



    }
    public void setbalance(double newbalance) {

        this.balance = newbalance;

    }
    public void setinbalance(double newinbalance) {

        if(balance >= newinbalance) {
            balance -= newinbalance;        	
        }

        else if(balance < newinbalance){
        	System.out.println("파산");
        }

    }
    public void setoutbalance(double newoutbalance) {

    	
        balance += newoutbalance;


    }
}



