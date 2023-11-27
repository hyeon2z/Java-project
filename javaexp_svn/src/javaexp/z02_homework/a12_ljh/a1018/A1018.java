package javaexp.z02_homework.a12_ljh.a1018;

import java.util.ArrayList;

import javaexp.z02_homework.a12_ljh.a1018.vo.Member;

import java.util.*;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
		
		/*
		데이터의 형변환 혹은 데이터유형과 연결되는 객체를 통해 제공되는 메서드를 이용하기 위해 Wrapper클래스를 사용한다.
		byte 		=> 		Byte
	    char 		=> 		Character(*)
	    int	 		=> 		Integer(*)
	   	double 		=> 		Double
	   	boolean 		=> 		Boolean
		 */
		
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		/*
		// Boxing 처리(기본유형 => 객체화)
		Integer intOb01 = Integer.valueOf(27);
		// UnBoxing 처리(객체 => 기본유형)
		int num01 = intOb01.intValue();
		System.out.println(num01);
		
		// AutoBoxing
		Byte bOb01 = 97;
		System.out.println(bOb01.byteValue());
		byte bNum01 = bOb01;
		// AutoUnBoxing
		System.out.println(bNum01);
		*/
		
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
		
		/*
		int stu1 = (int)(Math.random()*101);
		int stu2 = (int)(Math.random()*101);
		int stu3 = (int)(Math.random()*101);
		
		System.out.println("학생 3명의 점수");
		System.out.println("1) " + stu1);
		System.out.println("2) " + stu1);
		System.out.println("3) " + stu1);
		
		System.out.println("최고점: " + Math.max(Math.max(stu1, stu2), stu3));
		System.out.println("최저점: " + Math.min(Math.min(stu1, stu2), stu3));
		System.out.println("평균점(반올림): " + Math.round((double)(stu1+stu2+stu3)/3));
		*/
		
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		/*
		1) Math.random() => 객체 생성 없이 Math.XXX() 형식으로 바로 사용 가능하며 수학적인 계산 및 형변환 처리를 한다.
		2) Random 클래스   => 객체 생성 후에 사용할 수 있으며, 객체.next데이터유형 과 같이 사용함으로써 여러 유형의 데이터를 랜덤으로 출력할 수 있다.
		 */
		
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		/*
		
		 */
		/*
		Random r = new Random();
		int num2 = r.nextInt(3);
		System.out.println("가위/바위/보 게임");
		System.out.print("무엇을 내시겠습니까? ");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		if(num2 == 1) {
			System.out.println("컴퓨터: 가위");
			System.out.println("사용자: " + inputStr);
			if(inputStr.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(inputStr.equals("바위")) {
				System.out.println("이겼습니다.");
			}else if(inputStr.equals("보")) {
				System.out.println("졌습니다.");
			}else {
				System.out.println("가위/바위/보 중 하나만 입력하십시오.");
			}
		}
		if(num2 == 2) {
			System.out.println("컴퓨터: 바위");
			System.out.println("사용자: " + inputStr);
			if(inputStr.equals("가위")) {
				System.out.println("졌습니다.");
			}else if(inputStr.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(inputStr.equals("보")) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("가위/바위/보 중 하나만 입력하십시오.");
			}
		}
		if(num2 == 3) {
			System.out.println("컴퓨터: 보");
			System.out.println("사용자: " + inputStr);
			if(inputStr.equals("가위")) {
				System.out.println("이겼습니다.");
			}else if(inputStr.equals("바위")) {
				System.out.println("졌습니다.");
			}else if(inputStr.equals("보")) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("가위/바위/보 중 하나만 입력하십시오.");
			}
		}
		*/
		
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
		/*
		1) List : 순서를 유지하고 저장, 중복 저장 가능
		2) Set : 순서를 유지하지 않고 저장, 중복 저장 불가능 (HashSet)
				 (==> TreeSet의 경우 순서 유지 저장)
		3) Map : 키와 값의 쌍으로 저장, 키는 중복 저장 안된다. 순서 유지 안된다. (HashMap)
				 (==> TreeMap의 경우 순서 유지 저장)
		*/
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
		
		/*
		List<String> plist = new ArrayList<String>();
		plist.add("사과"); plist.add("바나나"); plist.add("딸기");
		plist.set(2, "키위");		// 마지막 데이터 변경
		plist.remove(1);		// 2번째 데이터 삭제
		plist.clear();			// 전체 삭제
		
		List<Integer> price = new ArrayList<Integer>();
		price.add(3000); price.add(10000); price.add(5000);
		price.set(1, 12000);
		price.remove(0);
		price.clear();
		
		List<Integer> cnt = new ArrayList<Integer>();
		cnt.add(5); cnt.add(1); cnt.add(10);
		cnt.set(0, 3);
		cnt.remove(2);
		cnt.clear();
		*/
		
		
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
		/*
		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("1학년 1반 30번", 80);
		students.put("1학년 1반 10번", 65);
		students.put("1학년 1반 20번", 90);
		
		for(String info : students.keySet()) {
			System.out.print(info + " : ");
			System.out.println(students.get(info));
		}
		*/
		
		
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
		
		/*
		List<Member> mems = new ArrayList<Member>();
		mems.add(new Member("himan", "1234", "홍길동", true, 100));
		mems.add(new Member("byeman", "4321", "김길동", false, 20));
		mems.add(new Member("helman", "5678", "마길동", true, 1500));
		mems.add(new Member("goodman", "9101", "박길동", true, 3000));
		mems.add(new Member("niceman", "1112", "이길동", false, 50));
		System.out.println("아이디\t패스워드\t이름\t권한\t포인트");
		for(Member mem : mems) {
			System.out.print(mem.getId() + "\t");
			System.out.print(mem.getPass() + "\t");
			System.out.print(mem.getName() + "\t");
			System.out.print(mem.isExcess() + "\t");
			System.out.print(mem.getPoint() + "\n");
		}
		*/
		
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}
