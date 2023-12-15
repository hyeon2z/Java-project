package javaexp.z02_homework.a21_hcj.h1018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//				기본데이터를 여러형태로 변환시키거나 쉽게 기능적인 처리를 하기위해
//				int ==> Integer
//				char ==> Character
//				double ==> Double
//				boolean ==>Boolean
//				선언형식
//				Wapper클래스 클래스명 =Wapper클래스.valueof(기본데이터) ;
//				
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
				int num = 50;
				Integer numObj = Integer.valueOf(num);// 기본적인 Boxing
				int value = numObj.intValue(); //기본적인 언박싱
				
				Integer num01Obj = 3; //AutoBoxing으로 내부적으로 자동 박싱처리
				int value2 = num01Obj; //AutoUnBoxing으로 내부적으로 자동 박싱처리
				
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
				int stdPt[] = new int[3];
				double tot=0;
				for(int i=0;i<stdPt.length;i++) {
					stdPt[i] = (int)(Math.random()*101);
					tot+=stdPt[i];
					System.out.println(i+1+":"+stdPt[i]);
				}
				int max= Math.max(stdPt[0], stdPt[1]);
				max = Math.max(stdPt[2], max);
				int min= Math.min(stdPt[0], stdPt[1]);
				min = Math.min(stdPt[2], min);
				double avg = tot/(stdPt.length*1.0);
				System.out.println("최고점: "+max);
				System.out.println("최저점: "+min);
					
				System.out.println("평균점수: "+Math.round(avg));
				
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
				//Math.rendom은 0.0~1.0 사이의 double형태의 수를 반환하지만 Random은 
				//여러가지 기능처리로 인해 int,byte,boolean 등 다양한 형태의 난수를 받을수있다
				
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
				Random r = new Random();
				int com;
				
				Scanner sc = new Scanner(System.in);
				int player;
				//0:가위 1:바위 2:보
				int win=0;
				int lose=0;
				int drow=0;
				int game =0;
				while(game!=3) {
					game++;
					
					com = r.nextInt(3);
					System.out.println(com);
					System.out.print("0.가위,1.바위,2.보 중의 1개를 입력:");
					player = Integer.parseInt(sc.nextLine());
					if(com == player) {
						drow++;
					}else if((com ==0&&player==1)||(com ==1&&player==2)||(com ==2&&player==0)) {
						win++;
					}else {
						lose++;
					}	
				}
				System.out.print("승:"+win);
				System.out.print("무:"+drow);
				System.out.println("패:"+lose);
				
				
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
				//List : 중복이 가능하고 순서를 저장한다
				//set : 중복이 불가능하고 순서를 저장하지 않는다.
				//Map : 키값만 중복이 불가능하고 값은 중복가능
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
				List<Product> cart = new ArrayList<Product>();
				cart.add(new Product("사과",1500,3));
				cart.add(new Product("배",3000,2));
				cart.add(new Product("바나나",1000,5));
				cart.set(1, new Product("복숭아",4000,1));
				cart.remove(2);
				for(Product d : cart) {
					System.out.print(d.getName()+"\t");
					System.out.print(d.getPrice()+"\t");
					System.out.print(d.getCnt()+"\n");
				}
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
				Map<String,Integer> stdu = new HashMap<String,Integer>();
				stdu.put("1학년1반30번", 80);
				stdu.put("1학년1반25번", 70);
				stdu.put("1학년1반01번", 100);
				for(String s:stdu.keySet()) {
					System.out.print("정보:"+s);
					System.out.println("점수:"+stdu.get(s));
					
				}
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
				List<Member> mlist = new ArrayList<Member>();
				mlist.add(new Member("abd","123","홍길동",true,80));
				mlist.add(new Member("abdF","11123","김길동",false,20));
				mlist.add(new Member("abdW","1123","신길동",false,80));
				mlist.add(new Member("aW","1223","고길동",false,90));
				mlist.add(new Member("aBD","1323","마길동",true,100));
				System.out.println("회원 명단");
				for(Member m:mlist) {
					System.out.print("이름:"+m.getName()+"  ");
					System.out.print("아이디:"+m.getId()+"  ");
					System.out.print("패스워드:"+m.getPass()+"  ");
					System.out.print("관리자권한:"+m.isAdm()+"  ");
					System.out.println("점수:"+m.getPoint());
				}
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		1.Objectcollection map에 대한 설명도 있었으면 좋겠습니다.
//		2. InputStream OutputStream 부분
//		3. 금일 진행한 수업내용 전반적으로 보충설명
//		
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		없음
//		3. 수업 시간 집중하였는가?
//		네
		
		
		
	}

}
class Product1018{
	
	
}
