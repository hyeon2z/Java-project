package javaexp.z02_homework.a17_okw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A1019_okw {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
//[1단계:확인] 1. 주문 메뉴를 배열로 선언하고 번호와 함께 리스트한 후, InputStream read()를 통해서 주문 번호를 입력 받아, 출력하세요.
   Map<String, String> foods = new HashMap<String, String>();
   foods.put("1","짜장면"); foods.put("2","짬뽕"); foods.put("3","탕수육");
   System.out.println("# 메뉴판 #");
   for(String orderNo:foods.keySet()) {
      System.out.print(orderNo+" : ");
      System.out.println(foods.get(orderNo));
   }
   System.out.print("주문번호를 입력하세요(숫자):");
   InputStream is = System.in;
   try {
      int menu = is.read();
      System.out.println("입력된 주문번호:"+(char)menu);
      if(menu == '1') {
         System.out.println("짜장면 주문!!");
      }else if(menu =='2') {
         System.out.println("짬뽕 주문!!");
      }else if(menu =='3'){
         System.out.println("탕수육 주문!!");
      }else {
         System.out.println("잘못된 입력입니다.");
      }
      is.close();
   } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }
      
//[1단계:개념] 2. File 객체에서 디렉토리와 파일의 만드는 방법의 차이를 예제를 통해 기술하세요.
      // 1. File 객체에서 파일 만드는 법 : createNewFile(); 메서드를 활용한다.
//      String path = "경로 입력";
//      String fileName = "파일명 입력.확장자";
//      File f01 = new File(path+fileName);
//      if(!f01.exists()) {
//         try {
//            f01.createNewFile();
//         } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//         }
//      }
      
      // 2. File 객체에서 디렉토리 만드는 법 : mkdir(); 메서드를 활용한다. 
//      String dirPath = "경로 입력";
//      String dirName = "디렉토리명 입력";
//      File d01 = new File(dirPath+dirName);
//      d01.mkdir();
      
//[1단계:개념] 3. 파일 객체와 파일의 쓰는 객체의 생성자, 메서드를 기술하고 기본예제를 통해서 처리하게 하세요. 
      /*
      # File 객체
         1. 데이터 코드를 통해 프로그램의 메모리에 할당하여 전송/출력 가능, 하드웨어적으로 물리적 파일을
            생성하고 저장할 수도 있음.
         2. 파일 처리 순서
            1) 객체생성
               File f01 = new File(경로+파일명);
            2) 다양한 메서드를 통해 물리적 파일/디렉토리 생성
               createNewFile() : 파일 생성
               mkdir() : 디렉토리 생성 
               등...
      # File의 쓰는 객체 (FileWriter)
         1. 입력한 데이터/메모리에 있는 변수에 할당된 데이터는 특정 파일에 입력할 수 있다.
         2. 객체 및 구성요소
            1) 파일쓰기 객체 : new FileWriter(경로+파일명)
            2) 메서드
               - write("문자열") : 파일에 쓸 내용
               - append("문자열") : 기존 파일 내용에서 추가할 내용 
               - flush() : buffer메모리 해제
               - close() : FileWriter 객체 메모리 해제
            ex)
               String path ="C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\a12_stream\\a04_filewrite\\";
               String fname = "a01_fileWrite.txt";
               try {
                  FileWriter fout = new FileWriter(path+fname);   
                  // FileWriter 클래스에서 생성자를 통해 파일이 없으면 자동으로 생성함.
                  fout.write("파일에 입력할내용\n");
                  fout.append("파일에 추가할 내용\n");
                  fout.flush();
                  fout.close();
               } catch (IOException e) {
                  e.printStackTrace();
               }
       */
      
//[1단계:확인] 4. 반의 정보를 파일명으로(1학년1반.txt)으로 하여, 배열로 선언된 학생 이름과 점수를 입력되게 하세요.
      String path4 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp"
                  + "\\z01_homework_okw\\a01_home\\"; 
      String fname4 = "1학년1반.txt";
      // 학생정보 저장용
      StringBuffer stuInfo = new StringBuffer();
      stuInfo.append("# 1학년 1반 성적 #\n");
      Map<String,Integer> studs = new LinkedHashMap<String, Integer>();
      studs.put("김길동",90); studs.put("홍길동",80); studs.put("박길동",70); 
      studs.put("오길동",100); studs.put("유길동",60);
      for(String stuName:studs.keySet()) {
         stuInfo.append(stuName).append(", 점수:").append(studs.get(stuName)).append("\n");
      }
      try {
         FileWriter fout4 = new FileWriter(path4+fname4);
         fout4.write(stuInfo.toString());
         fout4.flush();
         fout4.close();
         System.out.println("성적이 1학년 1반.txt에 성공적으로 저장되었습니다.");
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
//[1단계:확인] 5. 오늘날짜를 YYYYMMDD 형식으로 입력받아, 일기장을 내용을 입력하고,
//      Q를 입력시, 종료하여, 해당 날짜.txt파일로 일기를 쓰는 처리를 하세요
      String path5 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework_okw\\a01_home\\";
      Scanner sc = new Scanner(System.in);
      System.out.print("일기장 제목을 YYYYMMDD 형식의 숫자로 입력하세요.. : ");
      String title = sc.nextLine();
      String fname5 = title+".txt";
      try {
         FileWriter diary = new FileWriter(path5+fname5);
         while(true) {
            System.out.println("내용을 입력하세요!(Q입력시 종료)");
            String content = sc.nextLine();
            diary.append(content+"\n");
            if(content.equals("Q")) {
               System.out.println("일기장 작성 종료");
               diary.flush();
               diary.close();
               break;
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
//[1단계:개념] 6. FileWriter, FileReader 차이점과 주요 메서드와 기능 처리 내용을 기술하세요.
      /*
      # FileWriter : 텍스트 파일에 데이터를 쓰는데 사용된다.
         - 파일이 존재하지 않으면 파일을 생성, 이미 존재하는 파일을 덮어쓸 수 있음.
         - 텍스트 데이터를 문자 스트림으로 다룸.
         - 주요 메서드
            wirte() : 문자 쓰기 
            flush() : 버퍼 비우기
            close() : 파일 닫고 스트림 해제.
      # FileReader : 텍스트 파일에서 데이터를 읽는데 사용된다.
         - 파일이 존재하지 않으면 예외가 발생하며, 읽기모드로 파일을 열어 데이터를 읽음
         - 텍스트 데이터를 문자 스트림으로 다룸.
         - 주요 메서드
            read() : 파일로부터 한 문자를 읽어 반환.글자 한자 씩 code값을 int로 가져온다.
            close() : 파일을 닫고 스트림을 해제.
       */
//[1단계:확인] 7. product.txt라는 파일에 물건 정보를 포함(사과&3000&2 형식-다중행처리)시켜놓고, 
//      해당 물건 정보를 탭간격으로 출력되게 하세요.
      String path7 = "C:\\b01_javaexp\\workspace\\javaexp\\src\\javaexp\\z01_homework_okw\\a01_home\\";
      String fname7 = "product.txt";
      
      try {
         FileReader fin = new FileReader(path7+fname7);
         StringBuffer sbf = new StringBuffer();
         while(true) {
            int plist = fin.read();
            if(plist==-1) {
               break;
            }
            sbf.append((char)plist);
            
         }
         fin.close();
         String[] arr = sbf.toString().split("\n");
         System.out.println("물건명\t가격\t갯수");
         for(String item:arr) {
            String[] arr2 = item.split("&");
            System.out.print(arr2[0]+"\t");
            System.out.print(arr2[1]+"\t");
            System.out.print(arr2[2]+"\n");
         }
         
         System.out.println("\n #### END ####");
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      
   }

}
