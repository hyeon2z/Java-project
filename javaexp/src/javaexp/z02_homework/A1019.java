package javaexp.z02_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
	String path01 = "C:\\a01_java\\workspace\\javaexp\\src\\javaexp\\z02_homework\\";
	String f01Name = path01 + "1학년1반.txt";
	String f01Name1 = "1학년1반.txt";
	File f01 = new File(f01Name);
	
	if(!f01.exists()) {
		try {
			f01.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	String[] stName = {"길동", "민수", "철수"};
	String[] stScore = {"50점", "80점", "100점"};
	try {
		FileWriter fw01 = new FileWriter(path01 + f01Name1);
		for(int cnt = 0; cnt < stName.length; cnt ++) {
			fw01.append(stName[cnt] + "\t");
			fw01.append(stScore[cnt] + "\n");
		}
		
		fw01.flush();
		fw01.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//[1단계:확인] 
//	5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
	Scanner sc = new Scanner(System.in);
	System.out.print("오늘 날짜를 입력하세요(YYYYMMDD)");
	String date = sc.nextLine();
	
	File f02 = new File(path01 + date);
	if(!f02.exists()) {
		try {
			f02.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {
		FileWriter diary = new FileWriter(path01 + date);
		System.out.println("일기 내용을 입력하세요(Q입력 시 종료)");
		while(true) {
			String diaryWrite = sc.nextLine();
			if(diaryWrite.equals("Q")) {
				System.out.println("입력종료");
				break;
			}
			diary.append(diaryWrite + "\n");
		}
		diary.flush();
		diary.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//[1단계:개념] 
//	6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
//	둘다 FileReader, FileWriter 생성자를 선언한는건 똑같지만
//	Writer는 write와 append를 사용해서 파일에 내용을 추가하는 명령어고
//	Reader는 파일의 글자들을 코드로 하나하나 읽어온다.
//	알아볼수 있게 처리하려면 char로 형변환 해야함.
	
//[1단계:확인] 
//	7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
	String f03Name = "product.txt";
	File f03 = new File(path01 + f03Name);
	if(!f03.exists()) {
		try {
			f03.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	try {
		FileWriter pro01 = new FileWriter(path01 + f03Name);
		pro01.append("사과&3000&2\n");
		pro01.append("딸기&2000&5\n");
		pro01.append("바나나&2500&1");
		
		pro01.flush();
		pro01.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileReader pro01Read = new FileReader(path01 + f03Name);
		StringBuffer sbf = new StringBuffer();
		
		while(true) {
			int data = pro01Read.read();
			if(data == -1) {
				break;
			}
			sbf.append((char)data);
		}
		pro01Read.close();
		
		String[] arr = sbf.toString().split("\n");
		for(String str : arr) {
			String[] arr2 = str.split("&");
			for(int i = 0; i < arr.length; i ++) {
				System.out.print(arr2[i] + "\t");
			}
			System.out.println();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

//# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//3. 수업 시간 집중하였는가? 