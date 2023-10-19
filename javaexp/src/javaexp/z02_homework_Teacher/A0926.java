package javaexp.z02_homework_Teacher;

public class A0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//		[개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
//		[개념] 2. 배열의 기본 속성들을 기술하세요.
//		[확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
//		[개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
//		[확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
//		[토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
//		1. **배열의 선언과 할당 기본형식의 종류**:
//			Java에서 배열은 동일한 타입의 여러 변수를 저장하는 연속된 메모리 공간입니다.
//
//			```java
//			// 배열 선언
//			int[] arr1;
//			double[] arr2;
//			String[] arr3;
//
//			// 배열 할당
//			arr1 = new int[5];
//			arr2 = new double[10];
//			arr3 = new String[3];
//
//			// 배열 선언과 할당을 동시에
//			int[] arr4 = new int[5];
//			String[] arr5 = {"Java", "Python", "JavaScript"};
//			```
//
//			2. **배열의 기본 속성들**:
//			- **length**: 배열의 길이를 반환합니다. (`arr1.length`로 사용)
//			  
//			3. **Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력**:
//			```java
//			int[] diceResults = new int[5];
//			for (int i = 0; i < diceResults.length; i++) {
//			    diceResults[i] = (int)(Math.random() * 6) + 1;  // 주사위 던지기 (1 ~ 6 사이의 값)
//			    System.out.println(diceResults[i]);
//			}
//			```
//
//			4. **배열과 반복문의 관계**:
//			배열은 연속된 데이터를 저장하므로 반복문과 함께 사용하면 배열의 각 요소에 쉽게 접근하거나 수정할 수 있습니다.
//			```java
//			int[] scores = {90, 85, 80, 75, 70};
//			for (int i = 0; i < scores.length; i++) {
//			    System.out.println(scores[i]);
//			}
//			```
//
//			5. **학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당**:
//			```java
//			int[] studentScores = new int[30];
//			for (int i = 0; i < studentScores.length; i++) {
//			    studentScores[i] = (int)(Math.random() * 101);  // 0 ~ 100 사이의 임의의 점수 할당
//			    System.out.println(studentScores[i]);
//			}
//			```
//
//			6. **for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점**:
//			- **기본 for문**:
//			  ```java
//			  for (int i = 0; i < arr.length; i++) {
//			      System.out.println(arr[i]);
//			  }
//			  ```
//			  - 장점: 배열의 인덱스에 직접 접근할 수 있어 특정 요소를 수정하거나 특정 조건에 따라 반복을 제어할 수 있다.
//			  - 단점: 코드가 다소 길다.
//
//			- **foreach문 (enhanced for loop)**:
//			  ```java
//			  for (int value : arr) {
//			      System.out.println(value);
//			  }
//			  ```
//			  - 장점: 코드가 간결하고 읽기 쉽다. 인덱스를 사용하지 않아도 됨.
//			  - 단점: 인덱스를 직접 사용할 수 없기 때문에 특정 요소를 수정하거나 제어하는 것이 어렵다.
//
//			  - 활용 시점:
//			    - **기본 for문**: 배열의 인덱스를 활용하거나 특정 조건에 따라 반복을 제어해야 할 때.
//			    - **foreach문**: 배열의 모든 요소를 순차적으로 처리하고 인덱스를 사용할 필요가 없을 때.
		
		
	}

}
