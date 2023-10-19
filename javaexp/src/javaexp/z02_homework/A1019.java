package javaexp.z02_homework;

import java.io.FileWriter;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//[1단계:확인] 
//	1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
//		int num = 0;
//		ArrayList<String> menu = new ArrayList<String>();
//		menu.add("햄버거"); menu.add("감자튀김"); menu.add("콜라");
//		InputStream menuNum = System.in;
//		for(String menInfo : menu) {
//			num++;
//			System.out.println(num + ") " + menInfo);
//		}
//		System.out.print("\n메뉴를 입력해주세요 : ");
//		try {
//			int usrNum = menuNum.read();
//			
//			if(usrNum == 49) {
//				System.out.println("주문하신 메뉴 햄버거");
//			}else if(usrNum == 50) {
//				System.out.println("주문하신 메뉴 감자튀김");
//			}else if(usrNum == 51) {
//				System.out.println("주문하신 메뉴 콜라");
//			}
//			
//			
//			menuNum.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//[1단계:개념] 
//	2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
//		디렉토리는 String으로 파일경로를 지정하고
//		File 참조변수 = new File(경로 + 파일이름);
//		참조변수.mkdir(); 으로 생성이 가능하다
//		
//		파일은 동일하게 파일경로를 지정 후
//		String filename = 경로 + 생성할 파일 명; 까지는 동일하나
//		파일을 생성할 때
//		filename.createNewFile(); 을 입력하면 try catch 문을 사용해야한다.
	
//[1단계:개념] 
//	3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
//		String path = 파일경로;
//		Stirng name = 파일명;
//		사용메서드)
//			1. write("문자열") : 파일에 쓸 내용
//			2. append("문자열"): 파일에 내용 추가
//			2. flush() : buffer 메모리 해제
//			3. close() : FileWriter 객체 메모리 해제
		
//		FileWriter filewrite = new FileWriter(경로 + 파밀명); <- try catch 문 사용
	
//[1단계:확인] 
//	4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
	
	
//[1단계:확인] 
//	5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
	
	
//[1단계:개념] 
//	6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
	
	
//[1단계:확인] 
//	7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.

		 
	}

}

//# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//3. 수업 시간 집중하였는가? 