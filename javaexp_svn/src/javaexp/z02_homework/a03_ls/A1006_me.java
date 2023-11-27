package javaexp.z02_homework.a03_ls;//
import java.util.ArrayList;
import java.util.Scanner;

//import Javaexp.z01_project.vo.Book;
//import Javaexp.z01_project.vo.Library;
//import Javaexp.z01_project.vo.List;
//
public class A1006_me {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
///*
//마감 : 월요일 ~18:00까지 개인톡으로 전달..
//
//# 미니프로젝트
//1. 주제 : 조원 협의 해서 동일한 주제/개인별로(java/javascript 1씩) 
//2. 아래내용 연습을 위한 내용(필수2개이상씩)
//
//# 자바프로그램
//1. **도서관 관리 시스템**:
//    - 도서 추가, 삭제, 검색 기능
//    - 사용자 회원 가입, 대출 및 반납 기능
//    
//2. **은행 계좌 관리 애플리케이션**:
//    - 계좌 생성, 입금, 출금, 잔액 조회 기능
//
//3. **학생 성적 관리 시스템**:
//    - 학생 정보 및 성적 입력, 수정, 삭제, 조회 기능
//    - 평균, 등급 계산 기능
//
//4. **간단한 쇼핑몰 시스템**:
//    - 상품 목록, 장바구니, 주문 기능
//    - 사용자 로그인 및 회원 가입 기능
//
//5. **일정 관리 애플리케이션**:
//    - 일정 추가, 삭제, 수정, 조회 기능
//    - 알림 설정 기능
//
//6. **투두 리스트 애플리케이션**:
//    - 할 일 추가, 삭제, 수정 기능
//    - 우선순위 및 완료 체크 기능
//
//7. **커피 주문 시스템**:
//    - 메뉴 선택, 재료 선택, 결제 기능
//
//v8. **영화 티켓 예매 시스템**:
//    - 영화 선택, 시간 선택, 좌석 선택, 결제 기능
//
//9. **간단한 퀴즈 애플리케이션**:
//    - 다양한 퀴즈 풀이 및 정답 확인 기능
//    - 점수 및 랭킹 기능
//
//10. **날씨 정보 애플리케이션**:
//    - 도시나 지역 선택 후 현재 날씨 및 예보 정보 제공 기능
//    - 다양한 지역에 대한 날씨 정보 저장 및 조회 기능
//
//# 자바스크립트
//1. **간단한 계산기**:
//    - 사칙 연산 기능(+, -, *, /) 구현
//    - 입력값 검증 및 결과 출력
//
//2. **숫자 맞추기 게임**:
//    - 컴퓨터가 1부터 100까지의 숫자 중 하나를 무작위로 선택
//    - 사용자가 숫자를 입력하여 맞추는 게임
//
//3. **문자열 처리 유틸리티**:
//    - 주어진 문자열의 길이, 단어 수, 대/소문자 변환 기능 등
//
//4. **배열 및 객체 정렬 유틸리티**:
//    - 사용자가 배열이나 객체를 입력하면 정렬하여 결과를 출력
//
//5. **시간 변환 유틸리티**:
//    - 초를 입력받아 시, 분, 초로 변환하거나 그 반대의 기능
//
//6. **화폐 단위 변환기**:
//    - 다양한 국가의 화폐 단위 간 변환 기능
//
//7. **데이터 필터링 유틸리티**:
//    - 주어진 데이터 배열에서 특정 조건을 만족하는 항목만을 추출
//
//8. **객체 기반 주소록 시스템**:
//    - 이름, 전화번호, 이메일 주소 등의 정보를 입력하고 조회, 수정, 삭제하는 기능
//
//v9. **텍스트 기반 RPG 게임**:
//    - 간단한 캐릭터 생성, 전투, 경험치 획득 등의 기능
//
//10. **기본적인 통계 계산 유틸리티**:
//    - 주어진 숫자 배열의 평균, 중앙값, 최댓값, 최솟값 등을 계산


// * */
//	
		
//	1. **도서관 관리 시스템**:
//	- 도서 추가, 삭제, 검색 기능
//	- 사용자 회원 가입, 대출 및 반납 기능

//		
//	Library l02 = new Library();
//	ArrayList <Book> books = new ArrayList<Book>();
//	l02.addBook(new Book("책하나"));
//	l02.addBook(new Book("책둘"));
//	l02.addBook(new Book("책셋"));
//	l02.addBook(new Book("책넷"));  //  책 정보 추가
////	books.remove(0);  // 삭제
//	l02.showBookInfo(); //  등록된 책 정보 출력 
//	
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("검색하실 도서명을 입력해주세요");
//	String title = sc.nextLine();
//	
//	boolean found = l02.searchBook(title);  
//	// boolean 값으로 하단 if구문 수행하기 위한 변수 설정
//	
//	
//	if(found) {
//		System.out.println("검색하신 도서를 보유중입니다.");
//	}else {
//		System.out.println("검색하신 도서를 보유하고 있지 않습니다.");
//	}
//	
//
//	
//	//	6. **투두 리스트 애플리케이션**:
////	    - 할 일 추가, 삭제, 수정 기능
////	    - 우선순위 및 완료 체크 기능
//	
//	ArrayList <List> lists = new ArrayList<List>();
//	List l03 = new List();
//	l03.regList(new List("8월11일 아침"," 병원가기"));
//	l03.regList(new List("8월11일 점심"," 친구만나기"));
//	l03.regList(new List("8월11일 저녁"," 마트가기"));
//	l03.regList(new List("8월11일 아침"," 쓰레기버리기"));
//	l03.regList(new List("8월11일 저녁"," 택배찾기"));
//	
//	System.out.println("기존 todo리스트");
//	l03.showListInfo();
//	
//	l03.getLists().set(2,new List("8월11일 저녁","마트가서 과자사기")); // 3번째 내용 수정
//	
//	System.out.println("수정 todo 리스트");
//	l03.showListInfo();
//	
////	l01.getLists().remove(4);
////	l01.showListInfo(); // 마지막 일정 삭제 
//	
////	System.out.println("first를 입력하시면 우선순위를 변경하실수 있습니다.\n(변경사항이 없으시면no입력).");
////	String change = sc.nextLine();
////	
////	
////	if(change.equals("first")) {
////		System.out.println("우선순위로 등록할 할일의 순번를 입력하십시오");
////		int number = Integer.parseInt(sc.nextLine());
////		if(number<=5&&number>0) {
////			l01.getLists().add(0, l01.getLists().remove(number-1));
////			
////		}else {System.out.println("입력하신 순번의 일정이 존재하지않습니다. ");}
////		
////				
////	}if(change.equals("no")) {
////		System.out.println("시스템을 종료합니다. ");
////	}   //  할일 수정 포기! 
//	
//	// 완료체크
//	
//	System.out.println("완료한 할일의 순번을 입력하세요");
//	int check = Integer.parseInt(sc.nextLine());
//	if(check>0&&check<=5) {
//		l03.getLists().remove(check-1);
//		System.out.println("할일 삭제 완료");
//	}else {System.out.println("입력하신 순번의 일정이 존재하지않습니다. ");}
//	// 완료한 순번 자동 삭제 
//	
//	System.out.println("완료 수정3 todo 리스트");
//	l03.showListInfo();
//	
}
}


