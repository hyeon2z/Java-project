package javaexp.z02_homework;

import java.util.Scanner;




public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	[1단계:개념] 
//		1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//		기본 데이터 유형들을 여러 형태로 변환하거나 메서드를 이용해서 기능적으로 처리를 하고 싶을때
//		Wrapper를 통해 객체로 변환하여 사용한다.
//		
//		int num = 2; // 기본 int 데이터유형
//		Integer numOb = Integer.valueOf(num); // 객체로 변경
//	[1단계:개념] 
//		2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
//		int num = 2; // 기본 int 데이터유형
//		Integer numOb = Integer.valueOf(num); // 객체로 변경 Boxing
//		int num1 = numOb.intValue(); // UnBoxing
		
//		Auto Boxing/UnBoxing 은 기본 데이터유형을 보다 간편하게 객체 또는 다시 기본 데이터 유형으로 변경할 때 사용된다.
//		Integer intOb = 10; // AutoBoxing
//		int num02 = intOb; // AutoUnBoxing
		
//	[1단계:확인] 
//		3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고,최고점, 최저점, 평균점(반올림) 출력을 하세요
//		int score1 = (int)(Math.random()*101);
//		int score2 = (int)(Math.random()*101);
//		int score3 = (int)(Math.random()*101);
//		int avr = (score1 + score2 + score3)/3;
//		
//		int high1 = Math.max(score1, score2);
//		int high2 = Math.max(high1, score3);
//		System.out.println("점수의 최고점 : " + high2);
//		
//		int low1 = Math.min(score1, score2);
//		int low2 = Math.min(score3, low1);
//		System.out.println("점수의 최저점 : " + low2);
//		System.out.println("점수의 평균점 : " + Math.round(avr));
//	[1단계:개념] 
//		4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
//		두개 모두 랜덤난수를 생성하는 점은 비슷하지만
//		사용할때 Math.random()은 따로 import 할 필요 없이 바로 사용가능하지만
//		Random은 import도 해야하고 new를 통해 객체생성도 해야함.
//	[1단계:확인] 
//		5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Scanner sc = new Scanner(System.in);
		int win = 0; int loose = 0; int draw = 0;
		
		for(int i = 0; i < 3; i ++) {
			int com = (int)(Math.random()*3+1);
			System.out.println("숫자를 입력하세요");
			System.out.println("1. 가위\n2. 바위\n3. 보");
			int user = sc.nextInt();
			while(user == 1) {
				if(com == 1) {
					System.out.println("무승부!!");
					draw++;
					break;
				}else if(com == 2) {
					System.out.println("패배!!");
					loose++;
					break;
				}else {
					System.out.println("승리!!");
					win++;
					break;
				}
			}
			while(user == 2) {
				if(com == 2) {
					System.out.println("무승부!!");
					draw++;
					break;
				}else if(com == 3) {
					System.out.println("패배!!");
					loose++;
					break;
				}else {
					System.out.println("승리!!");
					win++;
					break;
				}
			}
			while(user == 3) {
				if(com == 3) {
					System.out.println("무승부!!");
					draw++;
					break;
				}else if(com == 1) {
					System.out.println("패배!!");
					loose++;
					break;
				}else {
					System.out.println("승리!!");
					win++;
					break;
				}
			}
		}
		System.out.println("게임결과\n승리 : " + win + " 패비 : " + loose + " 무승부 : " + draw);
//	[1단계:개념] 
//		6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//		1. List : 순서를 유지한 채 저장도 되고 중복저장도 가능함.
//			인터페이스를 상속받아 사용자 정의로 실제 클래스 생성이 가능하다.
//		2. Set : 순서를 유지하지 않고 저장한다. 중복저장은 불가능.
//		3. Map : 키와 값 쌍을 저장한다. 키는 중복저장이 안됨.
//	[1단계:확인] 
//		7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
//		ArrayList<String> pro = new ArrayList<String>();
//		ArrayList<String> price = new ArrayList<String>();
//		ArrayList<String> cnt = new ArrayList<String>();
//		pro.add("컴퓨터"); price.add("10000"); cnt.add("2");
//		pro.add("키보드"); price.add("5000"); cnt.add("1");
//		pro.add("마우스"); price.add("2000"); cnt.add("3");
//		
//		pro.set(1, "스피커");
//		pro.remove(2);
		
//	[1단계:확인] 
//		8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("1학년 1반 1번", 70);
//		map.put("1학년 1반 2번", 80);
//		map.put("1학년 1반 3번", 100);
//		
//		for(String key:map.keySet()) {
//			System.out.println(key);
//			System.out.println(map.get(key));
//		}
		
//	[1단계:확인] 
//		9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
//		List<User> usr = new ArrayList<User>();
//		usr.add(new User("abc123", "123abc", "길동", "admin", 100));
//		usr.add(new User("qwe124", "qwe223", "동길", "usr", 70));
//		usr.add(new User("zcx135", "asd123", "민수", "usr", 50));
//		usr.add(new User("tax112", "125asx", "철수", "usr", 10));
//		usr.add(new User("loc100", "789asd", "지훈", "usr", 0));
//
//		for(User u1 : usr) {
//			System.out.print(u1.getId()+"\t");
//			System.out.print(u1.getPass()+"\t");
//			System.out.print(u1.getName()+"\t");
//			System.out.print(u1.getPower()+"\t");
//			System.out.print(u1.getPoint()+"\n");
//		}
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
	}

}
class User{
	String id;
	String pass;
	String name;
	String power;
	int point;
	public User(String id, String pass, String name, String power, int point) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.power = power;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}