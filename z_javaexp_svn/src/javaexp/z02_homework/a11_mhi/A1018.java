package javaexp.z02_homework.a11_mhi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class A1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 
//		기본 선언 형식을 기술하세요
//		사용이유) 기본 자료형의 값을 단순히 값으로 사용하지 않고,
//		        그 값에 대한 메서드를 사용 혹은 null 값을 이용하기 위해 사용

//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		// 박싱
//		int i  =10;
//		Integer num = Integer.valueOf(i);

//		//언박싱
//		int n = num.intValue();
//		
//		//오토박싱 : new Integer() 생략 
//		Integer num = 17;
//		
//		//오토언박싱 : intValue() 생략 가능
//		int n =num;
//		

//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
		Random r = new Random();
		int num01 = r.nextInt(101);
		int num02 = r.nextInt(101);
		int num03 = r.nextInt(101);
		System.out.println("num01값:" + num01);
		System.out.println("num02값:" + num02);
		System.out.println("num03값:" + num03);
		System.out.println("최대값:" + Math.max(num01, Math.max(num02, num03)));
		System.out.println("최저값:" + Math.min(num01, Math.min(num02, num03)));
		System.out.println("평균점:" + Math.round((num01 + num02 + num03) / 3));

//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		// Math.random() : 클래스의 정적 메서드

		// Random 클래스 : java.util.Random 패키지속에 속하는 클래스
		// Random 클래스의 인스턴스를 생성한 후,
		// nextInt(), nextDouble(), nextBoolean()등과 같은
		// 다양한 메서드를 사용하여 난수 생성 가능
		// 범위를 직접 지정할 필요 없이, 사용자가 원하는 형식의 난수 생성 가능

//		코드를 짜긴 했는데 코드를 다시 봐야겠다. [1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int player;
		int computer;
		int win=0;
		int lose=0;
		int draw=0;
		
		for(int i=0; i<3; i++) {
			player = r.nextInt(3);
			computer = r.nextInt(3);
			  if(player==computer)
		         {
		            draw++;
		         }
		         else if((player==computer+1)||(player==0&&computer==2))
		         {
		            win++;
		         }
		         else
		         {
		            lose++;
		         }
		      }

		System.out.println(win+"승"+lose+"패"+draw+"무");
		
		
//		System.out.println("가위바위보 게임 진행(가위=1, 바위=2, 보=3)");
//		int input = sc.nextInt();
//		int num04 = r.nextInt(3 + 1);
//		
//		
//		System.out.println("사용자 입력값:"+input);
//		System.out.println("컴퓨터 입력값:"+num04);
//		
////		for(int i=0; i<5; i++) {
//			if (num04 < input) {
//				System.out.println("이겼습니다.");
//			} else if (num04 == input) {
//				System.out.println("비겼습니다.");
//			} else {
//				System.out.println("졌습니다.");
//			}
//		}
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
			// Collection, List, Set
			// Collection :모든 컬렉션 클래스의 상위 인터페이스,
//			               다른 컬렉션 인터페이스들의 공통 기능을 정의한다.
//			               Collection은 객체의 그룹을 표현하며, 중복 요소를 허용하거나 허용하지 않는 컬렉션을 모두 다룰 수 있다.
//			               주요 메서드로 add(), remove(), size(), isEmpty(), contains(), iterator() 등이 있다.
			
			// List : java.util.List 인터페이스는 순서가 있는 컬렉션을 나타내며, 중복 요소를 허용합니다.
			//요소를 인덱스로 접근할 수 있으며, 요소의 위치를 유지하고 있어서 중복 요소가 허용된다.
			//구현 클래스로 ArrayList, LinkedList, Vector 등이 있으며, 주요 메서드로 get(), set(), add(), remove(), indexOf(), contains() 등이 있다.
			
			//Set : java.util.Set 인터페이스는 중복을 허용하지 않는 컬렉션을 나타냅니다. 즉, 같은 요소가 중복되어 저장되지 않는다..
			//Set은 순서가 정해져 있지 않으므로 요소의 순서를 보장하지 않는다.
			//구현 클래스로 HashSet, LinkedHashSet, TreeSet 등이 있으며, 주요 메서드로 add(), remove(), size(), isEmpty(), contains() 등이 있다.
			
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
			List<String> plist = new ArrayList<String>();
			plist.add("비누");
			plist.add("당근");
			plist.add("세제");
			plist.set(1, "당근아니고 피망");
			plist.remove(0); //비누 삭제
			for(int idx=0;idx<plist.size();idx++) {
				System.out.print(idx+1+"\t");
				System.out.println(plist.get(idx));
			}
			plist.clear();
			System.out.println("비어 있는지 여부:"+plist.isEmpty());
			
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
			Map<String, Integer> map01 = new HashMap<String,Integer>();
			map01.put("1학년1반30번", 80);
			map01.put("1학년1반30번", 70);
			map01.put("1학년1반30번", 90);
			System.out.println("학생정보\t점수");
			for(String serNum:map01.keySet()) {
				System.out.print(serNum+"\t");
				System.out.println(map01.get(serNum));
			}
			
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
			
			
			
			
			
//		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//		3. 수업 시간 집중하였는가?

	}

}


// 강사님 답안
// TODO Auto-generated method stub
//[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
//[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
//[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
//[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
//[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
//[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
//[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
//[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
/*
각 질문에 대한 자바 코드 예제와 설명을 제공하겠습니다.

**[1단계:개념] 1. Wrapper 클래스 사용 이유 및 기본 선언 형식**

- 사용 이유: 
1. 기본 자료형(primitive data type)에 대한 객체 표현이 필요할 때 사용합니다.
2. 컬렉션과 같은 객체만을 저장하는 자료구조에 기본 자료형 값을 저장하기 위해 사용됩니다.
List<Integer> list = new ArrayList<Integer>();
list.add(25);
list.add(75);
list.add(85);
3. 클래스에 따른 유용한 메서드들을 사용할 수 있습니다.

- 기본 선언 형식:
```java
Integer intObj = Integer.valueOf(123);
```

**[1단계:개념] 2. Boxing/UnBoxing 및 AutoBoxing/AutoUnBoxing**

- Boxing: 기본 자료형의 값을 래퍼 객체로 변환하는 것
```java
Integer boxedInt = Integer.valueOf(10);
```

- UnBoxing: 래퍼 객체의 값을 기본 자료형으로 변환하는 것
```java
int unboxedInt = boxedInt.intValue();
```

- AutoBoxing: 기본 자료형의 값을 자동으로 래퍼 객체로 변환하는 것
```java
Integer autoBoxedInt = 10;
```

- AutoUnBoxing: 래퍼 객체의 값을 자동으로 기본 자료형으로 변환하는 것
```java
int autoUnboxedInt = autoBoxedInt;
```

**[1단계:확인] 3. Math 클래스를 이용한 학생 점수 계산**

```java
public class ScoreCalculator {
public static void main(String[] args) {
double[] scores = {Math.floor(Math.random() * 101), Math.floor(Math.random() * 101), Math.floor(Math.random() * 101)};

double maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
double minScore = Math.min(scores[0], Math.min(scores[1], scores[2]));
double averageScore = (scores[0] + scores[1] + scores[2]) / 3;

System.out.println("최고점: " + maxScore);
System.out.println("최저점: " + minScore);
System.out.println("평균점: " + Math.round(averageScore));
}
}
```

**[1단계:개념] 4. Math.random()과 Random 클래스 차이**

- `Math.random()`: 0.0(포함)과 1.0(미포함) 사이의 double 값을 반환하는 정적 메서드.
- `Random` 클래스: 다양한 타입의 랜덤 값을 생성할 수 있는 메서드들을 제공하는 클래스. 예를 들면, `nextInt()`, `nextLong()`, `nextDouble()` 등의 메서드가 있습니다. 또한 시드(seed) 값을 설정하여 동일한 랜덤 시퀀스를 생성할 수 있습니다.

**[1단계:확인] 5. Random를 활용한 가위/바위/보 게임**


```java
import java.util.Random;

public class RockPaperScissors {
public static void main(String[] args) {
String[] choices = {"가위", "바위", "보"};
Random rand = new Random();

for (int i = 0; i < 3; i++) {
    int computerChoice = rand.nextInt(3);
    // 사용자의 선택은 예를 들어 항상 "가위"로 가정
    System.out.println("컴퓨터의 선택: " + choices[computerChoice]);
    // 여기에 승/무/패 판정 로직 추가
}
}
}


String[] games = {"가위","바위","보"};
int win,eq,def; win=eq=def=0; // 승무패 선언.
System.out.println("# 컴퓨터와 하는 가위, 바위, 보 게임#");
for(int cnt=1;cnt<=3;cnt++) { 
	System.out.println(cnt+"번째 게임!!");
	System.out.print("번호를 입력하세요(1.가위, 2.바위, 3.보):");
	Scanner sc = new Scanner(System.in);
	int myIdx = sc.nextInt()-1;
	String myChoice= games[myIdx];
	System.out.println("당신의 선택:"+myChoice);		
	Random r = new Random();
	int comIdx = r.nextInt(3); // 0~2 임의로 나온다.
	String comResult = games[comIdx]; // 임의 index로 컴퓨터 선택
	System.out.println("임의의 가위/바위/보(컴퓨터):"+
			comResult);
	if(myIdx == comIdx) {
		System.out.println("무승부");
		eq++;
	}else if((myIdx+2)%3 == comIdx) {
		System.out.println("나의 승");
		win++;
	}else {
		System.out.println("컴퓨터의 승");
		def--;
	}
}
System.out.println("# 최종 결과 #");
System.out.println(win+"승, "+eq+"무, "+def+"패");
// 			{"가위","바위","보"};
// myIdx		0     1    2
// comIdx       0     1    2  
// 1. 비길때,  myIdx == comIdx
// 2. 나의승   myIdx   0    1     2
//           comIdx   2    0     1
//    규칙 찾고 ==> 비교조건 ex) ++myIdx == comIdx
///               hint %     
// 3. 컴퓨터승    myIdx   0    1     2                        (myIdx+2)%3 == comIdx
		//      comIdx   1    2     0
//  
```


**[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징**

- **List**: 순서가 있는 데이터의 집합. 데이터의 중복을 허용합니다.
- **Set**: 순서가 없는 데이터의 집합. 데이터의 중복을 허용하지 않습니다.
- **Map**: 키와 값의 쌍으로 이루어진 데이터의 집합. 키의 중복을 허용하지 않지만, 값의 중복은 허용합니다.

**[1단계:확인] 7. List의 주요 메서드 이용**

```java
import java.util.ArrayList;
import java.util.List;

class Item {
String name;
double price;
int quantity;

Item(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}

@Override
public String toString() {
return name + " (가격: " + price + ", 수량: " + quantity + ")";
}
}

public class ShoppingCart {
public static void main(String[] args) {
List<Item> cart = new ArrayList<>();

cart.add(new Item("아이템1", 1000, 1));
cart.add(new Item("아이템2", 1500, 2));
cart.add(new Item("아이템3", 2000, 3));

// 수정
cart.get(1).price = 1800;

// 삭제
cart.remove(0);

// 출력
for (Item item : cart) {
    System.out.println(item);
}
}
}
```

**[1단계:확인] 8. Map 사용**

```java
import java.util.HashMap;
import java.util.Map;

public class StudentScores {
public static void main(String[] args) {
Map<String, Integer> scores = new HashMap<>();

scores.put("1학년1반1번", 80);
scores.put("1학년1반2번", 85);
scores.put("1학년1반3번", 90);

for (String key : scores.keySet()) {
    System.out.println(key + ": " + scores.get(key) + "점");
}
}
}
```

**[1단계:확인] 9. List에 클래스를 이용한 회원정보 등록 및 출력**

```java
import java.util.ArrayList;
import java.util.List;

class Member {
String id;
String password;
String name;
String role;
int points;

Member(String id, String password, String name, String role, int points) {
this.id = id;
this.password = password;
this.name = name;
this.role = role;
this.points = points;
}

@Override
public String toString() {
return "ID: " + id + ", 이름: " + name + ", 권한: " + role + ", 포인트: " + points;
}
}

public class MemberList {
public static void main(String[] args) {
List<Member> members = new ArrayList<>();

members.add(new Member("user1", "pass1", "홍길동", "USER", 100));
members.add(new Member("user2", "pass2", "이순신", "ADMIN", 200));
// ... 추가적인 회원들 ...

for (Member member : members) {
    System.out.println(member);
}
}
}
```

*/



//}

//}
