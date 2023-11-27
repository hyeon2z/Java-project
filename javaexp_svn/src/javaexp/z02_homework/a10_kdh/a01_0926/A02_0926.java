package javaexp.z02_homework.a10_kdh.a01_0926;

public class A02_0926 {

	public static void main(String[] args) {
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
//		1)
		int[] intArr1 = new int[5];
		intArr1[0] = 10;
//		2)
		int[] intArr2;
		intArr2 = new int[5];
		intArr2[0] = 11;
//		3)
		int[] intArr3 = new int[] {1,2,3,4,5};
//		4)
		int[] intArr4 = {10,20,30,40,50};
		
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
//		배열.length : 배열의 크기
//		인덱스(index) : 각 배열의 요소의 접근하기 위한 번호
//		선언방법 : new 데이터유형[크기];
		
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
		int[] result = new int[5];
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = (int)(Math.random()*6+1);
		}
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println("결과" + (i+1) + ") " + result[i]);
		}
		
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
//		
//		배열의 길이(배열.length)는 반복문의 한계치/반복조건이고, 
//		배열의 index는 반복문에서 사용할 변수이다.
//		이 같은 요소를 통해 반복문을 이용하면 보다 효과적으로 배열을 사용할 수 있다.
//		for(int idx=0;idx<배열.length;idx++){
//			배열[idx];
//		}
//		int idx = 0 :배열은 index가 0부터 처리한다.
//		idx < 배열.length : 배열의 index는 배열의 크기보다 1작다. 
//		 					주의) idx <= 배열.length 에러발생.
//		idx++ : 배열의 index는 증가한다.
//		배열[idx] : 배열은 index로 가져온다.
		
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
		int[] scores = new int[30];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random()*101);
		}
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
		
//		배열은 순차적인 같은 데이터 타입을 모아놓은 것이므로 index도 0부터 순차적으로 증가하기때문에 for문과 같이 쓰면
//		index를 for문의 요소로 접근하면 편리하게 배열을 활용할 수 있다.
		
//		for문 구조
//      for(int idx=0;idx<배열.length;idx++){
//    		배열[idx]
// 		}
//   	장점 : 반복 횟수가 정해져있는 경우, for문을 사용하면 가독성이 좋다
//                     초기화, 조건식, 증감식을 이용하여 반복문의 흐름을 직관적으로 파악할 수 있다.
//   	단점 : 인덱스를 이용해서 요소에 접근하기 때문에 코드가 복잡해 질 수 있다.
//         인덱스를 사용하기 때문에 인덱스 오류가 발생할 가능성이 있다.
 
//   	foreach문 구조
//   	for(단위데이터 변수:배열)
//   	장점 : 인덱스를 사용하지 않기 때문에 코드가 간결해짐
//         	인덱스를 사용하지 않기 때문에 인덱스 오류가 발생할 가능성이 적음
//			인덱스를 사용하지 않고 순차적으로 데이터에 접근하기 때문에 일반 for문보다 속도가 빠르다.
//   	단점 : 반복 횟수가 정해져 있지 않은 경우 사용 할 수 없슴
//         	인덱스를 사용하지 않기 때문에 요소의 인덱스를 알아내기 어려움
//			인덱스를 사용하지 않기 때문에 배열의 요소를 변경할 수 없음
	}
}
