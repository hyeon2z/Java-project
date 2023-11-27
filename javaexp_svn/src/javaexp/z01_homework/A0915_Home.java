package javaexp.z01_homework;

import java.util.Scanner;

public class A0915_Home {
	public static void main(String[]args) {
//		### 문제 1
//		**두 수 비교하기**(3항연산자활용) 
//		   두 숫자를 입력받아 크거나 같은 수를 출력하십시오.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = scanner.nextInt();
//
//        int result = num1 >= num2 ? num1 : num2;
//        System.out.println("큰 수: " + result);		
		
		
//		### 문제 2
//		**최대값 찾기**  
//		   임의의 세 수를 변수에 할당하여 최대값을 출력하십시오.
        int a = 5, b = 8, c = 3;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("최대값: " + max);		
		
//		### 문제 3
//		**등급 판별하기**  
//		   점수를 입력받아 등급을 출력하십시오.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("점수를 입력하세요: ");
//        int score = scanner.nextInt();
//
//        if(score >= 90) System.out.println("A등급");
//        else if(score >= 80) System.out.println("B등급");
//        else if(score >= 70) System.out.println("C등급");
//        else if(score >= 60) System.out.println("D등급");
//        else System.out.println("F등급");
        
//		### 문제 4
//		도시의 온도가 20도를 넘으면 아이스크림을 먹으러 갑니다. 그렇지 않으면 핫초코를 마십니다. 온도가 20도일 때는 뭐를 해야할지 선택하세요.
//		온도를 `int temperature`로 가정하고, 뭐를 할지를 삼항 연산자를 이용하여 결정하세요.
        int temperature = 20;
        String decision = temperature > 20 ? "아이스크림 먹기" : "핫초코 마시기";
        System.out.println(decision);        
//		### 문제 5
//		어떤 학생의 수학 점수는 85점, 과학 점수는 90점입니다. 이 학생의 수학 점수가 80점 이상이고 과학 점수가 85점 이상이면 '합격'이라는 메시지를 출력하고, 그렇지 않으면 '불합격'이라는 메시지를 출력하세요.
//		점수는 `int mathScore = 85, scienceScore = 90;`로 가정합니다.
        int mathScore = 85, scienceScore = 90;
        if(mathScore >= 80 && scienceScore >= 85) System.out.println("합격");
        else System.out.println("불합격");
        
//		### 문제 6
//		두 숫자 `a`와 `b`가 있습니다. 두 숫자의 평균이 50 이상이면 "평균 이상", 그렇지 않으면 "평균 미만"이라는 메시지를 출력하세요.
//		숫자는 `int a = 40, b = 60;`으로 가정합니다.
//        int a = 40, b = 60;
//        double average = (a + b) / 2.0;
//        if(average >= 50) System.out.println("평균 이상");
//        else System.out.println("평균 미만");       
        
//		### 문제 7(3항연산자활용) 
//		변수 `hoursWorked`가 임의로 주어지고, 40시간을 초과하면 "과로하세요", 그렇지 않으면 "정상 근무 시간입니다"라는 메시지를 출력하세요.
        int hoursWorked = 42;  // 예시 값
        String message = hoursWorked > 40 ? "과로하세요" : "정상 근무 시간입니다";
        System.out.println(message);       
//		### 문제 8
//		변수 `day`에 요일을 입력하고 "일요일"나 "토요일"이면 "주말입니다", 그렇지 않으면 "평일입니다"라는 메시지를 출력하세요.
        String day = "토요일";  // 예시 값
        if(day.equals("일요일") || day.equals("토요일")) System.out.println("주말입니다");
        else System.out.println("평일입니다");
        
//		### 문제 9
//		변수 `height`의 값이 150cm 미만이면 "놀이기구를 이용할 수 없습니다", 그렇지 않으면 "놀이기구를 이용하세요"라는 메시지를 출력하세요.
        int height = 155;  // 예시 값
        if(height < 150) System.out.println("놀이기구를 이용할 수 없습니다");
        else System.out.println("놀이기구를 이용하세요");
        
//		### 문제 10: 기본 요금 계산기
//		요일별로 다른 교통비 요금을 계산하는 프로그램을 작성하세요. 월요일부터 금요일까지는 1200원, 주말(토요일, 일요일)은 800원입니다.
//		```java
//		String dayOfWeek = "토요일";  // 사용자로부터 입력 받은 요일
//		int fare;
        String dayOfWeek = "토요일";
        int fare = (dayOfWeek.equals("토요일") || dayOfWeek.equals("일요일")) ? 800 : 1200;
        System.out.println("요금: " + fare + "원");
        
        
//		```
//		### 문제 11: 영화 추천 프로그램
//		사용자의 연령에 따라 영화 장르를 추천해주는 프로그램을 작성하세요. 13세 미만은 "애니메이션", 13세 이상 19세 이하는 "로맨틱 코미디", 20세 이상은 "액션" 장르를 추천합니다.
//		```java
//		int age = 25;  // 사용자로부터 입력 받은 나이
//		String movieRecommendation;
        int age = 25;
        String movieRecommendation = (age < 13) ? "애니메이션" : (age >= 13 && age <= 19) ? "로맨틱 코미디" : "액션";
        System.out.println("추천 영화 장르: " + movieRecommendation);        
//		```
//		### 문제 12: 계절 확인 프로그램
//		달을 입력 받아 해당 계절을 출력하는 프로그램을 작성하세요. 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울입니다.
//		```java
//		int month = 10;  // 사용자로부터 입력 받은 월
		String season;
        int month = 10;
        if(month >= 3 && month <= 5) season = "봄";
        else if(month >= 6 && month <= 8) season = "여름";
        else if(month >= 9 && month <= 11) season = "가을";
        else season = "겨울";
        System.out.println("계절: " + season);	

		
		
		
	}
}
