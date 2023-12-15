package javaexp.z02_homework.a17_okw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A1018_okw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
			/*
			기본데이터유형을 객체처럼 사용해 다양한 메서드(데이터 유형 변경, 치환기능 등)를 이용하기 위함이다.
			또한 컬렉션 프레임웍 등에서는 객체만을 다루기 때문에 기본 데이터 타입을 저장하려면 Wrapper클래스를
			이용해야 한다.
			
			# 기본 선언 형식
			- Integer intWrapper = new Integer(42);
			 */
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
			/*
			# 기본적인 Boxing과 UnBoxing
			char chr01 = 'A';
			Character chr01B = Character.ValueOf(chr01);  ==> Boxing 처리.
			char chr01Ub = chr01B.charValue(); ==> Unboxing 처리
			
			# AutoBoxing/UnBoxing 
			Character chr01Ab = 'A';  ==> AutoBoxing 처리.
			char chr01AUb = chr01Ab ==> AutoUnboxing 처리.
			*/
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
			int[] scores = new int[3];
			for(int i=0;i<scores.length;i++) {
				scores[i] = (int)(Math.random()*101);
			}
			int maxScore = scores[0];
			int minScore = scores[0];
			
			for (int i = 1; i < scores.length; i++) {
			  maxScore = Math.max(maxScore,scores[i]);
			  minScore = Math.min(minScore,scores[i]);
			}
			int totalScore = scores[0] + scores[1] + scores[2];
			double avgScore = totalScore/3;
			System.out.println("# 학생 3명의 점수 #");
			System.out.println(""+scores[0]+ " " + scores[1]+ " " + scores[2]);
			System.out.println("최고점 : "+maxScore);
			System.out.println("최저점 : "+minScore);
			System.out.println("평균점 : "+Math.round(avgScore));
			
			
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
			/*
			# Random 클래스 
				- 더 객체 지향적인 방식으로 난수를 생성한다.
				- 기능 메서드
					nextInt() : 0부터 'bound(전달된 매개변수) -1' 까지의 난수 반환.
					nextDouble() : 0.0 이상 1.0 미만의 실수 사이에서 난수 반환
					nextBoolean() : true/false를 50% 확률로 반환.
			# Math.Random()
				-Random 클래스와 다르게 정적 메서드(static)으로써, 인스턴스 생성없이
				 바로 사용 가능. 0이상 1미만의 double 타입의 난수를 반환한다.
			 */
			
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
//			Scanner sc = new Scanner(System.in);
//			Random random = new Random();	
//			
//			int userWin = 0;
//			int comWin = 0;
//			int draw = 0;
//			
//			for(int cnt=1;cnt<=3;cnt++) {
//				System.out.println("#"+cnt+"라운드 #");
//				try {
//					System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : ");
//					int userChoice= sc.nextInt();
//					if(userChoice < 1 || userChoice >3) {
//						System.out.println("잘못된 입력입니다. 1~3중 하나를 입력하세요..");
//						cnt--;
//						continue;
//					}
//					
//					int computerChoice = random.nextInt(3)+1;
//					
//					
//					System.out.println("당신의 선택: " + (userChoice == 1 ? "가위" : (userChoice == 2 ? "바위" : "보")));
//					System.out.println("컴퓨터의 선택: " + (computerChoice == 1 ? "가위" : (computerChoice == 2 ? "바위" : "보")));
//					
//					if(userChoice == computerChoice) {
//						System.out.println("무승부입니다.");
//						draw++;
//					}else if(
//							(userChoice ==1 && computerChoice ==2) ||
//							(userChoice ==2 && computerChoice ==3) ||
//							(userChoice ==3 && computerChoice ==1)
//							) {
//						System.out.println("컴퓨터의 승리입니다.");
//						comWin++;
//					}else {
//						System.out.println("당신의 승리입니다.");
//						userWin++;
//					}
//			
//					
//				}catch(InputMismatchException e) {
//					System.out.println("잘못된 입력입니다. 숫자로 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 :  ");
//					sc.nextLine();
//					cnt--;
//				}
//			}
//			System.out.println("# 게임 결과 #");
//			System.out.println(userWin+"승\t"+draw+"무\t"+comWin+"패");
//			sc.close();
			
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
			/*
			# Collection 인터페이스
				1. List 인터페이스 : 순서를 유지하고 저장, 중복 저장이 가능
				2. Set 인터페이스 : 순서를 유지하지 않고 저장, 중복 저장이 불가능
				3. Map인터페이스 : 키와 값의 쌍으로 저장, 키는 중복 저장이 안됨.
			 */
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
			List<Product1018> cart = new ArrayList<>();
			cart.add(new Product1018("사과", 3000, 5));
			cart.add(new Product1018("바나나", 2000, 3));
			cart.add(new Product1018("수박", 12000, 1));
			cart.add(0,new Product1018("복숭아", 5000, 2));
			cart.set(1, new Product1018("딸기", 8000, 20));
			System.out.println("수박이 있습니까?"+cart.contains("수박"));
			cart.remove(1);
			System.out.println("# 현재 장바구니 목록 #");
			for(int idx=0;idx<cart.size();idx++) {
				System.out.print(idx+1+") ");
				System.out.println(cart.get(idx));
			}
			
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
			Map<String, Integer> stud01 = new HashMap<String,Integer>();
			stud01.put("1학년1반30번",80);
			stud01.put("1학년1반17번",75);
			stud01.put("1학년1반33번",95);
			System.out.println("학년/반/번호\t점수");
			for(String stuInfo:stud01.keySet()){
				System.out.print(stuInfo+"\t");
				System.out.println(stud01.get(stuInfo));
			}
			System.out.println();
			
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
			List<Member1018> members = new ArrayList<Member1018>();
			members.add(new Member1018("himan444","himan44","홍길동","브론즈등급",2150));
			members.add(new Member1018("paka9999","9999999","손인욱","다이아등급",8700));
			members.add(new Member1018("okw93441","rmsdn73","오근훈","골드 등급",4250));
			members.add(new Member1018("abc12345","abcdefg","박춘자","실버 등급",3000));
			members.add(new Member1018("lovejava","java123","김코딩","일반 등급",2000));
			System.out.println("ID\t\tPassword\t이름\t권한\t\t포인트");
			for(Member1018 member:members) {
			    System.out.print(member.getId() + "\t");
			    System.out.print(member.getPw() + "\t\t");
			    System.out.print(member.getName() + "\t");
			    System.out.print(member.getAuthority() + "\t");
			    System.out.print(member.getPoint() + "\n");
			}
			
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?
		
		
		
	}

}
class Product1018{
	private String name;
	private int price;
	private int quantity;
	public Product1018(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "" + name + ":  " + price + "원, " + quantity + "개 ";
	}
	
}
class Member1018 {
	private String id;
	private String pw;
	private String name;
	private String authority;
	private int point;
	public Member1018() {
		// TODO Auto-generated constructor stub
	}
	public Member1018(String id, String pw, String name, String authority, int point) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.authority = authority;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
