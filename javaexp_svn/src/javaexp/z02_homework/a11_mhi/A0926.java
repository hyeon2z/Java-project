package javaexp.z02_homework.a11_mhi;

public class A0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      # 아래 내용을 java 문제로  개념 정리하고 내용 확인해주세요
//
//      [개념] 1. 배열의 선언과 할당 기본형식의 종류를 예제를 통해 기술하세요
      // 배열의 선언
      int[] pts; // 정수형 배열 선언
      double[] ptd; // 실수형 배열 선언
      String[] strs; // 정수형 배열 선언

      // 배열의 크기 할당 및 초기화
      pts = new int[3]; // [배열 크기 3 지정 ,정수형 배열 초기값으로 0이 할당]
      ptd = new double[2]; // [ 배열크기 2, 실수형 배열 초기값으로 0.0이 할당]
      strs = new String[3]; // [배열크기 3, 정수형 배열 초기값으로 null 할당]

      // 배열의 선언과 데이터 할당 바로 하는법
      int pts2[] = { 10, 20, 30 };
      
      pts2[0] = 100; // 각배열의 구성요소에서 할당 처리 하는법 ( 값 변경)

//      [개념] 2. 배열의 기본 속성들을 기술하세요. (인덱스, 선언방법)
//      # 배열의 길이
//      - 배열의 길이(저장된 요소의 개수)를 구할때는 배열명.length 명령어를 이용한다.
//      # 인덱스
//      - 배열의 각 요소는 0부터 시작하는 인덱스를 가지고 있다.
//      - 인덱스를 사용하여 배열의 특정 요소에 접근할 수 있다.
//      # 요소
//      - 요소는 인덱스를 통해 접근하고 수정 할 수 있다.
//      - 선언할 때 타입을 명시하여 해당 타입의 요소만 저장할 수 있다.
//      #크기
//      - 배열은 크기가 고정되어 있으며, 선언된 후에는 크기를 변경 할 수 없다.
//      - 배열의 크기를 변경하려면 새로운 배열을 생성하고 기존의 요소를 복사해야 한다.
      
   
      
//      [확인] 3. Math.random()으로 주사위 5회 던진 결과를 배열에 할당 처리하고 출력하세요.
      
      int[] dices = new int[5];
      
      for(int idx=0;idx<dices.length;idx++) {
         dices[idx] = (int)(Math.random() * 6+1);
         System.out.println(dices[idx]);
      }   
      
//      [개념] 4. 배열과 반복문의 관계를 각 속성과 예제를 통해서 설명하세요
       String family[] = {"해인","광현","연화"};
       for(int idx=0;idx<family.length;idx++) {
          System.out.println(family[idx]);
       }
       // idx=0 : 배열은 0부터 시작한다.
       // idx<배열.length : 배열의 index는 배열의 크기보다 1작다.
       // -> 예제의 배열 length는 3이고, index는 2이다.
       // 배열[idx] : 배열은 index로 가져온다.
       // 결론) -> 배열 [0]부터 시작해서, 배열의 길이(3)보다 1 적은 [2]까지의 배열이 출력이 되는 것 
      
      
//      [확인] 5. 학생 30명의 점수를 배열로 초기로 일단, 선언하고, for문을 통해서 임의의 점수(0~100)까지 할당해 보세요.
       int[] studuntArry;
       studuntArry= new int[30];
       for(int idx=0;idx<studuntArry.length;idx++) {
          studuntArry[idx] = (int)(Math.random() * 101);
          System.out.println(idx+1+")"+studuntArry[idx]);
       }
       
       
       
//      [토론] 6. for문과 배열과의 관계에서 기본형식과 foreach문의 장단점과 사용하는 각각 적절한 활용 시점 토의해 보자.
//      배열은 순차적인 같은 데이터 타입을 모아놓은 것이므로 index도 0부터 순차적으로 증가하기때문에
      // for문과 같이 쓰면 index를 for문의 요소로 접근하면 편리하게 배열을 활용할 수 있다.

//      for문 구조
//         for(int idx=0;idx<배열.length;idx++){
//       배열[idx]
//    }
//      장점 : 반복 횟수가 정해져있는 경우, for문을 사용하면 가독성이 좋다
//            초기화, 조건식, 증감식을 이용하여 반복문의 흐름을 직관적으로 파악할 수 있다.
//      단점 : 인덱스를 이용해서 요소에 접근하기 때문에 코드가 복잡해 질 수 있다.
//            인덱스를 사용하기 때문에 인덱스 오류가 발생할 가능성이 있다.

//      foreach문 구조
//      for(단위데이터 변수:배열)
//      장점 : 인덱스를 사용하지 않기 때문에 코드가 간결해짐
//            인덱스를 사용하지 않기 때문에 인덱스 오류가 발생할 가능성이 적음
//           인덱스를 사용하지 않고 순차적으로 데이터에 접근하기 때문에 일반 for문보다 (데이터 처리)속도가 빠르다.
//      단점 : 반복 횟수가 정해져 있지 않은 경우 사용 할 수 없슴
//            인덱스를 사용하지 않기 때문에 요소의 인덱스를 알아내기 어려움
         //인덱스를 사용하지 않기 때문에 배열의 요소를 변경할 수 없음


	}

}
