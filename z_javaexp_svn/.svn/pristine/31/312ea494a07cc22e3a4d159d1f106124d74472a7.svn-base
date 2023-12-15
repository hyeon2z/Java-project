package javaexp.a03_calculator;

public class A02_Incre_Decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 증감연산자
		1. 기본 : 1씩 증가/감소 처리..
			++변수  : 증가하고 해당라인에 표시
			변수++  : 해당라인에 표시하고 증가
			--변수  : 감소하고 해당라인에 표시
			변수--  : 해당라인에 표시하고 감소
		# 누적연산자
		1. 2개이상 증가/감소할 때??
		 * */
		int no = 0; // [0]
		System.out.println(++no);// 증가시키고 출력 [1]
		System.out.println(++no);// [2]
		System.out.println(++no);// [3]
		System.out.println(no++);// 출력[3]하고 증가 [4]
		System.out.println(no++);// 출력[4]    증가 [5]
		System.out.println(no++);// 출력[5]    증가 [6]
		System.out.println(--no);// 감소[5]하고 출력
		System.out.println(--no);// 감소[4]하고 출력
		System.out.println(--no);// 감소[3]하고 출력
		System.out.println(no--);// 출력[3]    감소 [2]
		System.out.println(no--);// 출력[2]    감소 [1]
		System.out.println(no--);// 출력[1]    감소 [0]
		System.out.println("최종데이터:"+no);
		/*
		# 누적연산자
		1. 2개이상 증가/감소할 때??
		*/
		int no2 = 0;
		int no3,no4,no5; // 정수형으로 no3, no4,no5 선언
		no3 = no4 = no5 = 7;
		
		// 연산식은 왼쪽에서 오른쪽 흐름, 위에서 아래..
		// 단, 대입연산자(=) 오른쪽 왼쪽으로 대입된다..
		
		no2 = no2 + 2;
		no2 = no2 + 2;
		no2 = no2 + 2;
		no2 +=2; // 위 연산식과 동일 결과를 처리한다.
		no2 +=2; // 위 연산식과 동일 결과를 처리한다.
		System.out.println("최종 결과값:"+no2);
		no2 +=5;
		System.out.println("최종 결과값:"+no2);
		no2 +=5;
		System.out.println("최종 결과값:"+no2);
		no2 +=5;
		System.out.println("최종 결과값:"+no2);
		no2 +=5;
		System.out.println("최종 결과값:"+no2);
		// ex1) no3을 초기값을 0으로 설정하고, 3씩 3번 증가한 결과값을 
		//     출력하세요.
		no3 = 0;
		System.out.println("##no3을 초기값을 0으로 설정하고, 3씩 3번 증가#");
		System.out.println(no3);
		no3 +=3;
		System.out.println(no3);
		no3 +=3;
		System.out.println(no3);
		no3 +=3;
		System.out.println(no3);
		// ex2) no4를 초기값을 10으로 설정하고, 1씩 감소 5번한 내용을
		//     출력하세요..
		System.out.println("##no4를 초기값을 10으로 설정하고, 1씩 감소 5번#");
		no4 = 10;
		System.out.println(no4); no4--;
		System.out.println(no4); no4--;
		System.out.println(no4); no4--;
		System.out.println(no4); no4--;
		System.out.println(no4); 
		System.out.println(--no4); 
		
		// ex3) no5를 초기값을 100으로 설정하고, 2씩 5번 감소한 내용을
		//     출력하세요..
		System.out.println("## no5를 초기값을 100으로 설정하고, 2씩 5번 감소 ##");
		no5 = 100;
		System.out.println(no5);
		System.out.println(no5-=2);
		System.out.println(no5-=2);
		System.out.println(no5-=2);
		System.out.println(no5-=2);
		System.out.println(no5-=2);
		
		int num01 = 1;
		System.out.println("# 사칙 누적 연산#");
		System.out.println("num01*=2:"+(num01*=2));
		System.out.println("num01*=2:"+(num01*=2));
		System.out.println("num01*=2:"+(num01*=2));
		System.out.println("num01/=2:"+(num01/=2));
		System.out.println("num01/=2:"+(num01/=2));
		System.out.println("num01%=2:"+(num01%=2));
		System.out.println("num01%=2:"+(num01%=2));
		
		
		
		
	}

}
