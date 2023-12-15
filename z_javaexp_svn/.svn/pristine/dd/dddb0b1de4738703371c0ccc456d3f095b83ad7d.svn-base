package javaexp.z02_homework.a20_kjw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
*/
		/*
		String path ="C:\\b01_javaexp\\javaexp_svn\\src\\javaexp\\z02_homework\\a20_kjw\\A1019.java\\";
		// 1. 폴더와 파일을 지정.
		String f01Name =path+"hw.txt";
		try {
			FileReader fin = new FileReader(path+f01Name);
			StringBuffer sbf = new StringBuffer();
			while(true) {
				int code = fin.read();
				if(code==-1) { //더이상 데이터값 없을때까지
					break;
				}//파일에 있는 내용을 화면에 출력..
				System.out.print((char)code);
			}
			fin.close(); //자원해제..
			System.out.println("# stringbuffer #");
			System.out.println(sbf);
			System.out.println("#파일 읽기 종료#");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
		/*[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
*/		
		String path="C:\\b01_javaexp\\javaexp_svn\\src\\javaexp\\z02_homework\\a20_kjw\\hw2\\";
		String fd = path+"date.txt";
		//  경로/파일 만들기 후, 아래 내용 코드 처리..
		try {
			System.out.println("오늘 날짜를 입력하세요!!");
		
			FileWriter fins = new FileWriter(path+fd);
			fins.write("파일에 입력할 내용\n");
			fins.append("파일에 추가할 내용\n");
			Scanner scan = new Scanner(System.in);
			System.out.println("파일에 입력할 내용을 적으세요!!");
			String addStr = scan.nextLine();
			fins.append(addStr);

			System.out.println("계속 입력하시겠습니까(Y/Q)?:");
				String isCon = scan.nextLine();
				if(!isCon.equals("Y")) {
					System.out.println("입력종료");
					}
			fins.flush();
			fins.close();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		/*
[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.


# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가? 
		 */
	

}

