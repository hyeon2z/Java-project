package javaexp.a05_array;

public class A02_UsingArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		# 배열의 활용
//		 1. 배열을 index단위 호출하거나 할당할 수 있다.
//		     int[] iArry = new int[3];
//		     String[] arry = {"사과", "바나나", "딸기"};
//		     iArry[0] = 45;
//		     iArry[1] = 50;
//
//		     System.out.println(arry[0]);
//		     arry[1] = "오렌지";
//
//		 2. 배열은 lengh 배열의 길이를 가져올 수 있다.
//		     iArry.length : 3
//
//		 3. 배열과 반복문
//		     1) for(int idx = 0; idx < 배열명.length; idx++) {
//		             배열명[idx]
//		         }
//			 // idx < 배열명.length : 배열의 index와 배열의 길이가 정수형으로 1차이가 나기 때문에
//			     <(미만)으로 표기하여야 한다.(주의) (0,1,2 길이 3)
//
//		     2) for(단위 객체 : 배열객체) {
//		         // 배열안에 있는 구성요소 하나씩 가져와서 처리 후, 다음 index의 배열을 가져온다.
		String[] fruits = {"사과", "바나나", "딸기"};
		int[] fruPrices = new int[3];
		fruPrices[0] = 2000; // 배열명[index번호]로 저장할 수 있다.
		fruPrices[1] = 4000;
		fruPrices[2] = 12000;
//		fruPrices[3] = 5000; <- 에러발생 배열의 크기보다 더 많은 index호출
		
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruPrices[0]);
		System.out.println(fruPrices[1]);
		System.out.println(fruPrices[2]);
		// 배열에 저장된 데이터 index 호출하여 가져올 수 있다.
		System.out.println("과일들의 배열의 크기 : " + fruits.length);
		System.out.println("과일가격의 배열의 크기 : " + fruPrices.length);
		//heap 영역에서 참조변수(네모만듬)생성 = 주소값
		// 		만든 참조변수 안에 크기결정?
		
		// ex) 3학생의 학점 등급을 문자 'A', 'C', 'D' 등으로 할당하였다.
//				배열에 할당하여 출력하세요
		String[] stuGrade = new String[3]; //<- index 들어갈 공간 할당
		stuGrade[0] = "'A'";
		stuGrade[1] = "'C'";
		stuGrade[2] = "'D'";
		System.out.println("첫번째 학생의 학점 등급 : " + stuGrade[0]);
		System.out.println("두번째 학생의 학점 등급 : " + stuGrade[1]);
		System.out.println("세번째 학생의 학점 등급 : " + stuGrade[2]);
		
		char[] stGrades = {'A', 'C', 'D'};
		System.out.println(stGrades[0]);
		System.out.println(stGrades[1]);
		System.out.println(stGrades[2]);
		
		// ex2) 회원의 몸무게를 소숫점 1자리까지 저장하게 5명을 선언하고
//				index로 접근하여 할당하고 출력하세요.
		double[] weight = new double[5];
		weight[0] = 12.3;
		weight[1] = 22.3;
		weight[2] = 32.3;
		weight[3] = 42.3;
		weight[4] = 52.3;
		System.out.println(weight[0]);
		System.out.println(weight[1]);
		System.out.println(weight[2]);
		System.out.println(weight[3]);
		System.out.println(weight[4]);
		System.out.println("몸무게 배열의 갯수 : " + weight.length);
		// 배열과 mapping된 for문 처리
		// int idx = 0 : 배열의 시작 index
		// int < weight.length : 배열의 한계치 범위 / index는 크기보다 1작다.
		// idx++ : 배열의 증가 처리
		// weights[idx] : 배열의 구성요소 접근 처리
		
		for(int idx = 0; idx < weight.length; idx++) {
			System.out.println(idx + "번째 몸무게");
			System.out.println(weight[idx] + "kg");
		}
		// ex) 회원 3명의 이름과 회원의나이를 배열로 선언/할당 후 반복문 for를 통해서 출력하세요
//				번호 	회원명 회원나이
//				1	@@@	@@
//				2	@@@	@@
//				3	@@@	@@
		
		String[] userName = {"지훈", "지민", "민지"};
		int[] userAge = new int[3];
		userAge[0] = 25;
		userAge[1] = 22;
		userAge[2] = 18;
		System.out.println("번호\t회원명\t회원나이");
		for(int i = 0; i < userAge.length; i++) {
			System.out.println(1+i + "\t" + userName[i] + "\t" + userAge[i]);
		}
		
		String[] mnames = {"a", "b", "c"};
		int[] mages = {21, 25, 30};
		System.out.println("번호\t회원명\t회원나이");
		for(int idx=0;idx<mnames.length;idx++) {
			System.out.print(idx+1+"\t");
			System.out.print(mnames[idx]+"\t");
			System.out.println(mages[idx]+"\t");
		}
		// for(단위:배열)
		System.out.println("# forEach 구문을 통한 배열데이터 #");
		for(String name:mnames) {
			System.out.println(name);
		}
		// ex1) 위 mages를 for each 구문을 통해 출력하고, 전역변수를 활용하여 평균 나이를 출력하세요
		int mageSum = 0;
		for(int mage:mages) {
			System.out.println(mage);
			mageSum += mage;
		}
		System.out.println(mageSum / mages.length);
		
		// ex2) [알고리즘 문제]
//				전역변수 추가하고, 최대나이를 출력하세요
		int ageMax = 0;
		int tot = 0;
		for(int age:mages) {
			tot += age;
			if(age > ageMax) {
				ageMax = age;
			}
			System.out.println("나이 : " + age);
		}
		System.out.println("나이의 평균 : " + (tot / mages.length));
		System.out.println("최고령 : " + ageMax);
		
		// 영어의 알파벳 모음여부 출력하기
		
		char[] greets = {'H', 'e', 'l', 'l', 'o'};
		for(char c:greets) {
			if(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
				System.out.println("[모음]");
			}
			System.out.println(c + ", ");
		}
		// 대소문자 구분여부
		for(char c:greets) {
			if(c>=97 && c<=122) {
				System.out.println("[소문자]");
			} else {
				System.out.println("[대문자]");
			}
			System.out.println(c + ",");
		}
		byte bytes[] = new byte[8];
		for(int idx = 0; idx < bytes.length; idx++) {
			bytes[idx] = (byte)(Math.random() * 90 + 33); // 0~7까지 랜덤 바이트 추가
		}
		// byte[] ==> char[] ==> String
		
		String ranPass = new String(bytes);
		System.out.println("임의의 비번 : " + ranPass);
		// 33~122
		
//		
//		for(int code=1;code<=122;code++) {
//			System.out.println(code+ ":" + (char)code);
//		}
		
		
		
		
		
		
	}

}
