package javaexp.a05_array;

public class A03_MultiArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본데이터 유형 ==> 배열 ==> 배열안에 배열(다차원배열)
		// ==> Object
		/*
		# 다차원 배열
		1. 배열이 2차원 이상인 경우를 말한다.
			- 변수는 초기에 한개의 데이터를 할당한다.
			- 1차원의 배열에는 두개 이상의 데이터를 하나의 이름으로
				index로 구분하여 연속적으로 할당한다.
			- 2차원 이상의 배열은 위 1차원 배열이 여러 개를 
				처리하는 것을 말한다.
		2. 자바의 1차원 배열을 이용하여 2차원 이상의 배열을 처리한다.
			1) 선언
				- 1차원 배열
					데이터유형[] 배열명;
					ex) 기차의 호차	
				- 2차원 배열
					데이터유형[][] 배열명;
					ex) 기차의 호차가 있고, 그 안에
						좌석번호가 1~60
				- 다차원 배열
				    데이터유형[][][]... 배열명;
				    ex) 학년/반/번호
			2) 데이터 할당
				- 1차원 배열
					배열명 = new 데이터유형[크기];
					배열명[index번호]
					배열명.length
				- 2차원 배열
					배열명 = new 데이터유형[상위차원갯수][하위차원갯수]
					배열명[상위차원index][하위차원index];
					ex) 기차가 5호차까지 있고,
					각 호차마다 좌석 60좌석이 있을 때..
					train = new 기차[5][60];
					train[0][0]; 
					// index는 0부터시작 첫번째 호차의 첫번째 좌석
		 * */
		boolean [][] trainSeats = new boolean[5][60];
		// 기차 5개 호차가 있고, 각 호차마다 좌석 60개가 있는데
		// 각 좌석에 비어있으면 false, 좌석이 차 있으면 true로
		// 처리하는 2차원 구조의 배열 선언..
		System.out.println("1호차의 첫번째 좌석:"+
				trainSeats[0][0]);
		System.out.println("5호차의 마지막 좌석:"+
				trainSeats[4][59]);
		// ex1) 3호차 40번좌석
		trainSeats[2][39]=true;
		// ex2) 4호차 2번좌석
		trainSeats[3][1]=true;
		// ex3) 5호차 16번좌석
		trainSeats[4][15]=true;
		// 학년에 반과 번호에 해당하는 점수
		//  3학년  6반이 있고 각반 20명  국어점수처리 2차원배열..
		int [][] kors = new int[6][20];
		// 3반 2번  80
		// 4반 16번  90
		// 5반 7번   85
		kors[2][1] = 80;
		kors[3][15] = 90;
		kors[4][6] = 85;
		System.out.println("반의 수:"+kors.length);// 상위 배열
		System.out.println("1반의 학생수:"+kors[0].length);
		// 각 단위 하위의 배열크기.
		
		for(int clsIdx=0;clsIdx < kors.length;clsIdx++) {
			System.out.println(clsIdx+1+"반의 점수");
			for(int noIdx=0;noIdx < kors[clsIdx].length;noIdx++) {
				System.out.println("\t"+(noIdx+1)+"번호 점수"+
								kors[clsIdx][noIdx]);
				// 배열명[상위index][하위index]
			}
		}
		int [] pts = new int[5];
		pts[0] = 70;
		pts[1] = 80;
		pts[2] = 90;
		pts[3] = 80;
		pts[4] = 70;
		for(int idx=0;idx<pts.length;idx++) {
			// 0 1 2 3 4
			// pts[0]
			// pts[1]
			// pts[2]
			// pts[3]
			// pts[4]
			System.out.println(pts[idx]);
		}
		
		
		
		
		
	}

}
