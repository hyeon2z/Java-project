package javaexp.z02_homework.a12_ljh.a1019;

import java.io.*;
import java.util.*;

public class A1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
				
				List<String> orderList = new ArrayList<String>();
				orderList.add("명란 파스타"); orderList.add("고르곤졸라 피자"); orderList.add("크림 리조또");
				System.out.println("[인기 메뉴]");
				for(int idx=0; idx<orderList.size(); idx++) {
					System.out.println(idx+1 + ") " + orderList.get(idx));
				}
				System.out.print("\n 메뉴를 주문하세요: ");
				InputStream is = System.in;
				OutputStream os = System.out;
				
				try {
					int order = is.read();
					System.out.println("[주문 메뉴]");
					os.write(order);
					os.flush();
					if(order == '1') {
						System.out.println(") 명란 파스타 : $12");
					}else if(order == '2') {
						System.out.println(") 고르곤졸라 피자 : $20");
					}else if(order == '3') {
						System.out.println(") 크림 리조또 : $8");
					}else {
						System.out.println(") 해당 메뉴가 없습니다.");
					}
					os.close();
					is.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
		String path = "C:\\b01_javaexp\\workspace\\javaexp_svn\\src\\javaexp\\z02_homework\\a12_ljh\\a1019\\";
		String fName = path + "a01_file.txt";
		String dName = path + "a01_dir";
		
		File makeFile = new File(fName);
		File makeDir = new File(dName);
		// 1) 파일 생성
		try {
			makeFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2) 디렉토리 생성
		makeDir.mkdir();
		
[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
		
		// 파일 객체 생성
		File f01 = new File("경로와 파일명");
		try {
			// 물리적 파일 생성
			f01.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 기능 메서드
	      createNewFile() : 파일 생성
	      mkdir() : 디렉토리 생성
	      mkdirs() : 경로에 없는 모든 디렉토리 생성
	      delete() : 파일 또는 디렉토리 삭제, 파일이 있으면 해당 파일을 물리적으로 삭제 처리
	      canExecute() : 실행 파일 여부
	      canRead() : 읽을 수 있는지 여부
	      canWrite() : 쓸 수 있는지 여부
	      getParent() : 부모 디렉토리 리턴
	      getName() : 파일 이름 리턴
	      File getParentFile() : 부모 디렉토리를 File 객체로 생성 후 리턴
	      String getPath() : 전체 경로 리턴
	      isDirectory() : 디렉토리인지 여부(boolean)
	      isFile() : 파일인지 여부(boolean)
	      long length() : 파일의 저장 크기 리턴
	      String [] list() : 경로에 포함된 파일명 또는 서브 디렉토리 리턴
	      File[] listFiles() : 경로에 포함된 파일 및 서브 디렉토리 목록 전부를 File 배열로 리턴
		


[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
		
		String path = "C:\\Users\\user\\OneDrive\\바탕 화면\\쌍용교육센터\\workspace\\javaexp\\src\\javaexp\\z01_homework\\a1019\\";
		String fname = "classInfo.txt";
		
		// 경로/파일 만들기 후, 아래 내용 코드 처리
		try {
			FileWriter fw = new FileWriter(path + fname);
			Scanner scan = new Scanner(System.in);
			System.out.print("학생 이름: ");
			String name = scan.nextLine();
			System.out.print("점수: ");
			String score = scan.nextLine();
			fw.append(name);
			fw.append(score);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}


[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요



[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.

		1) FileWriter
		- 입력한 데이터/메모리에 있는 변수에 할당된 데이터는 특정한 파일에 입력할 수 있다.
		- OutputStream을 상속 받은 객체이다.
		- 주요 메서드
		  write("문자열") : 파일에 쓸 내용
	      append("문자열") : 기존 파일 내용에서 추가할 내용
	      flush() : buffer 메모리 해제
	      close() : FileWriter 객체 메모리 해제
	      
	    2) FileReader
	    - 특정한 경로의 파일에 있는 문자열을 읽어와서 화면에 출력하거나, 변수에 할당하여 원하는 데이터를 사용할 때 활용하는 객체이다.
	    - InputStream을 상속 받은 객체이다.
	    - 주요 메서드
	      read() : 글자 한 자씩 code값을 int로 가져온다.
	      		   char 타입 캐스팅 시, 문자로 변환
		      	   공백이나 줄 바꿈들도 포함해서 가져온다.
		  code 값이 -1 일 때, 더이상 문자가 없을 때이다.
		  close() 자원해제
	    

[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.


# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가? 
		 */
		
		
		
	}
}


/*
#### 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
```java
public class OrderSystem {
    public static void main(String[] args) throws IOException {
        String[] menu = {"Burger", "Pizza", "Pasta", "Salad"};
        System.out.println("Choose a menu item by entering the number:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        int orderNum = System.in.read() - '0';
        System.out.println("You ordered: " + menu[orderNum - 1]);
    }
}
```

#### 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
```java
import java.io.File;

public class FileDirectoryExample {
    public static void main(String[] args) {
        // Creating a directory
        File dir = new File("myDirectory");
        dir.mkdir();

        // Creating a file
        File file = new File("myFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요.
```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("This is a sample text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
```java
import java.io.FileWriter;
import java.io.IOException;

public class ClassInfo {
    public static void main(String[] args) {
        String filename = "1학년1반.txt";
        String[] students = {"John:85", "Jane:90", "Doe:78"};

        try (FileWriter fw = new FileWriter(filename)) {
            for (String student : students) {
                fw.write(student + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
이 내용은 상당히 길어져서, 아래에 직접 추가로 작성하겠습니다.

#### 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고, Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요.
```java
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiaryEntry {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter today's date in YYYYMMDD format:");
        String date = reader.readLine();
        
        System.out.println("Write your diary entry. Enter 'Q' on its own line to finish.");
        
        StringBuffer entry = new StringBuffer();
        String line;
        while (!(line = reader.readLine()).equals("Q")) {
            entry.append(line).append("\n");
        }
        
        try (FileWriter fw = new FileWriter(date + ".txt")) {
            fw.write(entry.toString());
        }
    }
}
```

#### 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
`FileWriter`와 `FileReader`는 각각 텍스트 파일에 문자 데이터를 쓰거나 읽을 때 사용되는 클래스입니다.

- **FileWriter**: 텍스트 파일에 문자 데이터를 쓰기 위해 사용됩니다.
  - 주요 메서드:
    - `write(int c)`: 한 문자를 씁니다.
    - `write(char[] cbuf)`: 문자 배열을 씁니다.
    - `write(String str)`: 문자열을 씁니다.
    - `flush()`: 버퍼를 비우고, 모든 변경 사항을 파일에 씁니다.
    - `close()`: 파일을 닫습니다.
    
- **FileReader**: 텍스트 파일에서 문자 데이터를 읽기 위해 사용됩니다.
  - 주요 메서드:
    - `read()`: 한 문자를 읽습니다.
    - `read(char[] cbuf)`: 문자 배열로 데이터를 읽습니다.
    - `close()`: 파일을 닫습니다.

#### 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 해당 물건 정보를 탭간격으로 출력되게 하세요.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("product.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("&");
                System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        FileReader fr = new FileReader("경로 + product.txt);
        StringBuffer sbf = new StringBuffer();
        while(true){
        	try{
        		int code = fr.read();	// 코드값 가져오기
        		sbf.append((char)code);
        		if(code == -1){
        			break;
        		}
        	}
        	catch(IOException e){
        		e.printStackTrace();
        	}
        }
        
        // sbf ==> toString()을 호출
           StringBuffer split() 기능 가지지 않음
           sbf.toString() 통해서 String으로 변환
        String[] rowProds = sbf.toString().split("\n");
        for(String row : rowProds){	// 행단위로
        	// 사과&3000&2
        	 String arry[] = row.split("&");
        	 System.out.print(arry[0] + "\t");
        	 System.out.print(arry[1] + "\t");
        	 System.out.print(arry[2]);
        
        }
        
        
    }
}
```
*/
