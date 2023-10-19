package javaexp.a06_object;

import java.util.Scanner;

public class A07_Methods {

/*
# 객체의 기능메서드의 각 기능별로 복합 처리
 1. 매개변수입력 + 프로세스X + 리턴처리
     ex) 간단하게 매개변수 입력 후, 연산결과 리턴 처리

 2. 매개변수입력 + 프로세스(저장/로직처리) + 리턴값(X)
     ex) 매개변수 입력 후, 로직처리로 화면에 출력만 처리

 3. 매개변수입력X + 프로세스 + 리턴처리
     ex) 매개변수가 없지만 내부적으로 데이터를 프로세스 처리 후,
          리턴데이터 처리하는 형식
          
 4. 매개변수 입력 + 프로세스 + 리턴값         
          
# 객체의 모든 구성요소들의 복합적 처리
 1. 생성자 + 필드 : 생성자를 통해서 데이터 처리

 2. 필드 + 메서드처리
 
 3. 생성자 + 필드 + 메서드처리


 */
	public static void main(String[] args) {
		MethodsExp01 me01 = new MethodsExp01();
		int plusTot = me01.plus(10, 20);
		System.out.println("결과1 : " + plusTot);
		System.out.println("결과2 : " + me01.minus(20, 5));
		
		MethodsExp02 me02 = new MethodsExp02(); // me02 필드
		System.out.println("총계 : " + me02.butTot(5000, 4));
		System.out.println("평균값 : " + me02.getAvg(50, 2));
		System.out.println("더 큰수 : " + me02.getMaxNum(456, 2));
		System.out.println("원의 면적 : " + me02.circleArea(6));
		
		me02.getGugu(9);
		me02.tri(9, 7);
		
		System.out.println("임의의 점수(1~100) : " + me02.getRandomPoint());
		
		if(me02.isAgrade()) {
			System.out.println("A학점 입니다.");
		}else {
			System.out.println("A학점이 아닙니다.");
		}
	

	}
}
// class MethodsExp02 선언하고
// 물건가격과 물건갯수의 매개변수 입력받아서, 총계를 리턴 처리하는 메서드
// 타율계산하는 메서드로 타석과 안타수를 매개변수로 입력받아, 타율을 리턴하는 메서드
// 두 수의 평균 계산 리턴
// 두 수 중 큰수 반환
// 반지름을 가진 원의 면적 계산(반지름 매개변수 1개)

class MethodsExp02 {
	// ex) Scanner로 점수를 입력받아서 A학점여부(90점이상)를 boolean으로 리턴하게 처리하세요
	boolean isAgrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력 : ");
		sc.nextLine();
		int pt = sc.nextInt();
		System.out.println("입력된 점수:"+pt);
		return pt>=90;
	
	}
	
	
	
//	매개변수입력X + 프로세스 + 리턴처리
	public int getRandomPoint() {
		int pt = (int)(Math.random() * 101);
		return pt;
	}
	
	// 입력 받은 값을 기준으로 출력 처리하고 리턴값이 없는 경우
	void getGugu(int grade) {
		System.out.println("# " + grade + "단 #");
		for(int cnt = 1;cnt <= 9; cnt++) {
			System.out.println(grade + " x " + cnt + " = " + (grade * cnt));
			
		}
	}
	// ex) 삼각형의 밑면과 높이를 입력받아, 입력된 정보와 넓이를 출력하는 메서드를 선언하고 호출하세요 (리턴값없음)
	
	void tri(int num01, int num02) {
		System.out.println("밑면 : " + num01 + " 높이 : " + num02);
		
		System.out.println("삼각형의 넓이 : " + (double)num01 * num02 / 2);
	}
	
	
	
	double circleArea(double radius) {
		// Math.PI = 3.14
		return Math.PI * radius * radius;
	}
	
	int getMaxNum(int num01, int num02) {
		//두 수 중에 큰데이터를 리턴하되 같으면 0
		return num01 > num02? num01 :(num01 < num02? num02 : 0);
	}
	
	int getAvg(int num01, int num02) {
		return (num01 + num02) / 2;
	}
	
	int butTot(int price, int cnt) {
		System.out.println("물건가격 : " + price);
		System.out.println("물건 구매 갯수 : " + cnt);
		return price * cnt;
	}
	
	double ball(double count, double anta) {
		System.out.println("타석 : " + count);
		System.out.println("안타수 : " + anta);
		return anta / count;
	}
	
	
		
		
	}
	



// 매개변수입력 + 프로세스X + 리턴처리
class MethodsExp01 {
	int plus(int num01, int num02) {
		System.out.println("합산 처리 메서드");
		return num01 + num02;
	}
	int minus(int num01, int num02) {
		System.out.println("뺄셈 처리 메서드");
		return num01 - num02;
	}
}




