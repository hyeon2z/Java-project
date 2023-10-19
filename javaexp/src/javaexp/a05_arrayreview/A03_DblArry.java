package javaexp.a05_arrayreview;

public class A03_DblArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 이중배열
 1. 데이터유형[][][] = new 데이터유형[크기][크기][크기];
     [][] : 차원의 갯수
		 */
		// 반별 학생의 국어 점수
		// 반이 5반까지 있고, 한반에 학생이 30명이 있을 때
		// 국어점수 할당 배열
		
		int[][] kors = new int[5][30];
		int[][] kors2; 
		kors2 = new int[5][]; // 반은 5반인데 각 반의 학생수를 다르게 할 때
//		int[][] kors3 = new int[][]; // 에러
		
		
		kors2[1] = new int[4];
		kors2[1][2] = 45;
//		kors2[1][1] = 45;
//		kors2[1][2] = 24;
		
		
		// 1반에 1번 점수할당.
//		kors[0][0] = 70;
//		// 5반 30번 점수할당
//		kors[4][29] = 80;
//		// 1반학생들 점수를 임의로 할당.
//
//		for(int idx = 0; idx < 30; idx++) {
//			kors[0][idx] = (int)(Math.random() * 101);
//			System.out.println(idx + 1 + "번 " + kors[0][idx]);
//		}
//		System.out.println("반의 갯수 : " + kors.length);
//		System.out.println("2반의 학생 인원 : " + kors[1].length);
//		for(int idx = 0; idx < kors.length; idx++) {
//			System.out.print(idx + ":" + (idx+1) + "반");
//			System.out.println(kors[idx].length + "명");
//			for(int jdx = 0; jdx < kors[idx].length; jdx++) {
//				kors[idx][jdx] = (int)(Math.random() * 101);
//				System.out.println(jdx + 1 + "\t" + kors[idx][jdx] + ",");
//			}
//			System.out.println();
//		}
		// 2차원 데이터가 for문에서 할당하는 구조 이해여부 확인
		// 1. kors.length와 kors[idx].length의 차이점을 알고 있는지
//				1 -> kors[] 첫번째 배열에 대한 길이
//				2 -> kors[i][] i배열에 대한 하위배열의 크기
		
		// 2. kors[idx][jdx] 왜? 두개를 다른 idx, jdx를 사용해서 데이터를 할당하고 있는지
//				첫번째 배열에 대한 하위배열들을 뽑아내기위해 jdx를 따로 돌림
//				 ~ 두번째배열에 대한 하위배열 ... 마지막배열에 대한 하위배열까지 가능
		
		// 		idx의 의미는 무엇이고, jdx의 의미는 뭔지
//					idx는 상위배열 0~4를 의미하고 jdx는 하위배열 0~29를 의미
		
//			idx : 반정보에 대한 index 0~4
//			jdx : 반정보에 대한 index 0~29
		
		
		// 3. 2차원 데이터를 for문을 2개를 사용해야 하는 이유를 알고 있는지?
//				2개 사용해야 상위배열에 대한 하위배열들을 출력할수 있음
//					ex) [0~4][0~29] 두개 따로 반복해야
//						0일때 0~29, 1일때 0~29, 3일때 0~29 이런식으로 사용가능
//			반/번호라는 계층구조로 2차원 배열을 선언했기 때문에 반을 접근할때 for문과
//			번호접근할때 for문이 필요
		
//		ex) 기차가 ktx 1~5호 있고, 각 호차별로 좌석이 60개 있을 때.
//			예약자명을 할당하는 배열을 선언하고
//			1호차 30번, 2호차 2번, 5호차 3번 좌석에
//			홍길동		 김길동	  신길동 예약처리하고 for문으로 출력
		
		String[][] ktx = new String[5][60];
		ktx[0][29] = "홍길동";
		ktx[1][1] = "김길동";
		ktx[4][2] = "신길동";
		
		for(int i = 0; i < ktx.length; i ++) {
			for(int e = 0; e < ktx[i].length; e ++) {
				System.out.print((i+1) + "호차 " + (e+1) + "좌석 : ");
				System.out.println(ktx[i][e]);
			}
		}
		
		
		
	}

}
