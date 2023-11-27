package javaexp.z02_homework.a19_cjw;

import java.util.*;

public class A1018_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
		/*
		1. 사용이유
			기본 데이터유형을 객체유형으로 변환하여 api(주로 객체만 처리)에서 제공하는 메서드들을 사용하기 위함이다.
		2. 기본 선언 형식
			1) 기본 데이터유형에 따른 형태
				byte => Byte
				char => Character
				int => Integer
				double => Dobule
				boolean => Boolean
			2) 선언 형식(double 형태를 예시로)
				(1) 기본
					// Boxing
					double db01 = 3.14;
					Double dbOb1 = Double.valueOf(db01);
					// UnBoxing
					dbOb1.intValue();	// 형변환 가능 그외 다른 메서드를 이용한 처리 가능
					dbOb1.doubleValue();
				(2) Auto
					Double dbOb2 = 3.14;
					dbOb2.doubleValue();
		 * */
		
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		/*
		1. 기본
			// Boxing
			int num01 = 4;
			Integer numOb1 = Integer.valueOf(num01);
			// UnBoxing
			numOb1.intValue();
		2. Auto
			Integer numOb2 = 4;
			numOb2.intValue();
		 * */
		
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고,
//					  최고점, 최저점, 평균점(반올림) 출력을 하세요
		int grade01 = (int)(Math.random()*100);
		int grade02 = (int)(Math.random()*100);
		int grade03 = (int)(Math.random()*100);
		System.out.println("학생 3명의 점수: "+grade01+", "+grade02+", "+grade03);
		System.out.println("최고점: "+Math.max(grade01, Math.max(grade02, grade03)));
		System.out.println("최저점: "+Math.min(grade01, Math.min(grade02, grade03)));
		System.out.println("평균점(반올림): "+Math.round((double)(grade01+grade02+grade03)/3));
		
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		/*
		Math.random() => Math클래스의 random메서드로 0~1사이의 실수값 하나를 무작위로 출력한다.
		Random 클래스 => .next데이터유형의 메서드들이 존재. 객체로 불러와서 사용해야한다.
						ex) r.nextBoolean() : true/false가 랜덤으로 출력
							r.nextInt(경우의수) : 0부터 경우의수 크기(3이면 0~2)의 정수가 랜덤으로 출력
		 * */
		
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 시작!");
		int win = 0;
		int lose = 0;
		int draw = 0;
		for(int i = 1;i<=3;i++) {
			System.out.println(i+"회");
			int com = r.nextInt(3);
			String comResult = "";
			if(com==0) {
				comResult = "가위";
			}else if(com==1) {
				comResult = "바위";
			}else if(com==2) {
				comResult = "보";
			}
			System.out.print("플레이어: ");
			String playerResult = sc.nextLine();
			if((comResult.equals("가위") && playerResult.equals("바위")) ||
					(comResult.equals("바위") && playerResult.equals("보")) ||
					(comResult.equals("보") && playerResult.equals("가위"))) {
				System.out.println("컴퓨터: "+comResult);
				System.out.println("플레이어: "+playerResult);
				System.out.println("승");
				win++;
			}else if((comResult.equals("가위") && playerResult.equals("보")) ||
					(comResult.equals("바위") && playerResult.equals("가위")) ||
					(comResult.equals("보") && playerResult.equals("바위"))) {
				System.out.println("컴퓨터: "+comResult);
				System.out.println("플레이어: "+playerResult);
				System.out.println("패");
				lose++;
			}else if(comResult.equals(playerResult)) {
				System.out.println("컴퓨터: "+comResult);
				System.out.println("플레이어: "+playerResult);
				System.out.println("무");
				draw++;
			}
		}
		System.out.println("결과: "+win+"승 "+draw+"무 "+lose+"패");
		
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
		/*
		1. List : 순서는 인덱스에 의해 저장이 되며, 데이터를 저장/중복저장한다.
					ArrayList, Vector, LinkedList
		2. Set : 사용자의 의도대로 순서가 유지되지 않으며, 데이터를 저장하며 중복저장은 불가능하다.
					HashSet, TreeSet
		3. Map : 순서는 유지되지 않고 키와 값 쌍으로 저장되며, 키는 중복저장이 불가능하나 값은 중복저장이 가능하다.
					HashMap, Hashtable, TreeMap, Properties
		 * */
		
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고,
//					  수정, 삭제 해보세요.
		List<Product> cart = new ArrayList<Product>();	// product 클래스는 하단에 생성
		cart.add(new Product("사과",2000,5));
		cart.add(new Product("딸기",4000,2));
		cart.add(new Product("바나나",3000,1));
		cart.add(1,new Product("오렌지",2500,3));
		cart.set(2, new Product("망고",5000,4));
		cart.remove(0);
		System.out.println("과일 종류: "+cart.size()+"개");
		System.out.println("물건명\t가격\t개수");
		for(Product fruit:cart) {
			System.out.println(fruit.getName()+"\t"+fruit.getPrice()+"원\t"+fruit.getCnt()+"개");
		}
		
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어
//					  학생 3명의 점수를 할당하고 출력해보세요.
		Map<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("1학년 1반 30번",80);
		grades.put("2학년 3반 15번",90);
		grades.put("3학년 6반 27번",80);
		System.out.println("학생정보\t점수");
		for(String id:grades.keySet()) {
			System.out.println(id+"\t"+grades.get(id));
		}
		
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고,
//					  회원5명을 정보를 등록 및 리스트 출력하세요.
		List<PersonInfo> information = new ArrayList<PersonInfo>();
		information.add(new PersonInfo("himan","java123","홍길동","manager",30000));
		information.add(new PersonInfo("higirl","java234","김길동","nonuser",300));
		information.add(new PersonInfo("ohman","java456","오길동","user",200));
		information.add(new PersonInfo("login","java686","신길동","user",330));
		information.add(new PersonInfo("good","java789","박길동","nonuser",500));
		System.out.println("# 회원정보 #");
		System.out.println("아이디\t패스워드\t이름\t권한\t포인트");
		for(PersonInfo info:information) {
			System.out.println(info.getId()+"\t"+info.getPassword()+"\t"+info.getName()
								+"\t"+info.getAuthority()+"\t"+info.getPoint()+"점");
		}
		
	}

}

class Product{
	private String name;
	private int price;
	private int cnt;
	
	public Product(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}

class PersonInfo{
	private String id;
	private String password;
	private String name;
	private String authority;
	private int point;
	
	public PersonInfo(String id, String password, String name, String authority, int point) {
		this.id = id;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
