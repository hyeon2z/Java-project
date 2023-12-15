package javaexp.z02_homework.a06_psj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javaexp.z02_homework.a06_psj.Person;
import javaexp.z02_homework.a06_psj.vo.Market;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//		기본데이터 유형을 사용할때 여러 형태로 변환이 필요하거나 기능적으로 처리해야할경우가 많다.
//		기본 데이터유형과 연결되는 객체 유형을 만들어 메서드를 통해 활용이 가능하다.
		int num1 = 5;
		Integer numb1 = Integer.valueOf(num1);
		numb1.byteValue();
		numb1.hashCode();
		// 등등 객체로만들어 여러 메서드를 쓸수있게된다.
		num1 = numb1.intValue();  // 객체를 기본데이터유형으로 바꿔주는 메서드
		
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
//		int num1 = 5;    
//		Integer numb1 = Integer.valueOf(num1);  //Boxing
//		num1 = numb1.intValue(); // UnBoxing
		
//		Integer ib = 25; // AutoBoxing 기본데이터를 바로 객체로 변경하는것
//		int num2 = ib;  // AutoUnBoxing 메서드 쓸필요도 없음
//		System.out.println(num2);
		
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
		Random r = new Random();
		int s1 = r.nextInt(100); System.out.println("학생1: "+s1);
		int s2 = r.nextInt(100); System.out.println("학생2: "+s2);
		int s3 = r.nextInt(100); System.out.println("학생3: "+s3);
		System.out.println("\n최고점: "+Math.max(s1, Math.max(s2, s3)));
		System.out.println("최저점: "+Math.min(s1, Math.min(s2, s3)));
		System.out.println("평균점: "+Math.round(s1+s2+s3)/3);
		
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		Math.random(); // 0~1사이 double형으로 반환 무조건
		r.nextInt(1, 100); // 원하는 범위를 원하는 데이터유형으로 받을수있음!!
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		int com; int me = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			com=r.nextInt(1,3);
			System.out.println("뭐낼래요? / 가위  바위  보 ");
			String tmp = sc.next();
			if (tmp.equals("가위")) me=1;
			else if(tmp.equals("바위")) me=2;
			else if(tmp.equals("보")) me=3;
			else System.out.println("이상하게 입력해서 겜망함;;");
			
			System.out.println("상대: "+com);
			if (com==3 && me==1) {System.out.println("이겼다!");}
			else if (com==1 && me==3) {System.out.println("졌어요 ㅠㅠㅠ");}
			else if (me>com) {System.out.println("이겼다!");}
			else if (me==com) {System.out.println("비겼어요");}
			else {System.out.println("졌어요 ㅠㅠㅠ");}
		}
		
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//		List인터페이스 : 순서를 유지하고 저장, 중복 저장 가능, 사용자 정의 실제 클래스 정의가 가능
//		Set인터페이스 : 순서를 유지하고 저장, 중복 저장 불가능
//		Map인터페이스 : 키와 값의 쌍으로 저장, 키는 중복 저장 안됨.
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
		List<Market> shopList = new ArrayList<Market>();
		shopList.add(new Market("커피", 3000, 1));
		shopList.add(new Market("컴퓨터", 500000, 2));
		shopList.add(new Market("스마트폰", 800000, 1));
		shopList.set(0,new Market("커피", 2500, 2)); //수정
		shopList.remove(2); // 삭제
		System.out.println("\n이름\t가격\t수량");
		for (Market sp:shopList) {
			System.out.print(sp.getName()+"\t");
			System.out.print(sp.getPrice()+"원\t");
			System.out.print(sp.getM()+"개\n");
		}
		
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}

