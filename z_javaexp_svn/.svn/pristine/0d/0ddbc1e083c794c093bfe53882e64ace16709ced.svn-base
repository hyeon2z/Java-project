package javaexp.a05_arrayreview;

public class A03_DblArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# 이중 배열
		1. 데이터유형[][] = new 데이터유형[크기][크기];
			[][] : 차원의 갯수	
		*/
		// 반별 학생의 국어 점수
		// 반이 5반까지 있고, 한반에 학생이 30명이 있을 때,
		// 국어점수할당 배열
		int[][] kors = new int[5][30];
		int[][] kors2 = new int[5][]; // 5반인데 반별 학생수.
//		int[][] kors3 = new int[][]; 에러발생..
		// 반은 5반인데 각 반에 학생 수를 다르게할 때.
//		kors2[0][0]=75;
//		kors2[0][1]=85;
//		kors2[1][0]=75;
//		kors2[1][1]=80;
//		kors2[1][2]=90;
		
		// 1반에 1번에 점수할당.
		kors[0][0] = 70;
		// 5반에 30번에 점수할당
		kors[4][29] = 80;
		// 1반학생들 점수를 임의로 할당.
		for(int idx=0;idx<30;idx++) {
			// 1반에 1~30까지 점수 할당.
			kors[0][idx] = (int)(Math.random()*101);
			System.out.println(idx+1+"번 "+kors[0][idx]);
		}
		System.out.println("반의 갯수:"+kors.length);
		System.out.println("2반의 학생 인원:"+kors[1].length);
		for(int idx=0;idx<kors.length;idx++) {
			System.out.print(idx+":"+(idx+1)+"반 ");
			System.out.println(kors[idx].length+"명");
			for(int jdx=0;jdx<kors[idx].length;jdx++) {
				kors[idx][jdx]=(int)(Math.random()*101);
				System.out.println(jdx+1+"\t"+
						kors[idx][jdx]+",");
			}
			System.out.println();
		}
		// # 2차원 데이터가 for문에서 할당하는 구조 이해여부 확인
		// 1. kor.length와 kors[idx].length의 차이점을 알고 있는지?
		// 2. kors[idx][jdx] 왜? 두개를 다른 idx, jdx를 사용해서
		//    데이터를 할당하고 있는지?
		//    idx의 의미는 무엇이고, jdx의 의미는 무엇인지?
		//    idx : 반정보에 대한 index 0 부터
		//    jdx : 반 안에 학생들의 번호 index 0 부터
		// 3. 2차원 데이터를 for문을 2개를 사용해야 하는 이유를 알고 
		//    있는지?
		//    반/번호라는 계층구조로 2차원 배열을 선언했기때문에
		//    반을 접근할 때 for문과  번호를 접근할 때 for문이
		//    필요로 한다.
		// ex) 기차가 ktx 1~5호 있고, 각 호차별로 좌석이 60개 있을때.
		//     예약자명을 할당하는 배열을 선언하고
		//     1호차 30번, 2호차 2번, 5호차 3번 좌석에
		//     홍길동      김길동     신길동을 예약처리하고
		//     for문을 통해서 출력해보세요   String[][]
		// int[][] kors = new int[5][30];
		String [][] ktx = new String[5][60];
		ktx[0][29] = "홍길동";
		ktx[1][1] = "김길동";
		ktx[4][2] = "신길동";
		for(int idx=0;idx<ktx.length;idx++) {
			System.out.println(idx+1+"호차 예약현황");
			for(int jdx=0;jdx<ktx[idx].length;jdx++) {
				System.out.println("  좌석번호:"+(jdx+1)+":"+
						ktx[idx][jdx]);
			}
			
		}
		
		
		
		
		
		
	}

}
