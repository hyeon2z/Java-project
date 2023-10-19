 package javaexp.a03_calculator;

public class A02_Incre_Decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 증감연산자
		1. 기본 : 1씩 증가/감소 처리
		    ++변수 : 증가하고 해당라인에 표시
		    변수++ : 해당라인에 표시하고 증가
		    --변수 : 감소하고 해당라인에 표시
		    변수-- : 해당라인에 표시하고 감소
		 */
		int no = 0;
		System.out.println(++no); // 증가시키고 출력 1
		System.out.println(++no); // 2
		System.out.println(++no); // 3
		System.out.println(no++); // 3 출력하고 증가 4
		System.out.println(no++); // 4 출력하고 증가 5
		System.out.println(no++); // 5 출력하고 증가 6
		System.out.println(--no); // 감소시키고 5 출력
		System.out.println(--no); // 4
		System.out.println(--no); // 3
		System.out.println(no--); // 3 출력하고 감소 2
		System.out.println(no--); // 2 출력하고 감소 1
		System.out.println(no--); // 1 출력하고 감소 0
		System.out.println("최종결과값 : " + no);
		/*
		# 누적연산자
		1. 2개이상 증가/감소 할 때
		 */
		int no2 = 0;
		no2 = no2 + 2;
		no2 += 2; // 위 연산식과 동일 결과를 처리.
		
		// 연산식은 왼쪽에서 오른쪽 흐름, 위에서 아래로
		// 단, 대입연산자(=) 오른쪽 -> 왼쪽으로 대입된다.
		
		// ex) no3을 초기값을 0으로 설정하고, 3씩 3번 증가한 결과값을 출력하세요.
		// ex) no4을 초기값을 10으로 설정하고, 1씩 5번 감소한 결과값을 출력하세요.
		// ex) no5을 초기값을 100으로 설정하고, 2씩 5번 감소한 결과값을 출력하세요.
		
		int no3 = 0;
		no3 += 3;
		System.out.println(no3);
		no3 += 3;
		System.out.println(no3);
		no3 += 3;
		System.out.println(no3);
		
		int no4 = 10;
		no4 -= 1;
		no4 -= 1;
		no4 -= 1;
		no4 -= 1;
		no4 -= 1;
		System.out.println(no4);
		
		int no5 = 100;
		System.out.println(no5);
		System.out.println(no5 -= 2);
		System.out.println(no5 -= 2);
		System.out.println(no5 -= 2);
		System.out.println(no5 -= 2);
		System.out.println(no5 -= 2);
		
		int num01 = 1;
		System.out.println("# 사칙 누적 연산 #");
		System.out.println("num01*=2" + (num01*=2));
		System.out.println("num01*=2" + (num01*=2));
		System.out.println("num01*=2" + (num01*=2));
		System.out.println("num01/=2" + (num01/=2));
		System.out.println("num01/=2" + (num01/=2));
		System.out.println("num01%=2" + (num01%=2));
		System.out.println("num01%=2" + (num01%=2));
		
	}

}
