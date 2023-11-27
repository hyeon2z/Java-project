package javaexp.z02_homework.a11_mhi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[1단계:개념]  1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
		[1단계:확인]  2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
		[1단계:개념]  3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
		[1단계:확인]  4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
		[1단계:개념]  5. 예외를 계층구조로 하는 이유를 기술하세요
		[1단계:개념]  6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
		[1단계:확인]  7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
		[1단계:개념]  8. 예외의 강제란 무엇인가?
		[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
			       데이터를 입력하게 처리하세요.
			       
			       
		# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
		1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
		2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
		3. 수업 시간 집중하였는가?
		 * */
				//1. 예외처리기본 형식과 구체적인 예외 처리 순서 프로세스
				
//				예외처리 기본 형식1
//				try{
//				 	처리1
//				 	처리2
//				 	예외가 발생할 수 있는 코드를 포함함.
//				 	처리3
//				 }catch(Exception e){
//				 	예외 처리하는데 사용됨:`try` 블록 내에서 예외가 발생하면
//				    해당 예외를 처리하는 `catch` 블록이 실행됨.
//				 }
//				 	처리4 : 계속 수행해서 마무리 처리가 가능.
				
//				예외처리 기본 형식2
//				try{
//				 	처리1
//				 	처리2
//				 	예외가 발생할 수 있는 코드를 포함함.
//				 	처리3
//				 }catch(){
//				 	예외 처리하는데 사용됨:`try` 블록 내에서 예외가 발생하면
//				    해당 예외를 처리하는 `catch` 블록이 실행됨.
//				 }finally{
//			     	예외 발생 여부와 상관 없이 항상 실행됨
//				 }
				
				// 2. Scanner에서 숫자형이지 않는 데이터를 입력할 때 예외가 발생하여 숫자형 데이터를 입력하게 처리하세요.
				Scanner sc= new Scanner(System.in);
//				int number = 0;
//				
//				try {
//					System.out.println("숫자를 입력하세요.");
//					number = sc.nextInt();
//				}catch(InputMismatchException e) {
//					System.out.println("숫자형이 아닙니다.");
//				}
//				System.out.println("입력된 숫자"+number);
				
				//3. 실행예외와 컴파일예외의 차이점을 기본 예제로 기술하세요.
				// 실행예외 : 프로그램을 실행하는 동안 발생함. 실행중에 발생하는 예외 상황을 나타냄
				// 주로 프로그램 실행 중의 입력데이터나 프로그램 런타임 동작과 관련된 문제로 인해 발생함
				// ex) 배열 범위를 벗어나는 접근, 0으로 나누기, null 객체의 접근 등
//					int[] num02= {10,20,30};
//					System.out.println(num02[5]); // 배열 범위를 벗어나는 접근
				
				
				
				// 컴파일예외 : 컴파일 하는동안 발생한다. 코드의 구문적 오류나 논리적 오류를 나타낸다.
				// 개발자의 코드 작성 실수나 불일치로 인해 발생하며, 컴파일러가 이를 감지함
				// ex) 잘못된 변수 이름, 메서드 이름, 타입 불일치, 누락된 세미콜론 등
//				int num01="20"; //타입 불일치
				
				 //4. 컴파일예외로 SQLException이라는 예외가 나는 경우를 확인하고, 처리해보세요.
				//데이터 베이스와 관련된 작업에서 발생할 수 있는 예외
				
				
				
				//5. 예외를 계층구조로 하는 이유를 기술하세요
				// 1. 다양한 예외 유형 처리
				// 2. 예외 처리의 유연성: 각 예외 유형에 맞춤형으로 구현될 수 있으며,
				// 예외 상황에 따라 다른 조치를 취할 수 있다. 
			    // 3. 유지보수와 디버깅 : 예외 계층 구조를 사용하면 코드 유지 보수 및 디버긴 과정이 
//					간소화 된다. 
				
					
			    //6. 예외의 위임이라 무엇인가? 기본 예제 코드와 함께 설명하세요.
					//- 예외가 발생한 곳에서 try ~ catch 블록으로 예외를 직접 처리할 수 있지만,
					//자신이 직접 처리하지 않고, 메서드를 호출한 곳으로 예외를 위임(떠넘김) 할 때
					//throws 키워드를 사용한다.
			
					
			     //7. 예외 위임 코드 각 메서드마다 배열의 데이터가 범위를 넘었을 때, 나오는 예외를 처리해 보세요.
					//int[] numbers = {1,2,3,4,5};
					
				//8. 예외의 강제란 무엇인가?	
				// 예외가 발생했을때 처리되지 않고, 상위 호출자에게 전파되는 것
				// 예외 처리를 포기하고, 예외를 처리할 코드가 없는 상황에서 발생한다.
				// 예외를 잡아내지 않은 상황에서 발생하며, 프로그램이 예외를 무시하고
				// 계속 실행되지 않고 프로그램을 중단 시킨다.
				
			    // 예외 강제 발생 사항
				// 1. 예외 처리 코드가 없는 경우
				// 2. 예외를 명시적으로 전파하는 경우
				
				//[1단계:조별]  9. Scanner로 물건명 가격 갯수를 입력하여 출력하게 할 때, 각 데이터를 입력하지 않을 때, 강제 예외를 발생해서
			    //   데이터를 입력하게ㅐ 처리하세요.
				
//				System.out.println("물건명");
//				String name = sc.nextLine();
//				System.out.println("가격");
//				int price = sc.nextInt();
		//	
//				System.out.println("갯수");
//				int cnt = sc.nextInt();
//				try {
//					System.out.println("# 강제 예외 처리 #");
//					if(name.equals(null))
//					throw new Exception("강제예외입니다");
//				}catch(Exception e) {
//					System.out.println("강제 예외 처리 결과:"+e.getMessage());
//				}	
//				try {
//					System.out.println("# 강제 예외 처리 #");
//					if(Integer==null)
//					throw new Exception("강제예외입니다");
//				}catch(Exception e) {
//					System.out.println("강제 예외 처리 결과:"+e.getMessage());
//				}	
//				
				
				
				
				
			}

		}



// -- 강사님 답안

/*
package javaexp.z02_homework.a00_yhs;

public class A1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
### [1단계:개념] 1. 예외처리 기본 형식과 구체적인 예외 처리 순서 프로세스

자바에서 예외처리는 `try-catch` 블록을 사용하여 처리합니다. 

기본 형식:
```java
try {
    // 예외가 발생할 가능성이 있는 코드
} catch (예외타입1 변수명) {
    // 예외 처리 코드
} catch (예외타입2 변수명) {
    // 예외 처리 코드
} finally {
    // 항상 실행되는 코드
}
```

예외 처리 순서 프로세스:
1. `try` 블록 내에서 코드가 실행됩니다.
2. 예외가 발생하면 즉시 해당 예외를 처리할 수 있는 가장 가까운 `catch` 블록으로 제어가 이동됩니다.
3. `finally` 블록은 예외 발생 여부와 관계 없이 항상 실행됩니다.

### [1단계:확인] 2. Scanner에서 숫자형 예외 처리

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하세요: ");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("입력한 숫자: " + number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자형 데이터를 입력해주세요.");
                
            }
        }
    }
}
```

### [1단계:개념] 3. 실행예외와 컴파일예외의 차이점

- **실행예외(Runtime Exception)**: 컴파일 시점에서 체크되지 않는 예외들. 주로 프로그램의 실행 도중 발생. 예) `NullPointerException`, `ArrayIndexOutOfBoundsException`.
- **컴파일예외(Compile-time Exception)**: 컴파일 시점에 체크되는 예외들. 예외 처리를 강제함. 예) `FileNotFoundException`, `ClassNotFoundException`.

```java
// 예외 위임을 반드시하여야 처리 가능(컴파일 예외)
public void runtimeExceptionExample() {
    int[] arr = new int[5];
    arr[10] = 50;  // ArrayIndexOutOfBoundsException
}

public void compileTimeExceptionExample() throws FileNotFoundException {
    File file = new File("nonexistent.txt");
    FileInputStream fis = new FileInputStream(file);
}
```

### [1단계:확인] 4. 컴파일 예외로 SQLException 처리

```java
import java.sql.*;

public void databaseQuery() {
    try {
    	//데이터베이스 처리시 반드시 필수 예외 처리하여야 한다.
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "user", "password");
    } catch(SQLException e) {
        e.printStackTrace();
    }
}
```

### [1단계:개념] 5. 예외 계층구조 이유

자바의 예외 계층구조는 객체 지향적인 상속의 원칙을 따릅니다. 이 계층구조를 통해 예외들을 그룹화하고, 공통된 로직을 재사용할 수 있습니다. 예를 들어, 여러 예외들이 같은 부모 예외로부터 상속받는다면, 해당 부모 예외만으로 여러 예외를 함께 처리할 수 있습니다.

### [1단계:개념] 6. 예외의 위임

예외 위임이란 메서드나 생성자에서 발생하는 예외를 그대로 호출한 곳으로 던져서 처리하게 하는 것을 말합니다. `throws` 키워드를 사용하여 예외를 위임합니다.

```java
public void exampleMethod() throws SomeException {
    //...
    throw new SomeException();
}
```

### [1단계:

확인] 7. 예외 위임 코드 배열 데이터 범위 처리

```java
public class ArrayExample {
    public void method1() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        method2(arr);
    }

    public void method2(int[] arr) throws ArrayIndexOutOfBoundsException {
        arr[10] = 50;  // 예외 발생
    }

    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        try {
            example.method1();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다.");
        }
    }
}
```

### [1단계:개념] 8. 예외의 강제

예외 강제란 특정 조건에서 프로그래머가 의도적으로 예외를 발생시키는 것을 말합니다. `throw` 키워드를 사용하여 예외를 강제로 발생시킬 수 있습니다.

### [1단계:조별] 9. Scanner로 데이터 입력 강제 예외 처리

```java
import java.util.Scanner;

public class ProductInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productName ="";
        String price ="";
        String count ="";
        while(true){
        	try{
	        	System.out.println("물건명을 입력하세요: ");
	        	String productName = scanner.nextLine();
	        	if(productName.equals("")){
	        	   throw new Exception("물건명 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }
        while(true){
        	try{
	        	System.out.println("가격을 입력하세요: ");
	        	String price = scanner.nextLine();
	        	if(price.equals("")){
	        	   throw new Exception("가격 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }
           while(true){
        	try{
	        	System.out.println("갯수를 입력하세요: ");
	        	String count = scanner.nextLine();
	        	if(count.equals("")){
	        	   throw new Exception("갯수 입력");
	        	}
	        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }     

        System.out.println("물건명: " + productName + ", 가격: " + price + ", 갯수: " + count);
    }
}

이 코드는 사용자가 올바른 값을 입력하지 않을 경우 강제로 예외를 발생시켜 경고합니다.
 
 */
//	}
//
//}

