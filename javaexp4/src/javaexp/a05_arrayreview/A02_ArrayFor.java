package javaexp.a05_arrayreview;

import java.util.Scanner;

public class A02_ArrayFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 배열과 반복문 처리
 1. 배열을 반복문을 통해 보다 효과적으로 사용할 수 있다.
     1) 배열의 길이 : 반복문의 한계치/반복조건
     2) 배열의 index : 반복문에서 사용할 변수
 
 2. 기본 형식1
     for(int idx = 0; idx < 배열.length; idx++) {
         배열[idx]
     }
     int idx = 0 : 배열은 index가 0부터 시작한다.
     idx < 배열.length : 배열의 index는 배열의 크기보다 1 작다.
         주의) idx <= 배열.length 에러발생
     idx++ : 배열의 index는 증가한다.
     배열[idx] : 배열은 index로 가져온다.

 3. 기본 형식2
     forEach구문
     배열안에 있는 구성요소를 첫번째부터 1씩 가져와서 단위데이터에 할당 후,
     다시 반복문을 돌면서 하나씩 가져와서 배열의 마지막 데이터까지 할당한 후 반복문이 중단되는 형태를 말한다.
     
     for(단위데이터 변수:배열){

     }
		 
		 */
		
//		String[] fruits = new String[3];
//		// Scanner를 통해서 과일 3개 정보를 입력하고, 출력하는 처리
//		Scanner sc = new Scanner(System.in);
//		for(int idx = 0; idx < fruits.length; idx++) {
//			System.out.print(idx + 1 + "번째 과일정보를 입력 : ");
//			fruits[idx] = sc.nextLine();
//		}
//		System.out.println("# 배열에 등록된 과일 #");
//		for(int idx = 0; idx < fruits.length; idx++) {
//			System.out.println(idx + 1 + ") " + fruits[idx]);
//		}
		String games[] = {"가위","바위","보"};
		System.out.println("# foreach구문을 통한 처리 #");
		for(String game : games) {
			System.out.println(game);
		}
		// ex) 학생 5명의 점수를 선언하고, 출력하되 총점과 평균을 foreach 구문으로 처리
		int[] score = {80,70,75,90,100};
		int tot = 0;
		System.out.println("학생 5명의 점수");
		for(int score1 : score) {
			tot += score1;
			System.out.print(score1 + " ");
			
		}
		System.out.println("\n총점 : " + tot);
		System.out.println("평균 : " + tot/(score.length));
		
	}

}
