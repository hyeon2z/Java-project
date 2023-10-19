package javaexp.a01_start;

public class A03_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl + alt + 화살표아래 : 해당 커서의 라인 줄복사
		System.out.println("안녕1");
		System.out.println("안녕2");
		System.out.println("안녕3");
		// println() : 라인단위로 명령을 출력
		System.out.print("사과 ");
		System.out.print("바나나 ");
		System.out.print("딸기 ");
		// print() : 줄바꿈 없이 명령을 출력
		// ex1) 친구3명의 이름을 줄 바꾸기로 출력하고,
		System.out.println();
		System.out.println("# 친구 3명#");
		System.out.println("준우");
		System.out.println("민수");
		System.out.println("진우");
		
		// ex2) 좋아하는 음식 3가지를 ,(단위로) 줄바꾸지 않고 출력해보세요.
		System.out.print("좋아하는 음식 3가지 : ");
		System.out.print("1) 치킨, ");
		System.out.print("2) 카레, ");
		System.out.print("3) 김밥, ");
		/*
		# 줄바꿈과 탭간격 특수문자 처리 (특수문자를 통한 줄 바꿈 처리)
		1. 문자열 출력 명령문 안에서 바로 줄바꿈 처리를 하려면
			\n 을 포함하여야 한다.
		2. 문자열 출력 명령문에서 탭간격으로 데이터를 출력 처리하려면
			\t 를 포함하여 처리한다.
		 */
		System.out.println("\n사과\n바나나\n딸기\n수박");
		System.out.println("no\t물건명\t가격");
		System.out.println("1\t수박\t1000");
		System.out.println("2\t바나나\t500");
		System.out.println("3\t사과\t200");
		
		// ex3) println 으로 학생 3명의 국어점수를 줄바꾸어 출력하세요.
		System.out.println("# 학생 3명의 국어점수#");
		System.out.println("준우 100점\n진우 90점\n민수 80점");
		
		// ex4) 학생의 번호, 이름, 엉어점수를 탭 간격으로 출력하세요
		System.out.println("번호\t이름\t영어점수");
		System.out.println("7번\t준우\t90점");
		System.out.println("3번\t진우\t95점");
		System.out.println("1번\t민수\t100점");
		/*
		# printf("출력 format만들기", 매핑할 변수)
		형식을 선언 후, 해당 형식안에 들어갈 데이터를 처리하는 형식
		 */
		String name = "길동";
		int age = 25;
		double salary = 5000.501;
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %d%n", age);
		System.out.printf("연봉 : %.2f%n", salary);
		// %s : 문자열 데이터 처리
		// %d : 정수형 데이터 처리
		// %f : 실수형 데이터 처리
		// %자리수s : 자리수와 문자열데이터 유형 처리
		// %자리수d : 자리수와 정수형데이터 유형 처리
		// %소숫점이상.소숫점이하f : 자리수와 실수형데이터 유형 처리
		
		
		
		
		
	}

}
