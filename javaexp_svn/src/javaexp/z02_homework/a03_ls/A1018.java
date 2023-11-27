package javaexp.z02_homework.a03_ls;

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

		/*
		 * 객체인 경우 사용할 수 있는 기능메서드들이 다양한데, 그러한 기능을 이용하기 위해 Wrapper를 이용한다. int a= 1; 이런식으로
		 * 기본 데이터유형에 데이터를 할당하고 그에 맞는 Wrapper 를 Integer aOb = Integer.valueOf(a); 이런식으로
		 * valueOf를 이용하여 정보를 넣거나 Integer aOb = 1; 이런식으로 자동박싱해서 쓸 수 있다.
		 */

//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		/*
		 * int a =1 ; Integer aOb = Integer.valueOf(num01); 이렇게 객체형으로 바꾸는 것을 박싱이라고 하고
		 * 반대로 int a2 = aOb.intValue(); 이처럼 기본데이터 유형에 객체형 데이터 유형정보를 넣는것을 언박싱이라고 한다. 이 둘은
		 * 기본적으로 자동으로 가능해서 Integer aOb = 1; (자동박싱) // int a3 = aOb; (자동 언박싱) 을 지원한다.
		 
		 *Wrapper 클래스
		 *	기본데이터 유형 ==> 객체(Boxing)
		 *	기본데이터 유형 <== 객체(UnBoxing)
		 */
		
		
		Integer one = Integer.valueOf(30);
		Integer two = Integer.valueOf(40);
		System.out.println("#비교된 값#");
		System.out.println(one.compareTo(two));

		// Integer.parseINt("25"); 객체 생성없이 바로 사용할 수 있는
//			static 메서드들이 많음
//		Integer.cpmpare(25,30)...
		
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
		int num01 = (int) (Math.random() * 101 + 1);
		int num02 = (int) (Math.random() * 101 + 1);
		int num03 = (int) (Math.random() * 101 + 1);

		System.out.println("학생1 점수 :" + num01);
		System.out.println("학생2 점수 :" + num02);
		System.out.println("학생3 점수 :" + num03);

		System.out.println("#최고점수 학생 찾기#");
		System.out.println(Math.max(num01, Math.max(num03, num02)));
		System.out.println("#최저점수 학생 찾기#");
		System.out.println(Math.min(num01, Math.min(num03, num02)));

		System.out.println("학생들의 평균점 : " + Math.ceil((num01 + num02 + num03) / 3));

//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요
		/*
		 * 기본적으로 Random 클래스를 사용하면 좀 더 정교한 난수를 만들 수 있습니다. Math.random()은 더 간단한 방식으로 난수를
		 * 생성하지만, 범위 및 시드 설정이 더 제한적입니다.
		 */

//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Random r = new Random();
		int com = r.nextInt(3);
		Scanner sc = new Scanner(System.in);

		int meWin = 0;
		int meLose = 0;
		int meSame = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("가위바위보 중 하나를 입력하세요");
			String me = sc.nextLine();

			if (com == 0) {
				System.out.println("컴퓨터는 가위");
			}
			if (com == 1) {
				System.out.println("컴퓨터는 바위");
			}
			if (com == 2) {
				System.out.println("컴퓨터는 보");
			}
			if (me.equals("가위")) {
				if (com == 0) {
					System.out.println("무승부");
					meSame += 1;
				} else if (com == 1) {
					System.out.println("사용자 패배");
					meLose += 1;
				} else {
					System.out.println("사용자 승리");
					meWin += 1;
				}
			}
			if (me.equals("바위")) {
				if (com == 0) {
					System.out.println("사용자승리");
					meWin += 1;
				} else if (com == 1) {
					System.out.println("무승부");
					meSame += 1;
				} else {
					System.out.println("사용자 패배");
					meLose += 1;
				}
			}
			if (me.equals("보")) {
				if (com == 0) {
					System.out.println("사용자 패배");
					meLose += 1;
				} else if (com == 1) {
					System.out.println("사용자 승리");
					meWin += 1;
				} else {
					System.out.println("무승부");
					meSame += 1;
				}
			}
		}

		System.out.println("사용자 승리 :" + meWin + "판\n" + 
		"사용자 패배 :" + meLose + "판\n" + "무승부:" + meSame + "판\n");

//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.

		/*
		 * List, Set, Map 세가지 가 있으며 List는 중복해서 정보저장이 가능하고, 인덱스로 정보를 관리하며 Set은 중복으로 저장이
		 * 불가능하고 출력 또한 무작위로 출력됩니다. Map은 키와 값으로 이루어져 있으며 키는 중복이 안되고 값 부분은 중복으로 정보저장이
		 * 가능합니다. 출력시에는 키가 숫자로 이루어진 경우 자동으로 정렬돼 출력됩니다.
		 */
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.

		List<Cart> clist = new ArrayList<Cart>();
		clist.add(new Cart("딸기", 5000, 1));
		clist.add(new Cart("바나나", 6000, 3));
		clist.add(new Cart("사과", 2000, 2));
		clist.set(2, new Cart("배", 4000, 5)); // 수정
		clist.remove(0); // 삭제

//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.

		Map<String, Integer> map01 = new HashMap<String, Integer>();
		map01.put("1학년1반30번", 80);
		map01.put("1학년2반30번", 90);
		map01.put("1학년3반30번", 75);
		for (String slist : map01.keySet()) {
			System.out.print(slist + "\t");
			System.out.println(map01.get(slist));
		}

//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
		List<Member> m01 = new ArrayList<Member>();
		m01.add(new Member("aa", 1111, "홍길동", "일반회원", 3000));
		m01.add(new Member("bb", 2222, "김길동", "준회원", 1000));
		m01.add(new Member("cc", 3333, "최길동", "상급회원", 2000));
		m01.add(new Member("dd", 4444, "박길동", "중급회원", 4000));
		m01.add(new Member("ee", 5555, "오길동", "매니저", 5000));

		System.out.println("아이디\t비밀번호\t이름\t등급\t포인트");
		for (Member mlist : m01) {
			System.out.print(mlist.id + "\t");
			System.out.print(mlist.pass + "\t");
			System.out.print(mlist.name + "\t");
			System.out.print(mlist.level + "\t");
			System.out.print(mlist.point + "\n");
		}
	}
	
}

class Member {
	String id;
	int pass;
	String name;
	String level;
	int point;
	public Member(String id, int pass, String name, String level, int point) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.level = level;
		this.point = point;
	}
	
}

class Cart {
	String name;
	int price;
	int cnt;
	public Cart(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
}