package javaexp.z02_homework.a16_jsr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
//		Map<Character, String> menu= new HashMap<Character, String>();
//		menu.put('1', "짜장면");
//		menu.put('2', "짬뽕");
//		menu.put('3', "탕수육");
//		menu.put('4', "팔보채");
//		System.out.println("#메뉴 출력#");
//		for(char serNum:menu.keySet()) {
//			System.out.print(serNum+" ");
//			System.out.println(menu.get(serNum));
//		}
//		try {
//			System.out.print("주문 번호를 입력해주세요>>");
//			InputStream is = System.in;
//			int num=is.read();
//			System.out.println("주문하신 음식>>"+menu.get((char)num));
//			is.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
//		String path = ""; 경로를 설정하고
//		String f01Name =""; 디렉토리 이름을 설정하고
//		String f02Name =""; 파일 이름을 설정하고
//		File f01 = new File(path+f01Name); 파일객체 생성자에 경로+디렉토리 이름을 넣고
//		File f02 = new File(path+f02Name); 파일객체 생성자에 경로+파일 이름을 넣고
//		f01.mkdir(); 디렉토리를 생성합니다.
//		f02.createNewFile(); 파일은 생성합니다.
		
//[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
//		1)파일 객체의 생성자
//		File f01 = new File(경로+이름):지정된 경로를 사용하여 File 객체를 생성합니다
//		File f01 = new File(String parent, String child):지정된 부모 디렉토리와 자식 파일 이름을 사용하여 File 객체를 생성합니다.
//		File f01 = new File(File parent, String child):지정된 부모 File 객체와 자식 파일 이름을 사용하여 File 객체를 생성합니다.
//		2)기능 메서드
//		exists(): 파일이나 디렉토리가 존재하는지 확인합니다.
//		isDirectory(): 파일이 디렉토리인지 확인합니다.
//		isFile(): 파일이 파일인지 확인합니다.
//		getName(): 파일이나 디렉토리의 이름을 반환합니다.
//		getPath(): 파일이나 디렉토리의 경로를 반환합니다.
//		length(): 파일의 크기를 반환합니다.
//		createNewFile(): 파일을 생성합니다.
//		mkdir(): 디렉토리를 생성합니다.
		
//[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
//		String path="C:\\b02_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework\\";
//		String name="1학년1반.txt";
//		String[] arr= {"홍길동 100","김길동 85","고길동 77"};
//		try {
//			FileWriter fout = new FileWriter(path+name);
//			for (int i = 0; i < arr.length; i++) {
//				fout.append(arr[i]+"\n");
//			}
//			fout.flush();
//			fout.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
//		String path="C:\\b02_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework\\";
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.print("YYYYMMDD>>");
//			String title=sc.nextLine();
//			FileWriter diary=new FileWriter(path+title+".txt");
//			while (true) {
//				System.out.println("----------"+title+" 일기장 내용을 입력하세요----------종료:Q");
//				String input=sc.nextLine();
//				if(input.equals("Q")) {
//					break;
//				}
//				diary.write(input);
//			}
//			System.out.println("일기장 종료");
//			diary.flush();
//			diary.close();	
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
//		1)FileWriter 클래스는 파일에 문자 데이터를 쓰는 데 사용된다.
//			생성자: 지정된 파일에 연결된 FileWriter 객체를 생성한다.
//			write("문자열"): 파일에 쓸 내용
//		    append("문자열"): 기존 파일 내용에서 추가할 내용
//			flush(): buffer메모리 해제
//			close(): FileWriter 객체 메모리 해제
//		2)FileReader 클래스는 파일에서 문자 데이터를 읽는 데 사용된다.
//			생성자: 지정된 파일에 연결된 FileReader 객체를 생성한다.
//			read(): 글자한자씩 code값을 int로 가져온다.
//			skip(long n): 파일에서 지정된 수의 바이트(문자)를 건너뛴다.
//			close(): FileReader 객체 메모리 해제
//[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
//		String path="C:\\b02_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework\\";
//		String list="product.txt";
//		try {
//			FileReader input=new FileReader(path+list);
//			StringBuffer str=new StringBuffer();
//			while (true) {
//				int data=input.read();
//				if (data==-1) {
//					break;
//				}
//				str.append((char)data);
//			}
//			input.close();
//			String[] arr = str.toString().split("\n");
//			for (String string : arr) {
//				String[] arr2 = string.split("&");
//				System.out.print(arr2[0]+"\t");
//				System.out.print(arr2[1]+"\t");
//				System.out.print(arr2[2]+"\n");
//			}
//			System.out.println("읽어오기 종료");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}

