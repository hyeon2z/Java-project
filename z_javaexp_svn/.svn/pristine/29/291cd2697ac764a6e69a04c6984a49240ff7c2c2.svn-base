package javaexp.z02_homework.a16_jsr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//				기본 데이터는 기능메서드를 사용할 수 없는데 Wrapper클래스를 통해 
//				그 데이터를 객체화 시켜 기능메서드를 사용할 수 있게 해줍니다.
//				기본 => 객체화
//				byte => Byte
//				short => Short
//				int => Integer
//				long => Long
//				float => Float
//				double => Double
//				char => Character
//				boolean => Boolean
//		
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
//				1)기본적인 Boxing/UnBoxing
//				int num01=33; //기본 데이터
//				Integer num01W = Integer.valueOf(num01); //Boxing
//				int num02= num01W.intValue(); //UnBoxing
//				
//				2)AutoBoxing/AutoUnBoxing : 기능 메서드 사용없이 바로 객체에 할당하는 것
//				ArrayList<Integer>numList=new ArrayList<Integer>();
//				Integer 객체단위에 값을 집어넣을경우에도 자동으로 박싱이 된다.
//				numList.add(30); //AutoBoxing
//				int num03=numList.get(0); //객체가 자동으로 기본 데이터로 변경되어 변수에 저장됨
//				
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
//				int[] score = new int[3];
//				int sum=0;
//				for (int i = 0; i < score.length; i++) {
//					score[i]=(int) (Math.random()*100);
//					sum+=score[i];
//					System.out.println(score[i]);
//				}
//				int max=0;
//				int min=score[0];
//				for (int i = 0; i < score.length; i++) {
//					if(score[i]>max) {
//						max=score[i];
//					}
//					if(score[i]<min) {
//						min=score[i];
//					}
//				}
//				double avg=Math.round(sum/score.length);
//				System.out.println("최저점:"+min+" 최고점:"+max+" 평균:"+avg);
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
//				Math.random()과 Random 클래스는 모두 랜덤 수를 생성하는 방법을 제공합니다.
//				1) Math.random() 은 별도의 인스턴스를 생성해줄 필요가 없고 double값 만을 반환합니다.
//					double rand=Math.random();
//					int rand2=(int)(Math.random());// 형변환 필요
//				2) Random 클래스는 boolean, int, long, float, double 값을 생성할 수 있습니다.
//					그리고 반드시 인스턴스를 생성해야합니다. 또한 종자값을 설정할 수 있습니다.
//				Random random = new Random();// 인스턴스 생성
//				random.nextInt(10) // 0~10
//				random.nextBoolean() // true, false
//				random.nextDouble(10) // 0.0~10.0 사이의 실수
				
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
//				Random random = new Random();
//				int cnt=0;
//				System.out.println("#가위바위보 게임을 시작합니다#(1:가위,2:바위,3:보)");
//				int win=0;
//				int lose=0;
//				int twin=0;
//				while (cnt<=2) {
//					Scanner sc = new Scanner(System.in);
//					System.out.print("사용자의 선택>>");
//					int play=sc.nextInt();
//					int com=random.nextInt(3)+1;
//					System.out.println("컴퓨터:"+com);
//					if(com==1&&play==2||com==2&&play==3||com==3&&play==1) {
//						win++;
//					}else if(com==play) {
//						twin++;
//					}else {
//						lose++;
//					}
//					cnt++;
//				}
//				System.out.println(win+"승 "+twin+"무 "+lose+"패");
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//				1) List인터페이스: 순서를 유지하고 저장, 중복 저장 가능
//					ArrayList, Vector, LinkedList
//				List<String>  list= new ArrayList<String>();
//				2) Set인터페이스: 순서를 유지하고 저장, 중복 저장 불가능
//					HashSet, TreeSet
//				Set<String> set=new HashSet<String>();
//				3) Map인터페이스: 키와 값의 쌍으로 저장, 키는 중복 저장 안된다
//					HashMap, HashTable, TreeMep, Properties
//				Map<String, String> map=new HashMap<String, String>();
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
//				List<String> list= new ArrayList<String>();
//				list.add("바나나");
//				list.add("5000");
//				list.add("2");
//				list.add("장갑");
//				list.add("15000");
//				list.add("1");
//				list.add("마늘");
//				list.add("3000");
//				list.add("1");
//				for(String str:list) {
//					System.out.print(str+" ");
//				}
//				System.out.println();
//				list.remove(0);
//				list.remove(0);
//				list.remove(0);
//				list.set(0, "고무장갑");
//				for(String str:list) {
//					System.out.print(str+" ");
//				}
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//				Map<String, Integer> map=new HashMap<String, Integer>();
//				map.put("1학년1반30번", 80);
//				map.put("1학년1반31번", 70);
//				map.put("1학년1반32번", 85);
//				for(String serNum:map.keySet()) {
//					System.out.print(serNum+")");
//					System.out.println(map.get(serNum));
//				}
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
//				List<Member2> members = new ArrayList<Member2>();
//				members.add(new Member2("au","777","홍길동","회원",500));
//				members.add(new Member2("bu","888","고길동","회원",500));
//				members.add(new Member2("cu","555","마길동","회원",500));
//				members.add(new Member2("du","111","킹길동","회원",500));
//				members.add(new Member2("eu","666","정서라","관리자",10000));
//				
//				for(Member2 m01:members) {
//					System.out.println(m01.memInfo());
//				}
	}
}
class Member2{
	private String id;
	private String pass;
	private String name;
	private String permission;
	private int point;
	
	public Member2(String id, String pass, String name, String permission, int point) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.permission = permission;
		this.point = point;
	}
	
	public String memInfo() {
		return id+" "+pass+" "+name+" "+permission+" "+point;
	}
}
