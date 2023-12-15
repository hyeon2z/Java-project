package javaexp.z02_homework.a11_mhi;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;





public class A1019 {

	public static void main(String[] args) {
	     // TODO Auto-generated method stub
	      /*
	       * [1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력
	       * 받아, 출력하세요. [1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요. [1단계:개념]
	       * 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. [1단계:확인] 4.반의 정보를
	       * 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요. [1단계:확인] 5. 오늘날짜를
	       * YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
	       * [1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요. [1단계:확인] 7.
	       * product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게
	       * 하세요.
	       * 
	       */

	//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
//	      List<String> menuList = new ArrayList<String>();
//	      menuList.add("피자");
//	      menuList.add("햄버거");
//	      menuList.add("치킨");
	//
//	      for (int idx = 0; idx < menuList.size(); idx++) {
//	         System.out.print(idx + 1 + "\t");
//	         System.out.println(menuList.get(idx));
//	      }
	//
//	      System.out.println("주문메뉴를 입력하세요");
//	      InputStream is = System.in;
//	      try {
//	         int menu = is.read();
//	         OutputStream os = System.out;
//	         System.out.print("주문메뉴:");
//	         os.write(menu);
//	         os.flush();
//	         if (menu == '1') {
//	            System.out.println("피자");
//	         } else if (menu == '2') {
//	            System.out.println("햄버거");
//	         } else if (menu == '3') {
//	            System.out.println("치킨");
//	         } else {
//	            System.out.println("메뉴정보에 없습니다.");
//	            os.close();
//	            is.close();
//	         }
//	      } catch (IOException e) {
//	         // TODO Auto-generated catch block
//	         e.printStackTrace();
//	      }

	      // [1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
	      // 디렉토리 만드는법
	      // 차이점) mkdir()라는 메서드로 디랙토리 생성.
//	      String path1 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\"; // 파일의 패키지 경로 입력, 경로 마지막에 \\입력 필수
//	      String f01Name="a04_exp"; //파일명 입력
//	      // 2. 파일객체 선언
//	      File folder = new File(path1+f01Name); // ctrl+shift+o
//	      
//	      folder.mkdir();

	      // 파일 만드는법

//	      String path = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a01_exp\\"; // 파일의 패키지 경로 입력, 경로 마지막에 \\입력 필수
//	      String f01Name1="a02_file.txt"; //파일명 입력
//	      // 2. 파일객체 선언
//	      File f01 = new File(path+f01Name1); // ctrl+shift+o
//	      if( ! f01.exists()) {
//	         try {
//	            // 파일이 생성될때 컴파일 예외 처리
//	            f01.createNewFile();
//	            
//	         } catch (IOException e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	         }
//	      }

	      // [1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요.

//	      File f01 = new File(f01Name) //파일 객체 선언
//	      FileWriter fout = new FileWriter("경로명과 파일명") //파일쓰기 객체 생성자
//	      메서드  
//	      write("문자열") : 파일에 쓸 내용
//	      append("문자열") : 기존 파일 내용에서 추가할 내용
//	      flush() : buffer메모리 해제
//	      close() : FileWriter 객체 메모리 해제

	      String path= "C:\\1019최최종\\javaexp_svn\\src\\javaexp\\z02_homework\\a11_mhi\\";
	      String fname = "a02_newFile.txt";
	      File f01 = new File(path+fname); //파일 생성
	      if( ! f01.exists()) {
	         try {
	            // 파일이 생성될때 컴파일 예외 처리
	            f01.createNewFile();
	            System.out.println("파일 생성 완료");
	         } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	      
	      try {         
	         FileWriter fout = new FileWriter(f01);
	         fout.write("파일에 입력할 내용\n");
	         fout.append("파일에 추가할 내용\n");
	         fout.flush();
	         fout.close();
	      }catch(IOException e) {
	         e.printStackTrace();
	      }

	      // 1단계:확인] 4.반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
//	      
//	      String[] studentNames = {"학생1", "학생2", "학생3"};
//	        int[] studentScores = {90, 85, 88};
//	      
//	      
//	      String path= "C:\\1019최최종\\javaexp_svn\\src\\javaexp\\z02_homework\\a11_mhi\\";
//	      String fname = "1학년1반.txt";
//	      try {
//	         FileWriter fout = new FileWriter(path+fname);
//	         for (int i = 0; i < studentNames.length; i++) {
//	                fout.write("이름: " + studentNames[i] + ", 점수: " + studentScores[i] + "\n");
//	            }
//	         fout.flush();
//	         fout.close();
//	      }catch(IOException e) {
//	         e.printStackTrace();
//	      }

	      // [1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당
	      // 날짜.txt파일로 일기를 쓰는 처리를 하세요
//	      String path = "C:\\1019최최종\\javaexp_svn\\src\\javaexp\\z02_homework\\a11_mhi\\";
//	      String fname = "1019일기장.txt";
//	      try {
//	         FileWriter fout = new FileWriter(path + fname);
////	         fout.write("파일에 입력할 내용\n");
//	         Scanner scan = new Scanner(System.in);
//	         System.out.println("오늘 날짜를 YYYYMMDD형식으로 입력해주세요(231019)");
//	         int inputDay = scan.nextInt(); // 날짜를 정수로 입력받음
//	         scan.nextLine();
//	         fout.write(Integer.toString(inputDay) + "\n"); // 정수를 문자열로 변환하여 파일에 쓰기
//	         while (true) {
//	            System.out.println("일기장 내용을 입력하세요(ex: 학원에서 코딩을 배우고 있다. 열심히 해서 코딩 천재가 될 것이다.)");
//	            String inputTxt = scan.nextLine();
//	            fout.append(inputTxt+"\n");
//	            System.out.println("입력을 종료하시겠습니까?(종료시:Q)");
//	            String isCon = scan.nextLine();
//	            if (isCon.equals("Q")) {
//	               System.out.println("입력종료");
//	               break;
//	            }
//	         }
//	         fout.flush();
//	         fout.close();
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }

	      // 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
	      // FileWriter : 텍스트 파일에 문자 데이터를 쓸 때 사용됨.
	      // 주요 메서드:
	      // FileWriter(String fileName): 파일명을 인수로 받는 생성자로, 지정된 파일명의 FileWriter를 생성함
	      // write(String text): 주어진 문자열을 파일에 기록
	      // append(String text): 주어진 문자열을 파일에 추가
	      // flush(): 출력 스트림을 비우고 데이터를 파일에 씀
	      // close(): FileWriter를 닫고 리소스를 해제함

	      // FileReader: 텍스트 파일에서 문자 데이터를 읽을 때 사용됨.
	      // 주요 메서드:
	      // FileReader(String fileName): 파일명을 인수로 받는 생성자로, 지정된 파일명의 FileReader를 생성함
	      // read(): 파일에서 다음 문자를 읽어옵니다. 읽은 문자의 유니코드 값을 반환함
	      // read(char[] cbuf): 파일에서 문자 배열로 데이터를 읽어옴
	      // close(): FileReader를 닫고 리소스를 해제함

	      // 차이점: FileWrither은 파일에 데이터를 쓸 때 사용되고, FileReader는 파일에서 데이터를 읽을 때 사용된다.

	      // [1단계:확인] 7.product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를
	      // 탭간격으로 출력되게하세요.
//	      String path = "C:\\1019최최종\\javaexp_svn\\src\\javaexp\\z02_homework\\a11_mhi\\";
//	      String fname = "7.product.txt";
//	      try {
//	         FileReader fin = new FileReader(path + fname);
//	         StringBuffer sbf = new StringBuffer();
//	         while (true) {
//	            int data = fin.read();
//	            if (data == -1) {
//	               break;
//	            }
//	            sbf.append((char) data);
	//
//	         }
//	         fin.close(); // 자원해제..
	//
//	         // 1단계 줄바꿈을 데이터 자르기
//	         String[] arr = sbf.toString().split("\n");
//	         System.out.println("뽑아온 데이터");
//	         System.out.println("과일이름\t가격\t갯수");
//	         for (String str : arr) {
////	                     System.out.print(str);
//	            // 2단계 줄 단위로 있는 데이터 ,(콤마로) 자리기
//	            String[] arr2 = str.split("&");
//	            System.out.print(arr2[0] + "\t");
//	            System.out.print(arr2[1] + "\t");
//	            System.out.print(arr2[2] + "");
//	         }
	//
//	      } catch (FileNotFoundException e) {
//	         e.printStackTrace();
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }

	   }

	}



//강사님 답안
//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
//[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
//[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
//[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
//[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
//[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
//[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
//
//
//이 질문들에 대한 자바 코드를 아래에 작성하였습니다.
//
//#### 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
//```java
//public class OrderSystem {
//    public static void main(String[] args) throws IOException {
//        String[] menu = {"Burger", "Pizza", "Pasta", "Salad"};
//        System.out.println("Choose a menu item by entering the number:");
//        // 배열의 for
//        for (int i = 0; i < menu.length; i++) {
//            System.out.println((i + 1) + ". " + menu[i]);
//        }
//
//        int orderNum = System.in.read() - '0';
//        // 번호와 배열의 index -1 차이
//        System.out.println("You ordered: " + 
//        	menu[orderNum - 1]);
//    }
//}
//```
//
//#### 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
//```java
//import java.io.File;
//
//public class FileDirectoryExample {
//    public static void main(String[] args) {
//        // Creating a directory
//        File dir = new File("myDirectory");
//        dir.mkdir();
//
//        // Creating a file
//        File file = new File("myFile.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//```
//
//#### 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 
//     기본예제를 통해서 처리하게 하세요.
//```java
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileWriteExample {
//    public static void main(String[] args) {
//        File file = new File("sample.txt");
//        try (FileWriter fw = new FileWriter(file)) {
//            fw.write("This is a sample text.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//```
//
//#### 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 
//배열로 선언된 학생 이름과 점수를 입력되게 하세요.
//```java
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class ClassInfo {
//    public static void main(String[] args) {
//        String filename = "1학년1반.txt";
//        String[] students = {"John:85", "Jane:90", "Doe:78"};
//
//        try {
//        	FileWriter fw = new FileWriter(filename);
//        	
//            for (String student : students) {
//                fw.write(student + "\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//```
//
//#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
//이 내용은 상당히 길어져서, 아래에 직접 추가로 작성하겠습니다.
//
//#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
//```java
//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class DiaryEntry {
//    public static void main(String[] args) throws IOException {
//        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Enter today's date in YYYYMMDD format:");
//        String date = reader.readLine();
//        String path = "경로명..";
//        
//        File f = new File(path+date);
//        if(!f.exists()){
//        	f.createNewFile();
//        }
//        System.out.println("Write your diary entry. Enter 'Q' on its own line to finish.");
//        StringBuffer entry = new StringBuffer();
//        String line;
//        while (true) {
//            line = reader.readLine();
//            if(line.equals("Q")){
//            	break;
//            }
//        	entry.append(line).append("\n");
//        }
//        try{
//        	FileWriter fw = new FileWriter(path+date );
//            fw.write(entry.toString());
//        }catch(IOException e){
//        	System.out.println(e.getMessage());
//        }
//    }
//}
//```
//
//#### 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
//`FileWriter`와 `FileReader`는 각각 텍스트 파일에 문자 데이터를 쓰거나 읽을 때 사용되는 클래스입니다.
//
//- **FileWriter**: 텍스트 파일에 문자 데이터를 쓰기 위해 사용됩니다.
//  - 주요 메서드:
//    - `write(int c)`: 한 문자를 씁니다.
//    - `write(char[] cbuf)`: 문자 배열을 씁니다.
//    - `write(String str)`: 문자열을 씁니다.
//    - `flush()`: 버퍼를 비우고, 모든 변경 사항을 파일에 씁니다.
//    - `close()`: 파일을 닫습니다.
//    
//- **FileReader**: 텍스트 파일에서 문자 데이터를 읽기 위해 사용됩니다.
//  - 주요 메서드:
//    - `read()`: 한 문자를 읽습니다.
//    - `read(char[] cbuf)`: 문자 배열로 데이터를 읽습니다.
//    - `close()`: 파일을 닫습니다.
//
//#### 7. product.txt라는 파일에 물건 정보를 
//포함(사과&3000&2 형식-다중행처리)시켜놓고, 
//해당 물건 정보를 탭간격으로 출력되게 하세요.
//```java
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class ProductReader {
//    public static void main(String[] args) {
    	/*
        try (BufferedReader br = new BufferedReader(new FileReader("product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("&");
                System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fr = new FileReader("경로"+product.txt);
        StringBuffer sbf = new StringBuffer();
        while(true){
        	int code = fr.read(); // 코드값 가져오기..
        	sbf.append((char)code);
        	if(code==-1){ // 마지막 라인에 이를때..
        		break;
        	}
        }
        // sbf ==> toString()을 호출..
         StringBuffer  split() 기능 가지지 않음..
         sbf.toString() 통해서  String으로 변환.
        String[] rowProds= sbf.toString().split("\n");
       	for(String row : rowProds){ // 행단위로..
       	    // 사과&3000&2 
       	    String arry[] = row.split("&");
       	    System.out.print(arry[0]+"\t"); 
       	    System.out.print(arry[1]+"\t"); 
       	    System.out.print(arry[2]); 
       	}
        
        */
		
		


	//}

//}