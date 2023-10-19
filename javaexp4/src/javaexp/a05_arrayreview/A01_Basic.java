package javaexp.a05_arrayreview;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 배열 객체
 1. 같은 유형의 데이터 여러개를 하나의 메모리에 할당하여 처리
     ex) 기차의 호차
 
 2. 메모리입장
     1) stack : heap영역의 주소값 할당
        배열형태   배열명

     2) heap : 실제 배열객체 저장
		 */
		// 배열의 선언(heap영역 할당하지 않고 선언)
		int [] intArry; // 정수형 배열 선언
		double [] dblArry; // 실수형 배열 선언
		String [] strArry; // 문자열 배열 선언
		/*
		배열의 할당(heap영역에 메모리할당)
     1) 크기지정 : 각 구성요소(index)에 초기값을 할당
        */
         intArry = new int[5]; // <- 5개 int(정수)형 배열 초기값으로 할당
         
         System.out.println(intArry[0]);
         System.out.println(intArry[1]);
         System.out.println(intArry[2]);
         System.out.println(intArry[3]);
         System.out.println(intArry[4]);
         // System.out.println(intArry[5]);
         // 5개짜리 정수는 index로는 4까지만 선언하고 호출 가능
         // ex) 정수형 pts 3개짜리 배열 선언하고 초기값을 확인하세요
         
         int [] pts = new int[3];
         System.out.println(pts[0]);
         System.out.println(pts[1]);
         System.out.println(pts[2]);
         // 각 배열 구성요소에서 할당 처리
         pts[0] = 70;
         pts[1] = 60;
         pts[2] = 90;
         
         strArry = new String[3];
         
         System.out.println(strArry[0]);
         strArry[0] = "오렌지";
         strArry[1] = "사과";
         strArry[2] = "바나나";
         /*
         1. 어떤 데이터를 배열처리할 것인지?
         	 기본데이터유형 ==> 배열 ==> 객체
         	 String ==> 배열 ==> 객체
         	 Person ==> 배열 ==> 객체
         	 
         2. 초기 크기를 통해서 선언하는 방법?
         	 new 데이터유형[크기];
         	 참조변수.length
         	 
         3. 초기값에 할당된 내용 0,null
         4. index는 무엇인지? index를 통해서 할당 및 호출?
          	 배열명[0] : 저장/호출
          */
         System.out.println("배열의 크기 : " + strArry.length);
         // 자바에서 배열의 선언과 바로 데이터 할당(java 차이가 있다)
         int pts2[] = {70,80,90}; // 대부분의 프로그램은 [70,80,90] 이런식으로 할당함.
         int pts3[];
         pts3 = new int[] {80,90,70};
         // 선언 후 할당시는 new 데이터유형[] 으로 하여야 한다.
//         pts3 = {80,90,70}; -> 에러발생 
         System.out.println(pts3[0]);
         System.out.println(pts3[1]);
         System.out.println(pts3[2]);
         
         // ex1) double형으로 선언과 초기화를 바로 처리하는 배열 3개
         double [] dbArry = {1.4,2.5,3.14};         
         // ex2) boolean형으로 선언후 초기값 설정 처리하는 배열 5개
         boolean [] boolArry;
         boolArry = new boolean[] {1>2,3<1,2>5,1==2,1==1};
         System.out.println(dbArry[0]);
         System.out.println(dbArry[1]);
         System.out.println(dbArry[2]);
         System.out.println(boolArry[0]);
         System.out.println(boolArry[1]);
         System.out.println(boolArry[2]);
         System.out.println(boolArry[3]);
         System.out.println(boolArry[4]);
         
	}

}
